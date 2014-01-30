/*ESSE É DO GIT HUB
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.Editor.Editor;
import br.com.siroc.Editor.LeitorTeclas;
import br.com.siroc.builder.ItemBuilder;
import br.com.siroc.builder.PedidoBuilder;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Cliente;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Item;
import br.com.siroc.modelo.Pedido;
import br.com.siroc.modelo.Produto;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matteus
 */
public class NovoPedido extends JInternalFrame {

    /**
     * Creates new form NovoPedido
     */
    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Nome", "CNPJ/CPF", "Contato"}) {
        boolean[] canEdit = new boolean[]{
            false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };
    DefaultTableModel tmProduto_Fornecedor = new DefaultTableModel(null, new String[]{"Nome", "Peso", "Valor", "Fornecedor"}) {
        boolean[] canEdit = new boolean[]{
            false, false, false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };
    DefaultTableModel tmProduto_Pedido = new DefaultTableModel(null, new String[]{"Nome", "Peso", "Fornecedor", "QNT", "Valor Alterado", "Código"}) {
        boolean[] canEdit = new boolean[]{
            false, false, false, false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

//listas para serem utilizadas nas tabelas
    List<Produto> listProduto;
    List<Cliente> listCliente;
    List<Item> listItem = new ArrayList<>();
    List<Item> ItensFornecedor = new ArrayList<>();
    List<Long> idFornecedor = new ArrayList<>();
    Item item;
    Fornecedor fornecedor = new Fornecedor();
    Cliente cliente = new Cliente();
    DAO<Produto> pdao = new DAO<>(Produto.class);
    DAO<Cliente> cdao = new DAO<>(Cliente.class);
    DAO<Fornecedor> fdao = new DAO<>(Fornecedor.class);
    String status;
    JDesktopPane painel;
    private String caracteres = "0987654321.,";
    Double totalValor = 0.;
    Double totalPeso = 0.;

    public NovoPedido(JDesktopPane painel) {
        super("Cella - Cadastro de Pedidos");
        initComponents();
        this.painel = painel;

        hinter();
        this.setFocusable(true);
        this.addKeyListener(new LeitorTeclas());
        jDCData.setDate(new Date());
        jTProduto.setEnabled(false);
        //"Nome", "Peso", "Fornecedor", "Quantidade", "Valor Alterado", "Código"}) {
        TabelaProduto_Pedido.setAutoResizeMode(TabelaProduto_Pedido.AUTO_RESIZE_OFF);
        TabelaProduto_Pedido.getColumnModel().getColumn(0).setPreferredWidth(250);
        TabelaProduto_Pedido.getColumnModel().getColumn(1).setPreferredWidth(90);
        TabelaProduto_Pedido.getColumnModel().getColumn(2).setPreferredWidth(97);
        TabelaProduto_Pedido.getColumnModel().getColumn(3).setPreferredWidth(38);
        TabelaProduto_Pedido.getColumnModel().getColumn(4).setPreferredWidth(110);
        TabelaProduto_Pedido.getColumnModel().getColumn(5).setPreferredWidth(55);
        //{"Nome", "Peso", "Valor", "Fornecedor"}) {
        TabelaProduto_Fornecedor.setAutoResizeMode(TabelaProduto_Fornecedor.AUTO_RESIZE_OFF);
        TabelaProduto_Fornecedor.getColumnModel().getColumn(0).setPreferredWidth(390);
        TabelaProduto_Fornecedor.getColumnModel().getColumn(1).setPreferredWidth(90);
        TabelaProduto_Fornecedor.getColumnModel().getColumn(2).setPreferredWidth(110);
        TabelaProduto_Fornecedor.getColumnModel().getColumn(3).setPreferredWidth(145);
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
        jLCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCliente = new javax.swing.JTable();
        jTCliente = new javax.swing.JTextField();
        jDCData = new com.toedter.calendar.JDateChooser();
        jLData = new javax.swing.JLabel();
        jLPrazo = new javax.swing.JLabel();
        jTPrazo = new javax.swing.JTextField();
        jCBTipo_Pedido = new javax.swing.JComboBox();
        jLTipo_Pedido = new javax.swing.JLabel();
        jCBTipo_Pagamento = new javax.swing.JComboBox();
        jLTipo_Pagamento = new javax.swing.JLabel();
        jCBPago = new javax.swing.JComboBox();
        jLPrazo1 = new javax.swing.JLabel();
        jBSalvar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jLProduto = new javax.swing.JLabel();
        jTProduto = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaProduto_Fornecedor = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaProduto_Pedido = new javax.swing.JTable();
        jLTabela_Pedido = new javax.swing.JLabel();
        jBExcluir = new javax.swing.JButton();
        jLTotal = new javax.swing.JLabel();
        jLAjuda = new javax.swing.JLabel();
        jLTotalPeso = new javax.swing.JLabel();

        setClosable(true);
        setName("jFrame"); // NOI18N

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Pedidos");

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente:");

        TabelaCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaCliente.setModel(tmCliente);
        TabelaCliente.setRowHeight(23);
        TabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaCliente);

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClienteKeyTyped(evt);
            }
        });

