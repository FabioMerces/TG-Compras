/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author M
 */
public class Fornecedor_Material {
    private int CodMaterial;
    private ArrayList<Fornecedor>fornecedores;

    public int getCodMaterial() {
        return CodMaterial;
    }

    public void setCodMaterial(int CodMaterial) {
        this.CodMaterial = CodMaterial;
    }

    public ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void addFornecedor(Fornecedor f) {
        fornecedores.add(f);
    }  
    
}
