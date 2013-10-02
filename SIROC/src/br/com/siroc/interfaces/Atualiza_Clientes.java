/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.builder.ClienteBuilder;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Cliente;
import javax.swing.JOptionPane;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author matt
 */
public class Atualiza_Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Pesquisa_Clientes
     */
    Cliente cliente = new Cliente();
    DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);

   public Atualiza_Clientes(Cliente cliente) {
        super("SIROC - Atualização de Clientes");
        this.cliente = cliente;
        initComponents();
        setLocationRelativeTo(null);
        populateFields(this.cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTEndereco = new javax.swing.JTextField();
        jTIE = new javax.swing.JTextField();
        jTContato = new javax.swing.JTextField();
        jLTelefone = new javax.swing.JLabel();
        jTCidade = new javax.swing.JTextField();
        jLFrete = new javax.swing.JLabel();
        jLCEP = new javax.swing.JLabel();
        jLCNPJ = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jTNome = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jLContato = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jLCelular = new javax.swing.JLabel();
        jTFrete = new javax.swing.JTextField();
        jL_IE = new javax.swing.JLabel();
        jTCEP = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jLCabecalho = new javax.swing.JLabel();
        jFTCelular = new javax.swing.JFormattedTextField();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jCBEstado = new javax.swing.JComboBox();
        jLBairro = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jFTCnpj = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTIE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTContato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jTCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFrete.setText("Frete:");

        jLCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCEP.setText("CEP:");

        jLCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCNPJ.setText("CNPJ:");

        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEmail.setText("Email:");

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Atualizar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jLContato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLContato.setText("Contato:");

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCelular.setText("Celular:");

        jTFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jL_IE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jL_IE.setText("Inscrição Estadual:");

        jTCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Atualização Clientes");

        jFTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "RJ", "MG", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "PA", "PB", "PR", "PE", "PI", "RN", "RS", "RO", "RR", "SC", "SE", "TO" }));

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jLEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEndereco.setText("Endereço:");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jFTCnpj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLEmail)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTEmail))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLTelefone)
                                        .addComponent(jLContato))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLCelular)
                                            .addGap(18, 18, 18)
                                            .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTContato)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jL_IE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTIE, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLCNPJ)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFTCnpj))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLNome)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLCidade)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTCidade))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLEndereco)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTEndereco))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLEstado)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLCEP)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLFrete)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLBairro)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(31, 31, 31))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLCabecalho)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
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
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEndereco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstado)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBairro)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidade)
                    .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCEP)
                    .addComponent(jLFrete)
                    .addComponent(jTFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        try {
            
            System.out.println(cliente.getId());
            cliente = new ClienteBuilder().setBairro(jTBairro.getText()).setCelular(jFTCelular.getText()).setCep(jTCEP.getText())
                    .setCidade(jTCidade.getText()).setCnpj(jFTCnpj.getText()).setContato(jTContato.getText()).setEmail(jTEmail.getText()).
                    setEndereco(jTEndereco.getText()).setEstado(String.valueOf(jCBEstado.getSelectedItem())).setFrete(jTFrete.getText())
                    .setInscricao_est(jTIE.getText()).setNome(jTNome.getText()).setTelefone(jFTTelefone.getText()).setId(cliente.getId()).getCliente();
            
            dao.atualiza(cliente);
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso com Sucesso!");
            limpar();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios (sublinhados) vazios e/ou Informação inválida!");
            sublinha();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "CNPJ, E-mail e/ou Inscrição Estadual já cadastrado(s)!");
        }



    }//GEN-LAST:event_jBCadastrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JFormattedTextField jFTCelular;
    private javax.swing.JFormattedTextField jFTCnpj;
    private javax.swing.JFormattedTextField jFTTelefone;
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
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCEP;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTContato;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTFrete;
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
        jFTCnpj.setText(cliente.getCnpj());
    }

    public void limpar() {
        jTBairro.setText("");
        jTCEP.setText("");
        jFTCnpj.setText("");
        jTContato.setText("");
        jTEmail.setText("");
        jTEndereco.setText("");
        jTFrete.setText("");
        jTIE.setText("");
        jTNome.setText("");
        jTCidade.setText("");
        jFTCelular.setText("");
        jFTTelefone.setText("");
    }

    private void sublinha() {
        jLNome.setText("<html><u>Nome:</u></html>");
        jL_IE.setText("<html><u>Inscrição Estadual:</u></html>");
        jLEndereco.setText("<html><u>Endereço:</u></html>");
        jLBairro.setText("<html><u>Bairro:</u></html>");
        jLCidade.setText("<html><u>Cidade:</u></html>");
        jLEstado.setText("<html><u>Estado:</u></html>");
        jLCEP.setText("<html><u>CEP:</u></html>");
        jLCNPJ.setText("<html><u>CNPJ:</u></html>");
        jLFrete.setText("<html><u>Frete:</u></html>");
        jLContato.setText("<html><u>Contato:</u></html>");
    }
}
