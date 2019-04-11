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
    private int CodMaterial, QtdeMaterial, DataCotacao;
    private float PrecoMaterial;
	private String SituacaoCotacao, CNPJ;

    public int getNumCotacao() {
        return NumCotacao;
    }

    public void setNumCotacao(int NumCotacao) {
        this.NumCotacao = NumCotacao;
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

	public String getSituacaoCotacao() {
		return SituacaoCotacao;
	}
	
	public void setSituacaoCotacao(String situacao) {
		this.SituacaoCotacao = situacao;
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

    public int getDataCotacao() {
        return DataCotacao;
    }

    public void setDataCotacao(int Data) {
        this.DataCotacao = Data;
    }

    public float getPrecoMaterial() {
        return PrecoMaterial;
    }

    public void setPrecoMaterial(float PrecoMaterial) {
        this.PrecoMaterial = PrecoMaterial;
    }
    
    
}
