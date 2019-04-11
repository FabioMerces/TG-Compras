package model;

/**
 *
 * @author Matheus Jorge
 */
public class HistoricoCompra {
    private int CodHistorico, NumPedido, CodMaterial;
    private String CNPJ, Data;
    private float Preco;

    public int getCodHistorico() {
        return CodHistorico;
    }

    public void setCodHistorico(int CodHistorico) {
        this.CodHistorico = CodHistorico;
    }

    public int getNumPedido() {
        return NumPedido;
    }

    public void setNumPedido(int NumPedido) {
        this.NumPedido = NumPedido;
    }

    public int getCodMaterial() {
        return CodMaterial;
    }

    public void setCodMaterial(int CodMaterial) {
        this.CodMaterial = CodMaterial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }
   
}
