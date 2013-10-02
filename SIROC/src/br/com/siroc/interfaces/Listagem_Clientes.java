/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.dao.ClienteDAO;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Cliente;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author matt
 */
public class Listagem_Clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listagem_Clientes
     */
    DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
    ClienteDAO cdao = new ClienteDAO();
    String endereco;
    List<Cliente> clientes;//List de uma classe do modelo para utilização na tabela;
    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Nome", "Inscrição Estadual", "CNPJ", "Telefone", "Contato", "Email", "Celular", "Endereço", "Frete"});
    //definição das colunas da tabela
    Cliente cliente;

    public Listagem_Clientes() throws ParseException {
        super("SIROC - Listagem de Clientes");
        initComponents();
        MaskFormatter maskCnpj = new MaskFormatter("##.###.###/####-##");
        maskCnpj.install(jFTCnpj);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jBAtualizar = new javax.swing.JButton();
        jLCabecalho = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jBLimpar = new javax.swing.JButton();
        jLCNPJ = new javax.swing.JLabel();
        jFTCnpj = new javax.swing.JFormattedTextField();
        jBPesquisar = new javax.swing.JButton();
        jLNome = new javax.swing.JLabel();

        setClosable(true);

        tabela.setModel(tmCliente);
        jScrollPane1.setViewportView(tabela);

        jBAtualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/editar.png"))); // NOI18N
        jBAtualizar.setText("Alterar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Pesquisa de Clientes");

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

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCNPJ.setText("CNPJ:");

        jFTCnpj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCabecalho)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLCNPJ)
                                    .addComponent(jLNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jFTCnpj)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBPesquisar)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAtualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBLimpar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAtualizar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCNPJ)
                    .addComponent(jFTCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAtualizar)
                        .addGap(27, 27, 27)
                        .addComponent(jBLimpar)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        if (tabela.getSelectedRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro a ser alterado.");
        } else {
            
            //Atualiza_Clientes ac = new Atualiza_Clientes(clientes.get(tabela.getSelectedRow()).getId()); Antigo pegando o ID
            Atualiza_Clientes ac = new Atualiza_Clientes(clientes.get(tabela.getSelectedRow())); //Novo pego o objeto inteiro
            ac.setVisible(true);
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
    }//GEN-LAST:event_jTNomeActionPerformed

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped

        jFTCnpj.setText("");

        while (tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }

        clientes = dao.buscaPorNome(jTNome.getText());

        for (int i = 0; i < clientes.size(); i++) {
            endereco = clientes.get(i).getEndereco() + ", " + clientes.get(i).getBairro() + " - "
                    + clientes.get(i).getCidade() + "/" + clientes.get(i).getEstado() + " - CEP: "
                    + clientes.get(i).getCep();
            tmCliente.addRow(new String[]{null, null, null, null});
            tmCliente.setValueAt(clientes.get(i).getNome(), i, 0);
            tmCliente.setValueAt(clientes.get(i).getInscricao_est(), i, 1);
            tmCliente.setValueAt(clientes.get(i).getCnpj(), i, 2);
            tmCliente.setValueAt(clientes.get(i).getTelefone(), i, 3);
            tmCliente.setValueAt(clientes.get(i).getContato(), i, 4);
            tmCliente.setValueAt(clientes.get(i).getEmail(), i, 5);
            tmCliente.setValueAt(clientes.get(i).getCelular(), i, 6);
            tmCliente.setValueAt(endereco, i, 7);
            tmCliente.setValueAt(clientes.get(i).getFrete() + " %", i, 8);

        }    }//GEN-LAST:event_jTNomeKeyTyped

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();

    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed


        jTNome.setText("");

        while (tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }

        cliente = (Cliente) cdao.buscaPorCNPJ(jFTCnpj.getText());

        String endereco = cliente.getEndereco() + ", " + cliente.getBairro() + " - "
                + cliente.getCidade() + "/" + cliente.getEstado() + " - CEP: "
                + cliente.getCep();
        tmCliente.addRow(new String[]{null, null, null, null});
        tmCliente.setValueAt(cliente.getNome(), 0, 0);
        tmCliente.setValueAt(cliente.getInscricao_est(), 0, 1);
        tmCliente.setValueAt(cliente.getCnpj(), 0, 2);
        tmCliente.setValueAt(cliente.getTelefone(), 0, 3);
        tmCliente.setValueAt(cliente.getContato(), 0, 4);
        tmCliente.setValueAt(cliente.getEmail(), 0, 5);
        tmCliente.setValueAt(cliente.getCelular(), 0, 6);
        tmCliente.setValueAt(endereco, 0, 7);
        tmCliente.setValueAt(cliente.getFrete() + " %", 0, 8);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPesquisarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JFormattedTextField jFTCnpj;
    private javax.swing.JLabel jLCNPJ;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        jTNome.setText("");
        jFTCnpj.setText("");
        clientes = null;

        while (tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }
    }
}
