package view;

import control.Conexao;
import control.DaoMateriaisSolicitados;
import control.DaoMaterial;
import control.DaoRequisicaoCompra;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Material;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import model.MateriaisSolicitados;
import model.RequisicaoCompra;

/**
 *
 * @author Gabriel Pilan
 */
public class GUI_RequisicaoCompra extends javax.swing.JFrame {

    /**
     * Creates new form GUI_RequisicaoCompra
     */
    DefaultTableModel dm = null;
    int flagConfirma = 0;

    public GUI_RequisicaoCompra() {
        initComponents();
        jTableRequisicaodeCompra.setAutoCreateRowSorter(true);
     
        
        
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
        txtIdFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        btnAdicionarNaLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRequisicaodeCompra = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        chkMaterialNaoCadastrado = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricaoMaterial = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnEnviarRequisicao = new javax.swing.JButton();
        btnRemoverDaLista = new javax.swing.JButton();
        txtNomeMaterial = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePesquisaMaterial = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtSetor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Requisicao de Compra");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("ID Funcionário Requisitante:");

        txtIdFuncionario.setText("12345678900");
        txtIdFuncionario.setEnabled(false);

        jLabel2.setText("Requisição de Compra");

        jLabel3.setText("Nome do Material:");

        jLabel4.setText("Quantidade");

        btnAdicionarNaLista.setText("Adicionar Item Selecionado a Requisição");
        btnAdicionarNaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarNaListaActionPerformed(evt);
            }
        });

        jTableRequisicaodeCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Material", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTableRequisicaodeCompra);

        jLabel5.setText("Tabela da Requisição de Compra");

        chkMaterialNaoCadastrado.setText("Não Encontrei Meu(s) Material(is) no Sistema");
        chkMaterialNaoCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMaterialNaoCadastradoActionPerformed(evt);
            }
        });

        txtDescricaoMaterial.setColumns(20);
        txtDescricaoMaterial.setRows(5);
        txtDescricaoMaterial.setEnabled(false);
        jScrollPane2.setViewportView(txtDescricaoMaterial);

        jLabel6.setText("Descreva em detalhes o(s) material(is) que deseja requerir");

        btnEnviarRequisicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEnviarRequisicao.setText("Enviar Requisição");
        btnEnviarRequisicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarRequisicaoActionPerformed(evt);
            }
        });

        btnRemoverDaLista.setText("Remover Item Selecionado da Requisição");
        btnRemoverDaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverDaListaActionPerformed(evt);
            }
        });

        txtNomeMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeMaterialKeyReleased(evt);
            }
        });

        jTablePesquisaMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome do Material", "Unidade Medida", "Descrição"
            }
        ));
        jScrollPane3.setViewportView(jTablePesquisaMaterial);

        jLabel7.setText("Setor do Funcionario Requisitante");

        txtSetor.setEditable(false);
        txtSetor.setText("15");
        txtSetor.setEnabled(false);

        jLabel8.setText("Tabela de Materiais");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEnviarRequisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chkMaterialNaoCadastrado))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtSetor))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(58, 58, 58)
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAdicionarNaLista)
                                    .addGap(5, 5, 5))))
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoverDaLista))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarNaLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverDaLista))
                .addGap(31, 31, 31)
                .addComponent(chkMaterialNaoCadastrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEnviarRequisicao, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkMaterialNaoCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMaterialNaoCadastradoActionPerformed

        if (chkMaterialNaoCadastrado.isSelected()) {
            txtDescricaoMaterial.setEnabled(true);
        } else {
            txtDescricaoMaterial.setEnabled(false);
        }
    }//GEN-LAST:event_chkMaterialNaoCadastradoActionPerformed

    private void Filter(String query) {

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jTablePesquisaMaterial.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("GABRIEL", "GABRIEL");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoMaterial = new DaoMaterial(conexao.conectar());
        daoReq = new DaoRequisicaoCompra(conexao.conectar());

        String sqlquery = "SELECT CodMaterial , NomeMaterial , UnidMedida , DescriptMaterial FROM tbl_material";

        Statement stmt;
        ResultSet rs;

        try {
            stmt = conexao.conectar().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(sqlquery);
            jTablePesquisaMaterial.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(GUI_PesquisarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        //PARA FAZER FUNCIONAR A PESQUISA DINAMICA PRECISA DISSO
        dm = (DefaultTableModel) jTablePesquisaMaterial.getModel();
    }//GEN-LAST:event_formWindowOpened

    private void txtNomeMaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeMaterialKeyReleased
        //PARA FAZER FUNCIONAR A PESQUISA DINAMICA PRECISA DISSO
        String query = txtNomeMaterial.getText().trim();
        Filter(query);
    }//GEN-LAST:event_txtNomeMaterialKeyReleased

    private void btnAdicionarNaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarNaListaActionPerformed
        try {
            if (jTablePesquisaMaterial.getSelectedRow() == -1) {
                throw new Exception("Nao existe nenhum Material selecionado na Tabela");
            } else if (txtQuantidade.getText().equals("")) {
                throw new Exception("A quantidade do Material requisitado não esta definida");
            } else {
                String codigo, nome;
                int qtde;

                codigo = jTablePesquisaMaterial.getValueAt(jTablePesquisaMaterial.getSelectedRow(), 0).toString();
                nome = jTablePesquisaMaterial.getValueAt(jTablePesquisaMaterial.getSelectedRow(), 1).toString();
                qtde = Integer.parseInt(txtQuantidade.getText().trim());

                DefaultTableModel model = (DefaultTableModel) jTableRequisicaodeCompra.getModel();
                model.addRow(new Object[]{codigo, nome, qtde});
                txtQuantidade.setText("");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao adicionar Material: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdicionarNaListaActionPerformed

    private void btnRemoverDaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverDaListaActionPerformed
        try {
            if (jTableRequisicaodeCompra.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Nao existe nenhum material Selecionado na Tabela", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                int SelectedRow = jTableRequisicaodeCompra.getSelectedRow();

                DefaultTableModel model = (DefaultTableModel) jTableRequisicaodeCompra.getModel();
                model.removeRow(SelectedRow);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha na remoção do material: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverDaListaActionPerformed

    private void btnEnviarRequisicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarRequisicaoActionPerformed
        material = null;
        requisicaoCompra = new RequisicaoCompra();
        materiaisSolicitados = new MateriaisSolicitados();
        try {
            if (jTableRequisicaodeCompra.getModel().getRowCount() == 0) {
                throw new Exception("Nenhum material informado na Requisição.");
            }
            int input = JOptionPane.showConfirmDialog(null, "Confirma TODOS os itens da Requisicao de Compras ?, Depois de Envia-la nao podera ser alterada ", "ATENCAO!", 2);
            if (input == 0) {
                
               //Gerando Codigo da Requisicao
                int codigo;
                codigo = requisicaoCompra.GeraCodReq();
                requisicaoCompra.setCodRequisicao(codigo);
                requisicaoCompra.setIdFuncionarioRequisitante(txtIdFuncionario.getText());
                requisicaoCompra.setSetorFuncionarioRequisitante(Integer.parseInt(txtSetor.getText()));
                
                
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date date = new Date();
                
                requisicaoCompra.setDataSolicitacao(dateFormat.format(date));
                System.out.println(dateFormat.format(date));
                
                requisicaoCompra.setDescricaoMateriaisNaoEncontrados(txtDescricaoMaterial.getText());
                requisicaoCompra.setSituacaoSolicitacao("Em Aberto");
                
                materiaisSolicitados.setCodRequisicaoCompra(codigo);
                
                
                for (int count = 0; count < jTableRequisicaodeCompra.getModel().getRowCount(); count++) {

                    String CodMatSol = jTableRequisicaodeCompra.getModel().getValueAt(count, 0).toString();
                    System.out.println(CodMatSol);

                    //txtDescricaoMaterial.setText(txtDescricaoMaterial.getText() + " " + CodMatSol);
                    material = daoMaterial.consultar(Integer.parseInt(CodMatSol));
                    System.out.println(material.getNomeMaterial());
                    if (material == null) {
                        throw new Exception("Falha ao incluir material na Requisição;"
                                + "\n[Material não encontrado]");
                    } else {
                        
                       // requisicaoCompra.setMatSolicitados(materiaisSolicitados);
                        materiaisSolicitados.addMateriais(material);
                        materiaisSolicitados.addQtdeMaterial(Integer.parseInt(jTableRequisicaodeCompra.getModel().getValueAt(count, 2).toString()));
                        
                    }
                }
            
            //requisicaoCompra.setMatSolicitados(materiaisSolicitados);
            
            daoReq.inserir(requisicaoCompra, materiaisSolicitados);
            //System.out.println("Entrou aqui");
            
            
            
            } else {
                throw new Exception("A Requisicao de Compra não foi Enviada.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar requisição: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEnviarRequisicaoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_RequisicaoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_RequisicaoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_RequisicaoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RequisicaoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_RequisicaoCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarNaLista;
    private javax.swing.JButton btnEnviarRequisicao;
    private javax.swing.JButton btnRemoverDaLista;
    private javax.swing.JCheckBox chkMaterialNaoCadastrado;
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
    private javax.swing.JTable jTablePesquisaMaterial;
    private javax.swing.JTable jTableRequisicaodeCompra;
    private javax.swing.JTextArea txtDescricaoMaterial;
    private javax.swing.JTextField txtIdFuncionario;
    private javax.swing.JTextField txtNomeMaterial;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtSetor;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao;
    private Material material;
    private DaoMaterial daoMaterial;
    private DaoRequisicaoCompra daoReq;
    private RequisicaoCompra requisicaoCompra;
    private MateriaisSolicitados materiaisSolicitados;
    private DaoMateriaisSolicitados daoMateriaisSolicitados;
}
