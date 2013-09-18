/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.dao.DAO;
import br.com.siroc.dao.ProdutoDAO;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Produto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matt
 */
public class Listagem_Produtos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listagem_Produtos
     */
    List<Fornecedor> fornecedores;
    List<Produto> produtos;
    DAO<Produto> pdao = new DAO<Produto>(Produto.class);
    DAO<Fornecedor> fdao = new DAO<Fornecedor>(Fornecedor.class);
    //definição das colunas da tabela
    DefaultTableModel tmProduto = new DefaultTableModel(null, new String[]{"Nome", "Peso", "Fornecedor", "Valor Entrada", "Valor Saída"});

    public Listagem_Produtos() {
        super("SIROC - Listagem de Produtos");
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

        jRBNome = new javax.swing.JRadioButton();
        jLCabecalho = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jTNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jRBFornecedor = new javax.swing.JRadioButton();
        jTFornecedor = new javax.swing.JTextField();

        setClosable(true);

        jRBNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBNome.setText("Nome");
        jRBNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNomeActionPerformed(evt);
            }
        });

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Listagem de Produtos");

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBAlterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/editar.png"))); // NOI18N
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeActionPerformed(evt);
            }
        });
        jTNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomeKeyTyped(evt);
            }
        });

        tabela.setModel(tmProduto);
        jScrollPane1.setViewportView(tabela);

        jRBFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBFornecedor.setText("Fornecedor");
        jRBFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBFornecedorActionPerformed(evt);
            }
        });

        jTFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFornecedorActionPerformed(evt);
            }
        });
        jTFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFornecedorKeyTyped(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAlterar)
                            .addComponent(jBLimpar))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBFornecedor)
                                .addGap(18, 18, 18)
                                .addComponent(jTFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBNome)
                                .addGap(18, 18, 18)
                                .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLCabecalho))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBFornecedor)
                    .addComponent(jTFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAlterar)
                        .addGap(29, 29, 29)
                        .addComponent(jBLimpar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNomeActionPerformed
        if (jRBNome.isSelected()) {
            jRBFornecedor.setSelected(false);
            jTFornecedor.setText("");

            while (tmProduto.getRowCount() > 0) {
                tmProduto.removeRow(0);
            }

            produtos = pdao.buscaPorNome(jTNome.getText());
            for (int i = 0; i < produtos.size(); i++) {
                tmProduto.addRow(new String[]{null, null, null, null});
                tmProduto.setValueAt(produtos.get(i).getNome(), i, 0);
                tmProduto.setValueAt(produtos.get(i).getQuantidade(), i, 1);
                tmProduto.setValueAt(produtos.get(i).getFornecedor().getNome(), i, 2);
                tmProduto.setValueAt(produtos.get(i).getValor_entrada(), i, 3);
                tmProduto.setValueAt(produtos.get(i).getValor_saida(), i, 4);
            }
        }
    }//GEN-LAST:event_jRBNomeActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed

        Atualiza_Produto ap = new Atualiza_Produto(produtos.get(tabela.getSelectedRow()).getId(), produtos.get(tabela.getSelectedRow()).getFornecedor().getId());
        ap.setVisible(true);

    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeActionPerformed

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped
        if (jRBNome.isSelected()) {
            jRBFornecedor.setSelected(false);
            jTFornecedor.setText("");

            while (tmProduto.getRowCount() > 0) {
                tmProduto.removeRow(0);
            }

            produtos = pdao.buscaPorNome(jTNome.getText());
            for (int i = 0; i < produtos.size(); i++) {
                tmProduto.addRow(new String[]{null, null, null, null});
                tmProduto.setValueAt(produtos.get(i).getNome(), i, 0);
                tmProduto.setValueAt(produtos.get(i).getQuantidade(), i, 1);
                tmProduto.setValueAt(produtos.get(i).getFornecedor().getNome(), i, 2);
                tmProduto.setValueAt(produtos.get(i).getValor_entrada(), i, 3);
                tmProduto.setValueAt(produtos.get(i).getValor_saida(), i, 4);
            }
        }
    }//GEN-LAST:event_jTNomeKeyTyped

    private void jRBFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBFornecedorActionPerformed
        if (jRBFornecedor.isSelected()) {
            jRBNome.setSelected(false);
            jTNome.setText("");

            while (tmProduto.getRowCount() > 0) {
                tmProduto.removeRow(0);
            }

            fornecedores = fdao.buscaPorNome(jTFornecedor.getText());

            for (int i = 0; i < fornecedores.size(); i++) {
                for (int j = 0; j < fornecedores.get(i).getProdutos().size(); j++) {
                    tmProduto.addRow(new String[]{null, null, null, null});
                    tmProduto.setValueAt(fornecedores.get(i).getProdutos().get(j).getNome(), i, 0);
                    tmProduto.setValueAt(fornecedores.get(i).getProdutos().get(j).getQuantidade(), i, 1);
                    tmProduto.setValueAt(fornecedores.get(i).getNome(), i, 2);
                    tmProduto.setValueAt(fornecedores.get(i).getProdutos().get(j).getValor_entrada(), i, 3);
                    tmProduto.setValueAt(fornecedores.get(i).getProdutos().get(j).getValor_saida(), i, 4);
                }
            }
        }
    }//GEN-LAST:event_jRBFornecedorActionPerformed

    private void jTFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFornecedorActionPerformed
        if (jRBNome.isSelected()) {
            jRBFornecedor.setSelected(false);
            jTFornecedor.setText("");

            while (tmProduto.getRowCount() > 0) {
                tmProduto.removeRow(0);
            }

            List<Fornecedor> fornecedores = fdao.buscaPorNome(jTNome.getText());
            for (int i = 0; i < fornecedores.size(); i++) {
                for (int j = 0; j < fornecedores.get(i).getProdutos().size(); j++) {
                    tmProduto.addRow(new String[]{null, null, null, null});
                    tmProduto.setValueAt(fornecedores.get(i).getProdutos().get(j).getNome(), i, 0);
                    tmProduto.setValueAt(fornecedores.get(i).getProdutos().get(j).getQuantidade(), i, 1);
                    tmProduto.setValueAt(fornecedores.get(i).getNome(), i, 2);
                    tmProduto.setValueAt(fornecedores.get(i).getProdutos().get(j).getValor_entrada(), i, 3);
                    tmProduto.setValueAt(fornecedores.get(i).getProdutos().get(j).getValor_saida(), i, 4);
                }
            }
        }
    }//GEN-LAST:event_jTFornecedorActionPerformed

    private void jTFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFornecedorKeyTyped
        if (jRBFornecedor.isSelected()) {
            jRBNome.setSelected(false);
            jTNome.setText("");

            while (tmProduto.getRowCount() > 0) {
                tmProduto.removeRow(0);
            }

            Fornecedor fornecedor = fdao.buscaPorNome(jTFornecedor.getText()).get(0);

            for (int i = 0; i < fornecedor.getProdutos().size(); i++) {

                tmProduto.addRow(new String[]{null, null, null, null});
                tmProduto.setValueAt(fornecedor.getProdutos().get(i).getNome(), i, 0);
                tmProduto.setValueAt(fornecedor.getProdutos().get(i).getQuantidade(), i, 1);
                tmProduto.setValueAt(fornecedor.getNome(), i, 2);
                tmProduto.setValueAt(fornecedor.getProdutos().get(i).getValor_entrada(), i, 3);
                tmProduto.setValueAt(fornecedor.getProdutos().get(i).getValor_saida(), i, 4);
            }
        }
    }//GEN-LAST:event_jTFornecedorKeyTyped
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JRadioButton jRBFornecedor;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFornecedor;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
