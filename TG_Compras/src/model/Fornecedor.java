/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.InputMismatchException;

/**
 *
 * @author Gabriel Pilan
 */
public class Fornecedor {

    private String CNPJ;
    private String nomeFornecedor;
    private String logradouro;
    private int numero;
    private String complemento;
    private String CEP;
    private String bairro;
    private String cidade;
    private String UF;
    private String pais;
    private String telPrincipal;
    private String telSecundario;
    private String emailFornecedor;
    private int notaPreco;
    private int notaPosVenda;
    private int notaVelocidadeEntrega;
    private int notaQualidade;

    public int calculaNotaTotal() {
        int notaTotal = 0;
        notaTotal = (notaPosVenda + notaPreco + notaQualidade + notaVelocidadeEntrega);
        notaTotal = notaTotal / 4;
        return notaTotal;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public int getNotaPreco() {
        return notaPreco;
    }

    public void setNotaPreco(int notaPreco) {
        this.notaPreco = notaPreco;
    }

    public int getNotaPosVenda() {
        return notaPosVenda;
    }

    public void setNotaPosVenda(int notaPosVenda) {
        this.notaPosVenda = notaPosVenda;
    }

    public int getNotaVelocidadeEntrega() {
        return notaVelocidadeEntrega;
    }

    public void setNotaVelocidadeEntrega(int notaVelocidadeEntrega) {
        this.notaVelocidadeEntrega = notaVelocidadeEntrega;
    }

    public int getNotaQualidade() {
        return notaQualidade;
    }

    public void setNotaQualidade(int notaQualidade) {
        this.notaQualidade = notaQualidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelPrincipal() {
        return telPrincipal;
    }

    public void setTelPrincipal(String telPrincipal) {
        this.telPrincipal = telPrincipal;
    }

    public String getTelSecundario() {
        return telSecundario;
    }

    public void setTelSecundario(String telSecundario) {
        this.telSecundario = telSecundario;
    }

    public static boolean isCNPJ(String CNPJ) {
// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111")
                || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333")
                || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777")
                || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999")
                || (CNPJ.length() != 14)) {
            return (false);
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

// "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
// converte o i-ésimo caractere do CNPJ em um número:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posição de '0' na tabela ASCII)
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

// Verifica se os dígitos calculados conferem com os dígitos informados.
            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public static String imprimeCNPJ(String CNPJ) {
// máscara do CNPJ: 99.999.999.9999-99
        return (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "."
                + CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-"
                + CNPJ.substring(12, 14));
    }

    /*
  PARA UTILIZAR O VALIDAR CNPJ:
  
  import java.util.Scanner;
// importanto a classe "ValidaCNPJ" do pacote "meuPacote"
import meuPacote.ValidaCNPJ;
 
public class ExemploCNPJ {
 
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
 
    String CNPJ;
 
    System.out.printf("Informe um CNPJ: ");
    CNPJ = ler.next();
 
    System.out.printf("\nResultado: ");
// usando os métodos isCNPJ() e imprimeCNPJ() da classe "ValidaCNPJ"
    if (ValidaCNPJ.isCNPJ(CNPJ) == true)
       System.out.printf("%s\n", ValidaCNPJ.imprimeCNPJ(CNPJ));
    else System.out.printf("Erro, CNPJ inválido !!!\n");
  }
 
}
  
  
     */
}
