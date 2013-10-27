package br.com.siroc.interfaces;

import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Fornecedor;
import java.util.List;
import javax.swing.JOptionPane;
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
    DAO<Fornecedor> dao = new DAO<Fornecedor>(Fornecedor.class);
    List<Fornecedor> fornecedores;
    //definição das colunas da tabela
    DefaultTableModel tmFornecedor = new DefaultTableModel(null, new String[]{"Nome", "Telefone", "Email"});

    public Listagem_Fornecedores() {
        super("Cella - Listagem de Fornecedores");
        initComponents();
        tabela.setRowHeight(23);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLCabecalho = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jLNome = new javax.swing.JLabel();

        setClosable(true);

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

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jLCabecalho.setText("Pesquisa de Fornecedores");

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jBLimpar)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLNome)
                            .addGap(18, 18, 18)
                            .addComponent(jTNome))
                        .addComponent(jLCabecalho, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLCabecalho)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jBLimpar)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tabela.getSelectedRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro a ser alterado.");
        } else {

            Atualiza_Fornecedor af = new Atualiza_Fornecedor(fornecedores.get(tabela.getSelectedRow()));
            af.setVisible(true);

        }


        /*try {
         Atualiza_Fornecedor af = new Atualiza_Fornecedor(fornecedores.get(tabela.getSelectedRow()).getId());
         af.setVisible(true);
         } catch (ParseException ex) {
         Logger.getLogger(Listagem_Fornecedores.class.getName()).log(Level.SEVERE, null, ex);
         }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped

        while (tmFornecedor.getRowCount() > 0) {
            tmFornecedor.removeRow(0);
        }

        fornecedores = dao.buscaPorNome(jTNome.getText());

        for (int i = 0; i < fornecedores.size(); i++) {

            tmFornecedor.addRow(new String[]{null, null, null, null});
            tmFornecedor.setValueAt(fornecedores.get(i).getNome(), i, 0);
            tmFornecedor.setValueAt(fornecedores.get(i).getTelefone(), i, 1);
            tmFornecedor.setValueAt(fornecedores.get(i).getEmail(), i, 2);
        }

    }//GEN-LAST:event_jTNomeKeyTyped

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed

        while (tmFornecedor.getRowCount() > 0) {
            tmFornecedor.removeRow(0);
        }

        fornecedores = dao.buscaPorNome(jTNome.getText());

        for (int i = 0; i < fornecedores.size(); i++) {

            tmFornecedor.addRow(new String[]{null, null, null, null});
            tmFornecedor.setValueAt(fornecedores.get(i).getNome(), i, 0);
            tmFornecedor.setValueAt(fornecedores.get(i).getTelefone(), i, 1);
            tmFornecedor.setValueAt(fornecedores.get(i).getEmail(), i, 2);
        }

    }//GEN-LAST:event_jTNomeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        jTNome.setText("");

        fornecedores = null;

        while (tmFornecedor.getRowCount() > 0) {
            tmFornecedor.removeRow(0);
        }
        dao = new DAO<Fornecedor>(Fornecedor.class);
    }
}
