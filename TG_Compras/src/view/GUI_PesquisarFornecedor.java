/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

/**
 *
 * @author M
 */
public class GUI_PesquisarFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form GUI_PesquisarFornecedor
     */
    //PARA FAZER FUNCIONAR A PESQUISA DINAMICA PRECISA DISSO
    DefaultTableModel dm = null;

    public GUI_PesquisarFornecedor() {
        initComponents();

        jTableFornecedores.setAutoCreateRowSorter(true);

        conexao = new Conexao("GABRIEL", "GABRIEL");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");

        //PARA CARREGAR DADOS DO BANCO DE DADOS NA TABELA
        String sqlquery = "Select CNPJ , NOMEFORNECEDOR , CEP , CIDADE , UF , TELPRINCIPAL , TELSECUNDARIO , EMAIL from tbl_fornecedor";
        Statement stmt;
        ResultSet rs;
        try {
            stmt = conexao.conectar().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(sqlquery);
            jTableFornecedores.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(GUI_PesquisarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        //PARA FAZER FUNCIONAR A PESQUISA DINAMICA PRECISA DISSO
        dm = (DefaultTableModel) jTableFornecedores.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbPesquisaPorCNPJ = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbPesquisarPorNome = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnCopiarCNPJ = new javax.swing.JButton();
        ftxtCNPJ = new javax.swing.JFormattedTextField();
        txtNomeFornecedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Fornecedor");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        buttonGroup1.add(rbPesquisaPorCNPJ);
        rbPesquisaPorCNPJ.setText("Pesquisar Fornecedor pelo CNPJ");
        rbPesquisaPorCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesquisaPorCNPJActionPerformed(evt);
            }
        });

        jLabel1.setText("CNPJ");

        buttonGroup1.add(rbPesquisarPorNome);
        rbPesquisarPorNome.setText("Pesquisar fornecedor por Nome/Razão Social");
        rbPesquisarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesquisarPorNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome/Razão Social");

        jLabel4.setText("Selecione uma opção de pesquisa do fornecedor");

        jTableFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CNPJ", "Nome/Razão Social", "Endereço", "Telefone", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(jTableFornecedores);

        jLabel3.setText("Tabela de Fornecedores");

        btnCopiarCNPJ.setText("Copiar CNPJ do Fornecedor Selecionado");
        btnCopiarCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarCNPJActionPerformed(evt);
            }
        });

        try {
            ftxtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCNPJ.setEnabled(false);
        ftxtCNPJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ftxtCNPJKeyReleased(evt);
            }
        });

        txtNomeFornecedor.setEnabled(false);
        txtNomeFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeFornecedorKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("*Atencao a pesquisa feita eh Case Sensitive ou seja, maiusculas e minusculas serao diferenciadas na pesquisa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftxtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rbPesquisaPorCNPJ))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbPesquisarPorNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCopiarCNPJ)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(ftxtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPesquisarPorNome)
                            .addComponent(rbPesquisaPorCNPJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addComponent(btnCopiarCNPJ)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //PARA FAZER FUNCIONAR A PESQUISA DINAMICA PRECISA DISSO
    private void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = (TableRowSorter) jTableFornecedores.getRowSorter();
        if (query.length() == 0) {
            tr.setRowFilter(null);
        } else {
            try {
                RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter(query, 0, 1);
                tr.setRowFilter(rf);
            } catch (java.util.regex.PatternSyntaxException e) {
                tr.setRowFilter(null);
            }
        }
    }

    private void rbPesquisaPorCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesquisaPorCNPJActionPerformed
        if (rbPesquisaPorCNPJ.isSelected()) {
            ftxtCNPJ.setEnabled(true);
            txtNomeFornecedor.setText("");
            txtNomeFornecedor.setEnabled(false);

        } else {
            ftxtCNPJ.setEnabled(false);

        }
    }//GEN-LAST:event_rbPesquisaPorCNPJActionPerformed

    private void rbPesquisarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesquisarPorNomeActionPerformed
        if (rbPesquisarPorNome.isSelected()) {
            txtNomeFornecedor.setEnabled(true);
            ftxtCNPJ.setEnabled(false);

        } else {
            txtNomeFornecedor.setEnabled(false);
        }
    }//GEN-LAST:event_rbPesquisarPorNomeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void ftxtCNPJKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxtCNPJKeyReleased
        //PARA FAZER FUNCIONAR A PESQUISA DINAMICA PRECISA DISSO
        String query = ftxtCNPJ.getText().replace(".", "").replace("-", "").replace("/", "").trim();
        filter(query);
    }//GEN-LAST:event_ftxtCNPJKeyReleased

    private void txtNomeFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeFornecedorKeyReleased
        //PARA FAZER FUNCIONAR A PESQUISA DINAMICA PRECISA DISSO
        String query = txtNomeFornecedor.getText();
        filter(query);
    }//GEN-LAST:event_txtNomeFornecedorKeyReleased

    private void btnCopiarCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarCNPJActionPerformed
        //PARA COPIAR O TEXTO SELECIONADO DA TABELA PARA O BUFFER (CLIPBOARD)
        String myString = jTableFornecedores.getValueAt(jTableFornecedores.getSelectedRow(), 0).toString();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopiarCNPJActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_PesquisarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PesquisarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PesquisarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PesquisarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PesquisarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiarCNPJ;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField ftxtCNPJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedores;
    private javax.swing.JRadioButton rbPesquisaPorCNPJ;
    private javax.swing.JRadioButton rbPesquisarPorNome;
    private javax.swing.JTextField txtNomeFornecedor;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao = null;
}
