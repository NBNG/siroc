/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.dao.FornecedorDAO;
import br.com.siroc.modelo.Fornecedor;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matt
 */
public class Listagem_Fornecedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listagem_Fornecedores
     */
    //List de uma classe do modelo para utilização na tabela;
    List<Fornecedor> fornecedores;
    //definição das colunas da tabela
    DefaultTableModel tmFornecedor = new DefaultTableModel(null, new String[]{"Nome", "Telefone", "Email"});
    FornecedorDAO fdao = new FornecedorDAO();

    public Listagem_Fornecedores() {
        super("SIROC - Listagem de Fornecedores");
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

        jRBPesquisar = new javax.swing.JRadioButton();
        jTNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLCabecalho = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();

        setClosable(true);

        jRBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
<<<<<<< HEAD
        jRBPesquisar.setText("Pesquisar");
=======
        jRBPesquisar.setText("Nome");
>>>>>>> 1.5
        jRBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPesquisarActionPerformed(evt);
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

        tabela.setModel(tmFornecedor);
        jScrollPane1.setViewportView(tabela);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/editar.png"))); // NOI18N
        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Listagem de Fornecedores");

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRBPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jBLimpar))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(50, Short.MAX_VALUE)
=======
                .addContainerGap(54, Short.MAX_VALUE)
>>>>>>> 1.5
                .addComponent(jLCabecalho)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBPesquisar)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jBLimpar)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Atualiza_Fornecedor af = new Atualiza_Fornecedor(fornecedores.get(tabela.getSelectedRow()).getId());
            af.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Listagem_Fornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPesquisarActionPerformed
        if (jRBPesquisar.isSelected()) {
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
    }//GEN-LAST:event_jRBPesquisarActionPerformed

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped
        if (jRBPesquisar.isSelected()) {
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
    }//GEN-LAST:event_jTNomeKeyTyped

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jRBPesquisar.setSelected(false);
        jTNome.setText("");

        fornecedores = null;
        
        while (tmFornecedor.getRowCount() > 0) {
            tmFornecedor.removeRow(0);
        }
        
        tmFornecedor = new DefaultTableModel(null, new String[]{"Nome", "Telefone", "Email"});
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JRadioButton jRBPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
