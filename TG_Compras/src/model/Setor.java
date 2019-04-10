/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Pilan
 */
public class Setor {
    
    private int codSetor;
    private String nomeSetor;
    private ArrayList<Funcionario>funcionarios;
    
    public int gerarCodSetor(){ 
        //arrumar, colocar um jeito de nao criar um codigo de setor igual ao que ja existe
        codSetor = codSetor + 1;
        return codSetor;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }
    
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
    
     public void addFuncionario(Funcionario f){
        funcionarios.add(f);
    }
}
