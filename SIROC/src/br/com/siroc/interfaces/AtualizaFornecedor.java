package br.com.siroc.interfaces;

import br.com.siroc.Editor.LeitorTeclas;
import br.com.siroc.builder.FornecedorBuilder;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Fornecedor;
import java.awt.Desktop;
import java.awt.Toolkit;
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
public class AtualizaFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form Atualiza_Fornecedor
     */
    DAO<Fornecedor> dao = new DAO<Fornecedor>(Fornecedor.class);
    Fornecedor fornecedor;
    ListagemFornecedores lista;
    JDesktopPane painel;
    Long id;

    public AtualizaFornecedor(Fornecedor fornecedor,
            ListagemFornecedores lista, JDesktopPane painel) {
        super("Cella - Atualização de Fornecedores");
        this.fornecedor = fornecedor;
        id = this.fornecedor.getId();
        this.lista = lista;
        this.painel = painel;
        initComponents();
        this.setResizable(false);

        try {
            MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
            maskTelefone.install(jFTTelefone);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(AtualizaFornecedor.this,
                    "Erro: \n" + ex, "ERROR - Parse Exception!",
                    JOptionPane.ERROR_MESSAGE);
        }

        setLocationRelativeTo(null);
        populateFields(this.fornecedor);
        hinter();
        this.setFocusable(true);
        this.addKeyListener(new LeitorTeclas());
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/siroc/Imagens/icone.png")));
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
        jBCadastrar2 = new javax.swing.JButton();
        jLNome = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLTelefone = new javax.swing.JLabel();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jLEmail = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jLAjuda = new javax.swing.JLabel();
        jLFrete = new javax.swing.JLabel();
        jTFrete = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Atualização de Fornecedores");

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
        jTNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomeKeyTyped(evt);
            }
        });

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEmail.setText("Email:");

        jTEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLAjuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/help.png"))); // NOI18N
        jLAjuda.setText("Ajuda");
        jLAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAjudaMouseClicked(evt);
            }
        });

        jLFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFrete.setText("Frete:");

        jTFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFrete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFreteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBCadastrar2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLNome)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLEmail)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTEmail))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(93, 93, 93)
                                            .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLTelefone))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLFrete)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLAjuda)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
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
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFrete)
                    .addComponent(jTFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jBCadastrar2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrar2ActionPerformed
        try {
            fornecedor = new FornecedorBuilder().setEmail(jTEmail.getText()).
                    setNome(jTNome.getText()).setTelefone(jFTTelefone.getText()).
                    setFrete(jTFrete.getText()).setId(id).
                    getFornecedor();

            dao.atualiza(fornecedor);
            JOptionPane.showMessageDialog(AtualizaFornecedor.this,
                    "Fornecedor alterado com sucesso!",
                    "Activity Performed Successfully",
                    JOptionPane.INFORMATION_MESSAGE);
            limpar();
        } catch (IllegalArgumentException | NullPointerException e) {
            JOptionPane.showMessageDialog(AtualizaFornecedor.this,
                    "Campos obrigatórios (*) vazios e/ou Informação inválida!",
                    "ERROR 404 - Content not found!",
                    JOptionPane.ERROR_MESSAGE);
            marca();
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(AtualizaFornecedor.this,
                    "E-mail já cadastrado!", "ERROR 404 - Content not found!",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBCadastrar2ActionPerformed

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
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFreteKeyTyped

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar2;
    private javax.swing.JFormattedTextField jFTTelefone;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLFrete;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JFormattedTextField jTFrete;
    private javax.swing.JTextField jTNome;
    // End of variables declaration//GEN-END:variables

    private void populateFields(Fornecedor fornecedor) {
        jTNome.setText(fornecedor.getNome());
        jTEmail.setText(fornecedor.getEmail());
        jFTTelefone.setText(fornecedor.getTelefone());
        jTFrete.setText(String.valueOf(fornecedor.getFrete()));
    }

    private void marca() {
        jLNome.setText("Nome:*");
    }

    private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de atualização de Fornecedores,<br>"
                + " onde serão atualizados dados relativos as informações já cadastradas. <br>"
                + "1. Lembre-se de preencher os dados obrigatórios sempre, para serem evitados erros.<br>"
                + " Tal escolha auxiliará na máscara utilizada para o cadastro do seu respectivo código.<br>"
                + "2. Após o preenchimento, clique no botão atualizar para que seja executada a atualização.<br>"
                + "3. Para consultar o Manual do Proprietário, basta dar um duplo clique em \"Ajuda\" ou tecle F1.</html>");
    }

    private void limpar() throws ParseException {
        lista.dispose();
        ListagemFornecedores cl = new ListagemFornecedores(painel);
        painel.add(cl);
        cl.setVisible(true);
        this.dispose();
    }
}
