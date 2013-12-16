/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.Jasper.Relatorio;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author matteus
 */
public class RomaneioSO extends javax.swing.JFrame {

    /**
     * Creates new form Romaneio
     */
    public RomaneioSO() {
        super("Cella - Romaneio SO");
        initComponents();
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

        jLCabecalho = new javax.swing.JLabel();
        jLInicial = new javax.swing.JLabel();
        jLFinal = new javax.swing.JLabel();
        jCInicial = new com.toedter.calendar.JCalendar();
        jCFinal = new com.toedter.calendar.JCalendar();
        jBImprimir = new javax.swing.JButton();
        jBPDF = new javax.swing.JButton();
        jLAjuda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Romaneios SO - Cella");

        jLInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLInicial.setText("Data Inicial");

        jLFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFinal.setText("Data Final");

        jBImprimir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/imprimir.png"))); // NOI18N
        jBImprimir.setText("Imprimir");
        jBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLAjuda)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLInicial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLFinal)
                            .addComponent(jCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jBImprimir)
                        .addGap(38, 38, 38)
                        .addComponent(jBPDF)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBImprimir, jBPDF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAjuda))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLInicial)
                    .addComponent(jLFinal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBImprimir)
                    .addComponent(jBPDF))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        try {
            String where = "where  pedidos.ped_data >='" + jCInicial.getDate() + "' AND"
                    + " pedidos.ped_data <= '" + jCFinal.getDate() + "' AND pedidos.ped_pedido = 'SO'";
            java.sql.Date dataI = new java.sql.Date(jCInicial.getDate().getTime());
            java.sql.Date dataF = new java.sql.Date(jCFinal.getDate().getTime());
            String nome = "//Romaneio SO " + dataI + " até " + dataF + ".pdf";
            Relatorio rel = new Relatorio();
            rel.gerarSO(where, 1, nome);
            JOptionPane.showMessageDialog(RomaneioSO.this, "Romaneio impresso com sucesso!", "Activity Performed Successfully", JOptionPane.WARNING_MESSAGE);
        } catch (JRException ex) {
            Logger.getLogger(RomaneioSO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RomaneioSO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBImprimirActionPerformed

    private void jBPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPDFActionPerformed
        try {
            String where = "where  pedidos.ped_data >='" + jCInicial.getDate() + "' AND"
                    + " pedidos.ped_data <= '" + jCFinal.getDate() + "' AND pedidos.ped_pedido = 'SO'";
            java.sql.Date dataI = new java.sql.Date(jCInicial.getDate().getTime());
            java.sql.Date dataF = new java.sql.Date(jCFinal.getDate().getTime());
            String nome = "//Romaneio SO " + dataI + " até " + dataF + ".pdf";
            Relatorio rel = new Relatorio();
            rel.gerarSO(where, 0, nome);
            JOptionPane.showMessageDialog(RomaneioSO.this, "Romaneio impresso com sucesso!", "Activity Performed Successfully", JOptionPane.WARNING_MESSAGE);
        } catch (JRException ex) {
            Logger.getLogger(RomaneioSO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RomaneioSO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBPDFActionPerformed

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
    private com.toedter.calendar.JCalendar jCFinal;
    private com.toedter.calendar.JCalendar jCInicial;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLFinal;
    private javax.swing.JLabel jLInicial;
    // End of variables declaration//GEN-END:variables
        private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de geração de Romaneios SO.<br>"
                + "1. Para gerar o romaneio é necessário escolher as datas respectivas de início e término.<br>"
                + "2. Há a opção de gerar PDF's e/ou imprimi-los.<br>"
                + "3. Para consultar o Manual do Usuário, basta dar um duplo clique em \"Ajuda.\"</html>");
    }
}
