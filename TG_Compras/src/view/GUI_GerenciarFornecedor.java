/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Conexao;
import control.DaoFornecedor;
import javax.swing.JOptionPane;
import model.Fornecedor;

/**
 *
 * @author M
 */
public class GUI_GerenciarFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form GUI_GerenciarFornecedor
     */
    public GUI_GerenciarFornecedor() {
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

        jToolBar1 = new javax.swing.JToolBar();
        btnBuscar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtTelPrincipal = new javax.swing.JFormattedTextField();
        txtTelSecundario = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Fornecedor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cadastro de Fornecedor");

        jLabel2.setText("Nome/Razão Social *");

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtRazaoSocial.setEnabled(false);

        jLabel3.setText("CNPJ *");

        jLabel4.setText("Logradouro");

        jLabel5.setText("Número *");

        jLabel6.setText("Complemento");

        txtLogradouro.setEnabled(false);

        txtNumero.setEnabled(false);

        txtComplemento.setEnabled(false);

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setEnabled(false);

        jLabel7.setText("CEP *");

        jLabel8.setText("Bairro");

        txtBairro.setEnabled(false);

        txtCidade.setEnabled(false);

        jLabel9.setText("Cidade");

        jLabel10.setText("UF");

        txtUF.setEnabled(false);
        txtUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUFActionPerformed(evt);
            }
        });

        jLabel11.setText("País");

        txtPais.setEnabled(false);

        jLabel22.setText("Telefone Principal");

        try {
            txtTelPrincipal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelPrincipal.setEnabled(false);

        try {
            txtTelSecundario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelSecundario.setEnabled(false);

        jLabel23.setText("Telefone Secundário");

        jLabel24.setText("E-mail *");

        txtEmail.setEnabled(false);

        jLabel12.setText("* Preenchimento Obrigatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(txtTelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(txtTelSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtLogradouro))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel3)
                                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtComplemento, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRazaoSocial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel12)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnBuscar, btnCadastrar, btnExcluir});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBairro, txtCidade, txtPais});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtTelPrincipal, txtTelSecundario});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnBuscar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnBuscar, btnCadastrar, btnExcluir});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCEP, txtCNPJ, txtComplemento});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBairro, txtCidade, txtPais});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtTelPrincipal, txtTelSecundario});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            fornecedor = null;

            String CNPJ = txtCNPJ.getText().replace(".", "").replace("-", "").replace("/", "");
            fornecedor = daoFornecedor.consultar(CNPJ);

            if (fornecedor == null) {
                btnBuscar.setEnabled(false);
                btnCadastrar.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);

                txtCNPJ.setEnabled(false);
                txtRazaoSocial.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCEP.setEnabled(true);
                txtCidade.setEnabled(true);
                txtComplemento.setEnabled(true);
                txtEmail.setEnabled(true);
                txtLogradouro.setEnabled(true);
                txtNumero.setEnabled(true);
                txtPais.setEnabled(true);
                txtTelPrincipal.setEnabled(true);
                txtTelSecundario.setEnabled(true);
                txtUF.setEnabled(true);

            } else {
                btnBuscar.setEnabled(false);
                btnCadastrar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);

                txtCNPJ.setEnabled(false);
                txtRazaoSocial.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCEP.setEnabled(true);
                txtCidade.setEnabled(true);
                txtComplemento.setEnabled(true);
                txtEmail.setEnabled(true);
                txtLogradouro.setEnabled(true);
                txtNumero.setEnabled(true);
                txtPais.setEnabled(true);
                txtTelPrincipal.setEnabled(true);
                txtTelSecundario.setEnabled(true);
                txtUF.setEnabled(true);

                txtCNPJ.setText(fornecedor.getCNPJ());
                txtRazaoSocial.setText(fornecedor.getNomeFornecedor());
                txtBairro.setText(fornecedor.getBairro());
                txtCEP.setText(fornecedor.getCEP());
                txtCidade.setText(fornecedor.getCidade());
                txtComplemento.setText(fornecedor.getComplemento());
                txtEmail.setText(fornecedor.getEmailFornecedor());
                txtLogradouro.setText(fornecedor.getLogradouro());
                txtNumero.setText(Integer.toString(fornecedor.getNumero()));
                txtPais.setText(fornecedor.getPais());
                txtTelPrincipal.setText(fornecedor.getTelPrincipal());
                txtTelSecundario.setText(fornecedor.getTelSecundario());
                txtUF.setText(fornecedor.getUF());

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao pesquisar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("GABRIEL", "GABRIEL");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoFornecedor = new DaoFornecedor(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        boolean flagVerificaTudo = true;

        if (txtCEP.getText().isEmpty() || txtRazaoSocial.getText().isEmpty() || txtEmail.getText().isEmpty() || txtNumero.getText().equals(0)) {
            flagVerificaTudo = false;
        }

        if (flagVerificaTudo == false) {
            JOptionPane.showMessageDialog(null, "Existe um ou mais campos não preenchidos Corretamente por favor verifique os dados\n"
                    + "Os Seguintes Campos sao Obrigatorios: CEP, Email , Numero , Razao Social");
        }

        fornecedor.setBairro(txtBairro.getText());
        fornecedor.setCEP(txtCEP.getText().replace(".", "").replace("-", ""));
        fornecedor.setCNPJ(txtCNPJ.getText().replace(".", "").replace("-", "").replace("/", ""));
        fornecedor.setCidade(txtCidade.getText());
        fornecedor.setComplemento(txtComplemento.getText());
        fornecedor.setEmailFornecedor(txtEmail.getText());
        fornecedor.setLogradouro(txtLogradouro.getText());
        fornecedor.setNomeFornecedor(txtRazaoSocial.getText());
        fornecedor.setNumero(Integer.parseInt(txtNumero.getText()));
        fornecedor.setPais(txtPais.getText());
        fornecedor.setTelPrincipal(txtTelPrincipal.getText().replace("(", "").replace(")", "").replace("-", ""));
        fornecedor.setTelSecundario(txtTelSecundario.getText().replace("(", "").replace(")", "").replace("-", ""));
        fornecedor.setUF(txtUF.getText());

        //FAZER VERIFICACAO SE TA TUDO OK!
        if (txtCEP.getText().isEmpty() || txtRazaoSocial.getText().isEmpty() || txtEmail.getText().isEmpty() || txtNumero.getText().equals(0)) {
            flagVerificaTudo = false;
        }
        if (flagVerificaTudo == true) {
            daoFornecedor.alterar(fornecedor);

            btnBuscar.setEnabled(true);
            btnCadastrar.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

            txtCNPJ.setEnabled(true);
            txtRazaoSocial.setEnabled(false);
            txtBairro.setEnabled(false);
            txtCEP.setEnabled(false);
            txtCidade.setEnabled(false);
            txtComplemento.setEnabled(false);
            txtEmail.setEnabled(false);
            txtLogradouro.setEnabled(false);
            txtNumero.setEnabled(false);
            txtPais.setEnabled(false);
            txtTelPrincipal.setEnabled(false);
            txtTelSecundario.setEnabled(false);
            txtUF.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Alteração dos Dados do Fornecedor: " + txtRazaoSocial.getText() + " concluido com Sucesso");

            txtCNPJ.setText("");
            txtBairro.setText("");
            txtCEP.setText("");
            txtCidade.setText("");
            txtComplemento.setText("");
            txtEmail.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtPais.setText("");
            txtRazaoSocial.setText("");
            txtTelPrincipal.setText("");
            txtTelSecundario.setText("");
            txtUF.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Existe um ou mais campos não preenchidos Corretamente por favor verifique os dados\n"
                    + "Os Seguintes Campos sao Obrigatorios: CEP, Email , Numero , Razao Social");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        fornecedor = new Fornecedor();

        boolean flagVerificaTudo = true;

        if (txtCEP.getText().isEmpty() || txtRazaoSocial.getText().isEmpty() || txtEmail.getText().isEmpty() || txtNumero.getText().equals(0)) {
            flagVerificaTudo = false;
        }

        if (flagVerificaTudo == false) {
            JOptionPane.showMessageDialog(null, "Existe um ou mais campos não preenchidos Corretamente por favor verifique os dados\n"
                    + "Os Seguintes Campos sao Obrigatorios: CEP, Email , Numero , Razao Social");
        }

        fornecedor.setBairro(txtBairro.getText());
        fornecedor.setCEP(txtCEP.getText().replace(".", "").replace("-", ""));
        fornecedor.setCNPJ(txtCNPJ.getText().replace(".", "").replace("-", "").replace("/", ""));
        fornecedor.setCidade(txtCidade.getText());
        fornecedor.setComplemento(txtComplemento.getText());
        fornecedor.setEmailFornecedor(txtEmail.getText());
        fornecedor.setLogradouro(txtLogradouro.getText());
        fornecedor.setNomeFornecedor(txtRazaoSocial.getText());
        fornecedor.setNumero(Integer.parseInt(txtNumero.getText()));
        fornecedor.setPais(txtPais.getText());
        fornecedor.setTelPrincipal(txtTelPrincipal.getText().replace("(", "").replace(")", "").replace("-", ""));
        fornecedor.setTelSecundario(txtTelSecundario.getText().replace("(", "").replace(")", "").replace("-", ""));
        fornecedor.setUF(txtUF.getText());

        if (flagVerificaTudo == true) {
            daoFornecedor.inserir(fornecedor);

            btnBuscar.setEnabled(true);
            btnCadastrar.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

            txtCNPJ.setEnabled(true);
            txtRazaoSocial.setEnabled(false);
            txtBairro.setEnabled(false);
            txtCEP.setEnabled(false);
            txtCidade.setEnabled(false);
            txtComplemento.setEnabled(false);
            txtEmail.setEnabled(false);
            txtLogradouro.setEnabled(false);
            txtNumero.setEnabled(false);
            txtPais.setEnabled(false);
            txtTelPrincipal.setEnabled(false);
            txtTelSecundario.setEnabled(false);
            txtUF.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Cadastro do Fornecedor: " + txtRazaoSocial.getText() + " concluido com Sucesso");

            txtCNPJ.setText("");
            txtBairro.setText("");
            txtCEP.setText("");
            txtCidade.setText("");
            txtComplemento.setText("");
            txtEmail.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtPais.setText("");
            txtRazaoSocial.setText("");
            txtTelPrincipal.setText("");
            txtTelSecundario.setText("");
            txtUF.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Existe um ou mais campos não preenchidos Corretamente por favor verifique os dados\n"
                    + "Os Seguintes Campos sao Obrigatorios: CEP, Email , Numero , Razao Social");

        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        daoFornecedor.excluir(fornecedor.getCNPJ().replace(".", "").replace("-", "").replace("/", ""));

        btnBuscar.setEnabled(true);
        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

        txtCNPJ.setEnabled(true);
        txtRazaoSocial.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCEP.setEnabled(false);
        txtCidade.setEnabled(false);
        txtComplemento.setEnabled(false);
        txtEmail.setEnabled(false);
        txtLogradouro.setEnabled(false);
        txtNumero.setEnabled(false);
        txtPais.setEnabled(false);
        txtTelPrincipal.setEnabled(false);
        txtTelSecundario.setEnabled(false);
        txtUF.setEnabled(false);

        txtCNPJ.setText("");
        txtBairro.setText("");
        txtCEP.setText("");
        txtCidade.setText("");
        txtComplemento.setText("");
        txtEmail.setText("");
        txtLogradouro.setText("");
        txtNumero.setText("");
        txtPais.setText("");
        txtRazaoSocial.setText("");
        txtTelPrincipal.setText("");
        txtTelSecundario.setText("");
        txtUF.setText("");

        JOptionPane.showMessageDialog(null, "Fornecedor Excluido com Sucesso");

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUFActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_GerenciarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_GerenciarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JFormattedTextField txtTelPrincipal;
    private javax.swing.JFormattedTextField txtTelSecundario;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
private Conexao conexao = null;
    private Fornecedor fornecedor = null;
    private DaoFornecedor daoFornecedor = null;
}
