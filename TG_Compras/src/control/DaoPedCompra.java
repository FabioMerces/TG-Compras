package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.PedidoCompra;

/**
 *
 * @author Matheus Jorge
 */
public class DaoPedCompra {
    private Connection conn;

    public DaoPedCompra(Connection conn) {
        this.conn = conn;
    }
    
    public PedidoCompra consultar(int NumPedido) {
        PedidoCompra pdc = null;
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Pedido_Compra "
                    + "WHERE NumPedido = ?");
            ps.setInt(1, NumPedido);

            rs = ps.executeQuery();

            if (rs.next() == true) {
                pdc = new PedidoCompra();
                pdc.setNumPedido(rs.getInt("NumPedido"));
                pdc.setNumCotacao(rs.getInt("NumCotacao"));
                pdc.setNumSolicitacao(rs.getInt("NumSolicitacao"));
                pdc.setDataPedido(rs.getString("DataPedido"));
                pdc.setSituacaoPedido(rs.getString("Situacao"));
                pdc.setCPFGerente(rs.getString("CPFGerente"));
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao consultar Pedido de Compra [Nº:" + NumPedido + "]: " + ex.toString());
        }
        return (pdc);
    }
    
     public void inserir(PedidoCompra pdc) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tbl_Pedido_Compra (NumPedido, NumCotacao, NumSolicitacao,"
                    + " DataPedido, Situacao, CPFGerente)"
                    + " VALUES(?,?,?,?,?,?)");
            ps.setInt(1, pdc.getNumPedido());
            ps.setInt(2, pdc.getNumCotacao());
            ps.setInt(3, pdc.getNumSolicitacao());
            ps.setString(4, pdc.getDataPedido());
            ps.setString(5, pdc.getSituacaoPedido());
            ps.setString(6, pdc.getCPFGerente());
          
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Falha na inserção do Pedido de Compra [Pedido Nº:"+ pdc.getNumPedido() + "] da Cotação [Nº:" + pdc.getNumCotacao() + "]: " + ex.toString());
        }
    }
     
     public void alterar(PedidoCompra pdc) {
		PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbl_Pedido_Compra set NumCotacao = ?, NumSolicitacao = ?,"
                    + " DataPedido = ?, Situacao = ?, CPFGerente = ?"
                    + " WHERE NumPedido = ?"); 
            ps.setInt(1, pdc.getNumCotacao());
            ps.setInt(2, pdc.getNumSolicitacao());
            ps.setString(3, pdc.getDataPedido());
            ps.setString(4, pdc.getSituacaoPedido());
            ps.setString(5, pdc.getCPFGerente());
            ps.setInt(6, pdc.getNumPedido());

            ps.execute();

        } catch (SQLException ex) {
            System.out.println("Falha na alteração do Pedido de Compra [Nº: " + pdc.getNumPedido() + "]: " + ex.toString());
        }
    }
    
    public List listarPedidos() {
        PreparedStatement ps = null;
        List<PedidoCompra> ListaPedidos = new ArrayList<>();
        try {
            ps = conn.prepareStatement("SELECT NumPedido from tbl_Pedido_Compra");
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                ListaPedidos.add(consultar(rs.getInt("NumPedido")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (ListaPedidos);
    }
}
