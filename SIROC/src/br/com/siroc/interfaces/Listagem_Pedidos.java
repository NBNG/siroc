/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.dao.DAO;
import br.com.siroc.dao.PedidoDAO;
import br.com.siroc.modelo.Cliente;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Pedido;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matteus
 */
public class Listagem_Pedidos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listagem_Pedidos
     */
    DefaultTableModel tmPedido = new DefaultTableModel(null, new String[]{"Data", "Cidade", "Estado", "Cliente", "Fornecedor", "Valor", "Valor Total", "Frete", "Tipo de Pagamento", "Tipo de Pedido", "Pago"});
    
    PedidoDAO peddao = new PedidoDAO();
    DAO<Pedido> pdao = new DAO<Pedido>(Pedido.class);
    
    List<Pedido> pedidos;

    public Listagem_Pedidos() {
        super("Cella - Listagem de Produtos");
        initComponents();
        populateFields();
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
        jLFim = new javax.swing.JLabel();
        jLValor_Inicial = new javax.swing.JLabel();
        jLTipo_Pagamento = new javax.swing.JLabel();
        jLFornecedor = new javax.swing.JLabel();
        jLValor_Final = new javax.swing.JLabel();
        jLTipo_Pedido = new javax.swing.JLabel();
        jLPago = new javax.swing.JLabel();
        jCBCliente = new javax.swing.JComboBox();
        jCBEstado = new javax.swing.JComboBox();
        jCBCidade = new javax.swing.JComboBox();
        jCBFornecedor = new javax.swing.JComboBox();
        jCBTipo_Pagamento = new javax.swing.JComboBox();
        jCBTipo_Pedido = new javax.swing.JComboBox();
        jLCabecalho = new javax.swing.JLabel();
        jCBPago = new javax.swing.JComboBox();
        jDCData_Inicial = new com.toedter.calendar.JDateChooser();
        jDCData_Final = new com.toedter.calendar.JDateChooser();
        jTValor_Inicial = new javax.swing.JTextField();
        jTValor_Final = new javax.swing.JTextField();
        jRBCliente = new javax.swing.JRadioButton();
        jRBFornecedor = new javax.swing.JRadioButton();
        jRBData = new javax.swing.JRadioButton();
        jRBValor = new javax.swing.JRadioButton();
        jRBEstado = new javax.swing.JRadioButton();
        jRBCidade = new javax.swing.JRadioButton();
        jRBPago = new javax.swing.JRadioButton();
        jRBTipo_Pagamento = new javax.swing.JRadioButton();
        jRBTipo_Pedido = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_pedido = new javax.swing.JTable();
        jTBSeleciona = new javax.swing.JToggleButton();
        jBCancelar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBImprimir = new javax.swing.JButton();

        setClosable(true);

        jLInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLInicio.setText("Início:");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente:");

        jLFim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFim.setText("Fim:");

        jLValor_Inicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValor_Inicial.setText("Valor Inicial:");

        jLTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo_Pagamento.setText("Tipo de Pagamento:");

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor.setText("Fornecedor:");

        jLValor_Final.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValor_Final.setText("Valor Final:");

        jLTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipo_Pedido.setText("Tipo de Pedido:");

        jLPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLPago.setText("Pago:");

        jCBCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipo_Pagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cartão", "Cheque", "Depósito", "Dinheiro" }));

        jCBTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTipo_Pedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NF", "SO" }));

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Pesquisa de Pedidos");

        jCBPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Pago" }));

        jDCData_Inicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jDCData_Final.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTValor_Inicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTValor_Final.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBTipo_Pagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRBTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tabela_pedido.setModel(tmPedido);
        jScrollPane1.setViewportView(tabela_pedido);

        jTBSeleciona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTBSeleciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/editar.png"))); // NOI18N
        jTBSeleciona.setText("Selecionar Tudo");
        jTBSeleciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBSelecionaActionPerformed(evt);
            }
        });

        jBCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/excluir.gif"))); // NOI18N
        jBCancelar.setText("Cancelar Pedido");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
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

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBCliente)
                                    .addComponent(jRBFornecedor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLFornecedor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCBFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBEstado)
                                    .addComponent(jRBCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRBPago, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRBTipo_Pedido)
                                    .addComponent(jRBTipo_Pagamento))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLEstado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLPago)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBPago, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLTipo_Pagamento)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBTipo_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLTipo_Pedido)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBTipo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRBValor)
                                .addGap(18, 18, 18)
                                .addComponent(jLValor_Inicial)
                                .addGap(18, 18, 18)
                                .addComponent(jTValor_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLValor_Final)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTValor_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTBSeleciona)
                                .addGap(18, 18, 18)
                                .addComponent(jBPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBImprimir)
                                .addGap(36, 36, 36)
                                .addComponent(jBLimpar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBData)
                                .addGap(18, 18, 18)
                                .addComponent(jLInicio)
                                .addGap(18, 18, 18)
                                .addComponent(jDCData_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLFim)
                                .addGap(18, 18, 18)
                                .addComponent(jDCData_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTValor_Final, jTValor_Inicial});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRBCliente)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLCliente)
                                .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRBFornecedor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLFornecedor)
                                .addComponent(jCBFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBData)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jDCData_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLInicio))
                            .addComponent(jDCData_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFim))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jRBValor))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTValor_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLValor_Inicial)
                                .addComponent(jLValor_Final)
                                .addComponent(jTValor_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLEstado)
                                .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRBEstado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRBCidade)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLCidade)
                                .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLPago)
                                .addComponent(jCBPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRBPago, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLTipo_Pagamento)
                                .addComponent(jCBTipo_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRBTipo_Pagamento, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLTipo_Pedido)
                                    .addComponent(jCBTipo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jRBTipo_Pedido)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTBSeleciona)
                            .addComponent(jBPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCancelar)
                            .addComponent(jBLimpar)
                            .addComponent(jBImprimir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
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
            jRBValor.setSelected(true);
        } else {
            jRBCidade.setSelected(false);
            jRBCliente.setSelected(false);
            jRBEstado.setSelected(false);
            jRBFornecedor.setSelected(false);
            jRBData.setSelected(false);
            jRBPago.setSelected(false);
            jRBTipo_Pagamento.setSelected(false);
            jRBTipo_Pedido.setSelected(false);
            jRBValor.setSelected(false);
        }
    }//GEN-LAST:event_jTBSelecionaActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImprimirActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        String query = "FROM Pedido WHERE 1 = 1 ";
        if(jRBCliente.isSelected())
            query += "AND cliente = :Cliente ";
        if(jRBFornecedor.isSelected())
            query += "AND fornecedor = :Fornecedor ";
        
        System.out.println(query);
        pedidos = peddao.buscaAvançada(query,(Cliente) jCBCliente.getSelectedItem(), (Fornecedor) jCBFornecedor.getSelectedItem());
        
    }//GEN-LAST:event_jBPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JComboBox jCBCidade;
    private javax.swing.JComboBox jCBCliente;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JComboBox jCBFornecedor;
    private javax.swing.JComboBox jCBPago;
    private javax.swing.JComboBox jCBTipo_Pagamento;
    private javax.swing.JComboBox jCBTipo_Pedido;
    private com.toedter.calendar.JDateChooser jDCData_Final;
    private com.toedter.calendar.JDateChooser jDCData_Inicial;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLFim;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLInicio;
    private javax.swing.JLabel jLPago;
    private javax.swing.JLabel jLTipo_Pagamento;
    private javax.swing.JLabel jLTipo_Pedido;
    private javax.swing.JLabel jLValor_Final;
    private javax.swing.JLabel jLValor_Inicial;
    private javax.swing.JRadioButton jRBCidade;
    private javax.swing.JRadioButton jRBCliente;
    private javax.swing.JRadioButton jRBData;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JRadioButton jRBFornecedor;
    private javax.swing.JRadioButton jRBPago;
    private javax.swing.JRadioButton jRBTipo_Pagamento;
    private javax.swing.JRadioButton jRBTipo_Pedido;
    private javax.swing.JRadioButton jRBValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBSeleciona;
    private javax.swing.JTextField jTValor_Final;
    private javax.swing.JTextField jTValor_Inicial;
    private javax.swing.JTable tabela_pedido;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {
        pedidos = pdao.listaTodos();
        HashSet cCliente = new HashSet();
        HashSet cEstado = new HashSet();
        HashSet cCidade = new HashSet();
        HashSet cFornecedor = new HashSet();

        for (int i = 0; i < pedidos.size(); i++) {
            cCliente.add(pedidos.get(i).getCliente().getNome());
            cEstado.add(pedidos.get(i).getCliente().getEstado());
            cCidade.add(pedidos.get(i).getCliente().getCidade());
            for (int j = 0; j < pedidos.get(i).getItens().size(); j++) {
                cFornecedor.add(pedidos.get(i).getItens().get(j).getProduto().getFornecedor().getNome());
            }
        }

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
}
