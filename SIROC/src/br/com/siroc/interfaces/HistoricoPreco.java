/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.Editor.Editor;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Historico;
import br.com.siroc.modelo.Produto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matteus
 */
public class HistoricoPreco extends javax.swing.JInternalFrame {

    /**
     * Creates new form Historico_Preco
     */
    Produto produto = new Produto();
    List<Historico> historico;
    DAO<Historico> dao = new DAO<Historico>(Historico.class);
    DefaultTableModel tmHistorico = new DefaultTableModel(null, new String[]{"Produto", "Data", "Valor Antigo", "Valor Atualizado"});

    public HistoricoPreco() {
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

        jLabel1 = new javax.swing.JLabel();
        jLProduto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jTProduto = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Histórico de Preço dos Produtos - Valor de Compra");

        jLProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLProduto.setText("Produto:");

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmHistorico);
        jScrollPane1.setViewportView(tabela);

        jTProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTProdutoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLProduto)
                            .addGap(18, 18, 18)
                            .addComponent(jTProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProduto)
                    .addComponent(jTProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdutoKeyTyped
        historico = dao.listaTodos();

        while (tmHistorico.getRowCount() > 0) {
            tmHistorico.removeRow(0);
        }
        for (int i = 0; i < historico.size(); i++) {
            tmHistorico.addRow(new String[]{null, null, null, null});
            tmHistorico.setValueAt(historico.get(i).getProduto().getNome(), i, 0);
            tmHistorico.setValueAt(Editor.formatData(historico.get(i).getData_mudanca()), i, 1);
            tmHistorico.setValueAt(Editor.format(historico.get(i).getValor_antigo()), i, 2);
            tmHistorico.setValueAt(Editor.format(historico.get(i).getValor_atualizado()), i, 3);
        }
    }//GEN-LAST:event_jTProdutoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTProduto;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}