/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.Editor.Editor;
import br.com.siroc.Editor.LeitorTeclas;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Historico;
import br.com.siroc.modelo.Produto;
import java.awt.Desktop;
import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;
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

        jLabel1 = new javax.swing.JLabel();
        jLProduto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jTProduto = new javax.swing.JTextField();
        jLAjuda = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Histórico de Preço dos Produtos - Valor de Compra");

        jLProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLProduto.setText("Produto:");

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmHistorico);
        jScrollPane1.setViewportView(tabela);

        jTProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTProdutoActionPerformed(evt);
            }
        });
        jTProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTProdutoKeyTyped(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(jLAjuda))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLProduto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLAjuda)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProduto)
                    .addComponent(jTProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jTProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTProduto;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
    private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de Listagem do histórico do produto,<br>"
                + "aqui serão listadas todas as alterações de valores em todos os produtos,<br>"
                + "onde as colunas representam o produto, a data de alteração, o valor antigo e o valor atualizado.<br>"
                + "1. Para consultar o Manual do Proprietário, basta dar um duplo clique em \"Ajuda\" ou tecle F1.</html>");
    }
    private String query = "FROM Historico historico order by historico.id asc";
}
