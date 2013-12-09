/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.drive.InsertGoogleDrive;
import br.com.siroc.teste.Backup;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author matt
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        super("Cella - Sistema de Pedidos e Romaneios");
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/siroc/Imagens/icone.png")));
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
        jMIBackup = new javax.swing.JMenuItem();
        jMIGoogle = new javax.swing.JMenuItem();
        jMClente = new javax.swing.JMenu();
        jMICadastro_Clientes = new javax.swing.JMenuItem();
        jMIListagem_Clientes = new javax.swing.JMenuItem();
        jMFornecedor = new javax.swing.JMenu();
        jMICadastro_Fornecedor = new javax.swing.JMenuItem();
        jMIListagem_Fornecedor = new javax.swing.JMenuItem();
        jMProdutos = new javax.swing.JMenu();
        jMICadastro_Produtos = new javax.swing.JMenuItem();
        jMIListagem_Produtos = new javax.swing.JMenuItem();
        jMI_Historico = new javax.swing.JMenuItem();
        jMPedido = new javax.swing.JMenu();
        jMICadastro_Pedidos = new javax.swing.JMenuItem();
        jMIListagem_Pedidos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMIRomaneioSO = new javax.swing.JMenuItem();
        jMIRomaneioNF = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/arquivo.png"))); // NOI18N
        jMArquivo.setText("Arquivo");
        jMArquivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMIBackup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIBackup.setText("Backup");
        jMIBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBackupActionPerformed(evt);
            }
        });
        jMArquivo.add(jMIBackup);

        jMIGoogle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIGoogle.setText("Google Drive");
        jMIGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGoogleActionPerformed(evt);
            }
        });
        jMArquivo.add(jMIGoogle);

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

        jMFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/usuario.png"))); // NOI18N
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

        jMProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/icone_bau.png"))); // NOI18N
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

        jMIListagem_Produtos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIListagem_Produtos.setText("Listagem de Produtos");
        jMIListagem_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListagem_ProdutosActionPerformed(evt);
            }
        });
        jMProdutos.add(jMIListagem_Produtos);

        jMI_Historico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMI_Historico.setText("Histórico de Valores");
        jMI_Historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_HistoricoActionPerformed(evt);
            }
        });
        jMProdutos.add(jMI_Historico);

        jMenu.add(jMProdutos);

        jMPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/agenda.png"))); // NOI18N
        jMPedido.setText("Pedidos");
        jMPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMICadastro_Pedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMICadastro_Pedidos.setText("Cadastro de Pedidos");
        jMICadastro_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastro_PedidosActionPerformed(evt);
            }
        });
        jMPedido.add(jMICadastro_Pedidos);

        jMIListagem_Pedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIListagem_Pedidos.setText("Listagem de Pedidos");
        jMIListagem_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListagem_PedidosActionPerformed(evt);
            }
        });
        jMPedido.add(jMIListagem_Pedidos);
        jMPedido.add(jSeparator1);

        jMIRomaneioSO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIRomaneioSO.setText("Romaneio - SO");
        jMIRomaneioSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRomaneioSOActionPerformed(evt);
            }
        });
        jMPedido.add(jMIRomaneioSO);

        jMIRomaneioNF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIRomaneioNF.setText("Romaneio - NF");
        jMIRomaneioNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRomaneioNFActionPerformed(evt);
            }
        });
        jMPedido.add(jMIRomaneioNF);

        jMenu.add(jMPedido);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMICadastro_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastro_ClientesActionPerformed
        try {
            CadastroClientes cc = new CadastroClientes(jPanel);
            jPanel.add(cc);
            cc.setVisible(true);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(Principal.this, "Erro: \n" + ex, "ERROR - Parse Exception!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMICadastro_ClientesActionPerformed

    private void jMIListagem_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListagem_ClientesActionPerformed
        try {
            ListagemClientes lc = new ListagemClientes(jPanel);
            jPanel.add(lc);
            lc.setVisible(true);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(Principal.this, "Erro: \n" + ex, "ERROR - Parse Exception!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMIListagem_ClientesActionPerformed

    private void jMICadastro_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastro_FornecedorActionPerformed
        try {
            CadastroFornecedor cf = new CadastroFornecedor(jPanel);
            jPanel.add(cf);
            cf.setVisible(true);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(Principal.this, "Erro: \n" + ex, "ERROR - Parse Exception!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMICadastro_FornecedorActionPerformed

    private void jMIListagem_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListagem_FornecedorActionPerformed
        ListagemFornecedores lf = new ListagemFornecedores(jPanel);
        jPanel.add(lf);
        lf.setVisible(true);
    }//GEN-LAST:event_jMIListagem_FornecedorActionPerformed

    private void jMICadastro_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastro_ProdutosActionPerformed
        CadastroProdutos cp = new CadastroProdutos(jPanel);
        jPanel.add(cp);
        cp.setVisible(true);

    }//GEN-LAST:event_jMICadastro_ProdutosActionPerformed

    private void jMIListagem_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListagem_ProdutosActionPerformed
        ListagemProdutos lp = new ListagemProdutos(jPanel);
        jPanel.add(lp);
        lp.setVisible(true);
    }//GEN-LAST:event_jMIListagem_ProdutosActionPerformed

    private void jMICadastro_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastro_PedidosActionPerformed
        CadastroPedidos cp = new CadastroPedidos(jPanel);
        jPanel.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_jMICadastro_PedidosActionPerformed

    private void jMIListagem_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListagem_PedidosActionPerformed
        ListagemPedidos lp = new ListagemPedidos(jPanel);
        jPanel.add(lp);
        lp.setVisible(true);
    }//GEN-LAST:event_jMIListagem_PedidosActionPerformed

    private void jMI_HistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_HistoricoActionPerformed
        HistoricoPreco hp = new HistoricoPreco();
        jPanel.add(hp);
        hp.setVisible(true);
    }//GEN-LAST:event_jMI_HistoricoActionPerformed

    private void jMIRomaneioSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRomaneioSOActionPerformed
        RomaneioSO romaso = new RomaneioSO();
        romaso.setVisible(true);
    }//GEN-LAST:event_jMIRomaneioSOActionPerformed

    private void jMIRomaneioNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRomaneioNFActionPerformed
        RomaneioNF romanf = new RomaneioNF();
        romanf.setVisible(true);
    }//GEN-LAST:event_jMIRomaneioNFActionPerformed

    private void jMIGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGoogleActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//use FILES_ONLY caso deseje que o usuario selecione apenas arquivos  
            fileChooser.setDialogTitle("Abrir...");

            int status = fileChooser.showOpenDialog(null);
            if (status == JFileChooser.APPROVE_OPTION) {

                File file = fileChooser.getSelectedFile();//esse é o arquivo que o usuario escolheu, faça o que quiser com ele  
                String caminho = String.valueOf(file);
                InsertGoogleDrive igd = new InsertGoogleDrive();
                igd.EnviaBackup(caminho);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
        }
    }//GEN-LAST:event_jMIGoogleActionPerformed

    private void jMIBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBackupActionPerformed
        Backup bac = new Backup();
        bac.fazBackup();
    }//GEN-LAST:event_jMIBackupActionPerformed

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
    private javax.swing.JMenuItem jMIBackup;
    private javax.swing.JMenuItem jMICadastro_Clientes;
    private javax.swing.JMenuItem jMICadastro_Fornecedor;
    private javax.swing.JMenuItem jMICadastro_Pedidos;
    private javax.swing.JMenuItem jMICadastro_Produtos;
    private javax.swing.JMenuItem jMIGoogle;
    private javax.swing.JMenuItem jMIListagem_Clientes;
    private javax.swing.JMenuItem jMIListagem_Fornecedor;
    private javax.swing.JMenuItem jMIListagem_Pedidos;
    private javax.swing.JMenuItem jMIListagem_Produtos;
    private javax.swing.JMenuItem jMIRomaneioNF;
    private javax.swing.JMenuItem jMIRomaneioSO;
    private javax.swing.JMenuItem jMI_Historico;
    private javax.swing.JMenu jMPedido;
    private javax.swing.JMenu jMProdutos;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JDesktopPane jPanel;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
