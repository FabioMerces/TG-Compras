package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.MateriaisSolicitados;
import model.Material;

/**
 *
 * @author Matheus Jorge
 */
public class DaoMateriaisSolicitados {

    private Connection conn;

    public DaoMateriaisSolicitados(Connection conn) {
        this.conn = conn;
    }

    public MateriaisSolicitados consultar(int codRequisicao) {
        MateriaisSolicitados ms = null;
        DaoMaterial daoMaterial = new DaoMaterial(this.conn);
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Materiais_Solicitados "
                    + "WHERE NumSocilitacao = ?");
            ps.setInt(1, codRequisicao);

            rs = ps.executeQuery();

            if (rs.next() == true) {
                ms = new MateriaisSolicitados();
                ms.setCodRequisicaoCompra(rs.getInt("NumSolicitacao"));
                ms.addMateriais(daoMaterial.consultar(rs.getInt("CodMaterial")));
                ms.addQtdeMaterial(rs.getInt("QtdeMaterial"));
            }
        } catch (SQLException ex) {
            System.out.println("Falha na consulta de Materiais da Solicitação: " + ex.toString());
        }
        return (ms);
    }

    public void inserir(MateriaisSolicitados ms) {
        PreparedStatement ps = null;
        ArrayList<Material> mat = ms.getMateriais();
        ArrayList<Integer> qtdeMat = ms.getQtdeMateriais();
        int i = 0;

        try {
            while (i < mat.size() && mat.get(i) != null) {
                ps = null;
                ps = conn.prepareStatement("INSERT INTO tbl_Materiais_Solicitados (NumSolicitacao,"
                        + " CodMaterial, QtdeMaterial)"
                        + " VALUES(?,?,?)");
                ps.setInt(1, ms.getCodRequisicaoCompra());
                ps.setInt(2, mat.get(i).getCodMaterial());
                ps.setInt(3, qtdeMat.get(i));

                ps.execute();
                i++;
            }

        } catch (SQLException ex) {
            System.out.println("Falha na inserção de Materiais Solicitados: " + ex.toString());
        }
    }
}
