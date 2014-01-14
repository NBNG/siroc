/*
 * To change this template, choose Tools | Templates
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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matteus
 */
public class CadastroPedidos extends javax.swing.JInternalFrame {

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
    JDesktopPane painel;

    public CadastroPedidos(JDesktopPane painel) {
        super("Cella - Cadastro de Pedidos");
        initComponents();
        this.painel = painel;
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
        jBExcluir = new javax.swing.JButton();
        jLAjuda = new javax.swing.JLabel();

        setClosable(true);

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLFornecedor.setText("Fornecedor:");

        jTNome_Fornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTNome_Fornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNome_FornecedorKeyTyped(evt);
            }
        });

        TabelaFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TabelaFornecedor.setModel(tmFornecedor);
        TabelaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaFornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaFornecedor);

        jLData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLData.setText("Data:");

        jLTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLTipo_Pedido.setText("Tipo de Pedido:");

        jLTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLTipo_Pagamento.setText("Tipo de Pagamento:");

        jDCData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBTipo_Pedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NF", "SO" }));

        jCBTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBTipo_Pagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cartão", "Cheque", "Depósito", "Dinheiro" }));

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Pedidos");

        jLTabela_Pedido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTabela_Pedido.setText("Tabela de Produtos do Pedido");

        TabelaProduto_Fornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TabelaProduto_Fornecedor.setModel(tmProduto_Fornecedor);
        TabelaProduto_Fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProduto_FornecedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaProduto_Fornecedor);

        TabelaProduto_Pedido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TabelaProduto_Pedido.setModel(tmProduto_Pedido);
        jScrollPane3.setViewportView(TabelaProduto_Pedido);

        jLTabela_Fornecedor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTabela_Fornecedor.setText("Tabela de Produtos do Fornecedor");

        jBSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jCBPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBPago.setText("Pago");

        TabelaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TabelaCliente.setModel(tmCliente);
        TabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TabelaCliente);

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLCliente.setText("Cliente:");

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClienteKeyTyped(evt);
            }
        });

        jBExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/excluir.gif"))); // NOI18N
        jBExcluir.setText("Retirar Produto");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
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
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLAjuda))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTNome_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jTCliente)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
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
                    .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTabela_Fornecedor)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTabela_Pedido)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpar)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBLimpar, jBSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLCabecalho)
                    .addComponent(jLAjuda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFornecedor)
                    .addComponent(jTNome_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCliente)
                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(17, 17, 17)
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
                .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTabela_Pedido)
                    .addComponent(jLTabela_Fornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExcluir)
                    .addComponent(jBSalvar)
                    .addComponent(jBLimpar))
                .addContainerGap(22, Short.MAX_VALUE))
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

        pedido = new PedidoBuilder().setCliente(listCliente.get(TabelaCliente.getSelectedRow())).setData(jDCData.getDate()).setStatus(status).
                setTipo_pagamento(String.valueOf(jCBTipo_Pagamento.getSelectedItem())).setTipo_pedido(String.valueOf(jCBTipo_Pedido.getSelectedItem()))
                .setItens(listItem).getPedido();
        //pedido.setItens(listItem);
        for (int i = 0; i < listItem.size(); i++) {
            listItem.get(i).setPedido(pedido);
        }

        pdao.adicionar(pedido);
        JOptionPane.showMessageDialog(CadastroPedidos.this, "Pedido adicionado com sucesso! \n Se deseja realizar outro pedido, clique em Limpar!", "Activity Performed Successfully", JOptionPane.INFORMATION_MESSAGE);
        //marca();
        pedido = new Pedido();
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void TabelaProduto_FornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProduto_FornecedorMouseClicked
        Item itemAux = abreOptionPane();
        if (!itemAux.equals(null)) {
            listItem.add(itemAux);
            preencheTabela(listItem);
        }

    }//GEN-LAST:event_TabelaProduto_FornecedorMouseClicked

    public Item abreOptionPane() {
        JTextField campo_quantidade = new JTextField();
        JTextField campo_valor = new JTextField();
        Object[] message = {
            "Quantidade: ", campo_quantidade,
            "Valor Alterado: ", campo_valor};

        if (JOptionPane.showConfirmDialog(CadastroPedidos.this, message, "Informações Adicionais", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            String[] optionpane = {campo_quantidade.getText(), campo_valor.getText()};
            return gravaResposta(optionpane);
        } else {
            return null;
        }
    }

    public Item gravaResposta(String[] message) {
        try {
            item = new ItemBuilder().setPedido(pedido).setProduto(listProduto.get(TabelaProduto_Fornecedor.getSelectedRow())).
                    setQuantidade(message[0]).setValor_alterado((String) message[1])
                    .getItem();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(CadastroPedidos.this, "Campos obrigatórios (*) vazios e/ou Informação inválida!", "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            abreOptionPane();
        }
        return item;
    }
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

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        CadastroPedidos cp = new CadastroPedidos(painel);
        painel.add(cp);
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        removeItem();
    }//GEN-LAST:event_jBExcluirActionPerformed

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
    private javax.swing.JSeparator Separador;
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JTable TabelaFornecedor;
    private javax.swing.JTable TabelaProduto_Fornecedor;
    private javax.swing.JTable TabelaProduto_Pedido;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JCheckBox jCBPago;
    private javax.swing.JComboBox jCBTipo_Pagamento;
    private javax.swing.JComboBox jCBTipo_Pedido;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JLabel jLAjuda;
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

    public void removeItem() {
        listItem.remove(listItem.get(TabelaProduto_Pedido.getSelectedRow()));
        preencheTabela(listItem);
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
}
