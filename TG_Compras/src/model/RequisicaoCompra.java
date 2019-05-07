/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Gabriel Pilan
 */
public class RequisicaoCompra {
    private int codRequisicao;
    private String idFuncionarioRequisitante;
    private int setorFuncionarioRequisitante;
    private String dataSolicitacao;
    private String descricaoMateriaisNaoEncontrados;
    private String situacaoSolicitacao;
    private MateriaisSolicitados materiais;

    public MateriaisSolicitados getMateriais() {
        return materiais;
    }

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

    public int getSetorFuncionarioRequisitante() {
        return setorFuncionarioRequisitante;
    }

    public void setSetorFuncionarioRequisitante(int setorFuncionarioRequisitante) {
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
    
    public void setMatSolicitados(MateriaisSolicitados ms){
        materiais = ms;
    } 
    
    public int GeraCodReq (){
    Random rand = new Random();

                 // Obtain a number between [0 - 4999].
                int codigo = rand.nextInt(5000);

                // Add 1 to the result to get a number from the required range
                // (i.e., [1 - 50]).
                codigo += 1;
                
                return codigo;
    }
}
