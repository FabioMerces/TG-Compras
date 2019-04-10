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
import model.Material;

/**
 *
 * @author Matheus Jorge
 */
public class DaoFornecedor {

    private Connection conn;

    public DaoFornecedor(Connection conn) {
        this.conn = conn;
    }

    public Fornecedor consultar(String CNPJ) {
        Fornecedor f = null;
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Fornecedor "
                    + "WHERE CNPJ = ?");
            ps.setString(1, CNPJ);

            rs = ps.executeQuery();

            if (rs.next() == true) {
                f = new Fornecedor();
                f.setCNPJ(rs.getString("CNPJ"));
                f.setNomeFornecedor(rs.getString("NomeFornecedor"));
                f.setLogradouro(rs.getString("Logradouro"));
                f.setNumero(rs.getInt("Numero"));
                f.setComplemento(rs.getString("Complemento"));
                f.setCEP(rs.getString("CEP"));
                f.setBairro(rs.getString("Bairro"));
                f.setCidade(rs.getString("Cidade"));
                f.setUF(rs.getString("UF"));
                f.setPais(rs.getString("Pais"));
                f.setTelPrincipal(rs.getString("TelPrincipal"));
                f.setTelSecundario(rs.getString("TelSecundario"));
                f.setEmailFornecedor(rs.getString("Email"));
                f.setNotaVelocidadeEntrega(rs.getInt("NotaVelocidade"));
                f.setNotaPreco(rs.getInt("NotaPreco"));
                f.setNotaPosVenda(rs.getInt("NotaPosVenda"));
                f.setNotaQualidade(rs.getInt("NotaQualidade"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (f);
    }

    public void inserir(Fornecedor f) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO tbl_Fornecedor (CNPJ, NomeFornecedor,"
                    + " Logradouro, Numero, Complemento, CEP, Bairro, Cidade, UF, Pais, "
                    + " TelPrincipal, TelSecundario, Email, NotaVelocidade, NotaPreco, NotaPosVenda, NotaQualidade)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, f.getCNPJ());
            ps.setString(2, f.getNomeFornecedor());
            ps.setString(3, f.getLogradouro());
            ps.setInt(4, f.getNumero());
            ps.setString(5, f.getComplemento());
            ps.setString(6, f.getCEP());
            ps.setString(7, f.getBairro());
            ps.setString(8, f.getCidade());
            ps.setString(9, f.getUF());
            ps.setString(10, f.getPais());
            ps.setString(11, f.getTelPrincipal());
            ps.setString(12, f.getTelSecundario());
            ps.setString(13, f.getEmailFornecedor());
            ps.setInt(14, f.getNotaVelocidadeEntrega());
            ps.setInt(15, f.getNotaPreco());
            ps.setInt(16, f.getNotaPosVenda());
            ps.setInt(17, f.getNotaQualidade());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Fornecedor f) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbl_Fornecedor set NomeFornecedor = ?, Logradouro = ?"
                    + " Numero = ?, Complemento = ?, CEP = ?, Bairro = ?, Cidade = ?, UF = ?, Pais = ?"
                    + " TelPrincipal = ?, TelSecundario = ?, Email = ?, NotaVelocidade = ?, NotaPreco = ?"
                    + " NotaPosVenda = ?, NotaQualidade = ?"
                    + " WHERE CNPJ = ?");
            ps.setString(1, f.getNomeFornecedor());
            ps.setString(2, f.getLogradouro());
            ps.setInt(3, f.getNumero());
            ps.setString(4, f.getComplemento());
            ps.setString(5, f.getCEP());
            ps.setString(6, f.getBairro());
            ps.setString(7, f.getCidade());
            ps.setString(8, f.getUF());
            ps.setString(9, f.getPais());
            ps.setString(10, f.getTelPrincipal());
            ps.setString(11, f.getTelSecundario());
            ps.setString(12, f.getEmailFornecedor());
            ps.setInt(13, f.getNotaVelocidadeEntrega());
            ps.setInt(14, f.getNotaPreco());
            ps.setInt(15, f.getNotaPosVenda());
            ps.setInt(16, f.getNotaQualidade());
            ps.setString(17, f.getCNPJ());

            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void excluir(String CNPJ) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("DELETE FROM tbl_Fornecedor where CNPJ = ?");
            ps.setString(1, CNPJ);

            ps.execute();

            ps = null;

            ps = conn.prepareStatement("DELETE FROM tbl_Fornecedor_Material where CNPJ = ?");
            ps.setString(1, CNPJ);

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public List listarFornecedores() {
        PreparedStatement ps = null;
        List<Fornecedor> ListaFornecedores = new ArrayList<>();
        try {
            ps = conn.prepareStatement("SELECT CNPJ from tbl_Fornecedor");
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                ListaFornecedores.add(consultar(rs.getString("CNPJ")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (ListaFornecedores);
    }
}
