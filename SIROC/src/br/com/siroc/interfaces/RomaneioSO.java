package br.com.siroc.interfaces;

import br.com.siroc.Editor.Editor;
import br.com.siroc.Editor.LeitorTeclas;
import br.com.siroc.Jasper.Relatorio;
import br.com.siroc.dao.DAO;
import br.com.siroc.dao.PedidoDAO;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Pedido;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author matteus
 */
public class RomaneioSO extends javax.swing.JFrame {

    PedidoDAO peddao = new PedidoDAO();
    DAO<Pedido> pdao = new DAO<>(Pedido.class);
    List<Pedido> pedidos;
    List<Fornecedor> fornecedores;
    HashSet cFornecedor;
    List<Object[]> list; //pesquisa avançada
    DefaultTableModel tmPedido = new DefaultTableModel(null,
            new String[]{"Marcação", "Cliente", "Data", "Vencimento", "Valor Total",
                "Valor Devedor", "Fornecedor", "Pagamento", "Tipo Pedido", "Cidade", "Status", "ID"}) {
                public Class<?> getColumnClass(int columnIndex) {
                    if (columnIndex == 0) {
                        return Boolean.class;
                    } else {
                        return super.getColumnClass(columnIndex);
                    }
                }
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
        tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(225);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(6).setPreferredWidth(225);
        tabela.getColumnModel().getColumn(7).setPreferredWidth(90);
        tabela.getColumnModel().getColumn(8).setPreferredWidth(85);
        tabela.getColumnModel().getColumn(9).setPreferredWidth(150);
        tabela.getColumnModel().getColumn(10).setPreferredWidth(115);
        tabela.getColumnModel().getColumn(11).setPreferredWidth(60);

        populateFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCabecalho = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jBPesquisar = new javax.swing.JButton();
        jLAjuda = new javax.swing.JLabel();
        jCBFornecedor = new javax.swing.JComboBox();
        jLFornecedor = new javax.swing.JLabel();
        jLDataInicial = new javax.swing.JLabel();
        jDCFinal = new com.toedter.calendar.JDateChooser();
        jCBEstado = new javax.swing.JComboBox();
        jLFornecedor2 = new javax.swing.JLabel();
        jLDataFinal = new javax.swing.JLabel();
        jDCInicial = new com.toedter.calendar.JDateChooser();
        jBVisualizar = new javax.swing.JButton();
        jBImprimir = new javax.swing.JButton();
        jBGerar = new javax.swing.JButton();
        jTBMarca = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Romaneio SO");

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmPedido);
        tabela.setRowHeight(23);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
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

        jCBFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor.setText("Fornecedor:");

        jLDataInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDataInicial.setText("Data Inicial:");

        jCBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "RJ", "MG", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "PA", "PB", "PR", "PE", "PI", "RN", "RS", "RO", "RR", "SC", "SE", "TO" }));

        jLFornecedor2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor2.setText("Estado:");

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

        jBImprimir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/imprimir.png"))); // NOI18N
        jBImprimir.setText("Imprimir");
        jBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirActionPerformed(evt);
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

        jTBMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTBMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/editar.png"))); // NOI18N
        jTBMarca.setText("Marcar Tudo");
        jTBMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLDataInicial)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jDCInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(jLDataFinal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jDCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLFornecedor)
                            .addGap(18, 18, 18)
                            .addComponent(jCBFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLFornecedor2)
                            .addGap(18, 18, 18)
                            .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLCabecalho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLAjuda))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBPesquisar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTBMarca)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBVisualizar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBGerar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBImprimir))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDCFinal, jDCInicial});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCabecalho))
                    .addComponent(jLAjuda))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBPesquisar)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFornecedor)
                            .addComponent(jLFornecedor2)
                            .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLDataInicial)
                                .addComponent(jLDataFinal))
                            .addComponent(jDCInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGerar)
                    .addComponent(jBImprimir)
                    .addComponent(jBVisualizar)
                    .addComponent(jTBMarca))
                .addGap(26, 26, 26))
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
                tmPedido.setValueAt(resultado[3], i, 1); //Cliente
                tmPedido.setValueAt(Editor.formatData((Date) resultado[0]), i, 2); //Data
                if (resultado[11] == null) {
                    tmPedido.setValueAt("", i, 3); //Vencimento    
                } else {
                    tmPedido.setValueAt(Editor.formatData((Date) resultado[11]), i, 3); //Vencimento
                }
                tmPedido.setValueAt(Editor.format((Double) resultado[5]), i, 4); //Valor Total
                if (resultado[12] != null) {
                    Double valor = (Double) resultado[5] - (Double) resultado[12];
                    tmPedido.setValueAt(Editor.format(valor), i, 5);//devedor
                } else {
                    tmPedido.setValueAt("0,00", i, 5);//devedor
                }
                tmPedido.setValueAt(resultado[4], i, 6); //Fornecedor
                tmPedido.setValueAt(resultado[7], i, 7); //Tipo pagamento
                tmPedido.setValueAt(resultado[8], i, 8); //Tipo de pedido
                tmPedido.setValueAt(resultado[1], i, 9); //Cidade
                tmPedido.setValueAt(resultado[6], i, 10); //Status
                tmPedido.setValueAt(resultado[10], i, 11); //ID
            }
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

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

    private void jBVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarActionPerformed
        Boolean aux;
        if (tabela.getRowCount() != 0) {
            int col = 0;
            String parte = "";
            for (int i = 0; i < tabela.getRowCount(); i++) {
                aux = (Boolean) tabela.getValueAt(i, 0);
                if (aux == null) {

                } else if (aux == true) {
                    if (col == 0) {
                        parte += " fk_pedido = " + tabela.getModel().getValueAt(i, 11);
                    } else {
                        parte += " OR fk_pedido = " + tabela.getModel().getValueAt(i, 11);
                    }
                    col++;
                }
            }
            String query = "select fornecedores.for_nome as fornecedor,"
                    + "sum(item_quantidade) as quantidade,"
                    + "produtos.pro_nome || ' - ' || to_char(produtos.pro_peso,'0009D90')|| ' Kg' as produto,"
                    + "to_char((select sum(itens.item_quantidade*produtos.pro_peso) from itens inner join produtos on "
                    + "produtos.pro_id = itens.fk_produto inner join fornecedores on produtos.fk_fornecedor = fornecedores.for_id inner join pedidos on itens.fk_pedido = pedidos.ped_id"
                    + " inner join clientes on pedidos.fk_cliente = clientes.cli_id where "
                    + parte + " AND clientes.cli_estado = '" + (String) jCBEstado.getSelectedItem() + "'),'0009D90') || ' Kg' as peso from itens inner join produtos on "
                    + "produtos.pro_id = itens.fk_produto inner join fornecedores on produtos.fk_fornecedor = fornecedores.for_id inner join pedidos on itens.fk_pedido = pedidos.ped_id "
                    + "inner join clientes on pedidos.fk_cliente = clientes.cli_id where "
                    + parte + " AND clientes.cli_estado = '" + (String) jCBEstado.getSelectedItem() + "' group by itens.fk_produto,produtos.pro_nome,produtos.pro_peso,fornecedores.for_nome";
            System.out.println(query);
            try {
                java.sql.Date dataI = new java.sql.Date(jDCInicial.getDate().getTime());
                java.sql.Date dataF = new java.sql.Date(jDCFinal.getDate().getTime());
                String nome = "//Romaneio NF " + Editor.formatDataPasta(dataI) + " até " + Editor.formatDataPasta(dataF) + ".pdf";
                Relatorio rel = new Relatorio();
                rel.romaneioSO(query, 2, nome);

            } catch (IOException | JRException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro em procurar arquivo. Contate o administrador do sistema!\n" + ex);
            }
        }
    }//GEN-LAST:event_jBVisualizarActionPerformed

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        Boolean aux;
        if (tabela.getRowCount() != 0) {
            int col = 0;
            String parte = "";
            for (int i = 0; i < tabela.getRowCount(); i++) {
                aux = (Boolean) tabela.getValueAt(i, 0);
                if (aux == null) {

                } else if (aux == true) {
                    if (col == 0) {
                        parte += " fk_pedido = " + tabela.getModel().getValueAt(i, 11);
                    } else {
                        parte += " OR fk_pedido = " + tabela.getModel().getValueAt(i, 11);
                    }
                    col++;
                }
            }
            String query = "select fornecedores.for_nome as fornecedor,"
                    + "sum(item_quantidade) as quantidade,"
                    + "produtos.pro_nome || ' - ' || to_char(produtos.pro_peso,'0009D90')|| ' Kg' as produto,"
                    + "to_char((select sum(itens.item_quantidade*produtos.pro_peso) from itens inner join produtos on "
                    + "produtos.pro_id = itens.fk_produto inner join fornecedores on produtos.fk_fornecedor = fornecedores.for_id inner join pedidos on itens.fk_pedido = pedidos.ped_id"
                    + " inner join clientes on pedidos.fk_cliente = clientes.cli_id where "
                    + parte + " AND clientes.cli_estado = '" + (String) jCBEstado.getSelectedItem() + "'),'0009D90') || ' Kg' as peso from itens inner join produtos on "
                    + "produtos.pro_id = itens.fk_produto inner join fornecedores on produtos.fk_fornecedor = fornecedores.for_id inner join pedidos on itens.fk_pedido = pedidos.ped_id "
                    + "inner join clientes on pedidos.fk_cliente = clientes.cli_id where "
                    + parte + " AND clientes.cli_estado = '" + (String) jCBEstado.getSelectedItem() + "' group by itens.fk_produto,produtos.pro_nome,produtos.pro_peso,fornecedores.for_nome";
            System.out.println(query);
            try {
                java.sql.Date dataI = new java.sql.Date(jDCInicial.getDate().getTime());
                java.sql.Date dataF = new java.sql.Date(jDCFinal.getDate().getTime());
                String nome = "//Romaneio NF " + Editor.formatDataPasta(dataI) + " até " + Editor.formatDataPasta(dataF) + ".pdf";
                Relatorio rel = new Relatorio();
                rel.romaneioSO(query, 1, nome);

            } catch (IOException | JRException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro em procurar arquivo. Contate o administrador do sistema!\n" + ex);
            }
        }
    }//GEN-LAST:event_jBImprimirActionPerformed

    private void jBGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerarActionPerformed
        Boolean aux;
        if (tabela.getRowCount() != 0) {
            int col = 0;
            String parte = "";
            for (int i = 0; i < tabela.getRowCount(); i++) {
                aux = (Boolean) tabela.getValueAt(i, 0);
                if (aux == null) {

                } else if (aux == true) {
                    if (col == 0) {
                        parte += " fk_pedido = " + tabela.getModel().getValueAt(i, 11);
                    } else {
                        parte += " OR fk_pedido = " + tabela.getModel().getValueAt(i, 11);
                    }
                    col++;
                }
            }
            String query = "select fornecedores.for_nome as fornecedor,"
                    + "sum(item_quantidade) as quantidade,"
                    + "produtos.pro_nome || ' - ' || to_char(produtos.pro_peso,'0009D90')|| ' Kg' as produto,"
                    + "to_char((select sum(itens.item_quantidade*produtos.pro_peso) from itens inner join produtos on "
                    + "produtos.pro_id = itens.fk_produto inner join fornecedores on produtos.fk_fornecedor = fornecedores.for_id inner join pedidos on itens.fk_pedido = pedidos.ped_id"
                    + " inner join clientes on pedidos.fk_cliente = clientes.cli_id where "
                    + parte + " AND clientes.cli_estado = '" + (String) jCBEstado.getSelectedItem() + "'),'0009D90') || ' Kg' as peso from itens inner join produtos on "
                    + "produtos.pro_id = itens.fk_produto inner join fornecedores on produtos.fk_fornecedor = fornecedores.for_id inner join pedidos on itens.fk_pedido = pedidos.ped_id "
                    + "inner join clientes on pedidos.fk_cliente = clientes.cli_id where "
                    + parte + " AND clientes.cli_estado = '" + (String) jCBEstado.getSelectedItem() + "' group by itens.fk_produto,produtos.pro_nome,produtos.pro_peso,fornecedores.for_nome";
            System.out.println(query);
            try {
                java.sql.Date dataI = new java.sql.Date(jDCInicial.getDate().getTime());
                java.sql.Date dataF = new java.sql.Date(jDCFinal.getDate().getTime());
                String nome = "//Romaneio NF " + Editor.formatDataPasta(dataI) + " até " + Editor.formatDataPasta(dataF) + ".pdf";
                Relatorio rel = new Relatorio();
                rel.romaneioSO(query, 0, nome);

            } catch (IOException | JRException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro em procurar arquivo. Contate o administrador do sistema!\n" + ex);
            }
        }
    }//GEN-LAST:event_jBGerarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            int linha = tabela.getSelectedRow();
            int col = tabela.getSelectedColumn();

            if (col == 0) {
                Boolean aux = (Boolean) tmPedido.getValueAt(linha, col);
                if (aux == null || aux == false) {
                    tmPedido.setValueAt(true, linha, col);
                } else if (aux = true) {
                    tmPedido.setValueAt(false, linha, col);
                }

            }
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void jTBMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBMarcaActionPerformed
        if (tabela.getRowCount() != 0) {
            if (jTBMarca.isSelected()) {
                for (int i = 0; i < tabela.getRowCount(); i++) {
                    tmPedido.setValueAt(true, i, 0);
                }
            } else {
                for (int i = 0; i < tabela.getRowCount(); i++) {
                    tmPedido.setValueAt(false, i, 0);
                }
            }
        }
    }//GEN-LAST:event_jTBMarcaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGerar;
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBVisualizar;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JComboBox jCBFornecedor;
    private com.toedter.calendar.JDateChooser jDCFinal;
    private com.toedter.calendar.JDateChooser jDCInicial;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLDataFinal;
    private javax.swing.JLabel jLDataInicial;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLFornecedor2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBMarca;
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

    private void populateFields() {
        pedidos = pdao.listaTodos();
        cFornecedor = new HashSet();

        for (int i = 0; i < pedidos.size(); i++) {
            for (int j = 0; j < pedidos.get(i).getItens().size(); j++) {
                cFornecedor.add(pedidos.get(i).getItens().get(j).getProduto().getFornecedor().getNome());
            }
        }

        fornecedores = new ArrayList<>(cFornecedor);

        Iterator i = cFornecedor.iterator();

        while (i.hasNext()) {
            jCBFornecedor.addItem(i.next());
        }

    }
}
