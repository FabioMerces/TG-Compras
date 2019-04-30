package view;

import control.Conexao;
import control.DaoMaterial;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Material;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Matheus Jorge
 */
public class GUI_PesquisarMaterial extends javax.swing.JFrame {

    /**
     * Creates new form GUI_PesquisarMaterial
     */
    DefaultTableModel dm = null;

    public GUI_PesquisarMaterial() {
        initComponents();
        jTableMateriais.setAutoCreateRowSorter(true);
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
        btnPesquisarMaterial = new javax.swing.JButton();
        rbPesquisaPorCodigo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbPesquisarPorNome = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoMaterial = new javax.swing.JTextField();
        cmbNomeMaterial = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMateriais = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnCopiarCodMat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa Material");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnPesquisarMaterial.setText("Pesquisar Material");
        btnPesquisarMaterial.setEnabled(false);
        btnPesquisarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarMaterialActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPesquisaPorCodigo);
        rbPesquisaPorCodigo.setText("Pesquisar material pelo codigo");
        rbPesquisaPorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesquisaPorCodigoActionPerformed(evt);
            }
        });

        jLabel1.setText("Código do Material");

        buttonGroup1.add(rbPesquisarPorNome);
        rbPesquisarPorNome.setText("Pesquisar material por nome");
        rbPesquisarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesquisarPorNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do Material");

        jLabel4.setText("Selecione uma opção de pesquisa do material");

        txtCodigoMaterial.setEnabled(false);
        txtCodigoMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoMaterialKeyReleased(evt);
            }
        });

        cmbNomeMaterial.setEnabled(false);
        cmbNomeMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNomeMaterialActionPerformed(evt);
            }
        });

        jTableMateriais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Unidade de Medida", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(jTableMateriais);

        jLabel3.setText("Tabela de Materiais");

        btnCopiarCodMat.setText("Copiar Código do Material Selecionado");
        btnCopiarCodMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarCodMatActionPerformed(evt);
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
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPesquisarMaterial))
                                    .addComponent(rbPesquisaPorCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbPesquisarPorNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCopiarCodMat)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbPesquisaPorCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarMaterial)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbPesquisarPorNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnCopiarCodMat)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbPesquisaPorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesquisaPorCodigoActionPerformed
        if (rbPesquisaPorCodigo.isSelected()) {
            txtCodigoMaterial.setEnabled(true);
            btnPesquisarMaterial.setEnabled(true);
            cmbNomeMaterial.setEnabled(false);
        } else {
            txtCodigoMaterial.setEnabled(false);
            btnPesquisarMaterial.setEnabled(false);
        }
    }//GEN-LAST:event_rbPesquisaPorCodigoActionPerformed

    private void rbPesquisarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesquisarPorNomeActionPerformed
        if (rbPesquisarPorNome.isSelected()) {
            cmbNomeMaterial.setEnabled(true);
            txtCodigoMaterial.setEnabled(false);
            btnPesquisarMaterial.setEnabled(false);

        } else {
            cmbNomeMaterial.setEnabled(false);
        }
    }//GEN-LAST:event_rbPesquisarPorNomeActionPerformed

    private void btnCopiarCodMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarCodMatActionPerformed
        String myString = jTableMateriais.getValueAt(jTableMateriais.getSelectedRow(), 0).toString();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_btnCopiarCodMatActionPerformed

    private void btnPesquisarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarMaterialActionPerformed
        material = null;
        try {
            if (txtCodigoMaterial.getText().isEmpty()) {
                throw new Exception("Codigo do Material não foi informado.\n"
                        + "Por favor informar um código de material p/ pesquisa.");
            } else {
                material = daoMaterial.consultar(Integer.parseInt(txtCodigoMaterial.getText().trim()));

                if (material == null) {
                    throw new Exception("Codigo do material informado não existe.\n "
                            + "Use a lista de materiais p/ procura-lo pelo seu nome caso não lembre seu código.");
                } else {
                    for (int i = 0; i < listaComboMaterial.size(); i++) {
                        if (material.getCodMaterial() == listaComboMaterial.get(i).getCodMaterial()) {
                            cmbNomeMaterial.setSelectedItem(material.getNomeMaterial());
                            break;
                        }
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao pesquisar material: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarMaterialActionPerformed

    //PARA FAZER FUNCIONAR A PESQUISA DINAMICA PRECISA DISSO
    private void filter(String query) {
        //TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        TableRowSorter<DefaultTableModel> tr = (TableRowSorter) jTableMateriais.getRowSorter();
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


    private void txtCodigoMaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoMaterialKeyReleased
        String query = txtCodigoMaterial.getText().trim();
        filter(query);
    }//GEN-LAST:event_txtCodigoMaterialKeyReleased

    private void cmbNomeMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNomeMaterialActionPerformed
        if (listaComboMaterial != null) {
            txtCodigoMaterial.setText(String.valueOf(listaComboMaterial.get(cmbNomeMaterial.getSelectedIndex()).getCodMaterial()));
            if (rbPesquisarPorNome.isSelected()) {
                filter(txtCodigoMaterial.getText().trim());
            }
        } else {
            System.out.println("Lista de Materiais vázia.");
        }
    }//GEN-LAST:event_cmbNomeMaterialActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("GABRIEL", "GABRIEL");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoMaterial = new DaoMaterial(conexao.conectar());

        String sqlquery = "SELECT CodMaterial , NomeMaterial , UnidMedida , DescriptMaterial FROM tbl_material";

        Statement stmt;
        ResultSet rs;

        /*Populando jTableMaterial*/
        try {
            stmt = conexao.conectar().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(sqlquery);
            jTableMateriais.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(GUI_PesquisarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        //PARA FAZER FUNCIONAR A PESQUISA DINAMICA PRECISA DISSO
        dm = (DefaultTableModel) jTableMateriais.getModel();

        /*Populando cmbNomeMaterial*/
        try {
            listaComboMaterial = daoMaterial.listarMaterial();

            for (int i = 0; i < listaComboMaterial.size(); i++) {
                cmbNomeMaterial.addItem(listaComboMaterial.get(i).getNomeMaterial());
            }
            txtCodigoMaterial.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao iniciar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(GUI_PesquisarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PesquisarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PesquisarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PesquisarMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PesquisarMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiarCodMat;
    private javax.swing.JButton btnPesquisarMaterial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbNomeMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMateriais;
    private javax.swing.JRadioButton rbPesquisaPorCodigo;
    private javax.swing.JRadioButton rbPesquisarPorNome;
    private javax.swing.JTextField txtCodigoMaterial;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao = null;
    private Material material = null;
    private DaoMaterial daoMaterial = null;
    private List<Material> listaComboMaterial = null;
}
