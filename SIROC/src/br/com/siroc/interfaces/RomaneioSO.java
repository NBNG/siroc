/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.Editor.Editor;
import br.com.siroc.Jasper.Relatorio;
import br.com.siroc.dao.PedidoDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author matteus
 */
public class RomaneioSO extends javax.swing.JFrame {

    List<Object[]> list; //pesquisa avançada
    PedidoDAO peddao = new PedidoDAO();
    DefaultTableModel tmPedido = new DefaultTableModel(null,
            new String[]{"ID", "Data", "Cidade", "Estado", "Cliente",
                "Fornecedor", "Valor Total", "Frete", "Tipo de Pagamento",
                "Tipo de Pedido", "Pago", "Vencimento", "Obs"}) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false,
                    false, false, false, false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };

    public RomaneioSO() {
        super("Romaneio - SO");
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCabecalho = new javax.swing.JLabel();
        jLDataInicial = new javax.swing.JLabel();
        jLDataFinal = new javax.swing.JLabel();
        jBVisualizar = new javax.swing.JButton();
        jBGerar = new javax.swing.JButton();
        jBImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jDCInicial = new com.toedter.calendar.JDateChooser();
        jDCFinal = new com.toedter.calendar.JDateChooser();
        jBPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Romaneio SO");

        jLDataInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDataInicial.setText("Data Inicial:");

        jLDataFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDataFinal.setText("Data Final:");

        jBVisualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/visualizar.png"))); // NOI18N
        jBVisualizar.setText("Visualizar");
        jBVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizarActionPerformed(evt);
            }
        });

        jBGerar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/pdf (1).png"))); // NOI18N
        jBGerar.setText("Gerar PDF");
        jBGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerarActionPerformed(evt);
            }
        });

        jBImprimir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/imprimir.png"))); // NOI18N
        jBImprimir.setText("Imprimir");
        jBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirActionPerformed(evt);
            }
        });

        tabela.setModel(tmPedido);
        jScrollPane1.setViewportView(tabela);

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jLCabecalho)
                .addContainerGap(451, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLDataInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDCInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLDataFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBPesquisar)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBVisualizar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBGerar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBImprimir))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBGerar, jBImprimir, jBPesquisar, jBVisualizar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDCFinal, jDCInicial});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLDataInicial)
                        .addComponent(jLDataFinal))
                    .addComponent(jDCInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGerar)
                    .addComponent(jBImprimir)
                    .addComponent(jBVisualizar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        while (tmPedido.getRowCount() > 0) {
            tmPedido.removeRow(0);
        }
        /*
         0 data         1 cidade         2 estado         3 cliente
         4 fornecedor        5 total        6 status        7 tipo de pagamento
         8 tipo de pedido        9 frete        10 id        11 vencimento
         12 obs
         */
        list = peddao.buscaAvançada(montaQuery());
        for (int i = 0; i < list.size(); i++) {
            Object[] resultado = list.get(i);
            tmPedido.addRow(new String[]{null, null, null, null});
            //Posições a baixo relativos as ordem das colunas do JTABLE
            tmPedido.setValueAt(resultado[10], i, 0); //ID
            tmPedido.setValueAt(Editor.formatData((Date) resultado[0]), i, 1); //Data
            tmPedido.setValueAt(resultado[1], i, 2); //Cidade
            tmPedido.setValueAt(resultado[2], i, 3); //Estado
            tmPedido.setValueAt(resultado[3], i, 4); //Cliente
            tmPedido.setValueAt(resultado[4], i, 5); //Fornecedor
            tmPedido.setValueAt(Editor.format((Double) resultado[5]), i, 6); //Valor Total
            tmPedido.setValueAt(Editor.format((Double) resultado[9]), i, 7); //Frete
            tmPedido.setValueAt(resultado[6], i, 10); //Status
            tmPedido.setValueAt(resultado[7], i, 8); //Tipo pagamento
            tmPedido.setValueAt(resultado[8], i, 9); //Tipo de pedido
            if (resultado[11] == null) {
                tmPedido.setValueAt("", i, 11); //Vencimento    
            } else {
                tmPedido.setValueAt(Editor.formatData((Date) resultado[11]), i, 11); //Vencimento
            }
            tmPedido.setValueAt(resultado[12], i, 12); //OBS
            //[10] é o ID do PEDIDO
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarActionPerformed
        if (tabela.getSelectedRowCount() != 0) {
            String query = "select sum(item_quantidade) as quantidade,"
                    + " produtos.pro_nome || '-' || to_char(produtos.pro_peso,'09D90')||"
                    + " ' Kg' as produto from itens inner join produtos on"
                    + " produtos.pro_id = itens.fk_produto where ";
            int aux = 0;
            int[] selecao = tabela.getSelectedRows();
            for (int i : selecao) {
                if (aux == 0) {
                    query += " fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                } else {
                    query += " OR fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                }
                aux++;
            }
            aux = 0;
            query += " group by itens.fk_produto,produtos.pro_nome,produtos.pro_peso";
            try {

                java.sql.Date dataI = new java.sql.Date(jDCInicial.getDate().getTime());
                java.sql.Date dataF = new java.sql.Date(jDCFinal.getDate().getTime());
                String nome = "//Romaneio SO " + Editor.formatDataPasta(dataI) + " até " + Editor.formatDataPasta(dataF) + ".pdf";
                Relatorio rel = new Relatorio();
                rel.romaneioSO(query, 2, nome);
            } catch (IOException | JRException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione ao menos um(1) pedido!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBVisualizarActionPerformed

    private void jBGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerarActionPerformed
        if (tabela.getSelectedRowCount() != 0) {
            String query = "select sum(item_quantidade) as quantidade,"
                    + " produtos.pro_nome || '-' || to_char(produtos.pro_peso,'09D90')||"
                    + " ' Kg' as produto from itens inner join produtos on"
                    + " produtos.pro_id = itens.fk_produto where ";
            int aux = 0;
            int[] selecao = tabela.getSelectedRows();
            for (int i : selecao) {
                if (aux == 0) {
                    query += " fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                } else {
                    query += " OR fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                }
                aux++;
            }
            aux = 0;
            query += " group by itens.fk_produto,produtos.pro_nome,produtos.pro_peso";
            try {

                java.sql.Date dataI = new java.sql.Date(jDCInicial.getDate().getTime());
                java.sql.Date dataF = new java.sql.Date(jDCFinal.getDate().getTime());
                String nome = "//Romaneio SO " + Editor.formatDataPasta(dataI) + " até " + Editor.formatDataPasta(dataF) + ".pdf";
                Relatorio rel = new Relatorio();
                rel.romaneioSO(query, 0, nome);
            } catch (IOException | JRException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione ao menos um(1) pedido!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGerarActionPerformed

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        if (tabela.getSelectedRowCount() != 0) {
            String query = "select sum(item_quantidade) as quantidade,"
                    + " produtos.pro_nome || '-' || to_char(produtos.pro_peso,'09D90')||"
                    + " ' Kg' as produto from itens inner join produtos on"
                    + " produtos.pro_id = itens.fk_produto where ";
            int aux = 0;
            int[] selecao = tabela.getSelectedRows();
            for (int i : selecao) {
                if (aux == 0) {
                    query += " fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                } else {
                    query += " OR fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                }
                aux++;
            }
            aux = 0;
            query += " group by itens.fk_produto,produtos.pro_nome,produtos.pro_peso";
            try {

                java.sql.Date dataI = new java.sql.Date(jDCInicial.getDate().getTime());
                java.sql.Date dataF = new java.sql.Date(jDCFinal.getDate().getTime());
                String nome = "//Romaneio SO " + Editor.formatDataPasta(dataI) + " até " + Editor.formatDataPasta(dataF) + ".pdf";
                Relatorio rel = new Relatorio();
                rel.romaneioSO(query, 1, nome);
            } catch (IOException | JRException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione ao menos um(1) pedido!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGerar;
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBVisualizar;
    private com.toedter.calendar.JDateChooser jDCFinal;
    private com.toedter.calendar.JDateChooser jDCInicial;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLDataFinal;
    private javax.swing.JLabel jLDataInicial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
  public String montaQuery() {
        String query = "SELECT pedido.data,cliente.cidade,cliente.estado,cliente.nome,"
                + "fornecedor.nome,sum(item.valor_alterado*item.quantidade),pedido.status,"
                + "pedido.tipo_pagamento,pedido.tipo_pedido,"
                + "(sum(item.valor_alterado*item.quantidade)*fornecedor.frete)/100,pedido.id, "
                + "pedido.vencimento,pedido.obs "
                + "FROM Pedido pedido "
                + "INNER JOIN pedido.cliente as cliente "
                + "INNER JOIN pedido.itens as item "
                + "INNER JOIN item.produto as produto "
                + "INNER JOIN produto.fornecedor as fornecedor "
                + "WHERE pedido.tipo_pedido = 'SO' AND "
                + "pedido.data between '" + jDCInicial.getDate() + "' AND '" + jDCFinal.getDate() + "'"
                + "GROUP BY pedido.data,cliente.cidade,cliente.estado,cliente.nome,"
                + " fornecedor.nome, fornecedor.frete, pedido.status,"
                + "pedido.tipo_pagamento,pedido.tipo_pedido,pedido.id ";
        return query;

    }

}
