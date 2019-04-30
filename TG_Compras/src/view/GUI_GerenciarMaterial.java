/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Conexao;
import control.DaoMaterial;
import control.DaoUsuario;
import javax.swing.JOptionPane;
import model.Material;

/**
 *
 * @author Gabriel Pilan
 */
public class GUI_GerenciarMaterial extends javax.swing.JFrame {

    /**
     * Creates new form GUI_CadastrarMaterial
     */
    public GUI_GerenciarMaterial() {
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

        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoMaterial = new javax.swing.JTextField();
        txtNomeMaterial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbUnidadeMedida = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Materiais");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setEnabled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo Material");

        jLabel2.setText("Nome Material");

        txtNomeMaterial.setToolTipText("");
        txtNomeMaterial.setEnabled(false);

        jLabel3.setText("Unidade de Medida");

        cmbUnidadeMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ML", "LT", "KG", "MG", "UN" }));
        cmbUnidadeMedida.setEnabled(false);

        jLabel4.setText("Descrição Material");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setEnabled(false);
        jScrollPane1.setViewportView(txtDescricao);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar)
                        .addGap(12, 12, 12)
                        .addComponent(btnAlterar)
                        .addGap(13, 13, 13)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeMaterial)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 80, Short.MAX_VALUE))))
                        .addComponent(jScrollPane1)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnExcluir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnExcluir});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         conexao = new Conexao("JesusOrly", "JesusOrly");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe"); 
        daoMaterial = new DaoMaterial(conexao.conectar());
        //TESTE
        //Outro Teste
        //GIT
        //TESTE FINAL!!!
    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        material = null;

        int codMaterial = Integer.parseInt(txtCodigoMaterial.getText());

        material = daoMaterial.consultar(codMaterial);

        if (material == null) {
            btnBuscar.setEnabled(false);
            btnCadastrar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

            txtCodigoMaterial.setEnabled(false);
            txtDescricao.setEnabled(true);
            txtNomeMaterial.setEnabled(true);
            cmbUnidadeMedida.setEnabled(true);

        } else {
            btnBuscar.setEnabled(false);
            btnCadastrar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);

            txtCodigoMaterial.setEnabled(false);
            txtDescricao.setEnabled(true);
            txtNomeMaterial.setEnabled(true);
            cmbUnidadeMedida.setEnabled(true);

            txtDescricao.setText(material.getDescricaoMaterial());
            txtNomeMaterial.setText(material.getNomeMaterial());
            cmbUnidadeMedida.setSelectedItem(material.getUnidadeMedida());

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        material = new Material();
        boolean flagVerificaTudo = true;

        material.setCodMaterial(Integer.parseInt(txtCodigoMaterial.getText()));
        material.setNomeMaterial(txtNomeMaterial.getText());
        material.setUnidadeMedida(cmbUnidadeMedida.getSelectedItem().toString());
        material.setDescricaoMaterial(txtDescricao.getText());

        if (txtDescricao.getText().isEmpty() || txtNomeMaterial.getText().isEmpty()) {
            flagVerificaTudo = false;
        }
        System.out.println(txtCodigoMaterial.getText());
        System.out.println(txtDescricao.getText());
        System.out.println(txtNomeMaterial.getText());

        if (flagVerificaTudo == true) {
            daoMaterial.inserir(material);

            txtCodigoMaterial.setEnabled(true);
            txtDescricao.setEnabled(false);
            txtNomeMaterial.setEnabled(false);
            cmbUnidadeMedida.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Cadastro do Material: " + txtNomeMaterial.getText() + " concluido com Sucesso");

            txtCodigoMaterial.setText("");
            txtDescricao.setText("");
            txtNomeMaterial.setText("");

            btnBuscar.setEnabled(true);
            btnCadastrar.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Existe um ou mais campos não preenchidos Corretamente Por Favor verifique os dados");
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        boolean flagVerificaTudo = true;
        //INCLUIR VERIFICACAO DE DADOS
        if (txtDescricao.getText().isEmpty() || txtNomeMaterial.getText().isEmpty()) {
            flagVerificaTudo = false;
        }

        material.setCodMaterial(Integer.parseInt(txtCodigoMaterial.getText()));
        material.setNomeMaterial(txtNomeMaterial.getText());
        material.setUnidadeMedida(cmbUnidadeMedida.getSelectedItem().toString());
        material.setDescricaoMaterial(txtDescricao.getText());

        if (flagVerificaTudo == true) {
            daoMaterial.alterar(material);

            txtCodigoMaterial.setEnabled(true);
            txtDescricao.setEnabled(false);
            txtNomeMaterial.setEnabled(false);
            cmbUnidadeMedida.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Dados do Material: " + txtNomeMaterial.getText() + " alterados com Sucesso");

            txtCodigoMaterial.setText("");
            txtDescricao.setText("");
            txtNomeMaterial.setText("");

            btnBuscar.setEnabled(true);
            btnCadastrar.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Existe um ou mais campos não preenchidos Corretamente Por Favor verifique os dados");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        daoMaterial.excluir(material);

        txtCodigoMaterial.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtNomeMaterial.setEnabled(false);
        cmbUnidadeMedida.setEnabled(false);

        txtCodigoMaterial.setText("");
        txtDescricao.setText("");
        txtNomeMaterial.setText("");

        btnBuscar.setEnabled(true);
        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        JOptionPane.showMessageDialog(null, "Material Excluido com Sucesso");
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_GerenciarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_GerenciarMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cmbUnidadeMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoMaterial;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNomeMaterial;
    // End of variables declaration//GEN-END:variables
private Conexao conexao = null;
    private DaoMaterial daoMaterial = null;
    private Material material = null;
}
