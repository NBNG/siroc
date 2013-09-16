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
public class Atualiza_Fornecedor extends javax.swing.JFrame {

    /**
     * Creates new form Atualiza_Fornecedor
     */
    Long id;
    DAO<Fornecedor> dao = new DAO<Fornecedor>(Fornecedor.class);

    public Atualiza_Fornecedor(Long id) throws ParseException {
        super("SIROC - Atualização de Fornecedores");
        this.id = id;
        initComponents();
        MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
        maskTelefone.install(jFTTelefone);
        setLocationRelativeTo(null);
        populateFields(id);
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
        jTNome = new javax.swing.JTextField();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jLNome = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jLTelefone = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jBCadastrar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Atualização de Fornecedores");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

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

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBCadastrar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBCadastrar2.setText("Atualizar");
        jBCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
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
                            .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCabecalho)
                            .addGap(71, 71, 71))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
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
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar2)
                    .addComponent(jBLimpar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTEmail.setText("");
        jTNome.setText("");
        jFTTelefone.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrar2ActionPerformed
        if (jTNome.getText().equals("") || (jFTTelefone.getText().equals("") || (jTEmail.getText().equals("")))) {
            JOptionPane.showMessageDialog(null, "Por favor preencher os campos obrigatórios! (em negrito)");
            jLNome.setFont(new java.awt.Font("Tahoma", 1, 18));
            jLEmail.setFont(new java.awt.Font("Tahoma", 1, 18));
            jLTelefone.setFont(new java.awt.Font("Tahoma", 1, 18));
        } else {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setNome(jTNome.getText());
            fornecedor.setEmail(jTEmail.getText());
            fornecedor.setTelefone(jFTTelefone.getText());
            fornecedor.setId(id);
            dao.atualiza(fornecedor);
            JOptionPane.showMessageDialog(null, "Distribuidor alterado com Sucesso!");
        }
    }//GEN-LAST:event_jBCadastrar2ActionPerformed
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

    private void populateFields(Long id) {
        DAO<Fornecedor> dao = new DAO<Fornecedor>(Fornecedor.class);
        Fornecedor fornecedor = (Fornecedor) dao.busca(id);
        jTNome.setText(fornecedor.getNome());
        jTEmail.setText(fornecedor.getEmail());
        jFTTelefone.setText(fornecedor.getTelefone());
    }
}
