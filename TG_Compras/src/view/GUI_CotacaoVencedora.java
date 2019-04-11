/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Gabriel Pilan
 */
public class GUI_CotacaoVencedora extends javax.swing.JFrame {

    /**
     * Creates new form GUI_CotacaoVencedora
     */
    public GUI_CotacaoVencedora() {
        initComponents();
        jTableComparacaoFornecedores.setAutoCreateRowSorter(true);
        jTableCompararValor.setAutoCreateRowSorter(true); 
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        txtIDRequisicao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIDCotacao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCompararValor = new javax.swing.JTable();
        cmbCodigoMaterial = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        chkMenorPreco = new javax.swing.JCheckBox();
        chkMaiorQualidade = new javax.swing.JCheckBox();
        chkEntregaRapida = new javax.swing.JCheckBox();
        chkPossuiGarantia = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        cmbImportanciaMenorPreco = new javax.swing.JComboBox<>();
        cmbImportanciaMaiorQualidade = new javax.swing.JComboBox<>();
        cmbImportanciaEntregaRapida = new javax.swing.JComboBox<>();
        cmbImportanciaPossuiGarantia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableComparacaoFornecedores = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtFornecedorVencedor = new javax.swing.JTextField();
        btnCriarPedidodeCompra = new javax.swing.JButton();
        btnCalcularNota = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCotacaoVencedora = new javax.swing.JTextField();
        btnCopiarCodigo = new javax.swing.JButton();

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar Cotacao Vencedora");
        setAlwaysOnTop(true);

        jLabel1.setText("ID Requisição de Compra");

        jLabel2.setText("ID Cotacao");

        txtIDCotacao.setEditable(false);
        txtIDCotacao.setBackground(new java.awt.Color(204, 204, 204));
        txtIDCotacao.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtIDCotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDCotacaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome do Material Requisitado");

        jTableCompararValor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome Fornecedor", "Valor Final"
            }
        ));
        jScrollPane1.setViewportView(jTableCompararValor);

        cmbCodigoMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Necessidades da Compra");

        chkMenorPreco.setText("Menor Preco");
        chkMenorPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMenorPrecoActionPerformed(evt);
            }
        });

        chkMaiorQualidade.setText("Maior Qualidade");
        chkMaiorQualidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMaiorQualidadeActionPerformed(evt);
            }
        });

        chkEntregaRapida.setText("Entrega Rapida");
        chkEntregaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEntregaRapidaActionPerformed(evt);
            }
        });

        chkPossuiGarantia.setText("Pós Venda");
        chkPossuiGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPossuiGarantiaActionPerformed(evt);
            }
        });

        jLabel5.setText("Importância ");

        cmbImportanciaMenorPreco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Intermediaria", "Alta" }));
        cmbImportanciaMenorPreco.setEnabled(false);

        cmbImportanciaMaiorQualidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Intermediaria", "Alta" }));
        cmbImportanciaMaiorQualidade.setEnabled(false);

        cmbImportanciaEntregaRapida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Intermediaria", "Alta" }));
        cmbImportanciaEntregaRapida.setEnabled(false);

        cmbImportanciaPossuiGarantia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Intermediaria", "Alta" }));
        cmbImportanciaPossuiGarantia.setEnabled(false);

        jLabel6.setText("Tabela de Comparação de Fornecedores");

        jTableComparacaoFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Menor Preco", null, null, null},
                {"Maior Qualidade", null, null, null},
                {"Entrega Mais Rapida", null, null, null},
                {"Pos Venda", null, null, null},
                {"Media Total", null, null, null},
                {"Media Ponderada", null, null, null},
                {"Vencedor", null, null, null}
            },
            new String [] {
                "Requisito", "Nota Fornecedor 1", "Nota Fornecedor 2", "Nota Fornecedor 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableComparacaoFornecedores);

        jLabel7.setText("Com base nas necessidades o melhor fornecedor para essa compra sera:");

        txtFornecedorVencedor.setEditable(false);
        txtFornecedorVencedor.setBackground(new java.awt.Color(204, 204, 204));
        txtFornecedorVencedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btnCriarPedidodeCompra.setText("Criar Pedido de Compra do Material ");

        btnCalcularNota.setText("Calcular Nota dos Fornecedores");

        btnPesquisar.setText("Pesquisar ");

        jLabel8.setText("Codigo da Cotação Vencedora");

        txtCotacaoVencedora.setEditable(false);
        txtCotacaoVencedora.setBackground(new java.awt.Color(204, 204, 204));
        txtCotacaoVencedora.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        txtCotacaoVencedora.setEnabled(false);

        btnCopiarCodigo.setText("Copiar Codigo da Cotação vencedora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnCalcularNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chkMaiorQualidade)
                                        .addComponent(chkMenorPreco)
                                        .addComponent(chkPossuiGarantia)
                                        .addComponent(chkEntregaRapida))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbImportanciaMenorPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbImportanciaMaiorQualidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbImportanciaEntregaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbImportanciaPossuiGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel5)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCriarPedidodeCompra)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFornecedorVencedor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCotacaoVencedora, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCopiarCodigo)))
                                .addGap(206, 206, 206)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chkEntregaRapida, chkMaiorQualidade, chkMenorPreco, chkPossuiGarantia});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMenorPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbImportanciaMenorPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMaiorQualidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbImportanciaMaiorQualidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEntregaRapida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbImportanciaEntregaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPossuiGarantia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbImportanciaPossuiGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnCalcularNota)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFornecedorVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCotacaoVencedora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarCodigo))
                .addGap(18, 18, 18)
                .addComponent(btnCriarPedidodeCompra)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkMenorPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMenorPrecoActionPerformed
        if (chkMenorPreco.isSelected()){
            cmbImportanciaMenorPreco.setEnabled(true);
        }else{
            cmbImportanciaMenorPreco.setEnabled(false);
        }
    }//GEN-LAST:event_chkMenorPrecoActionPerformed

    private void chkMaiorQualidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMaiorQualidadeActionPerformed
        if (chkMaiorQualidade.isSelected()){
            cmbImportanciaMaiorQualidade.setEnabled(true);
        }else{
            cmbImportanciaMaiorQualidade.setEnabled(false);
        }
    }//GEN-LAST:event_chkMaiorQualidadeActionPerformed

    private void chkEntregaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEntregaRapidaActionPerformed
        if (chkEntregaRapida.isSelected()){
            cmbImportanciaEntregaRapida.setEnabled(true);
        }else{
            cmbImportanciaEntregaRapida.setEnabled(false);
        }
    }//GEN-LAST:event_chkEntregaRapidaActionPerformed

    private void chkPossuiGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPossuiGarantiaActionPerformed
       if (chkPossuiGarantia.isSelected()){
            cmbImportanciaPossuiGarantia.setEnabled(true);
        }else{
            cmbImportanciaPossuiGarantia.setEnabled(false);
        }
    }//GEN-LAST:event_chkPossuiGarantiaActionPerformed

    private void txtIDCotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDCotacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDCotacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_CotacaoVencedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_CotacaoVencedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_CotacaoVencedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_CotacaoVencedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_CotacaoVencedora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularNota;
    private javax.swing.JButton btnCopiarCodigo;
    private javax.swing.JButton btnCriarPedidodeCompra;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JCheckBox chkEntregaRapida;
    private javax.swing.JCheckBox chkMaiorQualidade;
    private javax.swing.JCheckBox chkMenorPreco;
    private javax.swing.JCheckBox chkPossuiGarantia;
    private javax.swing.JComboBox<String> cmbCodigoMaterial;
    private javax.swing.JComboBox<String> cmbImportanciaEntregaRapida;
    private javax.swing.JComboBox<String> cmbImportanciaMaiorQualidade;
    private javax.swing.JComboBox<String> cmbImportanciaMenorPreco;
    private javax.swing.JComboBox<String> cmbImportanciaPossuiGarantia;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableComparacaoFornecedores;
    private javax.swing.JTable jTableCompararValor;
    private javax.swing.JTextField txtCotacaoVencedora;
    private javax.swing.JTextField txtFornecedorVencedor;
    private javax.swing.JTextField txtIDCotacao;
    private javax.swing.JTextField txtIDRequisicao;
    // End of variables declaration//GEN-END:variables
}