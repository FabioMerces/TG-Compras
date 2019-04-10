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
import model.Fornecedor;
import model.Fornecedor_Material;
import model.Material;

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
        Fornecedor_Material fm = null;
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            DaoFornecedor daoF = new DaoFornecedor(this.conn);
            ps = conn.prepareStatement("SELECT * FROM tbl_Fornecedor_Material "
                    + "WHERE CodMaterial = ?");
            ps.setInt(1, codMaterial);

            rs = ps.executeQuery();

            if (rs.next() == true) {
                fm = new Fornecedor_Material();
                fm.setCodMaterial(rs.getInt("CodMaterial"));
                fm.addFornecedor(daoF.consultar(rs.getString("CNPJ")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (fm);
    }

    public void inserir(Fornecedor_Material fm) {
        PreparedStatement ps = null;
        ArrayList<Fornecedor> fornecedores = fm.getFornecedores();
        int i = 0;

        try {
            while (i < fornecedores.size()) {
                ps = conn.prepareStatement("INSERT INTO tbl_Fornecedor_Material (CNPJ, CodMaterial"
                        + " VALUES(?,?)");
                ps.setString(1, fornecedores.get(i).getCNPJ());
                ps.setInt(2, fm.getCodMaterial());

                ps.execute();
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
