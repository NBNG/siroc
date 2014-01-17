/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.Editor.Editor;
import br.com.siroc.Editor.LeitorTeclas;
import br.com.siroc.Jasper.Relatorio;
import br.com.siroc.dao.DAO;
import br.com.siroc.dao.PedidoDAO;
import br.com.siroc.modelo.Cliente;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Pedido;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author matteus
 */
public class ListagemPedidos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listagem_Pedidos
     */
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

    PedidoDAO peddao = new PedidoDAO();
    DAO<Pedido> pdao = new DAO<Pedido>(Pedido.class);

    List<Pedido> pedidos;
    List<Cliente> clientes;
    List<Fornecedor> fornecedores;

    HashSet cCliente;
    HashSet cEstado;
    HashSet cCidade;
    HashSet cFornecedor;

    String cliente;
    String fornecedor;

    Date dataVencimento;

    Double valorInicial, valorFinal;
    String estado, cidade, pago, tipo_pgto, tipo_ped;
    JDesktopPane painel;

    List<Object[]> list; //pesquisa avançada

    public ListagemPedidos(JDesktopPane painel) {
        super("Cella - Listagem de Produtos");
        initComponents();
        populateFields();
        this.painel = painel;
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

        jLInicio = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLCliente = new javax.swing.JLabel();
        jLTipo_Pagamento = new javax.swing.JLabel();
        jLFornecedor = new javax.swing.JLabel();
        jLTipo_Pedido = new javax.swing.JLabel();
        jCBCliente = new javax.swing.JComboBox();
        jCBEstado = new javax.swing.JComboBox();
        jCBCidade = new javax.swing.JComboBox();
        jCBFornecedor = new javax.swing.JComboBox();
        jCBTipo_Pagamento = new javax.swing.JComboBox();
        jCBTipo_Pedido = new javax.swing.JComboBox();
        jLCabecalho = new javax.swing.JLabel();
        jCBPago = new javax.swing.JComboBox();
        jDCVencimento = new com.toedter.calendar.JDateChooser();
        jRBCliente = new javax.swing.JRadioButton();
        jRBFornecedor = new javax.swing.JRadioButton();
        jRBData = new javax.swing.JRadioButton();
        jRBEstado = new javax.swing.JRadioButton();
        jRBCidade = new javax.swing.JRadioButton();
        jRBPago = new javax.swing.JRadioButton();
        jRBTipo_Pagamento = new javax.swing.JRadioButton();
        jRBTipo_Pedido = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jTBSeleciona = new javax.swing.JToggleButton();
        jBPesquisar = new javax.swing.JButton();
        jBPDF = new javax.swing.JButton();
        jLAjuda = new javax.swing.JLabel();
        jBLimpar1 = new javax.swing.JButton();
        jBImprimir = new javax.swing.JButton();
        jBImprimirMeia = new javax.swing.JButton();

        setClosable(true);

        jLInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLInicio.setText("Vencimento");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente:");

        jLTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo_Pagamento.setText("Tipo de Pagamento:");

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor.setText("Fornecedor:");

        jLTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo_Pedido.setText("Tipo de Pedido:");

        jCBCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipo_Pagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cheque", "Boleto", "Vale", "Cartão", "Depósito", "Dinheiro" }));

        jCBTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipo_Pedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NF", "SO" }));

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Pesquisa de Pedidos");

        jCBPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pago", "Parcialmente", "" }));

        jDCVencimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jRBCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmPedido);
        tabela.setUpdateSelectionOnSort(false);
        tabela.setVerifyInputWhenFocusTarget(false);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jTBSeleciona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTBSeleciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/editar.png"))); // NOI18N
        jTBSeleciona.setText("Selecionar Tudo");
        jTBSeleciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBSelecionaActionPerformed(evt);
            }
        });

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBPDF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/pdf (1).png"))); // NOI18N
        jBPDF.setText("Gerar PDF");
        jBPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPDFActionPerformed(evt);
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

        jBLimpar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar1.setText("Limpar");
        jBLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpar1ActionPerformed(evt);
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

        jBImprimirMeia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBImprimirMeia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/imprimir.png"))); // NOI18N
        jBImprimirMeia.setText("Imprimir ½ Página");
        jBImprimirMeia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirMeiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCabecalho)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTBSeleciona)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRBCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBFornecedor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLFornecedor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRBData)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLInicio)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDCVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBEstado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLEstado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBCidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLCidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jRBPago)
                                .addGap(18, 18, 18)
                                .addComponent(jCBPago, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jRBTipo_Pagamento)
                                .addGap(18, 18, 18)
                                .addComponent(jLTipo_Pagamento)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTipo_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRBTipo_Pedido)
                                .addGap(18, 18, 18)
                                .addComponent(jLTipo_Pedido)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTipo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBPesquisar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(jLAjuda))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBImprimirMeia)
                .addGap(18, 18, 18)
                .addComponent(jBImprimir)
                .addGap(18, 18, 18)
                .addComponent(jBPDF)
                .addGap(18, 18, 18)
                .addComponent(jBLimpar1)
                .addGap(24, 24, 24))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBImprimir, jBLimpar1, jBPDF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLAjuda)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLCabecalho)
                                .addGap(18, 18, 18))
                            .addComponent(jTBSeleciona, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCBFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFornecedor))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(jRBCliente))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLCliente))
                                .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRBFornecedor))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRBData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLInicio)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jDCVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLCidade))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(jRBEstado))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLEstado))
                                .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jRBPago))
                                        .addComponent(jRBTipo_Pagamento)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jLTipo_Pagamento))
                                        .addComponent(jCBTipo_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRBTipo_Pedido))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLTipo_Pedido)
                                            .addComponent(jCBTipo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBPesquisar))
                                        .addGap(1, 1, 1))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPDF)
                    .addComponent(jBLimpar1)
                    .addComponent(jBImprimir)
                    .addComponent(jBImprimirMeia))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBSelecionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBSelecionaActionPerformed
        if (jTBSeleciona.isSelected()) {
            jRBCidade.setSelected(true);
            jRBCliente.setSelected(true);
            jRBEstado.setSelected(true);
            jRBFornecedor.setSelected(true);
            jRBData.setSelected(true);
            jRBPago.setSelected(true);
            jRBTipo_Pagamento.setSelected(true);
            jRBTipo_Pedido.setSelected(true);
        } else {
            jRBCidade.setSelected(false);
            jRBCliente.setSelected(false);
            jRBEstado.setSelected(false);
            jRBFornecedor.setSelected(false);
            jRBData.setSelected(false);
            jRBPago.setSelected(false);
            jRBTipo_Pagamento.setSelected(false);
            jRBTipo_Pedido.setSelected(false);
        }
    }//GEN-LAST:event_jTBSelecionaActionPerformed

    private void jBPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPDFActionPerformed
        int[] selecao = tabela.getSelectedRows();
        for (int i = 0; i < tabela.getSelectedRowCount(); i++) {
            gerarPDF((Long) tabela.getModel().getValueAt(selecao[i], 0),
                    (String) tabela.getModel().getValueAt(selecao[i], 4));
        }
        JOptionPane.showMessageDialog(this, "PDFs criado com sucesso!",
                "Activity Performed Successfully",
                JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBPDFActionPerformed

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

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getButton() != evt.BUTTON3 && evt.getClickCount() == 2) {
            AtualizaPedido ap = new AtualizaPedido(list.
                    get(tabela.getSelectedRow()), this, painel);
            ap.setVisible(true);
        }
    }//GEN-LAST:event_tabelaMouseClicked

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

    private void jBLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpar1ActionPerformed
        ListagemPedidos lp = new ListagemPedidos(painel);
        painel.add(lp);
        this.dispose();
        lp.setVisible(true);
    }//GEN-LAST:event_jBLimpar1ActionPerformed

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        int[] selecao = tabela.getSelectedRows();
        for (int i = 0; i < tabela.getSelectedRowCount(); i++) {
            imprimir((Long) tabela.getModel().getValueAt(selecao[i], 0),
                    (String) tabela.getModel().getValueAt(selecao[i], 4));
        }
        JOptionPane.showMessageDialog(this, "Impressões realizadas com sucesso!",
                "Activity Performed Successfully",
                JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBImprimirActionPerformed

    private void jBImprimirMeiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirMeiaActionPerformed
        int[] selecao = tabela.getSelectedRows();
        for (int i = 0; i < tabela.getSelectedRowCount(); i++) {
            imprimirMeia((Long) tabela.getModel().getValueAt(selecao[i], 0),
                    (String) tabela.getModel().getValueAt(selecao[i], 4));
        }
        JOptionPane.showMessageDialog(this, "Impressões realizadas com sucesso!",
                "Activity Performed Successfully",
                JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jBImprimirMeiaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBImprimirMeia;
    private javax.swing.JButton jBLimpar1;
    private javax.swing.JButton jBPDF;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JComboBox jCBCidade;
    private javax.swing.JComboBox jCBCliente;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JComboBox jCBFornecedor;
    private javax.swing.JComboBox jCBPago;
    private javax.swing.JComboBox jCBTipo_Pagamento;
    private javax.swing.JComboBox jCBTipo_Pedido;
    private com.toedter.calendar.JDateChooser jDCVencimento;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLInicio;
    private javax.swing.JLabel jLTipo_Pagamento;
    private javax.swing.JLabel jLTipo_Pedido;
    private javax.swing.JRadioButton jRBCidade;
    private javax.swing.JRadioButton jRBCliente;
    private javax.swing.JRadioButton jRBData;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JRadioButton jRBFornecedor;
    private javax.swing.JRadioButton jRBPago;
    private javax.swing.JRadioButton jRBTipo_Pagamento;
    private javax.swing.JRadioButton jRBTipo_Pedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBSeleciona;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {
        pedidos = pdao.listaTodos();
        cCliente = new HashSet();
        cEstado = new HashSet();
        cCidade = new HashSet();
        cFornecedor = new HashSet();

        for (int i = 0; i < pedidos.size(); i++) {
            cCliente.add(pedidos.get(i).getCliente().getNome());
            cEstado.add(pedidos.get(i).getCliente().getEstado());
            cCidade.add(pedidos.get(i).getCliente().getCidade());
            for (int j = 0; j < pedidos.get(i).getItens().size(); j++) {
                cFornecedor.add(pedidos.get(i).getItens().get(j).getProduto().getFornecedor().getNome());
            }
        }

        clientes = new ArrayList<Cliente>(cCliente);
        fornecedores = new ArrayList<Fornecedor>(cFornecedor);

        Iterator i = cCliente.iterator();
        while (i.hasNext()) {
            jCBCliente.addItem(i.next());
        }

        i = null;
        i = cEstado.iterator();
        while (i.hasNext()) {
            jCBEstado.addItem(i.next());
        }

        i = null;
        i = cCidade.iterator();
        while (i.hasNext()) {
            jCBCidade.addItem(i.next());
        }
        i = null;
        i = cFornecedor.iterator();
        while (i.hasNext()) {
            jCBFornecedor.addItem(i.next());
        }

    }

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
                + "WHERE 1=1 ";

        if (jRBCliente.isSelected()) {
            cliente = jCBCliente.getSelectedItem().toString();
            query += "AND lower(cliente.nome) like lower('%" + cliente + "%') ";
        }
        if (jRBFornecedor.isSelected()) {
            fornecedor = jCBFornecedor.getSelectedItem().toString();
            query += "AND lower(fornecedor.nome) like lower('%" + fornecedor + "%')";
        }
        if (jRBCidade.isSelected()) {
            cidade = jCBCidade.getSelectedItem().toString();
            query += "AND lower(cliente.cidade) like lower('%" + cidade + "%') ";
        }
        if (jRBData.isSelected() && jDCVencimento.getDate() != null) {
            dataVencimento = jDCVencimento.getDate();
            query += "AND pedido.vencimento <='" + dataVencimento + "'";
        } else if (jRBData.isSelected()) {
            JOptionPane.showMessageDialog(ListagemPedidos.this,
                    "Pesquisa efetuada sem data. \n Valor não especificado.");
        }

        if (jRBEstado.isSelected()) {
            estado = jCBEstado.getSelectedItem().toString();
            query += "AND lower(cliente.estado) like lower('" + estado + "') ";
        }

        if (jRBPago.isSelected()) {
            if (jCBPago.getSelectedItem().toString().equals("Pago")) {
                pago = jCBPago.getSelectedItem().toString();
                query += "AND lower(pedido.status) like lower('" + pago + "') ";
            } else {
                query += "AND lower(pedido.status) is null ";
            }
        }
        if (jRBTipo_Pagamento.isSelected()) {
            tipo_pgto = jCBTipo_Pagamento.getSelectedItem().toString();
            query += "AND lower(pedido.tipo_pagamento) like lower('" + tipo_pgto + "') ";
        }
        if (jRBTipo_Pedido.isSelected()) {
            tipo_ped = jCBTipo_Pedido.getSelectedItem().toString();
            query += "AND lower(pedido.tipo_pedido) like lower('" + tipo_ped + "') ";
        }
        query += "GROUP BY pedido.data,cliente.cidade,cliente.estado,cliente.nome, fornecedor.nome, fornecedor.frete, pedido.status,"
                + "pedido.tipo_pagamento,pedido.tipo_pedido,pedido.id ";
        return query;

    }

    private void hinter() {
        jLAjuda.setToolTipText("<html>Esta tela é responsável pela Listagem de Pedidos,<br>"
                + "onde a listagem pode ser efetuada escolhendo as cláusulas no lado esquerdo,<br>"
                + "sendo necessário preencher os botões ao lado e pesquisar.<br>"
                + "1. O botão \"Selecionar Tudo\" facilita o preenchimento dos campos escolhidos.<br>"
                + "2. O botão limpar reinicia a tela limpando os campos.<br>"
                + "3. Para consultar o Manual do Proprietário, basta dar um duplo clique em \"Ajuda\" ou tecle F1.</html>");
    }

    private void imprimir(Long valueAt, String nome) {
        try {
            Relatorio rel = new Relatorio();
            rel.gerarPedido(valueAt, 1, nome, 0);

        } catch (IOException | JRException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro em procurar arquivo."
                    + " Contate o administrador do sistema!\n" + ex);
        }
    }

    private void imprimirMeia(Long valueAt, String nome) {
        try {
            Relatorio rel = new Relatorio();
            rel.gerarPedido(valueAt, 1, nome, 1);

        } catch (IOException | JRException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro em procurar arquivo."
                    + " Contate o administrador do sistema!\n" + ex);
        }
    }

    private void gerarPDF(Long valueAt, String nome) {
        try {
            Relatorio rel = new Relatorio();
            rel.gerarPedido(valueAt, 0, nome, 1);

        } catch (IOException | JRException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro em procurar arquivo."
                    + " Contate o administrador do sistema!\n" + ex);
        }
    }
}
