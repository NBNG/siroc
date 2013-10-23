package br.com.siroc.interfaces;

import br.com.siroc.builder.FornecedorBuilder;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Fornecedor;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author matt
 */
public class Atualiza_Fornecedor extends javax.swing.JFrame {

    /**
     * Creates new form Atualiza_Fornecedor
     */
    DAO<Fornecedor> dao = new DAO<Fornecedor>(Fornecedor.class);
    Fornecedor fornecedor;

    public Atualiza_Fornecedor(Fornecedor fornecedor) {
        super("SIROC - Atualização de Fornecedores");
        this.fornecedor = fornecedor;

        initComponents();

        try {
            MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
            maskTelefone.install(jFTTelefone);
        } catch (ParseException ex) {
            Logger.getLogger(Atualiza_Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        setLocationRelativeTo(null);
        populateFields(this.fornecedor);
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
        jBLimpar = new javax.swing.JButton();
        jBCadastrar2 = new javax.swing.JButton();
        jLNome = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLTelefone = new javax.swing.JLabel();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jLEmail = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Atualização de Fornecedores");

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBCadastrar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBCadastrar2.setText("Atualizar");
        jBCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrar2ActionPerformed(evt);
            }
        });

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEmail.setText("Email:");

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLCabecalho)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastrar2)
                .addGap(18, 18, 18)
                .addComponent(jBLimpar)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLEmail)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLNome)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jLTelefone))
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLCabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar2)
                    .addComponent(jBLimpar))
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(99, 99, 99)
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
                    .addContainerGap(99, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrar2ActionPerformed
        try {
            fornecedor = new FornecedorBuilder().setId(fornecedor.getId()).setEmail(jTEmail.getText())
                    .setNome(jTNome.getText()).setTelefone(jFTTelefone.getText()).getFornecedor();

            dao.atualiza(fornecedor);
            JOptionPane.showMessageDialog(null, "Fornecedor alterado com Sucesso!");
            limpar();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios com informações inválidas!");
            sublinha();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "E-mail já cadastrado!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios nulos!");
            sublinha();
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

    private void populateFields(Fornecedor fornecedor) {
        jTNome.setText(fornecedor.getNome());
        jTEmail.setText(fornecedor.getEmail());
        jFTTelefone.setText(fornecedor.getTelefone());
    }

    private void limpar() {
        jTEmail.setText("");
        jTNome.setText("");
        jFTTelefone.setText("");
        fornecedor = null;
    }

    private void sublinha() {
        jLNome.setText("Nome:*");
        jLTelefone.setText("Telefone:*");
        jLEmail.setText("Email:*");
    }
}
