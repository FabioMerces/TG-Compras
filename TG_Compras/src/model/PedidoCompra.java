/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author M
 */
public class PedidoCompra {
    private int NumPedido, NumCotacao;
    private String CPFGerente, DataPedido, SituacaoPedido;

    public int getNumPedido() {
        return NumPedido;
    }

    public void setNumPedido(int NumPedido) {
        this.NumPedido = NumPedido;
    }

    public int getNumCotacao() {
        return NumCotacao;
    }

    public void setNumCotacao(int NumCotacao) {
        this.NumCotacao = NumCotacao;
    }

    public String getCPFGerente() {
        return CPFGerente;
    }

    public void setCPFGerente(String CPFGerente) {
        this.CPFGerente = CPFGerente;
    }

    public String getDataPedido() {
        return DataPedido;
    }

    public void setDataPedido(String DataPedido) {
        this.DataPedido = DataPedido;
    }

    public String getSituacaoPedido() {
        return SituacaoPedido;
    }

    public void setSituacaoPedido(String SituacaoPedido) {
        this.SituacaoPedido = SituacaoPedido;
    }

    
    
}
