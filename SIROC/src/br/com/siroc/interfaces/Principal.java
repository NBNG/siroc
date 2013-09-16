/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matt
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        super("SIROC - Sistema de Pedidos e Romaneios");
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JDesktopPane();
        jMenu = new javax.swing.JMenuBar();
        jMArquivo = new javax.swing.JMenu();
        jMClente = new javax.swing.JMenu();
        jMICadastro_Clientes = new javax.swing.JMenuItem();
        jMIListagem_Clientes = new javax.swing.JMenuItem();
        jMFornecedor = new javax.swing.JMenu();
        jMICadastro_Fornecedor = new javax.swing.JMenuItem();
        jMIListagem_Fornecedor = new javax.swing.JMenuItem();
        jMProdutos = new javax.swing.JMenu();
        jMICadastro_Produtos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/arquivo.png"))); // NOI18N
        jMArquivo.setText("Arquivo");
        jMArquivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu.add(jMArquivo);

        jMClente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/cliente.png"))); // NOI18N
        jMClente.setText("Clientes");
        jMClente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastro_Clientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastro_Clientes.setText("Cadastro de Clientes");
        jMICadastro_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastro_ClientesActionPerformed(evt);
            }
        });
        jMClente.add(jMICadastro_Clientes);

        jMIListagem_Clientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIListagem_Clientes.setText("Listagem de Clientes");
        jMIListagem_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListagem_ClientesActionPerformed(evt);
            }
        });
        jMClente.add(jMIListagem_Clientes);

        jMenu.add(jMClente);

        jMFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/funcionario.png"))); // NOI18N
        jMFornecedor.setText("Fornecedores");
        jMFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastro_Fornecedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastro_Fornecedor.setText("Cadastro de Fornecedores");
        jMICadastro_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastro_FornecedorActionPerformed(evt);
            }
        });
        jMFornecedor.add(jMICadastro_Fornecedor);

        jMIListagem_Fornecedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIListagem_Fornecedor.setText("Listagem de Fornecedores");
        jMIListagem_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListagem_FornecedorActionPerformed(evt);
            }
        });
        jMFornecedor.add(jMIListagem_Fornecedor);

        jMenu.add(jMFornecedor);

        jMProdutos.setText("Produtos");
        jMProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastro_Produtos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastro_Produtos.setText("Cadastro de Produtos");
        jMICadastro_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastro_ProdutosActionPerformed(evt);
            }
        });
        jMProdutos.add(jMICadastro_Produtos);

        jMenu.add(jMProdutos);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMICadastro_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastro_ClientesActionPerformed
        try {
            Cadastro_Clientes cc = new Cadastro_Clientes();
            jPanel.add(cc);
            cc.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMICadastro_ClientesActionPerformed

    private void jMIListagem_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListagem_ClientesActionPerformed
        try {
            Listagem_Clientes lc = new Listagem_Clientes();
            jPanel.add(lc);
            lc.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIListagem_ClientesActionPerformed

    private void jMICadastro_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastro_FornecedorActionPerformed

        try {
            Cadastro_Fornecedor cf = new Cadastro_Fornecedor();
            jPanel.add(cf);
            cf.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMICadastro_FornecedorActionPerformed

    private void jMIListagem_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListagem_FornecedorActionPerformed
        Listagem_Fornecedores lf = new Listagem_Fornecedores();
        jPanel.add(lf);
        lf.setVisible(true);
    }//GEN-LAST:event_jMIListagem_FornecedorActionPerformed

    private void jMICadastro_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastro_ProdutosActionPerformed
        Cadastro_Produtos cp = new Cadastro_Produtos();
        jPanel.add(cp);
        cp.setVisible(true);
        
    }//GEN-LAST:event_jMICadastro_ProdutosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMArquivo;
    private javax.swing.JMenu jMClente;
    private javax.swing.JMenu jMFornecedor;
    private javax.swing.JMenuItem jMICadastro_Clientes;
    private javax.swing.JMenuItem jMICadastro_Fornecedor;
    private javax.swing.JMenuItem jMICadastro_Produtos;
    private javax.swing.JMenuItem jMIListagem_Clientes;
    private javax.swing.JMenuItem jMIListagem_Fornecedor;
    private javax.swing.JMenu jMProdutos;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JDesktopPane jPanel;
    // End of variables declaration//GEN-END:variables
}
