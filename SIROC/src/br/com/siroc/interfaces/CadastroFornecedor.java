/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.Editor.LeitorTeclas;
import br.com.siroc.builder.FornecedorBuilder;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Fornecedor;
import java.awt.Desktop;
import java.io.File;
import java.text.ParseException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author matt
 */
public class CadastroFornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Fornecedor
     */
    DAO<Fornecedor> dao = new DAO<Fornecedor>(Fornecedor.class);
    Fornecedor fornecedor;
    JDesktopPane painel;

    public CadastroFornecedor(JDesktopPane painel) throws ParseException {
        super("Cella - Cadastro de Fornecedores");

        initComponents();
        MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
        maskTelefone.install(jFTTelefone);
        this.painel = painel;
        hinter();
        this.setFocusable(true);
        this.addKeyListener(new LeitorTeclas());
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
        jLAjuda = new javax.swing.JLabel();
        jTFrete = new javax.swing.JFormattedTextField();
        jLFrete = new javax.swing.JLabel();
        jLSP = new javax.swing.JLabel();
        jTSP = new javax.swing.JFormattedTextField();
        jLMG = new javax.swing.JLabel();
        jTMG = new javax.swing.JFormattedTextField();
        jLRJ = new javax.swing.JLabel();
        jTRJ = new javax.swing.JFormattedTextField();

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

        jLAjuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/help.png"))); // NOI18N
        jLAjuda.setText("Ajuda");
        jLAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAjudaMouseClicked(evt);
            }
        });

        jTFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFrete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFreteKeyTyped(evt);
            }
        });

        jLFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFrete.setText("Frete:");

        jLSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLSP.setText("SP:");

        jTSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTSPKeyTyped(evt);
            }
        });

        jLMG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLMG.setText("MG:");

        jTMG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTMG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTMGKeyTyped(evt);
            }
        });

        jLRJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRJ.setText("RJ:");

        jTRJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTRJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTRJKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLNome)
                        .addGap(18, 18, 18)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(jLAjuda))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBCadastrar2)
                            .addGap(18, 18, 18)
                            .addComponent(jBLimpar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLEmail)
                            .addGap(18, 18, 18)
                            .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLTelefone))
                        .addGap(18, 18, 18)
                        .addComponent(jLFrete)
                        .addGap(18, 18, 18)
                        .addComponent(jTFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLSP)
                        .addGap(18, 18, 18)
                        .addComponent(jTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLMG)
                        .addGap(18, 18, 18)
                        .addComponent(jTMG, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLRJ)
                        .addGap(18, 18, 18)
                        .addComponent(jTRJ, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar2, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLAjuda)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLFrete)
                        .addComponent(jTFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLTelefone)
                        .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSP)
                    .addComponent(jTSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLMG)
                        .addComponent(jTMG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLRJ)
                            .addComponent(jTRJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar2)
                    .addComponent(jBLimpar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrar2ActionPerformed
        try {
            fornecedor = new FornecedorBuilder().setEmail(jTEmail.getText()).
                    setNome(jTNome.getText()).setTelefone(jFTTelefone.getText()).
                    setFrete(jTFrete.getText()).setPorcSp(jTSP.getText()).
                    setPorcMg(jTMG.getText()).setPorcRj(jTRJ.getText()).
                    getFornecedor();
            dao.adicionar(fornecedor);
            JOptionPane.showMessageDialog(CadastroFornecedor.this, "Fornecedor adicionado com sucesso!", "Activity Performed Successfully", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(CadastroFornecedor.this, "Informações inválidas!", "ERRO", JOptionPane.ERROR_MESSAGE);
            marca();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(CadastroFornecedor.this, "E-mail já cadastrado!", "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(CadastroFornecedor.this, "Campo 'Nome' obrigatório (*) vazio!", "ERRO", JOptionPane.ERROR_MESSAGE);
            marca();
        }
    }//GEN-LAST:event_jBCadastrar2ActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jLAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAjudaMouseClicked
        if (evt.getButton() != evt.BUTTON3 && evt.getClickCount() == 2) {
            String caminho = System.getenv("USERPROFILE")
                    + "\\Documents\\nbng\\siroc\\ajuda\\Manual do Proprietário - "
                    + "SIROC versão 1.9.9.pdf";
            File arquivo = new File(caminho);
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jLAjudaMouseClicked

    private void jTFreteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFreteKeyTyped
        String caracteres = "0987654321.,";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFreteKeyTyped

    private void jTSPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSPKeyTyped

    private void jTMGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMGKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMGKeyTyped

    private void jTRJKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRJKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRJKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar2;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JFormattedTextField jFTTelefone;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLFrete;
    private javax.swing.JLabel jLMG;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLRJ;
    private javax.swing.JLabel jLSP;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JFormattedTextField jTFrete;
    private javax.swing.JFormattedTextField jTMG;
    private javax.swing.JTextField jTNome;
    private javax.swing.JFormattedTextField jTRJ;
    private javax.swing.JFormattedTextField jTSP;
    // End of variables declaration//GEN-END:variables

    public void limpar() {
        try {
            CadastroFornecedor cf = new CadastroFornecedor(painel);
            painel.add(cf);
            cf.setVisible(true);
            this.dispose();
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(CadastroFornecedor.this, "Erro: \n" + pe, "ERROR - Parse Exception!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void marca() {
        jLNome.setText("Nome:*");
        jLEmail.setText("Email:*");
    }

    private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de cadastro de Fornecedores,<br>"
                + " onde serão cadastrados os dados relativos as informações do fornecedor. <br>"
                + "1. Lembre-se de preencher os dados obrigatórios sempre, para serem evitados erros.<br>"
                + "2. Após o preenchimento, clique no botão Cadastrar para que seja executada a atualização.<br>"
                + "3. O botão limpar reinicia a tela, limpando os campos.<br>"
                + "4. Para consultar o Manual do Proprietário, basta dar um duplo clique em \"Ajuda\" ou tecle F1.</html>");
    }
}