        jDCData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Data:");

        jLPrazo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLPrazo.setText("Prazo:");

        jTPrazo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrazoActionPerformed(evt);
            }
        });
        jTPrazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPrazoKeyTyped(evt);
            }
        });

        jCBTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipo_Pedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SO", "NF" }));

        jLTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo_Pedido.setText("Tipo de Pedido:");

        jCBTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipo_Pagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cheque", "Boleto", "Vale", "Cartão", "Depósito", "Dinheiro" }));

        jLTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo_Pagamento.setText("Tipo de Pagamento:");

        jCBPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Em Aberto", "Parcialmente", "Pago" }));

        jLPrazo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLPrazo1.setText("Status:");

        jBSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
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

        jLProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLProduto.setText("Produto:");

        jTProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTProdutoKeyTyped(evt);
            }
        });

        TabelaProduto_Fornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaProduto_Fornecedor.setModel(tmProduto_Fornecedor);
        TabelaProduto_Fornecedor.setRowHeight(23);
        TabelaProduto_Fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProduto_FornecedorMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TabelaProduto_Fornecedor);

        TabelaProduto_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaProduto_Pedido.setModel(tmProduto_Pedido);
        TabelaProduto_Pedido.setRowHeight(23);
        jScrollPane3.setViewportView(TabelaProduto_Pedido);

        jLTabela_Pedido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTabela_Pedido.setText("Tabela de Produtos do Pedido");

        jBExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/excluir.gif"))); // NOI18N
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jLTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTotal.setText("Valor do Pedido:");

        jLAjuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/help.png"))); // NOI18N
        jLAjuda.setText("Ajuda");
        jLAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAjudaMouseClicked(evt);
            }
        });

        jLTotalPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTotalPeso.setText("Peso do Pedido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLCliente)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLCabecalho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLPrazo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTipo_Pedido)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTipo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTipo_Pagamento)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTipo_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLPrazo1)
                                .addGap(18, 18, 18)
                                .addComponent(jCBPago, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLTotalPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLProduto)
                                .addGap(18, 18, 18)
                                .addComponent(jTProduto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLAjuda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTabela_Pedido)
                                .addGap(179, 179, 179)
                                .addComponent(jBExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpar))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLAjuda)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBExcluir)
                            .addComponent(jLTabela_Pedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCabecalho)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCliente)
                                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jDCData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLPrazo)
                                        .addComponent(jTPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLTipo_Pedido)
                                    .addComponent(jCBTipo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLTipo_Pagamento)
                                    .addComponent(jCBTipo_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCBPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLPrazo1))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLProduto)
                            .addComponent(jTProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLTotal)
                        .addComponent(jLTotalPeso))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSalvar)
                        .addComponent(jBLimpar)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClienteMouseClicked
        //coloca o nome inteiro do fornecedor no campo, com isso o usuario confirma a "clicada" na escolha
        jTCliente.setText(listCliente.get(TabelaCliente.getSelectedRow()).getNome());
        jTProduto.setEnabled(true);
    }//GEN-LAST:event_TabelaClienteMouseClicked

    private void jTClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClienteKeyTyped
        while (tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }

        listCliente = cdao.buscaPorNome(jTCliente.getText());

        for (int i = 0; i < listCliente.size(); i++) {
            tmCliente.addRow(new String[]{null, null, null, null});
            tmCliente.setValueAt(listCliente.get(i).getNome(), i, 0);
            tmCliente.setValueAt(listCliente.get(i).getCnpj_cpf(), i, 1);
            tmCliente.setValueAt(listCliente.get(i).getContato(), i, 2);
        }
    }//GEN-LAST:event_jTClienteKeyTyped

    private void jTPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrazoActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        idFornecedor = limpaId(idFornecedor);
        //inserir pedido dentro desse for
        status = (String) jCBPago.getSelectedItem();
        Date data = jDCData.getDate();
        if (!jTPrazo.getText().equals("")) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(data);
            cal.add(cal.DAY_OF_MONTH, Integer.parseInt(jTPrazo.getText()));
            data = cal.getTime();
        }
        DAO<Pedido> pdao = new DAO<>(Pedido.class);
        for (int i = 0; i < idFornecedor.size(); i++) {
            fornecedor = fdao.busca(idFornecedor.get(i));
            for (int j = 0; j < listItem.size(); j++) {
                if (fornecedor.getId().equals(listItem.get(j).getProduto().getFornecedor().getId())) {
                    ItensFornecedor.add(listItem.get(i));
                }
            }
            //dados do pedido
            Pedido pedido = new PedidoBuilder().setCliente(listCliente.get(TabelaCliente.getSelectedRow())).setData(jDCData.getDate()).setStatus(status).
                    setTipo_pagamento(String.valueOf(jCBTipo_Pagamento.getSelectedItem())).setTipo_pedido(String.valueOf(jCBTipo_Pedido.getSelectedItem()))
                    .setItens(ItensFornecedor).setVencimento(data).getPedido();
            for (int k = 0; k < ItensFornecedor.size(); k++) {
                ItensFornecedor.get(k).setPedido(pedido);
            }
            pdao.adicionar(pedido);
            ItensFornecedor.clear();
        }
        JOptionPane.showMessageDialog(this, "Pedido adicionado com sucesso! \n Se deseja realizar outro pedido, clique em Limpar!", "Activity Performed Successfully", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        NovoPedido cp = new NovoPedido(painel);
        painel.add(cp);
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jTProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdutoKeyTyped
        cliente = listCliente.get(TabelaCliente.getSelectedRow());
        while (tmProduto_Fornecedor.getRowCount() > 0) {
            tmProduto_Fornecedor.removeRow(0);
        }

        listProduto = pdao.buscaPorNome(jTProduto.getText());
        for (int i = 0; i < listProduto.size(); i++) {
            fornecedor = listProduto.get(i).getFornecedor();
            Double porcentagem = 0.;
            switch (cliente.getEstado()) {
                case "SP":
                    porcentagem = fornecedor.getPorcSp() / 100;
                    break;
                case "MG":
                    porcentagem = fornecedor.getPorcMg() / 100;
                    break;
                case "RJ":
                    porcentagem = fornecedor.getPorcRj() / 100;
                    break;
            }
            Double valorProduto = listProduto.get(i).getValor_saida();
            tmProduto_Fornecedor.addRow(new String[]{null, null, null, null});
            tmProduto_Fornecedor.setValueAt(listProduto.get(i).getNome(), i, 0);
            tmProduto_Fornecedor.setValueAt(listProduto.get(i).getPeso() + " kg", i, 1);
            tmProduto_Fornecedor.setValueAt(Editor.format(valorProduto + (valorProduto * porcentagem)), i, 2);
            tmProduto_Fornecedor.setValueAt(listProduto.get(i).getFornecedor().
                    getNome(), i, 3);

        }
    }//GEN-LAST:event_jTProdutoKeyTyped

    private void TabelaProduto_FornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProduto_FornecedorMouseClicked
        fornecedor = listProduto.get(TabelaProduto_Fornecedor.getSelectedRow()).getFornecedor();
        idFornecedor.add(fornecedor.getId());
        Item itemAux = abreOptionPane();
        if (itemAux != null) {
            listItem.add(itemAux);
            preencheTabela(listItem);
        }
    }//GEN-LAST:event_TabelaProduto_FornecedorMouseClicked
    public Item abreOptionPane() {
//        String[] options = {"OK"};
//JPanel panel = new JPanel();
//JLabel lbl = new JLabel("Enter Your name: ");
//JTextField txt = new JTextField(10);
//panel.add(lbl);
//panel.add(txt);
//int selectedOption = JOptionPane.showOptionDialog(null, panel, "The Title", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);
//
//if(selectedOption == 0)
//{
//    String text = txt.getText();
//    // ...
//}
//        
//        String[] options = {"OK","Cancelar"};
//        JPanel panel = new JPanel();
//        JFrame frame = new JFrame();
//        
//        JLabel lbl_quantidade = new JLabel("Quantidade: ");
//        final JTextField quantidade = new JTextField(10);
//        JLabel lbl_valor = new JLabel("Valor alterado: ");
//        JTextField valor = new JTextField(10);
//        
//        panel.add(lbl_quantidade);
//        panel.add(quantidade);
//        panel.add(lbl_valor);
//        panel.add(valor);
//        frame.getContentPane().add(panel);
//        frame.pack();
//        
//        frame.addWindowListener(new WindowAdapter() {
//            public void windowOpened(WindowEvent e){
//                quantidade.requestFocusInWindow();
//            }
//        });
//        frame.setVisible(true);
//        //int selectedOption = JOptionPane.showOptionDialog(null, frame, "Informações adicionais", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);
//        int selectedOption = 1;

        //String campo_quantidade;
        JTextField campo_valor = new JTextField();
        JTextField campo_quantidade = new JTextField();

        Object[] message = {
            "Quantidade: ", campo_quantidade, "Valor alterado: ", campo_valor
        };

        //campo_quantidade = JOptionPane.showInputDialog(message);
        if (JOptionPane.showConfirmDialog(this, message, "Informações Adicionais", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            String[] optionpane = {campo_quantidade.getText(), campo_valor.getText()};
            return gravaResposta(optionpane);

//        if(selectedOption == 1){
        } else {

            return null;
        }
    }

    public Item gravaResposta(String[] message) {
        try {
            Double porcentagem = 0.;
            switch (cliente.getEstado()) {
                case "SP":
                    porcentagem = fornecedor.getPorcSp() / 100;
                    break;
                case "MG":
                    porcentagem = fornecedor.getPorcMg() / 100;
                    break;
                case "RJ":
                    porcentagem = fornecedor.getPorcRj() / 100;
                    break;
            }
            if (message[1].equals("")) {
                item = new ItemBuilder().setProduto(listProduto.get(TabelaProduto_Fornecedor.getSelectedRow())).
                        setQuantidade(message[0]).setValor_alterado(String.valueOf(listProduto.get(TabelaProduto_Fornecedor.getSelectedRow()).getValor_saida()), porcentagem)
                        .getItem();
            } else if (!message[1].equals("")) {
                item = new ItemBuilder().setProduto(listProduto.get(TabelaProduto_Fornecedor.getSelectedRow())).
                        setQuantidade(message[0]).setValor_alterado(message[1], 0.)
                        .getItem();
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Campos obrigatórios (*) vazios e/ou Informação inválida!", "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            abreOptionPane();
        }
        return item;
    }
    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        removeItem();
        totalValor = 0.;
        totalPeso = 0.;
        for (int i = 0; i < listItem.size(); i++) {
            totalValor += listItem.get(i).getValor_alterado() * listItem.get(i).getQuantidade();
            totalPeso += listItem.get(i).getProduto().getPeso() * listItem.get(i).getQuantidade();
        }
        jLTotalPeso.setText("Peso do Pedido: " + String.valueOf(totalPeso) + " Kg");
        jLTotal.setText("Valor do Pedido: " + Editor.format(totalValor));
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jLAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAjudaMouseClicked
        if (evt.getButton() != evt.BUTTON3 && evt.getClickCount() == 2) {
            String caminho = System.getenv("USERPROFILE")
                    + "\\Documents\\nbng\\siroc\\ajuda\\Manual do Proprietário - "
                    + "SIROC versão 1.9.9.pdf";
            File arquivo = new File(caminho);
            try {
                Desktop.getDesktop().open(arquivo);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jLAjudaMouseClicked

    private void jTPrazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrazoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrazoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JTable TabelaProduto_Fornecedor;
    private javax.swing.JTable TabelaProduto_Pedido;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox jCBPago;
    private javax.swing.JComboBox jCBTipo_Pagamento;
    private javax.swing.JComboBox jCBTipo_Pedido;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLPrazo;
    private javax.swing.JLabel jLPrazo1;
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLTabela_Pedido;
    private javax.swing.JLabel jLTipo_Pagamento;
    private javax.swing.JLabel jLTipo_Pedido;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLTotalPeso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTextField jTPrazo;
    private javax.swing.JTextField jTProduto;
    // End of variables declaration//GEN-END:variables
    public void preencheTabela(List<Item> Itens) {
//{"Nome", "Peso", "Fornecedor", "Quantidade", "Valor Alterado", "Código"}) {
        while (tmProduto_Pedido.getRowCount() > 0) {
            tmProduto_Pedido.removeRow(0);
        }
        totalValor = 0.;
        totalPeso = 0.;

        for (int i = 0; i < Itens.size(); i++) {
            tmProduto_Pedido.addRow(new String[]{null, null, null, null});
            tmProduto_Pedido.setValueAt(Itens.get(i).getProduto().getNome(), i, 0);
            tmProduto_Pedido.setValueAt(Itens.get(i).getProduto().getPeso() + " Kg", i, 1);
            tmProduto_Pedido.setValueAt(Itens.get(i).getProduto().getFornecedor().getNome(), i, 2);
            tmProduto_Pedido.setValueAt(Itens.get(i).getQuantidade(), i, 3);
            tmProduto_Pedido.setValueAt(Editor.format(Itens.get(i).getValor_alterado()), i, 4);
            tmProduto_Pedido.setValueAt(Itens.get(i).getProduto().getId(), i, 5);
            totalValor += listItem.get(i).getValor_alterado() * listItem.get(i).getQuantidade();
            totalPeso += listItem.get(i).getProduto().getPeso() * listItem.get(i).getQuantidade();

        }
        jLTotalPeso.setText("Peso do Pedido: " + String.valueOf(totalPeso) + " Kg");
        jLTotal.setText("Valor do Pedido: " + Editor.format(totalValor));
    }

    private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de cadastro de Pedidos,<br>"
                + " onde serão cadastrados os dados relativos as informações do pedido. <br>"
                + "1. Lembre-se de preencher os dados obrigatórios sempre, para serem evitados erros.<br>"
                + "2. Lembre-se de escolher o Cliente para o cadastro ser efetuado com sucesso.<br>"
                + "3. Para serem listados os produtos, é necessário que seja escolhido o fornecedor.<br>"
                + "3. Após o preenchimento, clique no botão Cadastrar para que seja executada a atualização.<br>"
                + "4. O botão limpar reinicia a tela, limpando os campos.<br>"
                + "5. Caso a data não seja escolhida, o pedido será cadastrado com a data atual.<br>"
                + "6. O valor do produto pode ou não ser alterado quando for escolhido.<br>"
                + "7. O botão retirar produto remove um produto da lista no pedido.<br>"
                + "8. Para consultar o Manual do Proprietário, basta dar um duplo clique em \"Ajuda\" ou tecle F1.</html>");
    }

    public void removeItem() {
        listItem.remove(listItem.get(TabelaProduto_Pedido.getSelectedRow()));
        preencheTabela(listItem);
    }

    public void marca() {
        jLCliente.setText("CLiente:*");
        jLData.setText("Data:*");
        jLTipo_Pedido.setText("Tipo de Pedido:*");
        jLTipo_Pagamento.setText("Tipo de Pagamento:*");
        jLTabela_Pedido.setText("Tabela de Produtos do Pedido:*");
    }

    public List<Long> limpaLista(List<Long> lista) {
        HashSet listaLimpa = new HashSet();
        listaLimpa.addAll(lista);
        lista.clear();
        Iterator iterator = listaLimpa.iterator();
        while (iterator.hasNext()) {
            lista.add((Long) iterator.next());
        }
        return lista;
    }

    private List<Long> limpaId(List<Long> idFornecedor) {
        HashSet forn = new HashSet();
        for (int i = 0; i < idFornecedor.size(); i++) {
            forn.add(idFornecedor.get(i));
        }
        Iterator i = forn.iterator();
        idFornecedor.clear();
        while (i.hasNext()) {
            idFornecedor.add((Long) i.next());
        }
        return idFornecedor;
    }
}
