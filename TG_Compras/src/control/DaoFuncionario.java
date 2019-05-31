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
import model.Funcionario;

/**
 *
 * @author Matheus Jorge
 */
public class DaoFuncionario {

    private Connection conn;

    public DaoFuncionario(Connection conn) {
        this.conn = conn;
    }

    public Funcionario consultar(String Id) {
        Funcionario f = null;
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Funcionario "
                    + "WHERE CPF = ?");
            ps.setString(1, Id);

            rs = ps.executeQuery();

            if (rs.next() == true) {
                f = new Funcionario();
                f.setCPF(rs.getString("CPF"));
                f.setCodSetor(rs.getInt("CODSETOR"));
                f.setNomeFuncionario(rs.getString("NOMEFUNCIONARIO"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (f);
    }

}
