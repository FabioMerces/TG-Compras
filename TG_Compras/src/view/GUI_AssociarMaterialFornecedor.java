package view;

import control.Conexao;
import control.DaoFornecedor;
import control.DaoMaterial;
import control.DaoMaterialFornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedor;
import model.Fornecedor_Material;
import model.Material;

/**
 *
 * @author Matheus Jorge
 */
public class GUI_AssociarMaterialFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form GUI_AssociarMaterialFornecedor
     */
    public GUI_AssociarMaterialFornecedor() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbMaterial = new javax.swing.JComboBox<>();
        cmbFornecedor = new javax.swing.JComboBox<>();
        btnAssociarMaterialFornecedor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoMaterial = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Associar Material Fornecedor");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Associar Material Fornecedor");

        jLabel2.setText("Nome do Material a ser Associado");

        jLabel3.setText("Nome Fornecedor ");

        cmbMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMaterialActionPerformed(evt);
            }
        });

        cmbFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFornecedorActionPerformed(evt);
            }
        });

        btnAssociarMaterialFornecedor.setText("Associar Material ao Fornecedor");
        btnAssociarMaterialFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociarMaterialFornecedorActionPerformed(evt);
            }
        });

        jLabel4.setText("CNPJ Fornecedor");

        jLabel5.setText("Codigo do Material");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigoMaterial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCNPJ))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAssociarMaterialFornecedor)
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnAssociarMaterialFornecedor)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssociarMaterialFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociarMaterialFornecedorActionPerformed
        try {
            String CNPJ;
            if (matForn == null || material == null) {
                throw new Exception("Não é possível ligação entre material e fornecedor."
                        + "\nMaterial não informado.");
            } else {
                List<Fornecedor> listaFornecedores = matForn.getFornecedores();
                if (!txtCNPJ.getText().isEmpty()) {/*Inserção do Fornecedor pelo txt */
                    CNPJ = txtCNPJ.getText().replace(".", "").replace("-", "").replace("/", "");
                    /*Adcionar validaCNPJ dps(Motivo: Teste Livre)*/
                    fornecedor = daoFornecedor.consultar(CNPJ);

                    if (fornecedor.getCNPJ() == null) {
                        throw new Exception("Fornecedor não cadstrado ou CNPJ incorreto.");
                    }
                } else {/*Inserção do Fornecedor pelo combobox */
                    fornecedor = listaComboFornecedor.get(cmbFornecedor.getSelectedIndex());
                }
                for (int i = 0; i < listaFornecedores.size(); i++) {
                    if (listaFornecedores.get(i).getCNPJ().equals(fornecedor.getCNPJ())) {
                        throw new Exception("Material e Fornecedor informados já vínculados.");
                    }
                }
                matForn.addFornecedor(fornecedor);
                matForn.setCodMaterial(material.getCodMaterial());
                if (JOptionPane.showConfirmDialog(null, "Deseja vincular Material[" + material.getNomeMaterial()
                        + "] e Fornecedor[" + fornecedor.getNomeFornecedor() + "] ?", "Confirmação de Vínculo",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                    daoMatForn.inserir(matForn);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao Associar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAssociarMaterialFornecedorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("GABRIEL", "GABRIEL");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoMaterial = new DaoMaterial(conexao.conectar());
        daoFornecedor = new DaoFornecedor(conexao.conectar());
        daoMatForn = new DaoMaterialFornecedor(conexao.conectar());
        listaComboFornecedor = daoFornecedor.listarFornecedores();
        listaComboMaterial = daoMaterial.listarMaterial();
        try {
            for (int i = 0; i < listaComboFornecedor.size(); i++) {
                cmbFornecedor.addItem(listaComboFornecedor.get(i).getNomeFornecedor());
            }
            for (int i = 0; i < listaComboMaterial.size(); i++) {
                cmbMaterial.addItem(listaComboMaterial.get(i).getNomeMaterial());
            }
            txtCodigoMaterial.setText("");
            txtCNPJ.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao iniciar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            matForn = null;
            material = null;
            if (txtCodigoMaterial.getText().isEmpty()) {
                throw new Exception("Codigo do Material não foi informado.\n"
                        + "Por favor informar um código de material p/ pesquisa.");
            } else {
                material = daoMaterial.consultar(Integer.parseInt(txtCodigoMaterial.getText().trim()));

                if (material == null) {
                    throw new Exception("Codigo do material informado não existe.\n "
                            + "Use a lista de materiais p/ procura-lo por nome caso não lembre seu código.");
                } else {
                    for (int i = 0; i < listaComboMaterial.size(); i++) {
                        if (material.getCodMaterial() == listaComboMaterial.get(i).getCodMaterial()) {
                            cmbMaterial.setSelectedItem(material.getNomeMaterial());
                            matForn = daoMatForn.consultar(material.getCodMaterial());
                            break;
                        }
                    }
                    if (matForn == null) {
                        /* Material Sem Sínculo */
                        matForn = new Fornecedor_Material();
                        matForn.setCodMaterial(material.getCodMaterial());
                    } else {
                        /*Material Com Vinculo */
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cmbMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMaterialActionPerformed
        if (listaComboMaterial != null) {
            txtCodigoMaterial.setText(String.valueOf(listaComboMaterial.get(cmbMaterial.getSelectedIndex()).getCodMaterial()));
        } else {
            System.out.println("Lista de Materiais vázia.");
        }
    }//GEN-LAST:event_cmbMaterialActionPerformed

    private void cmbFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFornecedorActionPerformed
        if (listaComboFornecedor != null) {
            txtCNPJ.setText(listaComboFornecedor.get(cmbFornecedor.getSelectedIndex()).getCNPJ());
        } else {
            System.out.println("Lista de Fornecedores vázia.");
        }
    }//GEN-LAST:event_cmbFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_AssociarMaterialFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_AssociarMaterialFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_AssociarMaterialFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_AssociarMaterialFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_AssociarMaterialFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssociarMaterialFornecedor;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbFornecedor;
    private javax.swing.JComboBox<String> cmbMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtCodigoMaterial;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao = null;
    private DaoMaterial daoMaterial;
    private DaoFornecedor daoFornecedor;
    private DaoMaterialFornecedor daoMatForn;
    private List<Fornecedor> listaComboFornecedor;
    private List<Material> listaComboMaterial;
    private Material material = null;
    private Fornecedor fornecedor = null;
    private Fornecedor_Material matForn = null;
}
