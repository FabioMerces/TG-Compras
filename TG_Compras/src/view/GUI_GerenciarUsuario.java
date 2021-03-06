/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Conexao;
import control.DaoUsuario;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Gabriel Pilan
 */
public class GUI_GerenciarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form GUI_GerenciarUsuario
     */
    public GUI_GerenciarUsuario() {
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

        btgrpPermissao = new javax.swing.ButtonGroup();
        pnlDadosUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        pnlPermissao = new javax.swing.JPanel();
        rdbFuncRegular = new javax.swing.JRadioButton();
        rdbFuncCompras = new javax.swing.JRadioButton();
        rdbGerente = new javax.swing.JRadioButton();
        rdbAdministradorSistema = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Usuários");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlDadosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Dados do Usuário"));

        jLabel1.setText("Usuário (CPF)");

        jLabel2.setText("Senha");

        txtSenha.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Sua senha deve conter no maximo 12 Caracteres");

        javax.swing.GroupLayout pnlDadosUsuarioLayout = new javax.swing.GroupLayout(pnlDadosUsuario);
        pnlDadosUsuario.setLayout(pnlDadosUsuarioLayout);
        pnlDadosUsuarioLayout.setHorizontalGroup(
            pnlDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha)
                            .addComponent(txtUsuario)))
                    .addGroup(pnlDadosUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDadosUsuarioLayout.setVerticalGroup(
            pnlDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(23, 23, 23))
        );

        pnlPermissao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Tipo de Funcionario"));

        btgrpPermissao.add(rdbFuncRegular);
        rdbFuncRegular.setText("Funcionário de outro departamento");
        rdbFuncRegular.setEnabled(false);

        btgrpPermissao.add(rdbFuncCompras);
        rdbFuncCompras.setText("Funcionário do Setor de Compras");
        rdbFuncCompras.setEnabled(false);

        btgrpPermissao.add(rdbGerente);
        rdbGerente.setText("Gerente do Setor de Compras");
        rdbGerente.setEnabled(false);

        btgrpPermissao.add(rdbAdministradorSistema);
        rdbAdministradorSistema.setText("Administrador do Sistema");
        rdbAdministradorSistema.setEnabled(false);

        javax.swing.GroupLayout pnlPermissaoLayout = new javax.swing.GroupLayout(pnlPermissao);
        pnlPermissao.setLayout(pnlPermissaoLayout);
        pnlPermissaoLayout.setHorizontalGroup(
            pnlPermissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPermissaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPermissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbFuncRegular)
                    .addComponent(rdbFuncCompras)
                    .addComponent(rdbGerente)
                    .addComponent(rdbAdministradorSistema))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPermissaoLayout.setVerticalGroup(
            pnlPermissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPermissaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbFuncRegular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbFuncCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbAdministradorSistema)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Gerenciar Funcionário");

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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(pnlPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnExcluir, btnPesquisar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar)
                            .addComponent(btnAlterar)
                            .addComponent(btnExcluir)
                            .addComponent(btnPesquisar)))
                    .addComponent(pnlPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            usuario = null;
            String cpf = txtUsuario.getText();

            usuario = daoUsuario.consultar(cpf);

            if (usuario == null) {
                btnPesquisar.setEnabled(false);
                btnCadastrar.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                txtUsuario.setEnabled(false);
                txtSenha.setEnabled(true);
                rdbAdministradorSistema.setEnabled(true);
                rdbFuncCompras.setEnabled(true);
                rdbFuncRegular.setEnabled(true);
                rdbGerente.setEnabled(true);

            } else {
                
                txtUsuario.setText(usuario.getIdUsuario());
                txtSenha.setText(usuario.getSenha());
                
                tipoUsuario = usuario.getTipoUsuario();         
         
                if(tipoUsuario.equals("A")){ //Adm Sistma
                rdbAdministradorSistema.setSelected(true);
                }else if(tipoUsuario.equals("C")){ //Funcionario Compras
                    rdbFuncCompras.setSelected(true);
                    }else if(tipoUsuario.equals("O")){ //Funcionario Outro Setor
                        rdbFuncRegular.setSelected(true);
                        }else{                              //Gerente Compras -> letra G
                            rdbGerente.setSelected(true);
                            }

                btnPesquisar.setEnabled(false);
                btnCadastrar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                txtUsuario.setEnabled(false);
                txtSenha.setEnabled(true);
                rdbAdministradorSistema.setEnabled(true);
                rdbFuncCompras.setEnabled(true);
                rdbFuncRegular.setEnabled(true);
                rdbGerente.setEnabled(true);

            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("GABRIEL", "GABRIEL");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoUsuario = new DaoUsuario(conexao.conectar());
        
        JOptionPane.showMessageDialog(null, "Atencao! \n para cadastrar ou excluir um usuario" +
                 " sera necessario seu cadastro ou exclusao previamente no sistema de RH da empresa");
         
    }//GEN-LAST:event_formWindowOpened

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        usuario = new Usuario();
        boolean flagVerificaTudo = true;
        
        usuario.setIdUsuario(txtUsuario.getText());
        usuario.setSenha(txtSenha.getText());
        
        //Verificar Qual RB esta selecionado         
        if(rdbAdministradorSistema.isSelected()){ //Adm Sistma
                usuario.setTipoUsuario("A");
                }else if(rdbFuncCompras.isSelected()){ //Funcionario Compras
                    usuario.setTipoUsuario("C");
                    }else if(rdbFuncRegular.isSelected()){ //Funcionario Outro Setor
                        usuario.setTipoUsuario("O");
                        }else if(rdbGerente.isSelected()){  //Gerente Compras 
                            usuario.setTipoUsuario("G");
                            }else{
                                flagVerificaTudo = false;
                            }
        
        if(txtUsuario.getText().isEmpty()|| txtSenha.getText().isEmpty() || txtSenha.getPassword().length >= 13 
                || txtUsuario.getText().length() > 11){
            flagVerificaTudo = false;
        }
        
        if(flagVerificaTudo == true){
        daoUsuario.inserir(usuario);   

        rdbAdministradorSistema.setSelected(false);
        rdbFuncCompras.setSelected(false);
        rdbFuncRegular.setSelected(false);
        rdbGerente.setSelected(false);
        
        JOptionPane.showMessageDialog(null, "Cadastro do Usuario: " + txtUsuario.getText() + " concluido com Sucesso");
        
        
        txtUsuario.setText("");
        txtSenha.setText("");
        
        btnPesquisar.setEnabled(true);
        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtUsuario.setEnabled(true);
        txtSenha.setEnabled(false);
        rdbAdministradorSistema.setEnabled(false);
        rdbFuncCompras.setEnabled(false);
        rdbFuncRegular.setEnabled(false);
        rdbGerente.setEnabled(false);
        
        }else{
        JOptionPane.showMessageDialog(null, "Existe um ou mais campos não preenchidos Corretamente verifique os dados\n"
        + "Verifique se o CPF foi digitado Corretamente, Se a Senha tem 12 ou menos caracteres e se foi escolhido um tipo de usuario");}
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        boolean flagVerificaTudo = true;
        
        usuario.setIdUsuario(txtUsuario.getText());
        usuario.setSenha(txtSenha.getText());
        
        //Verificar Qual RB esta selecionado         
        if(rdbAdministradorSistema.isSelected()){ //Adm Sistma
                usuario.setTipoUsuario("A");
                }else if(rdbFuncCompras.isSelected()){ //Funcionario Compras
                    usuario.setTipoUsuario("C");
                    }else if(rdbFuncRegular.isSelected()){ //Funcionario Outro Setor
                        usuario.setTipoUsuario("O");
                        }else if(rdbGerente.isSelected()){  //Gerente Compras 
                            usuario.setTipoUsuario("G");
                            }else{
                                flagVerificaTudo = false;
                            }
        
        if(txtUsuario.getText().isEmpty()|| txtSenha.getText().isEmpty() || txtSenha.getPassword().length >= 13
                || txtUsuario.getText().length() > 11){
            flagVerificaTudo = false;
        }
        
        if(flagVerificaTudo == true){
        daoUsuario.alterar(usuario);

        rdbAdministradorSistema.setSelected(false);
        rdbFuncCompras.setSelected(false);
        rdbFuncRegular.setSelected(false);
        rdbGerente.setSelected(false);
        
        JOptionPane.showMessageDialog(null, "Alteração dos Dados do Usuario: " + txtUsuario.getText() + " concluido com Sucesso");
        
        
        txtUsuario.setText("");
        txtSenha.setText("");
        
        btnPesquisar.setEnabled(true);
        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtUsuario.setEnabled(true);
        txtSenha.setEnabled(false);
        rdbAdministradorSistema.setEnabled(false);
        rdbFuncCompras.setEnabled(false);
        rdbFuncRegular.setEnabled(false);
        rdbGerente.setEnabled(false);
        
        }else{
        JOptionPane.showMessageDialog(null, "Existe um ou mais campos não preenchidos Corretamente verifique os dados\n"
        + "Verifique se o CPF foi digitado Corretamente, Se a Senha tem 12 ou menos caracteres e se foi escolhido um tipo de usuario");
        }
       

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       
        daoUsuario.exlcuir(usuario);
        
        
        rdbAdministradorSistema.setSelected(false);
        rdbFuncCompras.setSelected(false);
        rdbFuncRegular.setSelected(false);
        rdbGerente.setSelected(false);
        
        txtUsuario.setText("");
        txtSenha.setText("");
        
        btnPesquisar.setEnabled(true);
        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtUsuario.setEnabled(true);
        txtSenha.setEnabled(false);
        rdbAdministradorSistema.setEnabled(false);
        rdbFuncCompras.setEnabled(false);
        rdbFuncRegular.setEnabled(false);
        rdbGerente.setEnabled(false);
        
        //NA VERDADE A EXCLUSAO AINDA NAO TA FUNCIONANDO ASSIM COMO O CADSATRO PRECISA VER COMO SERA FEITA
        //POR CAUSA DA RESTRICAO COM A TABELA PESSOA
        
        JOptionPane.showMessageDialog(null, "Exclusao Realizada com Sucesso");
        
        
        
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
            java.util.logging.Logger.getLogger(GUI_GerenciarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_GerenciarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgrpPermissao;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnlDadosUsuario;
    private javax.swing.JPanel pnlPermissao;
    private javax.swing.JRadioButton rdbAdministradorSistema;
    private javax.swing.JRadioButton rdbFuncCompras;
    private javax.swing.JRadioButton rdbFuncRegular;
    private javax.swing.JRadioButton rdbGerente;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    private DaoUsuario daoUsuario = null;
    private Usuario usuario = null;
    private Conexao conexao = null;
    private String tipoUsuario = null;
}
