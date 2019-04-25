package model;

import java.util.ArrayList;

/**
 *
 * @author Matheus Jorge
 */
public class MateriaisSolicitados {
    private int codRequisicaoCompra;
    private ArrayList<Material>materiais;
    private ArrayList<Integer>qtdeMateriais;
    private ArrayList<String>materiaisSoli;

    public int getCodRequisicaoCompra() {
        return codRequisicaoCompra; 
    }

    public void setCodRequisicaoCompra(int codRequisicaoCompra) {
        this.codRequisicaoCompra = codRequisicaoCompra;
    }

    public ArrayList<Material> getMateriais() {
        return materiais;
    }

    public void addMateriais(Material m) {
        materiais.add(m);
    }
    
    public ArrayList<Integer> getQtdeMateriais() {
        return qtdeMateriais;
    }

    public void addQtdeMaterial(int qtde) {
        qtdeMateriais.add(qtde);
    }
    
    public void addMateriaisSoli (int i , String s){
        materiaisSoli.add(i , s);
    }

    public ArrayList<String> getMateriaisSoli() {
        return materiaisSoli;
    }

    public void setMateriaisSoli(ArrayList<String> materiaisSoli) {
        this.materiaisSoli = materiaisSoli;
    }
    
    
}
