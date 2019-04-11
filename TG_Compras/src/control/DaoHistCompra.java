package control;

/**
 *
 * @author Matheus Jorge
 */
public class DaoHistCompra {
	
    private Connection conn;

    public DaoHistCompra(Connection conn) {
        this.conn = conn;
    }
    
    public HistoricoCompra consultar(int NumPedido) {
        HistoricoCompra hc = null;
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Historico "
                    + "WHERE NumPedido = ?");
            ps.setInt(1, NumPedido);
            
            rs = ps.executeQuery();

            if (rs.next() == true) {
                hc = new HistoricoCompra();
                hc.setCodHistorico(rs.getInt("CodHistorico"));
                hc.setNumPedido(rs.getInt("NumPedido")); 
				hc.setCodMaterial(rs.getInt("CodMaterial"));
				hc.setCNPJ(rs.setString("CNPJ"));
				hc.setData(rs.setString("DataCompra"));
				hc.setPreco(rs.setFloat("PrecoUnitario"));
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao consultar Histórico[NumPedido " + NumPedido "]: " + ex.toString());
        }
        return (hc);
    }
	
	public void incluir(HistoricoCompra hc) {
		PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tbl_Historico (CodHistorico, CNPJ,"
                    + " CodMaterial, PrecoUnitario, NumPedido, DataCompra)"
                    + " VALUES(?,?,?,?,?,?)");
            ps.setInt(1, hc.getCodHistorico());
            ps.setString(2, hc.getCNPJ());
			ps.setInt(3, hc.getCodMaterial());
			ps.setFloat(4, hc.getPreco());
			ps.setInt(5, hc.getNumPedido());
			ps.setString(6, hc.getData());
          
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Falha ao inserir Pedido de Compra ao Histórico: " + ex.toString());
        }
	}
	
	public List listaHistorico() {
        PreparedStatement ps = null;
        List<HistoricoCompra> ListaHistorico = new ArrayList<>();
        try {
            ps = conn.prepareStatement("SELECT NumPedido from tbl_Historico");
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                ListaHistorico.add(consultar(rs.getInt("NumPedido")));
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao construir Lista Histórico_Compra: " + ex.toString());
        }
        return (ListaHistorico);
    }
}
