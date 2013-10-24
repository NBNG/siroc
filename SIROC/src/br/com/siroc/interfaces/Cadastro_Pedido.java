/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.classes_auxiliares.Editor;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Fornecedor;
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
public class Cadastro_Pedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Pedido
     */
    DefaultTableModel tmFornecedor = new DefaultTableModel(null, new String[]{"Nome", "Email"});
    DefaultTableModel tmProduto_Fornecedor = new DefaultTableModel(null, new String[]{"Nome", "Peso", "Fornecedor", "Valor Entrada", "Valor Saída"});
    DefaultTableModel tmProduto_Pedido = new DefaultTableModel(null, new String[]{"Código", "Nome", "Quantidade", "Valor Alterado"});
    //List de uma classe do modelo para utilização na tabela;
    List<Fornecedor> fornecedores_fornecedor;
    List<Fornecedor> fornecedores_produto;
    List<Produto> produtos_produto;
    List<Produto> produtos_pedido;
    DAO<Produto> pdao = new DAO<Produto>(Produto.class);
    DAO<Fornecedor> fdao = new DAO<Fornecedor>(Fornecedor.class);
    Double valor;
    Integer quantidade;
    //definição das colunas da tabela

    public Cadastro_Pedido() {
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
        jCTipo_Pedido = new javax.swing.JComboBox();
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

        setClosable(true);

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor.setText("Fornecedor:");

        jTNome_Fornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNome_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNome_FornecedorActionPerformed(evt);
            }
        });
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

        jCTipo_Pedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCTipo_Pedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NF", "SO" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separador, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTNome_Fornecedor))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLData)
                        .addGap(18, 18, 18)
                        .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTipo_Pedido)
                        .addGap(18, 18, 18)
                        .addComponent(jCTipo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBPago)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTipo_Pagamento)
                        .addGap(18, 18, 18)
                        .addComponent(jCBTipo_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jLCabecalho)
                .addContainerGap())
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTabela_Pedido)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBLimpar, jBSalvar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLCabecalho)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBPago)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLData)
                                    .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTipo_Pedido)
                            .addComponent(jLTipo_Pagamento)
                            .addComponent(jCTipo_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBTipo_Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLFornecedor)
                            .addComponent(jTNome_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
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
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBLimpar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNome_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNome_FornecedorActionPerformed
        while (tmFornecedor.getRowCount() > 0) {
            tmFornecedor.removeRow(0);
        }

        fornecedores_fornecedor = fdao.buscaPorNome(jTNome_Fornecedor.getText());

        for (int i = 0; i < fornecedores_fornecedor.size(); i++) {

            tmFornecedor.addRow(new String[]{null, null, null, null});
            tmFornecedor.setValueAt(fornecedores_fornecedor.get(i).getNome(), i, 0);
            tmFornecedor.setValueAt(fornecedores_fornecedor.get(i).getEmail(), i, 1);
        }
    }//GEN-LAST:event_jTNome_FornecedorActionPerformed

    private void jTNome_FornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNome_FornecedorKeyTyped
        while (tmFornecedor.getRowCount() > 0) {
            tmFornecedor.removeRow(0);
        }

        fornecedores_fornecedor = fdao.buscaPorNome(jTNome_Fornecedor.getText());

        for (int i = 0; i < fornecedores_fornecedor.size(); i++) {

            tmFornecedor.addRow(new String[]{null, null, null, null});
            tmFornecedor.setValueAt(fornecedores_fornecedor.get(i).getNome(), i, 0);
            tmFornecedor.setValueAt(fornecedores_fornecedor.get(i).getEmail(), i, 1);
        }
    }//GEN-LAST:event_jTNome_FornecedorKeyTyped

    private void TabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaFornecedorMouseClicked
        jTNome_Fornecedor.setText(fornecedores_fornecedor.get(TabelaFornecedor.getSelectedRow()).getNome());
        while (tmProduto_Fornecedor.getRowCount() > 0) {
            tmProduto_Fornecedor.removeRow(0);
        }

        fornecedores_produto = fdao.buscaPorNome(jTNome_Fornecedor.getText());
        produtos_produto = new ArrayList<Produto>();

        for (int i = 0; i < fornecedores_produto.size(); i++) {
            for (int j = 0; j < fornecedores_produto.get(i).getProdutos().size(); j++) {
                produtos_produto.add(fornecedores_produto.get(i).getProdutos().get(j));
            }
        }

        Integer linha = 0;
        for (int i = 0; i < produtos_produto.size(); i++) {
            tmProduto_Fornecedor.addRow(new String[]{null, null, null, null});
            tmProduto_Fornecedor.setValueAt(produtos_produto.get(i).getNome(), i, 0);
            tmProduto_Fornecedor.setValueAt(produtos_produto.get(i).getPeso() + " kg", i, 1);
            tmProduto_Fornecedor.setValueAt(produtos_produto.get(i).getFornecedor().getNome(), i, 2);
            tmProduto_Fornecedor.setValueAt(Editor.format(produtos_produto.get(i).getValor_entrada()), i, 3);
            tmProduto_Fornecedor.setValueAt(Editor.format(produtos_produto.get(i).getValor_saida()), i, 4);
        }
    }//GEN-LAST:event_TabelaFornecedorMouseClicked

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        sublinha();
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void TabelaProduto_FornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProduto_FornecedorMouseClicked
        JTextField campo_quantidade = new JTextField();
        JTextField campo_valor = new JTextField();
        Object[] message = {
            "Quantidade:", campo_quantidade,
            "Valor Alterado:", campo_valor};
        int option = JOptionPane.showConfirmDialog(null, message, "Informações Adicionais", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            valor = Double.parseDouble(campo_valor.getText());
            quantidade = Integer.parseInt(campo_quantidade.getText());
        }

    }//GEN-LAST:event_TabelaProduto_FornecedorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JTable TabelaFornecedor;
    private javax.swing.JTable TabelaProduto_Fornecedor;
    private javax.swing.JTable TabelaProduto_Pedido;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JCheckBox jCBPago;
    private javax.swing.JComboBox jCBTipo_Pagamento;
    private javax.swing.JComboBox jCTipo_Pedido;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLTabela_Fornecedor;
    private javax.swing.JLabel jLTabela_Pedido;
    private javax.swing.JLabel jLTipo_Pagamento;
    private javax.swing.JLabel jLTipo_Pedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTNome_Fornecedor;
    // End of variables declaration//GEN-END:variables

    public void sublinha() {
        jLFornecedor.setText("Fornecedor:*");
        jLData.setText("Data:*");
        jLTipo_Pedido.setText("Tipo de Pedido:*");
        jLTipo_Pagamento.setText("Tipo de Pagamento:*");
        jLTabela_Pedido.setText("Tabela de Produtos do Pedido:*");
    }
}
