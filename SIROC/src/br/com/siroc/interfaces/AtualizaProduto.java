/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.Editor.LeitorTeclas;
import br.com.siroc.builder.ProdutoBuilder;
import br.com.siroc.dao.DAO;
import br.com.siroc.dao.FornecedorDAO;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Produto;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.text.ParseException;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matt
 */
public class AtualizaProduto extends javax.swing.JFrame {

    /**
     * Creates new form Atualiza_Produto
     */
    Fornecedor fornecedor;
    Produto produto;
    List<Fornecedor> fornecedores;
    DAO<Produto> dao = new DAO<Produto>(Produto.class);
    //definição das colunas da tabela
    DefaultTableModel tmFornecedor = new DefaultTableModel(null,
            new String[]{"Nome", "Telefone", "Email"}){
        boolean[] canEdit = new boolean[]{
            false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };;
    
    
    FornecedorDAO fdao = new FornecedorDAO();
    ListagemProdutos lista;
    JDesktopPane painel;

    public AtualizaProduto(Produto produto,
            ListagemProdutos lista, JDesktopPane painel) {
        super("Cella - Atualização de Produtos");
        initComponents();
        tabela.setRowHeight(23);
        setLocationRelativeTo(null);
        this.produto = produto;
        populateFields(this.produto);
        hinter();
        this.setFocusable(true);
        this.addKeyListener(new LeitorTeclas());
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().
                getResource("/br/com/siroc/Imagens/icone.png")));
        this.lista = lista;
        this.painel = painel;
        this.setResizable(false);
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
        jTV_Saida = new javax.swing.JTextField();
        jTV_Compra = new javax.swing.JTextField();
        jTPeso = new javax.swing.JTextField();
        jTNome_Produto = new javax.swing.JTextField();
        jLPeso = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLV_Venda = new javax.swing.JLabel();
        jLV_Compra = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jTNome = new javax.swing.JTextField();
        jLFornecedor = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLAjuda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Atualização de Produtos");

        jTV_Saida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTV_Compra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNome_Produto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLPeso.setText("Peso:");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLV_Venda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLV_Venda.setText("Valor de Saída:");

        jLV_Compra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLV_Compra.setText("Valor de Compra:");

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Atualizar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomeKeyTyped(evt);
            }
        });

        jLFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFornecedor.setText("Fornecedor:");

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmFornecedor);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabela);

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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                        .addComponent(jLAjuda))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBCadastrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLFornecedor)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLV_Compra)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTV_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLV_Venda)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTV_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLNome)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTNome_Produto)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLPeso)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLAjuda)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFornecedor)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPeso)
                    .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLV_Compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTV_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLV_Venda)
                    .addComponent(jTV_Saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBCadastrar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        if (tabela.getSelectedRowCount() < 1) {
            JOptionPane.showMessageDialog(AtualizaProduto.this, "Favor, escolher um fornecedor!", "ERROR 404 - Supplier not found!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                produto = new ProdutoBuilder().setId(produto.getId()).setFornecedor(fornecedores.get(tabela.getSelectedRow()))
                        .setNome(jTNome_Produto.getText()).setPeso(jTPeso.getText()).
                        setValor_entrada(jTV_Compra.getText()).setValor_saida(jTV_Saida.getText()).getProduto();
                dao.atualiza(produto);
                JOptionPane.showMessageDialog(AtualizaProduto.this, "Produto alterado com sucesso!", "Activity Performed Successfully", JOptionPane.INFORMATION_MESSAGE);
                limpar();
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(AtualizaProduto.this, "Campos obrigatórios (*) vazios e/ou Informação inválida!", "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
                marca();
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(AtualizaProduto.this, "Favor, escolher um fornecedor!", "ERROR 404 - Supplier not found!", JOptionPane.ERROR_MESSAGE);

            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Causa: \b" + ex,
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jBCadastrarActionPerformed

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
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPeso;
    private javax.swing.JLabel jLV_Compra;
    private javax.swing.JLabel jLV_Venda;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNome_Produto;
    private javax.swing.JTextField jTPeso;
    private javax.swing.JTextField jTV_Compra;
    private javax.swing.JTextField jTV_Saida;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void populateFields(Produto produto) {
        jTNome_Produto.setText(produto.getNome());
        jTPeso.setText(String.valueOf(produto.getPeso()));
        jTV_Compra.setText(String.valueOf(produto.getValor_entrada()));
        jTV_Saida.setText(String.valueOf(produto.getValor_saida()));
        jTNome.setText(produto.getFornecedor().getNome());
        populaTabela();
    }

    private void populaTabela() {
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
    }

    public void marca() {
        jLNome.setText("Nome:*");
        jLFornecedor.setText("Fornecedor:*");
        jLPeso.setText("Peso:*");
        jLV_Compra.setText("Valor de Compra:*");
        jLV_Venda.setText("Valor de Saída:*");
    }

    private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de atualização de Produtos,<br>"
                + " onde serão atualizados dados relativos as informações já cadastradas. <br>"
                + "1. Lembre-se de preencher os dados obrigatórios sempre, para serem evitados erros.<br>"
                + "2. Lembre-se de escolher se o Fornecedor para o cadastro ser efetuado com sucesso.<br>"
                + " Tal escolha auxiliará na máscara utilizada para o cadastro do seu respectivo código.<br>"
                + "3. Após o preenchimento, clique no botão atualizar para que seja executada a atualização.<br>"
                + "4. Para consultar o Manual do Proprietário, basta dar um duplo clique em \"Ajuda\" ou tecle F1.</html>");
    }

    private void limpar() throws ParseException {
        lista.dispose();
        ListagemProdutos cl = new ListagemProdutos(painel);
        painel.add(cl);
        cl.setVisible(true);
        this.dispose();
    }
}
