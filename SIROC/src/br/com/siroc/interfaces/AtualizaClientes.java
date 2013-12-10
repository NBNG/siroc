/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.builder.ClienteBuilder;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Cliente;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author matt
 */
public class AtualizaClientes extends javax.swing.JFrame {

    /**
     * Creates new form Pesquisa_Clientes
     */
    Cliente cliente;
    DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
    MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
    MaskFormatter maskCnpj = new MaskFormatter("##.###.###/####-##");

    public AtualizaClientes(Cliente cliente) throws ParseException {
        super("Cella - Atualização de Clientes");
        this.cliente = cliente;
        initComponents();

        try {
            MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
            MaskFormatter maskCelular = new MaskFormatter("(##) #####-####");
            //MaskFormatter maskFrete = new MaskFormatter("##,#");
            MaskFormatter maskCep = new MaskFormatter("#####-###");

            maskTelefone.install(jFTTelefone);
            maskCelular.install(jFTCelular);
            //maskFrete.install(jTFrete);
            maskCep.install(jTCEP);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(AtualizaClientes.this, "Erro: \n" + ex, "ERROR - Parse Exception!", JOptionPane.ERROR_MESSAGE);
        }

        setLocationRelativeTo(null);
        populateFields(this.cliente);
        hinter();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/siroc/Imagens/icone.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCabecalho = new javax.swing.JLabel();
        jLFrete = new javax.swing.JLabel();
        jL_IE = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jLAjuda = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jFTCelular = new javax.swing.JFormattedTextField();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jCBEstado = new javax.swing.JComboBox();
        jLEndereco = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jFTCnpj = new javax.swing.JFormattedTextField();
        jTCidade = new javax.swing.JTextField();
        jLContato = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jTCEP = new javax.swing.JFormattedTextField();
        jTEndereco = new javax.swing.JTextField();
        jTContato = new javax.swing.JTextField();
        jTNome = new javax.swing.JTextField();
        jTFrete = new javax.swing.JFormattedTextField();
        jTIE = new javax.swing.JTextField();
        jLCNPJ = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLCEP = new javax.swing.JLabel();
        jRBFisica = new javax.swing.JRadioButton();
        jRBJuridica = new javax.swing.JRadioButton();
        jBAlterar = new javax.swing.JButton();
        jLNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Atualização Clientes");

        jLFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFrete.setText("Frete:");

        jL_IE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jL_IE.setText("Inscrição Estadual:");

        jLCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCelular.setText("Celular:");

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLAjuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/help.png"))); // NOI18N
        jLAjuda.setText("Ajuda");

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "RJ", "MG", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "PA", "PB", "PR", "PE", "PI", "RN", "RS", "RO", "RR", "SC", "SE", "TO" }));

        jLEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEndereco.setText("Endereço:");

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEmail.setText("Email:");

        jFTCnpj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLContato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLContato.setText("Contato:");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jTCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTContato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTIE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCNPJ.setText("CNPJ/CPF:");

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jLCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCEP.setText("CEP:");

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

        jBAlterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBAlterar.setText("Atualizar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLAjuda))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBFisica)
                                .addGap(18, 18, 18)
                                .addComponent(jRBJuridica))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLBairro)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLCidade)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLNome)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLContato)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTContato))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLEmail)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTEmail))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLTelefone)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(jLCelular)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFTCelular))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLEstado)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jLCEP)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(jLFrete)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jL_IE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTIE, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLCNPJ)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFTCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLEndereco)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(617, Short.MAX_VALUE)
                    .addComponent(jBAlterar)
                    .addGap(70, 70, 70)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLAjuda)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBFisica)
                    .addComponent(jRBJuridica))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_IE)
                    .addComponent(jTIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCNPJ)
                    .addComponent(jFTCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCelular)
                    .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLContato)
                    .addComponent(jTContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEndereco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidade)
                    .addComponent(jLBairro)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEstado)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLFrete)
                        .addComponent(jTFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLCEP)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(505, Short.MAX_VALUE)
                    .addComponent(jBAlterar)
                    .addGap(27, 27, 27)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBFisicaActionPerformed
        if (jRBFisica.isSelected()) {
            jRBJuridica.setSelected(false);
            jFTCnpj.setValue(null);
            maskCPF.install(jFTCnpj);
            jFTCnpj.setFormatterFactory(new DefaultFormatterFactory(maskCPF));
        }
    }//GEN-LAST:event_jRBFisicaActionPerformed
    private void jRBJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBJuridicaActionPerformed
        if (jRBJuridica.isSelected()) {
            jRBFisica.setSelected(false);
            jFTCnpj.setValue(null);
            maskCnpj.install(jFTCnpj);
            jFTCnpj.setFormatterFactory(new DefaultFormatterFactory(maskCnpj));
        }
    }//GEN-LAST:event_jRBJuridicaActionPerformed
    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        try {
            cliente = new ClienteBuilder().setBairro(jTBairro.getText()).setCelular(jFTCelular.getText()).setCep(jTCEP.getText())
                    .setCidade(jTCidade.getText()).setCnpj_cpf(jFTCnpj.getText()).setContato(jTContato.getText()).setEmail(jTEmail.getText()).
                    setEndereco(jTEndereco.getText()).setEstado(String.valueOf(jCBEstado.getSelectedItem())).setFrete(jTFrete.getText())
                    .setInscricao_est(jTIE.getText()).setNome(jTNome.getText()).setTelefone(jFTTelefone.getText()).getCliente();

            dao.atualiza(cliente);
            JOptionPane.showMessageDialog(AtualizaClientes.this, "Cliente adicionado com sucesso!", "Activity Performed Successfully", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(AtualizaClientes.this, "Campos obrigatórios (*) vazios e/ou Informação inválida!", "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
            marca();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(AtualizaClientes.this, "CNPJ/CPF, E-mail e/ou Inscrição Estadual já cadastrado(s)!", "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JFormattedTextField jFTCelular;
    private javax.swing.JFormattedTextField jFTCnpj;
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
//metodos aqui

    public void populateFields(Cliente cliente) {
        jTNome.setText(cliente.getNome());
        jTBairro.setText(cliente.getBairro());
        jTCEP.setText(cliente.getCep());
        jTCidade.setText(cliente.getCidade());
        jTContato.setText(cliente.getContato());
        jTEmail.setText(cliente.getEmail());
        jTEndereco.setText(cliente.getEndereco());
        jTFrete.setText(String.valueOf(cliente.getFrete()));
        jTIE.setText(cliente.getInscricao_est());
        jFTCelular.setText(cliente.getCelular());
        jFTTelefone.setText(cliente.getTelefone());

        if (cliente.getCnpj_cpf().length() > 14) {
            jFTCnpj.setValue(null);
            maskCnpj.install(jFTCnpj);
            jFTCnpj.setFormatterFactory(new DefaultFormatterFactory(maskCnpj));
            jFTCnpj.setText(cliente.getCnpj_cpf());
            jRBFisica.setSelected(true);
        } else {
            jFTCnpj.setValue(null);
            maskCPF.install(jFTCnpj);
            jFTCnpj.setFormatterFactory(new DefaultFormatterFactory(maskCPF));
            jFTCnpj.setText(cliente.getCnpj_cpf());
            jRBJuridica.setSelected(true);
        }
    }

    private void marca() {
        jLAjuda.setText("Nome:*");
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
        jLAjuda.setToolTipText("<html>Esta é a tela de atualização de Clientes,<br>"
                + " onde serão atualizados dados relativos as informações já cadastradas. <br>"
                + "1. Lembre-se de preencher os dados obrigatórios sempre, para serem evitados erros.<br>"
                + "2. Lembre-se de escolher se o cliente é Pessoa Física ou Jurídica.<br>"
                + " Tal escolha auxiliará na máscara utilizada para o cadastro do seu respectivo código.<br>"
                + "3. Após o preenchimento, clique no botão atualizar para que seja executada a atualização.<br>"
                + "4. Para consultar o Manual do Usuário, basta dar um duplo clique em \"Ajuda.\"</html>");
    }
}
