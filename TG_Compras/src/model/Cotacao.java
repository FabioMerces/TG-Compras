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
public class Cotacao {
    private int NumCotacao, NumSolicitacaoCompra;
    private int QtdeMaterial, DataPedidoCompra;
    private float PrecoMaterial;

    public int getNumCotacao() {
        return NumCotacao;
    }

    public void setNumCotacao(int NumCotacao) {
        this.NumCotacao = NumCotacao;
    }

    public int getNumSolicitacaoCompra() {
        return NumSolicitacaoCompra;
    }

    public void setNumSolicitacaoCompra(int NumSolicitacaoCompra) {
        this.NumSolicitacaoCompra = NumSolicitacaoCompra;
    }

    public int getQtdeMaterial() {
        return QtdeMaterial;
    }

    public void setQtdeMaterial(int QtdeMaterial) {
        this.QtdeMaterial = QtdeMaterial;
    }

    public int getDataPedidoCompra() {
        return DataPedidoCompra;
    }

    public void setDataPedidoCompra(int DataPedidoCompra) {
        this.DataPedidoCompra = DataPedidoCompra;
    }

    public float getPrecoMaterial() {
        return PrecoMaterial;
    }

    public void setPrecoMaterial(float PrecoMaterial) {
        this.PrecoMaterial = PrecoMaterial;
    }
    
    
}
