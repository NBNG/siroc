/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.Editor.Editor;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Pedido;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author matteus
 */
public class AtualizaPedido extends javax.swing.JFrame {

    /**
     * Creates new form Atualiza_Pedido
     */
    Object[] resultado;

    Pedido pedido;

    DAO<Pedido> pdao = new DAO<>(Pedido.class);

    public AtualizaPedido(Object[] resultado) {
        super("Cella - Atualização de Clientes");
        this.resultado = resultado;

        pedido = pdao.busca((Long) resultado[10]); //Garofolo

        pedido = pdao.busca((Long) resultado[10]); //Garofolo

        pedido.setValorTotal((Double) resultado[5]);

        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/siroc/Imagens/icone.png")));
        //populateFields(resultado);
        populateFields(pedido);
        hinter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCliente = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();
        jLFrete = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jLTipoPagamento = new javax.swing.JLabel();
        jLTipoPedido = new javax.swing.JLabel();
        jCBPago = new javax.swing.JCheckBox();
        jDCData = new com.toedter.calendar.JDateChooser();
        jCBPedido = new javax.swing.JComboBox();
        jCBPagamento = new javax.swing.JComboBox();
        jBAtualizar = new javax.swing.JButton();
        jLCabecalho = new javax.swing.JLabel();
        jLFornecedor = new javax.swing.JLabel();
        jLAjuda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente");

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Data:");

        jLValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValor.setText("Valor Total:");

        jLFrete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFrete.setText("Frete:");

        jLEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEndereco.setText("Cidade");

        jLTipoPagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipoPagamento.setText("Tipo Pagamento:");

        jLTipoPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTipoPedido.setText("Tipo Pedido:");

        jCBPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBPago.setText("Pago");

        jDCData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBPedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NF", "SO" }));

        jCBPagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cartão", "Cheque", "Depósito", "Dinheiro" }));

        jBAtualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Atualização de Pedidos");

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor.setText("Fornecedor");

        jLAjuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/help.png"))); // NOI18N
        jLAjuda.setText("Ajuda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLTipoPedido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCBPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLTipoPagamento)
                            .addGap(18, 18, 18)
                            .addComponent(jCBPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLValor)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLData)
                                            .addGap(18, 18, 18)
                                            .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLEndereco)
                                        .addComponent(jLFornecedor)
                                        .addComponent(jLCliente))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLFrete)
                                        .addComponent(jCBPago)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addComponent(jLCabecalho)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                            .addComponent(jLAjuda)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAtualizar)
                        .addGap(40, 40, 40)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLAjuda)))
                .addGap(18, 18, 18)
                .addComponent(jLCliente)
                .addGap(18, 18, 18)
                .addComponent(jLFornecedor)
                .addGap(11, 11, 11)
                .addComponent(jLEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBPago)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLData)
                        .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLValor)
                    .addComponent(jLFrete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipoPedido)
                    .addComponent(jCBPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTipoPagamento)
                    .addComponent(jCBPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jBAtualizar)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        String pago = null;
        if (jCBPago.isSelected()) {
            pago = "Pago";
        }

        pedido.setData(jDCData.getDate());
        pedido.setStatus(pago);
        pedido.setTipo_pagamento((String) jCBPagamento.getSelectedItem());
        pedido.setTipo_pedido((String) jCBPedido.getSelectedItem());

        /*pedido = new PedidoBuilder().setData(jDCData.getDate()).setStatus(pago).
         setTipo_pagamento((String) jCBPagamento.getSelectedItem()).
         setTipo_pedido((String) jCBPedido.getSelectedItem()).setCliente(new DAO<Cliente>(Cliente.class).buscaPorNome((String) resultado[3]).get(0)).getPedido();*/
        pdao.atualiza(pedido);
        JOptionPane.showMessageDialog(AtualizaPedido.this, "Pedido alterado com sucesso!", "Activity Performed Successfully", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JComboBox jCBPagamento;
    private javax.swing.JCheckBox jCBPago;
    private javax.swing.JComboBox jCBPedido;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLFrete;
    private javax.swing.JLabel jLTipoPagamento;
    private javax.swing.JLabel jLTipoPedido;
    private javax.swing.JLabel jLValor;
    // End of variables declaration//GEN-END:variables
    public void populateFields(Object[] resultado) {
        jLCliente.setText((String) resultado[3]);
        //jLFornecedor.setText((String) resultado[4]);
        jLEndereco.setText((String) resultado[1] + " - " + (String) resultado[2]);
        jDCData.setDate((Date) resultado[0]);
        if (resultado[6] != null) {
            jCBPago.setSelected(true);
        }
        jLValor.setText("Valor Total: " + Editor.format((Double) resultado[5]));
        jLFrete.setText("Frete: " + Editor.format((Double) resultado[9]));
        for (int i = 0; i < jCBPagamento.getItemCount(); i++) {
            if (jCBPagamento.getItemAt(i).equals((String) resultado[7])) {
                jCBPagamento.setSelectedIndex(i);
            }
        }
        for (int i = 0; i < jCBPedido.getItemCount(); i++) {
            if (jCBPedido.getItemAt(i).equals((String) resultado[8])) {
                jCBPedido.setSelectedIndex(i);
            }
        }
    }

    public void populateFields(Pedido pedido) {
        jLCliente.setText("Cliente: " + pedido.getCliente().getNome());

        jLFornecedor.setText("Fornecedor: " + (String) resultado[4]);
        jLEndereco.setText(pedido.getCliente().getCidade() + " - " + pedido.getCliente().getEstado());

        //jLFornecedor.setText((String) resultado[4]);
        jLEndereco.setText(pedido.getCliente().getCidade() + " - " + pedido.getCliente().getEstado());

        jDCData.setDate(pedido.getData());
        if (pedido.getStatus() != null) {
            jCBPago.setSelected(true);
        }
        jLValor.setText("Valor Total: " + Editor.format(pedido.getValorTotal()));
        jLFrete.setText("Frete: " + Editor.format(pedido.getCliente().getFrete()));
        for (int i = 0; i < jCBPagamento.getItemCount(); i++) {
            if (jCBPagamento.getItemAt(i).equals(pedido.getTipo_pagamento())) {
                jCBPagamento.setSelectedIndex(i);
            }
        }
        for (int i = 0; i < jCBPedido.getItemCount(); i++) {
            if (jCBPedido.getItemAt(i).equals(pedido.getTipo_pedido())) {
                jCBPedido.setSelectedIndex(i);
            }
        }
    }

    private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de atualização de Pedidos,<br>"
                + " onde serão atualizados dados relativos as informações já cadastradas. <br>"
                + "1. Lembre-se de preencher os dados obrigatórios sempre, para serem evitados erros.<br>"
                + "2. Nesta tela apenas alguns dados podem ser atualizados, caso seja necessário alterar outros componentes,<br>"
                + "é necessário deletar este pedido e fazer outro.<br>"
                + " Tal escolha auxiliará na máscara utilizada para o cadastro do seu respectivo código.<br>"
                + "3. Após o preenchimento, clique no botão atualizar para que seja executada a atualização.<br>"
                + "4. Para consultar o Manual do Usuário, basta dar um duplo clique em \"Ajuda.\"</html");
    }
}
