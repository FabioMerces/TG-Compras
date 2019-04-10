/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gabriel Pilan
 */
public class RequisicaoCompra {
    private int codRequisicao;
    private String idFuncionarioRequisitante;
    private String setorFuncionarioRequisitante;
    private String descricaoMateriaisNaoEncontrados;
    private String dataSolicitacao;
    private String situacaoSolicitacao;

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getSituacaoSolicitacao() {
        return situacaoSolicitacao;
    }

    public void setSituacaoSolicitacao(String situacaoSolicitacao) {
        this.situacaoSolicitacao = situacaoSolicitacao;
    }

    public String getIdFuncionarioRequisitante() {
        return idFuncionarioRequisitante;
    }

    public void setIdFuncionarioRequisitante(String idFuncionarioRequisitante) {
        this.idFuncionarioRequisitante = idFuncionarioRequisitante;
    }

    public String getSetorFuncionarioRequisitante() {
        return setorFuncionarioRequisitante;
    }

    public void setSetorFuncionarioRequisitante(String setorFuncionarioRequisitante) {
        this.setorFuncionarioRequisitante = setorFuncionarioRequisitante;
    }

    public int getCodRequisicao() {
        return codRequisicao;
    }

    public void setCodRequisicao(int codRequisicao) {
        this.codRequisicao = codRequisicao;
    }

  

    public String getDescricaoMateriaisNaoEncontrados() {
        return descricaoMateriaisNaoEncontrados;
    }

    public void setDescricaoMateriaisNaoEncontrados(String descricaoMateriaisNaoEncontrados) {
        this.descricaoMateriaisNaoEncontrados = descricaoMateriaisNaoEncontrados;
    }
    
    
}
