/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Conexao;
import control.DaoCotacao;
import control.DaoFornecedor;
import control.DaoMateriaisSolicitados;
import control.DaoMaterial;
import control.DaoPedCompra;
import control.DaoRequisicaoCompra;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cotacao;
import model.Fornecedor;
import model.MateriaisSolicitados;
import model.Material;
import model.PedidoCompra;
import model.RequisicaoCompra;

/**
 *
 * @author Gabriel Pilan
 */
public class GUI_GerenciarPedidoCompra extends javax.swing.JFrame {

    /**
     * Creates new form GUI_CriarPedidoCompra
     */
    public GUI_GerenciarPedidoCompra() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtIDCotacaoVencedora = new javax.swing.JTextField();
        btnPesquisarCotacaoVencedora = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIDMaterial = new javax.swing.JTextField();
        txtNomeMaterial = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtValorFinal = new javax.swing.JTextField();
        btnConsultarPedidosCompra = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAlterarPedidoCompra = new javax.swing.JButton();
        cmbStatusPedidoCompra = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        btnFinalizarCompra = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabelTeste = new javax.swing.JLabel();
        btnCadastrarPedidoCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Pedido de Compra");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("ID Cotação Vencedora");

        btnPesquisarCotacaoVencedora.setText("Pesquisar");
        btnPesquisarCotacaoVencedora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCotacaoVencedoraActionPerformed(evt);
            }
        });

        jLabel3.setText("Dados Fornecedor");

        jLabel4.setText("CNPJ");

        txtCNPJ.setEditable(false);
        txtCNPJ.setEnabled(false);

        jLabel5.setText("Nome");

        txtNomeFornecedor.setEditable(false);
        txtNomeFornecedor.setEnabled(false);

        jLabel6.setText("E-Mail");

        txtEmail.setEditable(false);
        txtEmail.setEnabled(false);

        jLabel7.setText("Telefone");

        txtTelefone.setEditable(false);
        txtTelefone.setEnabled(false);

        jLabel8.setText("Dados do Material");

        jLabel9.setText("ID");

        jLabel10.setText("Nome");

        jLabel11.setText("Quantidade");

        jLabel12.setText("Valor Final");

        txtIDMaterial.setEditable(false);
        txtIDMaterial.setEnabled(false);

        txtNomeMaterial.setEditable(false);
        txtNomeMaterial.setEnabled(false);

        txtQuantidade.setEditable(false);
        txtQuantidade.setEnabled(false);

        txtValorFinal.setEditable(false);
        txtValorFinal.setEnabled(false);

        btnConsultarPedidosCompra.setText("Consultar Pedidos de Compras");
        btnConsultarPedidosCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPedidosCompraActionPerformed(evt);
            }
        });

        jLabel13.setText("Dados do Pedido de Compra");

        jLabel14.setText("Status");

        btnAlterarPedidoCompra.setText("Alterar Status do Pedido de Compra");
        btnAlterarPedidoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarPedidoCompraActionPerformed(evt);
            }
        });

        cmbStatusPedidoCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguardando Aprovação da Gerencia", "Aguardando Contato com Fornecedor", "Concluído", "Negado" }));
        cmbStatusPedidoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusPedidoCompraActionPerformed(evt);
            }
        });

        jLabel20.setText("Se o contato com o Fornecedor ja foi realizado e a compra de TODOS OS MATERIAIS da Requisicao de Compra");

        btnFinalizarCompra.setText("Finalizar Compra");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        jLabel21.setText("foram oficializados clique em Finalizar Compra ");

        jLabelTeste.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTeste.setText("Teste");

        btnCadastrarPedidoCompra.setText("Cadastrar Pedido de Compra");
        btnCadastrarPedidoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPedidoCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDCotacaoVencedora, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarCotacaoVencedora))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAlterarPedidoCompra)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultarPedidosCompra))
                            .addComponent(jLabel20)
                            .addComponent(btnFinalizarCompra)
                            .addComponent(jLabel21)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEmail))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomeFornecedor)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(248, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(cmbStatusPedidoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelTeste)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeMaterial))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(33, 33, 33)
                                    .addComponent(txtIDMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnCadastrarPedidoCompra))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDCotacaoVencedora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCotacaoVencedora))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtIDMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnCadastrarPedidoCompra)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbStatusPedidoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTeste)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarPedidoCompra)
                    .addComponent(btnConsultarPedidosCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinalizarCompra)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("GABRIEL", "GABRIEL");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoCotacao = new DaoCotacao(conexao.conectar());
        daoRequisicao = new DaoRequisicaoCompra(conexao.conectar());
        daoMateriaisSolicitados = new DaoMateriaisSolicitados(conexao.conectar());
        daoMaterial = new DaoMaterial(conexao.conectar());
        daoFornecedor = new DaoFornecedor(conexao.conectar());
        daoPedCompra = new DaoPedCompra(conexao.conectar());
        
        txtIDCotacaoVencedora.setText(GUI_CotacaoVencedora.CotacaoVencedora);
        jLabelTeste.setText("<html> Se o Status estiver: " + cmbStatusPedidoCompra.getSelectedItem().toString() + 
                        "<br/> sera necessario aguardar a aprovacao devido ao valor da compra </html>");
        
    }//GEN-LAST:event_formWindowOpened

    private void cmbStatusPedidoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusPedidoCompraActionPerformed
            jLabelTeste.setText(cmbStatusPedidoCompra.getSelectedItem().toString());
            if(jLabelTeste.getText().equals("Aguardando Aprovação da Gerencia")){
                jLabelTeste.setText("<html> Se o Status estiver: " + cmbStatusPedidoCompra.getSelectedItem().toString() + 
                        "<br/> sera necessario aguardar a aprovacao devido ao valor da compra </html>");
            }else if(jLabelTeste.getText().equals("Aguardando Contato com Fornecedor")){
                jLabelTeste.setText("<html>Se o Status estiver: " + cmbStatusPedidoCompra.getSelectedItem().toString() + 
                        " significa que ja pode ser feito o contato com o fornecedor <br/>" +
                                "e que após oficializar a compra com o fornecedor o Status do pedido de compra pode "
                                + "ser Alterado para Concluído</html>");
            }else if(jLabelTeste.getText().equals("Concluído")){
                jLabelTeste.setText("Se o Status estiver: " + cmbStatusPedidoCompra.getSelectedItem().toString() + 
                        " significa que a compra ja foi realizada");
            }else if(jLabelTeste.getText().equals("Negado")){
                jLabelTeste.setText("Se o Status estiver: " + cmbStatusPedidoCompra.getSelectedItem().toString() + 
                        " significa que a gerencia nao aprovou essa compra");
            }
    }//GEN-LAST:event_cmbStatusPedidoCompraActionPerformed

    private void btnConsultarPedidosCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPedidosCompraActionPerformed
        new GUI_ConsultarPedidoCompra().setVisible(true);
    }//GEN-LAST:event_btnConsultarPedidosCompraActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        new GUI_FinalizarCompra().setVisible(true);
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void btnPesquisarCotacaoVencedoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCotacaoVencedoraActionPerformed
        //Pegando os Objetos do Banco
        int CodigoCotacaoVencedora = 0;
        CodigoCotacaoVencedora = Integer.parseInt(txtIDCotacaoVencedora.getText().toString().trim());
        System.out.println(CodigoCotacaoVencedora);
        cotacao = daoCotacao.consultar(CodigoCotacaoVencedora);
        
        if(cotacao == null){
        JOptionPane.showMessageDialog(null, "Este codigo de Cotacao nao existe, verifique se o Codigo foi digitado corretamente");
        
        }else{
        
        String CNPJ;
        CNPJ = cotacao.getCNPJ();
        fornecedor = daoFornecedor.consultar(CNPJ);
        int codMat;
        codMat = cotacao.getCodMaterial();
        material = daoMaterial.consultar(codMat);
        
        //Setando eles nos Textos
        txtCNPJ.setText(fornecedor.getCNPJ());
        txtEmail.setText(fornecedor.getEmailFornecedor());
        txtNomeFornecedor.setText(fornecedor.getNomeFornecedor());
        txtTelefone.setText(fornecedor.getTelPrincipal());
        
        txtIDMaterial.setText(Integer.toString(material.getCodMaterial()));
        txtNomeMaterial.setText(material.getNomeMaterial());
        
        txtQuantidade.setText(Integer.toString(cotacao.getQtdeMaterial()));
        float ValorTotal = 0;
        ValorTotal = cotacao.getQtdeMaterial() * cotacao.getPrecoMaterial();
        txtValorFinal.setText(Float.toString(ValorTotal));
        
        pedidoCompra = daoPedCompra.consultar(cotacao.getNumCotacao());
        if(pedidoCompra != null){
            String compara;
            compara = pedidoCompra.getSituacaoPedido();
            if(compara.equals("Aguardando Aprovação da Gerencia")){
                cmbStatusPedidoCompra.setSelectedIndex(0);
            }else if(compara.equals("Aguardando Contato com Fornecedor")){
                cmbStatusPedidoCompra.setSelectedIndex(1);
            }else if(compara.equals("Concluído")){
                cmbStatusPedidoCompra.setSelectedIndex(2);
            }else{
                cmbStatusPedidoCompra.setSelectedIndex(3);
            }
            
        }
        
       }
        
    }//GEN-LAST:event_btnPesquisarCotacaoVencedoraActionPerformed

    private void btnCadastrarPedidoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPedidoCompraActionPerformed
        pedidoCompra = new PedidoCompra();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
        
        ;
        
        //pedidoCompra.setCPFGerente(CPFGerente);
        pedidoCompra.setDataPedido(dtf.format(localDate));
        pedidoCompra.setNumCotacao(cotacao.getNumCotacao());
        pedidoCompra.setNumPedido(cotacao.getNumCotacao());
        pedidoCompra.setNumSolicitacao(cotacao.getNumSolicitacaoCompra());
        pedidoCompra.setSituacaoPedido("Aguardando Contato com Fornecedor");
        
        
        if(daoPedCompra.consultar(cotacao.getNumCotacao()) == null){
            daoPedCompra.inserir(pedidoCompra);
            JOptionPane.showMessageDialog(null, "Pedido de Compra Cadastrado com Sucesso, Entre em Contato com o Fornecedor");
        
        }else{
        JOptionPane.showMessageDialog(null, "Ja existe um Pedido de Compra cadastrado com esse Codigo de Cotacao");
        }
        
    }//GEN-LAST:event_btnCadastrarPedidoCompraActionPerformed

    private void btnAlterarPedidoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarPedidoCompraActionPerformed
        pedidoCompra = daoPedCompra.consultar(cotacao.getNumCotacao());
        pedidoCompra.setSituacaoPedido(cmbStatusPedidoCompra.getSelectedItem().toString());
        daoPedCompra.alterar(pedidoCompra);
        JOptionPane.showMessageDialog(null, "Status do Pedido de Compra alterado com sucesso");
        
    }//GEN-LAST:event_btnAlterarPedidoCompraActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_GerenciarPedidoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarPedidoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarPedidoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarPedidoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_GerenciarPedidoCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPedidoCompra;
    private javax.swing.JButton btnCadastrarPedidoCompra;
    private javax.swing.JButton btnConsultarPedidosCompra;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnPesquisarCotacaoVencedora;
    private javax.swing.JComboBox<String> cmbStatusPedidoCompra;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTeste;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDCotacaoVencedora;
    private javax.swing.JTextField txtIDMaterial;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JTextField txtNomeMaterial;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtValorFinal;
    // End of variables declaration//GEN-END:variables
private Conexao conexao = null;
    private Cotacao cotacao;
    private DaoCotacao daoCotacao;
    private RequisicaoCompra requisicao;
    private DaoRequisicaoCompra daoRequisicao;
    private List<Material> listaComboMaterial;
    private MateriaisSolicitados materiaisSolicitados;
    private DaoMateriaisSolicitados daoMateriaisSolicitados;
    private Material material;
    private DaoMaterial daoMaterial;
    private Fornecedor fornecedor;
    private DaoFornecedor daoFornecedor;
    private PedidoCompra pedidoCompra;
    private DaoPedCompra daoPedCompra;
}
