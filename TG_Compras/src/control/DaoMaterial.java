/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Material;
/**
 *
 * @author Matheus Jorge
 */
public class DaoMaterial {
    
    private Connection conn;

    public DaoMaterial(Connection conn) {
        this.conn = conn;
    }
    
    public Material consultar(int codMaterial) {
        Material m = null;
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Material "
                    + "WHERE CodMaterial = ?");
            ps.setInt(1, codMaterial);
            
            rs = ps.executeQuery();

            if (rs.next() == true) {
                m = new Material();
                m.setCodMaterial(rs.getInt("CodMaterial"));
                m.setNomeMaterial(rs.getString("NomeMaterial"));
                m.setDescricaoMaterial(rs.getString("DescriptMaterial"));
                m.setUnidadeMedida(rs.getString("UnidMedida")); 
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (m);
    }
    
    public void inserir(Material m) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tbl_Material (CodMaterial, UnidMedida,"
                    + " NomeMaterial, DescriptMaterial)"
                    + " VALUES(?,?,?,?)");
            ps.setInt(1, m.getCodMaterial());
            ps.setString(2, m.getUnidadeMedida());
            ps.setString(3, m.getNomeMaterial());
            ps.setString(4, m.getDescricaoMaterial());
          
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Material m) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbl_Material set NomeMaterial = ?,"
                    + " UnidMedida = ?, DescriptMaterial = ?,"
                    + " WHERE CodMaterial = ?");
            ps.setString(1, m.getNomeMaterial());
            ps.setString(2, m.getUnidadeMedida());
            ps.setString(3, m.getDescricaoMaterial());
            ps.setInt(4, m.getCodMaterial());

            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void excluir(Material m) {   
        /*Há mais tabelas fora tbl_Material e tbl_Fornecedor_Material que possuem "CodMaterial", verificar se é necessário deletar delas também */
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE FROM tbl_Material where CodMaterial = ?");
            ps.setInt(1, m.getCodMaterial());

            ps.execute();

            ps = null;

            ps = conn.prepareStatement("DELETE FROM tbl_Fornecedor_Material where CodMaterial = ?");
            ps.setInt(1, m.getCodMaterial());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public List listarMaterial() {
        PreparedStatement ps = null;
        List<Material> ListaMateriais = new ArrayList<>();
        try {
            ps = conn.prepareStatement("SELECT CodMaterial from tbl_Material");
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                ListaMateriais.add(consultar(rs.getInt("CodMaterial")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (ListaMateriais);
    }
}
