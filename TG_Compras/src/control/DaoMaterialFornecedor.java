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
import java.util.List;
import model.Fornecedor;
import model.Fornecedor_Material;

/**
 *
 * @author Matheus Jorge
 */
public class DaoMaterialFornecedor {

    private Connection conn;

    public DaoMaterialFornecedor(Connection conn) {
        this.conn = conn;
    }

    public Fornecedor_Material consultar(int codMaterial) {
        Fornecedor_Material fm = new Fornecedor_Material();
        Fornecedor f;
        DaoFornecedor daoF = new DaoFornecedor(this.conn);
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Fornecedor_Material "
                    + "WHERE CodMaterial = ?");
            ps.setInt(1, codMaterial);

            rs = ps.executeQuery();

            if (rs.next() == true) {
                fm.setCodMaterial(rs.getInt("CodMaterial"));
                f = daoF.consultar(rs.getString("CNPJ"));
                if (f == null) {
                    /*Sem fornecedores vinculados*/
                } else {
                    fm.addFornecedor(f);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (fm);
    }

    public void inserir(Fornecedor_Material fm) {
        PreparedStatement ps = null;
        List<Fornecedor> fornecedores = fm.getFornecedores();

        try {
            ps = conn.prepareStatement("INSERT INTO tbl_Fornecedor_Material (CNPJ, CodMaterial)"
                    + " VALUES(?,?)");
            ps.setString(1, fornecedores.get(fornecedores.size()-1).getCNPJ());
            ps.setInt(2, fm.getCodMaterial());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
