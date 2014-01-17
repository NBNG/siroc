package br.com.siroc.interfaces;

import br.com.siroc.Editor.Editor;
import br.com.siroc.Editor.LeitorTeclas;
import br.com.siroc.Jasper.Relatorio;
import br.com.siroc.dao.PedidoDAO;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
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
            new String[]{"ID", "Cliente", "Data", "Vencimento", "Fornecedor", "Cidade",
                "Valor Total", "Pagamento",
                "Tipo Pedido", "Status"}) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false,
                    false, false
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
        this.setFocusable(true);
        this.addKeyListener(new LeitorTeclas());
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/siroc/Imagens/icone.png")));
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(60);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(225);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(225);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(150);
        tabela.getColumnModel().getColumn(6).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(8).setPreferredWidth(85);
        tabela.getColumnModel().getColumn(9).setPreferredWidth(55);
        tabela.getColumnModel().getColumn(7).setPreferredWidth(85);
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
        jLAjuda = new javax.swing.JLabel();

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

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                .addGap(434, 434, 434)
                .addComponent(jLCabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLAjuda))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCabecalho))
                    .addComponent(jLAjuda))
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
        if (jDCInicial.getDate() == null || jDCFinal.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Selecione ambas as datas!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
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
                tmPedido.setValueAt(Editor.formatData((Date) resultado[0]), i, 2); //Data
                tmPedido.setValueAt(resultado[1], i, 5); //Cidade
                tmPedido.setValueAt(resultado[3], i, 1); //Cliente
                tmPedido.setValueAt(resultado[4], i, 4); //Fornecedor
                tmPedido.setValueAt(Editor.format((Double) resultado[5]), i, 6); //Valor Total
                tmPedido.setValueAt(resultado[6], i, 9); //Status
                tmPedido.setValueAt(resultado[7], i, 7); //Tipo pagamento
                tmPedido.setValueAt(resultado[8], i, 8); //Tipo de pedido
                if (resultado[11] == null) {
                    tmPedido.setValueAt("", i, 3); //Vencimento    
                } else {
                    tmPedido.setValueAt(Editor.formatData((Date) resultado[11]), i, 3); //Vencimento
                }
            }
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarActionPerformed
        if (jDCInicial.getDate() == null || jDCFinal.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Selecione ambas as datas!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (tabela.getSelectedRowCount() != 0) {
                String parte = "";
                int aux = 0;
                int[] selecao = tabela.getSelectedRows();
                for (int i : selecao) {
                    if (aux == 0) {
                        parte += " fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                    } else {
                        parte += " OR fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                    }
                    aux++;
                }
                aux = 0;
                String query = "select sum(item_quantidade) as quantidade,\n"
                        + "produtos.pro_nome || '-' || to_char(produtos.pro_peso,'0009D90')|| ' Kg' as produto,\n"
                        + "to_char((select sum(itens.item_quantidade*produtos.pro_peso)\n"
                        + "from itens inner join produtos on produtos.pro_id = itens.fk_produto where \n"
                        + parte
                        + "),'0009D90')|| ' Kg' as peso\n"
                        + "from itens inner join produtos on produtos.pro_id = itens.fk_produto  where \n"
                        + parte
                        + "group by itens.fk_produto,produtos.pro_nome,produtos.pro_peso";
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
        }
    }//GEN-LAST:event_jBVisualizarActionPerformed

    private void jBGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerarActionPerformed
        if (jDCInicial.getDate() == null || jDCFinal.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Selecione ambas as datas!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (tabela.getSelectedRowCount() != 0) {
                String parte = "";
                int aux = 0;
                int[] selecao = tabela.getSelectedRows();
                for (int i : selecao) {
                    if (aux == 0) {
                        parte += " fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                    } else {
                        parte += " OR fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                    }
                    aux++;
                }
                aux = 0;
                String query = "select sum(item_quantidade) as quantidade,\n"
                        + "produtos.pro_nome || '-' || to_char(produtos.pro_peso,'0009D90')|| ' Kg' as produto,\n"
                        + "to_char((select sum(itens.item_quantidade*produtos.pro_peso)\n"
                        + "from itens inner join produtos on produtos.pro_id = itens.fk_produto where \n"
                        + parte
                        + "),'0009D90')|| ' Kg' as peso\n"
                        + "from itens inner join produtos on produtos.pro_id = itens.fk_produto  where \n"
                        + parte
                        + "group by itens.fk_produto,produtos.pro_nome,produtos.pro_peso";
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
        }
    }//GEN-LAST:event_jBGerarActionPerformed

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        if (jDCInicial.getDate() == null || jDCFinal.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Selecione ambas as datas!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (tabela.getSelectedRowCount() != 0) {
                String parte = "";
                int aux = 0;
                int[] selecao = tabela.getSelectedRows();
                for (int i : selecao) {
                    if (aux == 0) {
                        parte += " fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                    } else {
                        parte += " OR fk_pedido = " + tabela.getModel().getValueAt(i, 0);
                    }
                    aux++;
                }
                aux = 0;
                String query = "select sum(item_quantidade) as quantidade,\n"
                        + "produtos.pro_nome || '-' || to_char(produtos.pro_peso,'0009D90')|| ' Kg' as produto,\n"
                        + "to_char((select sum(itens.item_quantidade*produtos.pro_peso)\n"
                        + "from itens inner join produtos on produtos.pro_id = itens.fk_produto where \n"
                        + parte
                        + "),'0009D90')|| ' Kg' as peso\n"
                        + "from itens inner join produtos on produtos.pro_id = itens.fk_produto  where \n"
                        + parte
                        + "group by itens.fk_produto,produtos.pro_nome,produtos.pro_peso";
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
        }
    }//GEN-LAST:event_jBImprimirActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGerar;
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBVisualizar;
    private com.toedter.calendar.JDateChooser jDCFinal;
    private com.toedter.calendar.JDateChooser jDCInicial;
    private javax.swing.JLabel jLAjuda;
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

    private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de geração de Romaneios SO.<br>"
                + "1. Para gerar o romaneio é necessário escolher as datas respectivas de início e término.<br>"
                + "2. Há a opção de visualização, gerar PDF's e/ou imprimi-los.<br>"
                + "3. Para consultar o Manual do Proprietário, basta dar um duplo clique em \"Ajuda\" ou tecle F1.</html>");
    }
}
