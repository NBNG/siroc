/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.dao.DAO;
import br.com.siroc.dao.FornecedorDAO;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matt
 */
public class Cadastro_Produtos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Produtos
     */
    Fornecedor fornecedor = new Fornecedor();
    Produto produto = new Produto();
    List<Fornecedor> fornecedores;
    DAO<Produto> dao = new DAO<Produto>(Produto.class);
    //definição das colunas da tabela
    DefaultTableModel tmFornecedor = new DefaultTableModel(null, new String[]{"Nome", "Telefone", "Email"});
    FornecedorDAO fdao = new FornecedorDAO();

    public Cadastro_Produtos() {
        initComponents();
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
        jLFornecedor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLNome = new javax.swing.JLabel();
        jLQuantidade = new javax.swing.JLabel();
        jLV_Compra = new javax.swing.JLabel();
        jLV_Venda = new javax.swing.JLabel();
        jTNome_Produto = new javax.swing.JTextField();
        jTV_Compra = new javax.swing.JTextField();
        jTQnt = new javax.swing.JTextField();
        jTV_Saida = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jTNome = new javax.swing.JTextField();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Produtos");

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor.setText("Fornecedor:");

        tabela.setModel(tmFornecedor);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuantidade.setText("Quantidade:");

        jLV_Compra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLV_Compra.setText("Valor de Compra:");

        jLV_Venda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLV_Venda.setText("Valor de Saída:");

        jTNome_Produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTV_Compra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTQnt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTV_Saida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
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

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeActionPerformed(evt);
            }
        });
        jTNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLQuantidade)
                        .addGap(18, 18, 18)
                        .addComponent(jTQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLV_Venda)
                        .addGap(18, 18, 18)
                        .addComponent(jTV_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLV_Compra)
                        .addGap(18, 18, 18)
                        .addComponent(jTV_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBCadastrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNome)
                                .addGap(18, 18, 18)
                                .addComponent(jTNome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpar)))
                .addGap(19, 19, 19))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTQnt, jTV_Compra, jTV_Saida});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFornecedor)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantidade)
                    .addComponent(jTQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLV_Compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTV_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLV_Venda)
                    .addComponent(jTV_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeActionPerformed

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped

        while (tmFornecedor.getRowCount() > 0) {
            tmFornecedor.removeRow(0);
        }
        fornecedores = fdao.buscaPorNome(jTNome.getText());

        for (int i = 0; i < fornecedores.size(); i++) {

            tmFornecedor.addRow(new String[]{null, null, null, null});
            tmFornecedor.setValueAt(fornecedores.get(i).getNome(), i, 0);
            tmFornecedor.setValueAt(fornecedores.get(i).getTelefone(), i, 1);
            tmFornecedor.setValueAt(fornecedores.get(i).getEmail(), i, 2);

        }
    }//GEN-LAST:event_jTNomeKeyTyped

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        jTNome.setText(fornecedores.get(tabela.getSelectedRow()).getNome());
    }//GEN-LAST:event_tabelaMouseClicked

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        while (tmFornecedor.getRowCount() > 0) {
            tmFornecedor.removeRow(0);
        }
        jTNome_Produto.setText("");
        jTNome.setText("");
        jTQnt.setText("");
        jTV_Compra.setText("");
        jTV_Saida.setText("");
        fornecedores = null;

    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        fornecedor.setId(fornecedores.get(tabela.getSelectedRow()).getId());
        produto.setFornecedor(fornecedor);
        produto.setNome(jTNome_Produto.getText());
        produto.setQuantidade(Double.parseDouble(jTQnt.getText()));
        produto.setValor_entrada(Double.parseDouble(jTV_Compra.getText()));
        produto.setValor_saida(Double.parseDouble(jTV_Saida.getText()));
        dao.adicionar(produto);
        JOptionPane.showMessageDialog(null, "Produto adicionado com Sucesso!");
    }//GEN-LAST:event_jBCadastrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLV_Compra;
    private javax.swing.JLabel jLV_Venda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNome_Produto;
    private javax.swing.JTextField jTQnt;
    private javax.swing.JTextField jTV_Compra;
    private javax.swing.JTextField jTV_Saida;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}