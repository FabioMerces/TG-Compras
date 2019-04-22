/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Credito:
 * https://www.vivaolinux.com.br/script/Codigo-para-validar-CPF-e-CNPJ-otimizado
 *
 * @author 0030481711019 Matheus Jorge Bechara
 */
public class Utilitarios {

    private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    private static final int[] pesoCNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int calcularDigito(String str, int[] peso) {
        int soma = 0;
        for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
            digito = Integer.parseInt(str.substring(indice, indice + 1));
            soma += digito * peso[peso.length - str.length() + indice];
        }
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }

    public static boolean isValidCPF(String cpf) {
        if ((cpf == null) || (cpf.length() != 11)) {
            return false;
        }

        Integer digito1 = calcularDigito(cpf.substring(0, 9), pesoCPF);
        Integer digito2 = calcularDigito(cpf.substring(0, 9) + digito1, pesoCPF);
        return cpf.equals(cpf.substring(0, 9) + digito1.toString() + digito2.toString());
    }

    public static boolean isValidCNPJ(String cnpj) {
        if ((cnpj == null) || (cnpj.length() != 14)) {
            return false;
        }

        Integer digito1 = calcularDigito(cnpj.substring(0, 12), pesoCNPJ);
        Integer digito2 = calcularDigito(cnpj.substring(0, 12) + digito1, pesoCNPJ);
        return cnpj.equals(cnpj.substring(0, 12) + digito1.toString() + digito2.toString());
    }

    public static void limpaTela(JFrame Frame) {
        /* Limpa/Reseta os campos */
        for (int i = 0; i < Frame.getContentPane().getComponentCount(); i++) {
            //varre todos os componentes
            Component c = Frame.getContentPane().getComponent(i);
            if (c instanceof JTextField) {
                //Limpa o campo
                JTextField campo = (JTextField) c;
                campo.setText("");
            } else if (c instanceof JFormattedTextField) {
                //Limpa o campo
                JFormattedTextField campo = (JFormattedTextField) c;
                campo.setText("");
            } else if (c instanceof JComboBox) {
                //Muda o combobox para o primeiro item
                JComboBox cmb = (JComboBox) c;
                cmb.setSelectedIndex(0);
            }
        }
    }
}
