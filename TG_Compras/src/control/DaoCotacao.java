package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cotacao;
/**
 *
 * @author Matheus Jorge
 */
public class DaoCotacao {
    private Connection conn;

    public DaoCotacao(Connection conn) {
        this.conn = conn;
    }
    
    public Cotacao consultar(int NumCotacao) {
        Cotacao c = null;
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Cotacao "
                    + "WHERE NumCotacao = ?");
            ps.setInt(1, NumCotacao);

            rs = ps.executeQuery();

            if (rs.next() == true) {
                c = new Cotacao();
                c.setNumCotacao(rs.getInt("NumCotacao"));
                c.setNumSolicitacaoCompra(rs.getInt("NumSolicitacao"));
                c.setDataPedidoCompra(rs.getString("DataCotacao"));
                c.setPrecoMaterial(rs.getFloat("PrecoUnitario"));
				c.setSituacaoCotacao(rs.getString("SituacaoCotacao"));
				c.setCNPJ(rs.setString("CNPJ"));
                c.setCodMaterial(rs.setInt("CodMaterial"));
				
                ps = conn.prepareStatement("SELECT QtdeMaterial FROM tbl_Material_Solicitados"
                        + " WHERE NumCotacao = ? and CodMaterial = ?");
                ps.setInt(1, rs.getInt("NumSolicitacao"));
                ps.setInt(2, rs.getInt("CodMaterial"));
                
                rs = ps.executeQuery();
                
                c.setQtdeMaterial(rs.getInt("QtdeMaterial"));
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao consultar Cotação: " + ex.toString());
        }
        return (c);
    }
    
    public void inserir(Cotacao c) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tbl_Cotacao (NumCotacao, NumSolicitacao,"
                    + " DataCotacao, CNPJ, CodMaterial, SituacaoCotacao)"
                    + " VALUES(?,?,?,?,?,?)");
            ps.setInt(1, c.getNumCotacao());
            ps.setInt(2, c.getNumSolicitacaoCompra());
            ps.setString(3, c.getDataCotacao());
            ps.setString(4, c.getCNPJ());
            ps.setInt(5, c.getCodMaterial());
            ps.setString(6, c.getSituacaoCotacao);
          
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Falha na inserção da Cotação: " + ex.toString());
        }
    }
	
	public void alterar(Cotacao c) {
		PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbl_Cotacao set CNPJ = ?,"
                    + " CodMaterial = ?, DataCotacao = ?, PrecoUnitario = ?, SituacaoCotacao = ?"
                    + " WHERE NumCotacao = ?");
            ps.setString(1, c.getCNPJ());
            ps.setInt(2, c.getCodMaterial());
            ps.setString(3, c.getDataCotacao());
            ps.setFloat(4, c.getPrecoMaterial());
			ps.setString(5, c.getSituacaoCotacao());
			ps.setInt(6, c.getNumCotacao());

            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
	
    public void excluir(int NumCotacao) {
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement("DELETE from tbl_Cotacao WHERE NumCotacao = ?");
			ps.setInt(NumCotacao);
		
			ps.execute();
		} catch (SQLException ex) {
			System.out.println("Falha na exclusão da Cotação: " + ex.toString());
		}
	}
	
	public List listarCotacoes() {
        PreparedStatement ps = null;
        List<Cotacao> ListaCotacao = new ArrayList<>();
        try {
            ps = conn.prepareStatement("SELECT NumCotacao from tbl_Cotacao");
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                ListaCotacao.add(consultar(rs.getInt("NumCotacao")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (ListaCotacao);
    }
}
