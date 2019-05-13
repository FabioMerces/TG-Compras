package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cotacao;
import model.MateriaisSolicitados;
import model.Material;

/**
 *
 * @author Matheus Jorge
 */
public class DaoMateriaisSolicitados {

    private Connection conn;
    private DaoMaterial daoMaterial;

    public DaoMateriaisSolicitados(Connection conn) {
        this.conn = conn;
    }

    public MateriaisSolicitados consultar(int codRequisicao) {
        MateriaisSolicitados ms = null;
        DaoMaterial daoMaterial = new DaoMaterial(this.conn);
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Material_Solicitado "
                    + "WHERE NumSolicitacao = ?");
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
                ps = conn.prepareStatement("INSERT INTO tbl_Material_Solicitado (NumSolicitacao,"
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

    public List<Material> listarMateriaisSolicitadosDeUmaRequisicao(String codigoRequisicao) {
        PreparedStatement ps = null;
        DaoMaterial daoMaterial = new DaoMaterial(this.conn);
        List<Material> ListaMaterial = new ArrayList<>();
        try {
            ps = conn.prepareStatement("SELECT * from tbl_material_solicitado where NUMSOLICITACAO = "
                    + codigoRequisicao);
            ResultSet rs = ps.executeQuery();

            while (rs.next() == true) {
                //Devolvera o Codigo do Material, posteriormente sera interessante colocar o Nome do Material
                ListaMaterial.add(daoMaterial.consultar(rs.getInt("CODMATERIAL")));
                //System.out.println(consultar(rs.getInt("CODMATERIAL")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (ListaMaterial);
    }

}
