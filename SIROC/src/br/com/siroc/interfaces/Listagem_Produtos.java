/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.classes_auxiliares.Editor;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
        tabela.setRowHeight(23);
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
        jBAlterar = new javax.swing.JButton();
        jTNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jTFornecedor = new javax.swing.JTextField();
        jLNome_Produto = new javax.swing.JLabel();
        jLNome_Produto1 = new javax.swing.JLabel();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Pesquisa de Produtos");

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
        jTNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomeKeyTyped(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmProduto);
        jScrollPane1.setViewportView(tabela);

        jTFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFornecedorKeyTyped(evt);
            }
        });

        jLNome_Produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome_Produto.setText("Nome Produto:");

        jLNome_Produto1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome_Produto1.setText("Nome Fornecedor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAlterar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBLimpar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLCabecalho)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNome_Produto)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTNome))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNome_Produto1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))))
                        .addContainerGap(417, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome_Produto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome_Produto1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpar)
                        .addContainerGap(348, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        if (tabela.getSelectedRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "Selecione um produto a ser alterado.");
        } else {
            /*if (produtos == null) {
             Atualiza_Produto ap = new Atualiza_Produto(fornecedores.get(tabela.getSelectedRow()).getProdutos().get(tabela.getSelectedRow()));
             ap.setVisible(true);
             } else {
             Atualiza_Produto ap = new Atualiza_Produto(produtos.get(tabela.getSelectedRow()));
             ap.setVisible(true);
             }*/
            Atualiza_Produto ap = new Atualiza_Produto(produtos.get(tabela.getSelectedRow()));
            ap.setVisible(true);
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped

        jTFornecedor.setText("");

        while (tmProduto.getRowCount() > 0) {
            tmProduto.removeRow(0);
        }

        produtos = pdao.buscaPorNome(jTNome.getText());
        for (int i = 0; i < produtos.size(); i++) {
            tmProduto.addRow(new String[]{null, null, null, null});
            tmProduto.setValueAt(produtos.get(i).getNome(), i, 0);
            tmProduto.setValueAt(produtos.get(i).getPeso() + " kg", i, 1);
            tmProduto.setValueAt(produtos.get(i).getFornecedor().getNome(), i, 2);
            tmProduto.setValueAt(Editor.format(produtos.get(i).getValor_entrada()), i, 3);
            tmProduto.setValueAt(Editor.format(produtos.get(i).getValor_saida()), i, 4);
        }

    }//GEN-LAST:event_jTNomeKeyTyped

    private void jTFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFornecedorKeyTyped
        jTNome.setText("");
        while (tmProduto.getRowCount() > 0) {
            tmProduto.removeRow(0);
        }

        fornecedores = fdao.buscaPorNome(jTFornecedor.getText());

        produtos = new ArrayList<Produto>();

        for (int i = 0; i < fornecedores.size(); i++) {
            for (int j = 0; j < fornecedores.get(i).getProdutos().size(); j++) {
                produtos.add(fornecedores.get(i).getProdutos().get(j));
            }
        }

        /*produtos = fdao.buscaPorNome(jTFornecedor.getText()).get(0).getProdutos();
         for (int i = 0; i < fornecedores.size(); i++) {
         for (int j = 0; j < fornecedores.get(i).getProdutos().size(); j++) {

         tmProduto.addRow(new String[]{null, null, null, null});
         tmProduto.setValueAt(fornecedores.get(i).getProdutos().get(j).getNome(), linha, 0);
         tmProduto.setValueAt(fornecedores.get(i).getProdutos().get(j).getPeso() + " kg", linha, 1);
         tmProduto.setValueAt(fornecedores.get(i).getNome(), linha, 2);
         tmProduto.setValueAt(Editor.format(fornecedores.get(i).getProdutos().get(j).getValor_entrada()), linha, 3);
         tmProduto.setValueAt(Editor.format(fornecedores.get(i).getProdutos().get(j).getValor_saida()), linha, 4);
         linha++;
         } */
        Integer linha = 0;
        for (int i = 0; i < produtos.size(); i++) {
            tmProduto.addRow(new String[]{null, null, null, null});
            tmProduto.setValueAt(produtos.get(i).getNome(), i, 0);
            tmProduto.setValueAt(produtos.get(i).getPeso() + " kg", i, 1);
            tmProduto.setValueAt(produtos.get(i).getFornecedor().getNome(), i, 2);
            tmProduto.setValueAt(Editor.format(produtos.get(i).getValor_entrada()), i, 3);
            tmProduto.setValueAt(Editor.format(produtos.get(i).getValor_saida()), i, 4);

        }    }//GEN-LAST:event_jTFornecedorKeyTyped
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLNome_Produto;
    private javax.swing.JLabel jLNome_Produto1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFornecedor;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        jTFornecedor.setText("");
        jTNome.setText("");
        produtos = null;
        fornecedores = null;
        while (tmProduto.getRowCount() > 0) {
            tmProduto.removeRow(0);
        }
        pdao = new DAO<Produto>(Produto.class);
        fdao = new DAO<Fornecedor>(Fornecedor.class);
    }
}
