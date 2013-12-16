/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.builder.ClienteBuilder;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Cliente;
import java.awt.Desktop;
import java.io.File;
import java.text.ParseException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author matt
 */
public class CadastroClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Clientes
     */
    Cliente cliente;
    DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
    MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
    MaskFormatter maskCnpj = new MaskFormatter("##.###.###/####-##");
    JDesktopPane painel;

    public CadastroClientes(JDesktopPane painel) throws ParseException {
        super("Cella - Cadastro de Clientes");
        initComponents();
        MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
        MaskFormatter maskCelular = new MaskFormatter("(##) #####-####");
        //MaskFormatter maskFrete = new MaskFormatter("##,#");
        MaskFormatter maskCep = new MaskFormatter("#####-###");

        maskTelefone.install(jFTTelefone);
        maskCelular.install(jFTCelular);
        //maskFrete.install(jTFrete);
        maskCep.install(jTCEP);
        this.painel = painel;
        hinter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCabecalho = new javax.swing.JLabel();
        jLFrete = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jLCNPJ = new javax.swing.JLabel();
        jLCEP = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jFTCnpj_Cpf = new javax.swing.JFormattedTextField();
        jTCidade = new javax.swing.JTextField();
        jLContato = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jLCidade = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jCBEstado = new javax.swing.JComboBox();
        jFTCelular = new javax.swing.JFormattedTextField();
        jTEmail = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jLCelular = new javax.swing.JLabel();
        jL_IE = new javax.swing.JLabel();
        jTIE = new javax.swing.JTextField();
        jTEndereco = new javax.swing.JTextField();
        jTContato = new javax.swing.JTextField();
        jTNome = new javax.swing.JTextField();
        jTFrete = new javax.swing.JFormattedTextField();
        jTCEP = new javax.swing.JFormattedTextField();
        jRBFisica = new javax.swing.JRadioButton();
        jRBJuridica = new javax.swing.JRadioButton();
        jLAjuda = new javax.swing.JLabel();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Clientes");

        jLFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFrete.setText("Frete:");

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jLCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCNPJ.setText("CNPJ/CPF:");

        jLCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCEP.setText("CEP:");

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEmail.setText("Email:");

        jFTCnpj_Cpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLContato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLContato.setText("Contato:");

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jLEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEndereco.setText("Endereço:");

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "RJ", "MG", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "PA", "PB", "PR", "PE", "PI", "RN", "RS", "RO", "RR", "SC", "SE", "TO" }));

        jFTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCelular.setText("Celular:");

        jL_IE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jL_IE.setText("Inscrição Estadual:");

        jTIE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTContato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBFisica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBFisica.setText("Pessoa Física");
        jRBFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBFisicaActionPerformed(evt);
            }
        });

        jRBJuridica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBJuridica.setText("Pessoa Jurídica");
        jRBJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBJuridicaActionPerformed(evt);
            }
        });

        jLAjuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/help.png"))); // NOI18N
        jLAjuda.setText("Ajuda");
        jLAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAjudaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addGap(18, 18, 18)
                        .addComponent(jRBFisica)
                        .addGap(18, 18, 18)
                        .addComponent(jRBJuridica))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLNome)
                            .addGap(18, 18, 18)
                            .addComponent(jTNome))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jL_IE)
                                .addGap(18, 18, 18)
                                .addComponent(jTIE, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLCNPJ)
                                .addGap(18, 18, 18)
                                .addComponent(jFTCnpj_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLContato)
                            .addGap(18, 18, 18)
                            .addComponent(jTContato))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLTelefone)
                            .addGap(18, 18, 18)
                            .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLCelular)
                            .addGap(18, 18, 18)
                            .addComponent(jFTCelular))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLEmail)
                            .addGap(18, 18, 18)
                            .addComponent(jTEmail))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLEndereco)
                            .addGap(18, 18, 18)
                            .addComponent(jTEndereco))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLBairro)
                            .addGap(18, 18, 18)
                            .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(jLCidade)
                            .addGap(18, 18, 18)
                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLEstado)
                            .addGap(18, 18, 18)
                            .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jLCEP)
                            .addGap(18, 18, 18)
                            .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLFrete)
                            .addGap(18, 18, 18)
                            .addComponent(jTFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLAjuda)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCabecalho)
                        .addComponent(jRBFisica)
                        .addComponent(jRBJuridica))
                    .addComponent(jLAjuda))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_IE)
                    .addComponent(jTIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCNPJ)
                    .addComponent(jFTCnpj_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCelular)
                    .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLContato)
                    .addComponent(jTContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidade)
                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBairro)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEstado)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLCEP)
                        .addComponent(jLFrete)
                        .addComponent(jTFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        try {
            cliente = new ClienteBuilder().setBairro(jTBairro.getText()).setCelular(jFTCelular.getText()).setCep(jTCEP.getText())
                    .setCidade(jTCidade.getText()).setCnpj_cpf(jFTCnpj_Cpf.getText()).setContato(jTContato.getText()).setEmail(jTEmail.getText()).
                    setEndereco(jTEndereco.getText()).setEstado(String.valueOf(jCBEstado.getSelectedItem())).setFrete(jTFrete.getText())
                    .setInscricao_est(jTIE.getText()).setNome(jTNome.getText()).setTelefone(jFTTelefone.getText()).getCliente();

            dao.adicionar(cliente);
            JOptionPane.showMessageDialog(CadastroClientes.this, "Cliente adicionado com sucesso!", "Activity Performed Successfully", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(CadastroClientes.this, "Campos obrigatórios (*) vazios e/ou Informação inválida!", "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            marca();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(CadastroClientes.this, "CNPJ/CPF, E-mail e/ou Inscrição Estadual já cadastrado(s)!", "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            dao = new DAO<Cliente>(Cliente.class);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed
    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jRBFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBFisicaActionPerformed
        if (jRBFisica.isSelected()) {
            jRBJuridica.setSelected(false);
            jFTCnpj_Cpf.setValue(null);
            maskCPF.install(jFTCnpj_Cpf);
            jFTCnpj_Cpf.setFormatterFactory(new DefaultFormatterFactory(maskCPF));
        }
    }//GEN-LAST:event_jRBFisicaActionPerformed

    private void jRBJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBJuridicaActionPerformed
        if (jRBJuridica.isSelected()) {
            jRBFisica.setSelected(false);
            jFTCnpj_Cpf.setValue(null);
            maskCnpj.install(jFTCnpj_Cpf);
            jFTCnpj_Cpf.setFormatterFactory(new DefaultFormatterFactory(maskCnpj));
        }
    }//GEN-LAST:event_jRBJuridicaActionPerformed

    private void jLAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAjudaMouseClicked
        if (evt.getButton() != evt.BUTTON3 && evt.getClickCount() == 2) {
            String caminho = "C:\\siroc\\ajuda\\Manual do Proprietário - SIROC versão 1.9.9.pdf";
            File arquivo = new File(caminho);
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jLAjudaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JFormattedTextField jFTCelular;
    private javax.swing.JFormattedTextField jFTCnpj_Cpf;
    private javax.swing.JFormattedTextField jFTTelefone;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCNPJ;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLContato;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLFrete;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jL_IE;
    private javax.swing.JRadioButton jRBFisica;
    private javax.swing.JRadioButton jRBJuridica;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JFormattedTextField jTCEP;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTContato;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JFormattedTextField jTFrete;
    private javax.swing.JTextField jTIE;
    private javax.swing.JTextField jTNome;
    // End of variables declaration//GEN-END:variables

    public void limpar() {
        try {
            CadastroClientes cc = new CadastroClientes(painel);
            painel.add(cc);
            cc.setVisible(true);
            this.dispose();
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(CadastroClientes.this, "Erro: \n" + pe, "ERROR - Parse Exception!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void marca() {
        jLNome.setText("Nome:*");
        jL_IE.setText("Inscrição Estadual:*");
        jLEndereco.setText("Endereço:*");
        jLBairro.setText("Bairro:*");
        jLCidade.setText("Cidade:*");
        jLEstado.setText("Estado:*");
        jLCEP.setText("CEP:*");
        jLCNPJ.setText("CNPJ/CPF:*");
        jLContato.setText("Contato:*");
    }

    private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de cadastro de Clientes,<br>"
                + " onde serão cadastrados os dados relativos as informações do cliente. <br>"
                + "1. Lembre-se de preencher os dados obrigatórios sempre, para serem evitados erros.<br>"
                + "2. Lembre-se de escolher se o cliente é Pessoa Física ou Jurídica.<br>"
                + " Tal escolha auxiliará na máscara utilizada para o cadastro do seu respectivo código.<br>"
                + "3. Após o preenchimento, clique no botão Cadastrar para que seja executada a atualização.<br>"
                + "4. O botão limpar reinicia a tela, limpando os campos.<br>"
                + "5. Para consultar o Manual do Usuário, basta dar um duplo clique em \"Ajuda.\"</html");
    }
}
