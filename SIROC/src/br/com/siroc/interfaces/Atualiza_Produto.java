/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.builder.ProdutoBuilder;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Produto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author matt
 */
public class Atualiza_Produto extends javax.swing.JFrame {

    /**
     * Creates new form Atualiza_Produto
     */
    
    Produto produto = new Produto();
    DAO<Produto> dao = new DAO<Produto>(Produto.class);
    Long id, fid;

    public Atualiza_Produto(Produto produto) {
        super("SIROC - Atualização de Produtos");
        initComponents();
        setLocationRelativeTo(null);
        this.produto = produto;
        populateFields(this.produto);
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
        jLFornecedor = new javax.swing.JLabel();
        jTV_Saida = new javax.swing.JTextField();
        jTV_Compra = new javax.swing.JTextField();
        jTPeso = new javax.swing.JTextField();
        jTNome_Produto = new javax.swing.JTextField();
        jLPeso = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLV_Venda = new javax.swing.JLabel();
        jLV_Compra = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Atualização de Produtos");

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor.setText("Fornecedor");

        jTV_Saida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTV_Compra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNome_Produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLPeso.setText("Peso:");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLV_Venda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLV_Venda.setText("Valor de Saída:");

        jLV_Compra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLV_Compra.setText("Valor de Compra:");

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Atualizar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLCabecalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLPeso)
                                .addGap(18, 18, 18)
                                .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLV_Venda)
                                .addGap(18, 18, 18)
                                .addComponent(jTV_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLV_Compra)
                                .addGap(18, 18, 18)
                                .addComponent(jTV_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNome)
                                .addGap(18, 18, 18)
                                .addComponent(jTNome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLFornecedor))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpar)
                        .addGap(24, 24, 24))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLCabecalho)
                .addGap(47, 47, 47)
                .addComponent(jLFornecedor)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPeso)
                    .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLV_Compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTV_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLV_Venda)
                    .addComponent(jTV_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        try{
            produto = new ProdutoBuilder().setId(produto.getId()).setFornecedor(produto.getFornecedor())
                    .setNome(jTNome_Produto.getText()).setPeso(jTPeso.getText()).
                    setValor_entrada(jTV_Compra.getText()).setValor_saida(jTV_Saida.getText()).getProduto();
            
            dao.atualiza(produto);
            JOptionPane.showMessageDialog(null, "Produto atualizado com Sucesso!");
            limpar();
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Campos obrigatórios (sublinhados) vazios e/ou informação inválida!");
            //sublinha();
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "Escolha um fornecedor.");
        }
        
        /*fornecedor.setId(fid);
        produto.setFornecedor(fornecedor);
        produto.setNome(jTNome_Produto.getText());
        produto.setPeso(Double.parseDouble(jTPeso.getText()));
        produto.setValor_entrada(Double.parseDouble(jTV_Compra.getText()));
        produto.setValor_saida(Double.parseDouble(jTV_Saida.getText()));
        dao.atualiza(produto);
        JOptionPane.showMessageDialog(null, "Produto alterado com Sucesso!");*/
    }//GEN-LAST:event_jBCadastrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPeso;
    private javax.swing.JLabel jLV_Compra;
    private javax.swing.JLabel jLV_Venda;
    private javax.swing.JTextField jTNome_Produto;
    private javax.swing.JTextField jTPeso;
    private javax.swing.JTextField jTV_Compra;
    private javax.swing.JTextField jTV_Saida;
    // End of variables declaration//GEN-END:variables

    private void populateFields(Produto produto) {
        
        jTNome_Produto.setText(produto.getNome());
        jTPeso.setText(String.valueOf(produto.getPeso()));
        jTV_Compra.setText(String.valueOf(produto.getValor_entrada()));
        jTV_Saida.setText(String.valueOf(produto.getValor_saida()));
    }

    private void limpar() {
        jTNome_Produto.setText("");
        jTPeso.setText("");
        jTV_Compra.setText("");
        jTV_Saida.setText("");
    }
}
