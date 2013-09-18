/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Fornecedor;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author matt
 */
public class Cadastro_Fornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Fornecedor
     */
    DAO<Fornecedor> dao = new DAO<Fornecedor>(Fornecedor.class);
    Fornecedor fornecedor;

    public Cadastro_Fornecedor() throws ParseException {
        super("SIROC - Cadastro de Fornecedores");
        initComponents();
        MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
        maskTelefone.install(jFTTelefone);
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
        jLNome = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLTelefone = new javax.swing.JLabel();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jLEmail = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jBCadastrar2 = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Fornecedores");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEmail.setText("Email:");

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBCadastrar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBCadastrar2.setText("Cadastrar");
        jBCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrar2ActionPerformed(evt);
            }
        });

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBCadastrar2)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLNome)
                            .addGap(18, 18, 18)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLTelefone)
                            .addGap(18, 18, 18)
                            .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLEmail)
                            .addGap(18, 18, 18)
                            .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLCabecalho)
                .addGap(133, 133, 133))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar2, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar2)
                    .addComponent(jBLimpar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrar2ActionPerformed
        fornecedor = new Fornecedor();
        if (jTNome.getText().equals("") || (jFTTelefone.getText().equals("") || (jTEmail.getText().equals("")))) {
            JOptionPane.showMessageDialog(null, "Por favor preencher os campos obrigatórios! (em negrito)");
            jLNome.setFont(new java.awt.Font("Tahoma", 1, 18));
            jLEmail.setFont(new java.awt.Font("Tahoma", 1, 18));
            jLTelefone.setFont(new java.awt.Font("Tahoma", 1, 18));
        } else {
            fornecedor.setNome(jTNome.getText());
            fornecedor.setEmail(jTEmail.getText());
            fornecedor.setTelefone(jFTTelefone.getText());

            dao.adicionar(fornecedor);
            JOptionPane.showMessageDialog(null, "Fornecedor adicionado com Sucesso!");
            limpar();
        }
    }//GEN-LAST:event_jBCadastrar2ActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar2;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JFormattedTextField jFTTelefone;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTNome;
    // End of variables declaration//GEN-END:variables
    public void limpar() {
        fornecedor = new Fornecedor();
        jTEmail.setText("");
        jTNome.setText("");
        jFTTelefone.setText("");
    }
}
