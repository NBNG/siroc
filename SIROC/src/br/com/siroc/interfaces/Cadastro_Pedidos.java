/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.builder.ItemBuilder;
import br.com.siroc.builder.PedidoBuilder;
import br.com.siroc.classes_auxiliares.Editor;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Cliente;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Item;
import br.com.siroc.modelo.Pedido;
import br.com.siroc.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matteus
 */
public class Cadastro_Pedidos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Pedido
     */
    //modelos para tabelas
    DefaultTableModel tmFornecedor = new DefaultTableModel(null, new String[]{"Nome", "Email"});
    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Nome", "CNPJ/CPF", "Contato"});
    DefaultTableModel tmProduto_Fornecedor = new DefaultTableModel(null, new String[]{"Nome", "Peso", "Fornecedor", "Valor Entrada", "Valor Saída"});
    DefaultTableModel tmProduto_Pedido = new DefaultTableModel(null, new String[]{"Código", "Nome", "Quantidade", "Valor Alterado"});
    //listas para serem utilizadas nas tabelas
    List<Fornecedor> listFornecedor;
    List<Produto> listProduto;
    List<Cliente> listCliente;
    List<Item> listItem;

    Cliente cliente;
    Pedido pedido;
    Item item;

    DAO<Fornecedor> fdao = new DAO<Fornecedor>(Fornecedor.class);
    DAO<Cliente> cdao = new DAO<Cliente>(Cliente.class);

    Double valor;
    Integer quantidade;
    String status;

    public Cadastro_Pedidos() {
        super("Cella - Cadastro de Pedidos");
        initComponents();
        TabelaFornecedor.setRowHeight(23);
        TabelaProduto_Fornecedor.setRowHeight(23);
        TabelaProduto_Pedido.setRowHeight(23);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLFornecedor = new javax.swing.JLabel();
        jTNome_Fornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFornecedor = new javax.swing.JTable();
        jLData = new javax.swing.JLabel();
        jLTipo_Pedido = new javax.swing.JLabel();
        jLTipo_Pagamento = new javax.swing.JLabel();
        jDCData = new com.toedter.calendar.JDateChooser();
        jCBTipo_Pedido = new javax.swing.JComboBox();
        jCBTipo_Pagamento = new javax.swing.JComboBox();
        Separador = new javax.swing.JSeparator();
        jLCabecalho = new javax.swing.JLabel();
        jLTabela_Pedido = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaProduto_Fornecedor = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaProduto_Pedido = new javax.swing.JTable();
        jLTabela_Fornecedor = new javax.swing.JLabel();
        jBSalvar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jCBPago = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaCliente = new javax.swing.JTable();
        jLCliente = new javax.swing.JLabel();
        jTCliente = new javax.swing.JTextField();

        setClosable(true);

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor.setText("Fornecedor:");

        jTNome_Fornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNome_Fornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNome_FornecedorKeyTyped(evt);
            }
        });

        TabelaFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaFornecedor.setModel(tmFornecedor);
        TabelaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaFornecedor);

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Data:");

        jLTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo_Pedido.setText("Tipo de Pedido:");

        jLTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo_Pagamento.setText("Tipo de Pagamento:");

        jDCData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipo_Pedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NF", "SO" }));

        jCBTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipo_Pagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cartão", "Cheque", "Depósito", "Dinheiro" }));

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Pedidos");

        jLTabela_Pedido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTabela_Pedido.setText("Tabela de Produtos do Pedido");

        TabelaProduto_Fornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaProduto_Fornecedor.setModel(tmProduto_Fornecedor);
        TabelaProduto_Fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProduto_FornecedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaProduto_Fornecedor);

        TabelaProduto_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaProduto_Pedido.setModel(tmProduto_Pedido);
        jScrollPane3.setViewportView(TabelaProduto_Pedido);

        jLTabela_Fornecedor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTabela_Fornecedor.setText("Tabela de Produtos do Fornecedor");

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

        jCBPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBPago.setText("Pago");

        TabelaCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaCliente.setModel(tmCliente);
        TabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TabelaCliente);

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente:");

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalvar)
                        .addGap(36, 36, 36)
                        .addComponent(jBLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTabela_Fornecedor)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTabela_Pedido)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Separador)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLData)
                                .addGap(18, 18, 18)
                                .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCBPago)
                                .addGap(18, 18, 18)
                                .addComponent(jLTipo_Pedido)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTipo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLTipo_Pagamento)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTipo_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLFornecedor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTNome_Fornecedor))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(36, 36, 36))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBLimpar, jBSalvar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCliente)
                        .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLFornecedor)
                        .addComponent(jTNome_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCBPago)
                                .addComponent(jLTipo_Pedido)
                                .addComponent(jLTipo_Pagamento)
                                .addComponent(jCBTipo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCBTipo_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData)
                                    .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTabela_Fornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTabela_Pedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBSalvar)
                            .addComponent(jBLimpar))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNome_FornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNome_FornecedorKeyTyped
        while (tmFornecedor.getRowCount() > 0) {
            tmFornecedor.removeRow(0);
        }

        //pesquisa fornecedor por nome e preenche a ListFornecedores
        listFornecedor = fdao.buscaPorNome(jTNome_Fornecedor.getText());

        //preenche tabela de fornecedores
        for (int i = 0; i < listFornecedor.size(); i++) {
            tmFornecedor.addRow(new String[]{null, null, null, null});
            tmFornecedor.setValueAt(listFornecedor.get(i).getNome(), i, 0);
            tmFornecedor.setValueAt(listFornecedor.get(i).getEmail(), i, 1);
        }
    }//GEN-LAST:event_jTNome_FornecedorKeyTyped

    private void TabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaFornecedorMouseClicked
        //coloca o nome inteiro do fornecedor no campo, com isso o usuario confirma a "clicada" na escolha
        jTNome_Fornecedor.setText(listFornecedor.get(TabelaFornecedor.getSelectedRow()).getNome());

        while (tmProduto_Fornecedor.getRowCount() > 0) {
            tmProduto_Fornecedor.removeRow(0);
        }

        //inicializa array produtos
        listProduto = new ArrayList<>();
        //popula a list de produtos com os produtos presentes na lista de fornecedores pesquisada pelo FornecedorKeyTyped
        listProduto = listFornecedor.get(TabelaFornecedor.getSelectedRow()).getProdutos();

        for (int i = 0; i < listProduto.size(); i++) {
            tmProduto_Fornecedor.addRow(new String[]{null, null, null, null});
            tmProduto_Fornecedor.setValueAt(listProduto.get(i).getNome(), i, 0);
            tmProduto_Fornecedor.setValueAt(listProduto.get(i).getPeso() + " kg", i, 1);
            tmProduto_Fornecedor.setValueAt(listProduto.get(i).getFornecedor().getNome(), i, 2);
            tmProduto_Fornecedor.setValueAt(Editor.format(listProduto.get(i).getValor_entrada()), i, 3);
            tmProduto_Fornecedor.setValueAt(Editor.format(listProduto.get(i).getValor_saida()), i, 4);
        }
        listItem = new ArrayList<>();
    }//GEN-LAST:event_TabelaFornecedorMouseClicked

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        if (jCBPago.isSelected()) {
            status = "Pago";
        }

        DAO<Pedido> pdao = new DAO<>(Pedido.class);

        /*
         * pedido = new Pedido();

         if (jDCData.getDate() != null) {
         pedido.setData(jDCData.getDate());
         }

         pedido.setCliente(listCliente.get(TabelaCliente.getSelectedRow()));
         pedido.setTipo_pagamento(String.valueOf(jCBTipo_Pagamento.getSelectedItem()));
         pedido.setTipo_pedido(String.valueOf(jCBTipo_Pedido.getSelectedItem()));
         */
        pedido = new PedidoBuilder().setCliente(listCliente.get(TabelaCliente.getSelectedRow())).setData(jDCData.getDate()).setStatus(status).
                setTipo_pagamento(String.valueOf(jCBTipo_Pagamento.getSelectedItem())).setTipo_pedido(String.valueOf(jCBTipo_Pedido.getSelectedItem()))
                .setItens(listItem).getPedido();
        //pedido.setItens(listItem);
        for (int i = 0; i < listItem.size(); i++) {
            listItem.get(i).setPedido(pedido);
            //System.out.println(listItem.get(i).getPedido().getCliente().getNome());
            //System.out.println(listItem.get(i).getProduto().getNome());
        }
        pdao.adicionar(pedido);
        JOptionPane.showMessageDialog(null, "Pedido cadastrado com Sucesso.");
        //marca();
        pedido = new Pedido();
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void TabelaProduto_FornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProduto_FornecedorMouseClicked
        //item = new Item();
        JTextField campo_quantidade = new JTextField();
        JTextField campo_valor = new JTextField();

        Object[] message = {
            "Quantidade: ", campo_quantidade,
            "Valor Alterado: ", campo_valor};

        if (JOptionPane.showConfirmDialog(null, message, "Informações Adicionais", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

            /*if (campo_valor.getText().equals("")) {
             item.setValor_alterado(listProduto.get(TabelaProduto_Fornecedor.getSelectedRow()).getValor_saida());
             } else {
             item.setValor_alterado(Double.parseDouble(campo_valor.getText()));
             }
             item.setQuantidade(Integer.parseInt(campo_quantidade.getText()));
             item.setProduto(listProduto.get(TabelaProduto_Fornecedor.getSelectedRow()));
           
             */
            try {
                item = new ItemBuilder().setPedido(pedido).setProduto(listProduto.get(TabelaProduto_Fornecedor.getSelectedRow())).
                        setQuantidade(campo_quantidade.getText()).setValor_alterado(campo_valor.getText())
                        .getItem();
            } catch (NullPointerException e) {

            }
            listItem.add(item);

            preencheTabela(listItem);
        }
    }//GEN-LAST:event_TabelaProduto_FornecedorMouseClicked

    private void TabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClienteMouseClicked
        jTCliente.setText(listCliente.get(TabelaCliente.getSelectedRow()).getNome());
        cliente = new Cliente();
        //cliente = listCliente.get(TabelaCliente.getSelectedRow());
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JTable TabelaFornecedor;
    private javax.swing.JTable TabelaProduto_Fornecedor;
    private javax.swing.JTable TabelaProduto_Pedido;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JCheckBox jCBPago;
    private javax.swing.JComboBox jCBTipo_Pagamento;
    private javax.swing.JComboBox jCBTipo_Pedido;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLTabela_Fornecedor;
    private javax.swing.JLabel jLTabela_Pedido;
    private javax.swing.JLabel jLTipo_Pagamento;
    private javax.swing.JLabel jLTipo_Pedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTextField jTNome_Fornecedor;
    // End of variables declaration//GEN-END:variables

    public void marca() {
        jLFornecedor.setText("Fornecedor:*");
        jLCliente.setText("Cliente:*");
        jLData.setText("Data:*");
        jLTipo_Pedido.setText("Tipo de Pedido:*");
        jLTipo_Pagamento.setText("Tipo de Pagamento:*");
        jLTabela_Pedido.setText("Tabela de Produtos do Pedido:*");
    }

    public void preencheTabela(List<Item> Itens) {

        while (tmProduto_Pedido.getRowCount() > 0) {
            tmProduto_Pedido.removeRow(0);
        }

        for (int i = 0; i < Itens.size(); i++) {
            tmProduto_Pedido.addRow(new String[]{null, null, null, null});
            tmProduto_Pedido.setValueAt(Itens.get(i).getProduto().getId(), i, 0);
            tmProduto_Pedido.setValueAt(Itens.get(i).getProduto().getNome(), i, 1);
            tmProduto_Pedido.setValueAt(Itens.get(i).getQuantidade(), i, 2);
            tmProduto_Pedido.setValueAt(Editor.format(Itens.get(i).getValor_alterado()), i, 3);
        }
    }
}
