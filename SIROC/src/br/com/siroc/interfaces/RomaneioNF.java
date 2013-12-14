/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.Jasper.Relatorio;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Fornecedor;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author matteus
 */
public class RomaneioNF extends javax.swing.JFrame {

    /**
     * Creates new form RomaneioNF
     */
    DAO<Fornecedor> dao = new DAO<Fornecedor>(Fornecedor.class);
    List<Fornecedor> fornecedores;
    //definição das colunas da tabela
    DefaultTableModel tmFornecedor = new DefaultTableModel(null, new String[]{"Nome", "Telefone", "Email"}) {
        boolean[] canEdit = new boolean[]{
            false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

    public RomaneioNF() {
        super("Cella - Romaneio NF");
        initComponents();
        tabela.setRowHeight(23);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/siroc/Imagens/icone.png")));
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

        jBPDF = new javax.swing.JButton();
        jBImprimir = new javax.swing.JButton();
        jLCabecalho = new javax.swing.JLabel();
        jLInicial = new javax.swing.JLabel();
        jLFinal = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLNome = new javax.swing.JLabel();
        jLAjuda = new javax.swing.JLabel();
        jCInicio = new com.toedter.calendar.JDateChooser();
        jCFinal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBPDF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/pdf (1).png"))); // NOI18N
        jBPDF.setText("Gerar PDF");
        jBPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPDFActionPerformed(evt);
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

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Romaneios NF - Cella");

        jLInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLInicial.setText("Data Inicial");

        jLFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFinal.setText("Data Final");

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
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLAjuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/help.png"))); // NOI18N
        jLAjuda.setText("Ajuda");
        jLAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAjudaMouseClicked(evt);
            }
        });

        jCInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLCabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLAjuda)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLNome)
                        .addGap(18, 18, 18)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLInicial)
                            .addComponent(jCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLFinal)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jBPDF)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBImprimir)
                                    .addGap(14, 14, 14))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBImprimir, jBPDF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLAjuda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFinal)
                    .addComponent(jLInicial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPDF)
                    .addComponent(jBImprimir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPDFActionPerformed
        try {
            String where = "where fornecedores.for_nome like '" + jTNome.getText() + "' AND pedidos.ped_data >='" + jCInicio.getDate() + "' AND"
                    + " pedidos.ped_data <= '" + jCFinal.getDate() + "' AND pedidos.ped_pedido = 'NF'";
            Relatorio rel = new Relatorio();
            rel.gerarNF(where, 0);
            JOptionPane.showMessageDialog(RomaneioNF.this, "PDF criado com sucesso!", "Activity Performed Successfully", JOptionPane.WARNING_MESSAGE);
        } catch (JRException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBPDFActionPerformed

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        try {
            String where = "where  pedidos.ped_data >='" + jCInicio.getDate() + "' AND"
                    + " pedidos.ped_data <= '" + jCFinal.getDate() + "' AND pedidos.ped_pedido = 'SO'";
            Relatorio rel = new Relatorio();
            rel.gerarNF(where, 1);
            JOptionPane.showMessageDialog(RomaneioNF.this, "Romaneio impresso com sucesso!", "Activity Performed Successfully", JOptionPane.WARNING_MESSAGE);
        } catch (JRException ex) {

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jBImprimirActionPerformed

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

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        jTNome.setText(fornecedores.get(tabela.getSelectedRow()).getNome());
    }//GEN-LAST:event_tabelaMouseClicked

    private void jLAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAjudaMouseClicked
        if (evt.getButton() != evt.BUTTON3 && evt.getClickCount() == 2) {
            String caminho = "C:\\siroc\\ajuda\\ajuda.pdf";
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
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBPDF;
    private com.toedter.calendar.JDateChooser jCFinal;
    private com.toedter.calendar.JDateChooser jCInicio;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLFinal;
    private javax.swing.JLabel jLInicial;
    private javax.swing.JLabel jLNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
        private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de geração de Romaneios NF.<br>"
                + "1. Para gerar o romaneio é necessário escolher o fornecedor<br>"
                + " e as datas respectivas de início e término.<br>"
                + "2. Há a opção de gerar PDF's e/ou imprimi-los.<br>"
                + "3. Para consultar o Manual do Usuário, basta dar um duplo clique em \"Ajuda.\"</html>");
    }
}
