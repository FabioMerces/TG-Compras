package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.MateriaisSolicitados;
import model.RequisicaoCompra;

/**
 *
 * @author Matheus Jorge
 */
public class DaoRequisicaoCompra {

    private Connection conn;

    public DaoRequisicaoCompra(Connection conn) {
        this.conn = conn;
    }

    public RequisicaoCompra consultar(int codRequisicao) {
        RequisicaoCompra rq = null;
        ResultSet rs;
        PreparedStatement ps = null;
        DaoMateriaisSolicitados daoMS = new DaoMateriaisSolicitados(conn);
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Solicitacao_Compra "
                    + "WHERE NumSolicitacao = ?");
            ps.setInt(1, codRequisicao);

            rs = ps.executeQuery();

            if (rs.next() == true) {
                rq = new RequisicaoCompra();
                
                rq.setCodRequisicao(rs.getInt("NUMSOLICITACAO"));
                rq.setIdFuncionarioRequisitante(rs.getString("CPF"));
                rq.setSetorFuncionarioRequisitante(rs.getInt("SETOR"));
                rq.setDataSolicitacao(rs.getString("DATASOLICITACAO"));
                rq.setDescricaoMateriaisNaoEncontrados(rs.getString("DESCMATNOTFOUND"));
                rq.setSituacaoSolicitacao(rs.getString("SITUACAOSOLICITACAO"));
                rq.setMatSolicitados(daoMS.consultar(codRequisicao));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            
        }
        return (rq);
    }

    public void inserir(RequisicaoCompra rq, MateriaisSolicitados ms) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO tbl_Solicitacao_Compra (CPF, Setor,"
                    + " NumSolicitacao, DataSolicitacao, DescMatNotFound, SituacaoSolicitacao)"
                    + " VALUES(?,?,?,?,?,?)");
            ps.setString(1, rq.getIdFuncionarioRequisitante());
            ps.setInt(2, rq.getSetorFuncionarioRequisitante());
            ps.setInt(3, rq.getCodRequisicao());           
            ps.setString(4, rq.getDataSolicitacao());
            ps.setString(5, rq.getDescricaoMateriaisNaoEncontrados());
            ps.setString(6, rq.getSituacaoSolicitacao());
            
            ps.execute();
            
            DaoMateriaisSolicitados daoMS = new DaoMateriaisSolicitados(this.conn);
            daoMS.inserir(ms);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            
        }
    }

    public void alterar(RequisicaoCompra rq) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbl_Solicitacao_Compra set CPF = ?,"
                    + " Setor  = ?, DataSolicitacao = ?, DescMatNotFound = ?, SituacaoSolicitacao = ?"
                    + " WHERE CodRequisicao = ?");
            ps.setString(1, rq.getIdFuncionarioRequisitante());
            ps.setInt(2, rq.getSetorFuncionarioRequisitante());
            ps.setString(3, rq.getSituacaoSolicitacao());           
            ps.setString(4, rq.getDataSolicitacao());
            ps.setString(5, rq.getDescricaoMateriaisNaoEncontrados());
            ps.setInt(6, rq.getCodRequisicao());
            
            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void excluir(RequisicaoCompra rq) {   
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE FROM tbl_RequisicaoCompra where CodRequisicao = ?");
            ps.setInt(1, rq.getCodRequisicao());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public List listarRequisicao() {
        PreparedStatement ps = null;
        List<RequisicaoCompra> ListaRequisicao = new ArrayList<>();
        try {
            ps = conn.prepareStatement("SELECT CodRequisicao from tbl_Solicitacao_Compra");
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                ListaRequisicao.add(consultar(rs.getInt("CodRequisicao")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (ListaRequisicao);
    }
}
