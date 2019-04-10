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
import model.Usuario;

/**
 *
 * @author Matheus Jorge
 */
public class DaoUsuario {

    private Connection conn;

    public DaoUsuario(Connection conn) {
        this.conn = conn;
    }

    public Usuario login(String Id, String Senha) {
        Usuario u = null;
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Usuario "
                    + "WHERE CPF = ? and Senha = ?");
            ps.setString(1, Id);
            ps.setString(2, Senha);
            
            rs = ps.executeQuery();
            
            if(rs.next() == true){
                u = new Usuario();
                u.setIdUsuario(Id);
                u.setSenha(Senha);
                u.setTipoUsuario(rs.getString("Nivel"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(u);
     }

    public Usuario consultar(String Id) {
        Usuario u = null;
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Usuario "
                    + "WHERE CPF = ?");
            ps.setString(1, Id);

            rs = ps.executeQuery();

            if (rs.next() == true) {
                u = new Usuario();
                u.setIdUsuario(rs.getString("CPF"));
                u.setSenha(rs.getString("Senha"));
                u.setTipoUsuario(rs.getString("Nivel"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (u);
    }

    public void inserir(Usuario u) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO tbl_Usuario (CPF, Senha, Nivel) VALUES(?, ?, ?)");
            ps.setString(1, u.getIdUsuario());
            ps.setString(2, u.getSenha());
            ps.setString(3, u.getTipoUsuario());
            ps.execute();
            } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar (Usuario u) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("UPDATE tbl_Usuario SET Senha = ? , Nivel = ? Where CPF = ?");
            ps.setString(1, u.getSenha());
            ps.setString(2, u.getTipoUsuario());
            ps.setString(3, u.getIdUsuario());
            ps.execute();
            } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void exlcuir (Usuario u){
        
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("DELETE FROM tbl_Usuario where CPF = ?");
            ps.setString(1, u.getIdUsuario());
            ps.execute();
            } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    
    }
}
