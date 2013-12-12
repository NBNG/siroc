/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.interfaces;

import br.com.siroc.dao.ClienteDAO;
import br.com.siroc.dao.DAO;
import br.com.siroc.modelo.Cliente;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author matt
 */
public class ListagemClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listagem_Clientes
     */
    DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
    ClienteDAO cdao = new ClienteDAO();
    String endereco;
    List<Cliente> clientes;//List de uma classe do modelo para utilização na tabela;
    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Nome", "Inscrição Estadual", "CNPJ/CPF", "Telefone", "Contato", "Email", "Celular", "Endereço", "Frete"}) {
        boolean[] canEdit = new boolean[]{
            false, false, false, false, false, false, false, false, false, false
        };

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
        }
    };

//definição das colunas da tabela
    Cliente cliente;
    MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
    MaskFormatter maskCnpj = new MaskFormatter("##.###.###/####-##");
    JDesktopPane painel;

    public ListagemClientes(JDesktopPane painel) throws ParseException {

        super("Cella - Listagem de Clientes");
        initComponents();
        tabela.setRowHeight(23);
        this.painel = painel;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLCabecalho = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jBLimpar = new javax.swing.JButton();
        jFTCnpj_cpf = new javax.swing.JFormattedTextField();
        jBPesquisar = new javax.swing.JButton();
        jLNome = new javax.swing.JLabel();
        jRBFisica = new javax.swing.JRadioButton();
        jRBJuridica = new javax.swing.JRadioButton();
        jLAjuda = new javax.swing.JLabel();

        setClosable(true);

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmCliente);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Pesquisa de Clientes");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        jFTCnpj_cpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        jRBFisica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBFisica.setText("Pessoa Física");
        jRBFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBFisicaActionPerformed(evt);
            }
        });

        jRBJuridica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBJuridica.setText("Pessoa Jurídica");
        jRBJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBJuridicaActionPerformed(evt);
            }
        });

        jLAjuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siroc/Imagens/help.png"))); // NOI18N
        jLAjuda.setText("Ajuda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLAjuda))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNome)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRBFisica)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBJuridica)
                                        .addGap(16, 16, 16)
                                        .addComponent(jFTCnpj_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jBPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jBLimpar)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLAjuda)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTCnpj_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar)
                    .addComponent(jRBFisica)
                    .addComponent(jRBJuridica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBLimpar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped
        jFTCnpj_cpf.setText("");

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
            tmCliente.setValueAt(clientes.get(i).getCnpj_cpf(), i, 2);
            tmCliente.setValueAt(clientes.get(i).getTelefone(), i, 3);
            tmCliente.setValueAt(clientes.get(i).getContato(), i, 4);
            tmCliente.setValueAt(clientes.get(i).getEmail(), i, 5);
            tmCliente.setValueAt(clientes.get(i).getCelular(), i, 6);
            tmCliente.setValueAt(endereco, i, 7);
            tmCliente.setValueAt(clientes.get(i).getFrete() + " %", i, 8);

        }    }//GEN-LAST:event_jTNomeKeyTyped

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        try {
            ListagemClientes lc = new ListagemClientes(painel);
            painel.add(lc);
            lc.setVisible(true);
            this.dispose();
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(ListagemClientes.this, "Erro: \n" + pe, "ERROR - Parse Exception!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed

        if (!jFTCnpj_cpf.getText().equals("")) {
            jTNome.setText("");

            while (tmCliente.getRowCount() > 0) {
                tmCliente.removeRow(0);
            }

            clientes = new ArrayList<Cliente>();

            cliente = (Cliente) cdao.buscaPorCNPJ(jFTCnpj_cpf.getText());
            clientes.add(cliente);

            String endereco = cliente.getEndereco() + ", " + cliente.getBairro() + " - "
                    + cliente.getCidade() + "/" + cliente.getEstado() + " - CEP: "
                    + cliente.getCep();
            tmCliente.addRow(new String[]{null, null, null, null});
            tmCliente.setValueAt(cliente.getNome(), 0, 0);
            tmCliente.setValueAt(cliente.getInscricao_est(), 0, 1);
            tmCliente.setValueAt(cliente.getCnpj_cpf(), 0, 2);
            tmCliente.setValueAt(cliente.getTelefone(), 0, 3);
            tmCliente.setValueAt(cliente.getContato(), 0, 4);
            tmCliente.setValueAt(cliente.getEmail(), 0, 5);
            tmCliente.setValueAt(cliente.getCelular(), 0, 6);
            tmCliente.setValueAt(endereco, 0, 7);
            tmCliente.setValueAt(cliente.getFrete() + " %", 0, 8);
        } else {
            JOptionPane.showMessageDialog(ListagemClientes.this, "Favor preencher um CPF/CNPJ!", "ERROR 404 - Content not found!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jRBFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBFisicaActionPerformed
        if (jRBFisica.isSelected()) {
            jRBJuridica.setSelected(false);
            jFTCnpj_cpf.setValue(null);
            maskCPF.install(jFTCnpj_cpf);
            jFTCnpj_cpf.setFormatterFactory(new DefaultFormatterFactory(maskCPF));
        }
    }//GEN-LAST:event_jRBFisicaActionPerformed

    private void jRBJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBJuridicaActionPerformed
        if (jRBJuridica.isSelected()) {
            jRBFisica.setSelected(false);
            jFTCnpj_cpf.setValue(null);
            maskCnpj.install(jFTCnpj_cpf);
            jFTCnpj_cpf.setFormatterFactory(new DefaultFormatterFactory(maskCnpj));
        }
    }//GEN-LAST:event_jRBJuridicaActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getButton() != evt.BUTTON3 && evt.getClickCount() == 2) {
            try {
                AtualizaClientes ac = new AtualizaClientes(clientes.get(tabela.getSelectedRow())); //Novo pego o objeto inteiro
                System.out.println(clientes.get(tabela.getSelectedRow()));
                ac.setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(ListagemClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tabelaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JFormattedTextField jFTCnpj_cpf;
    private javax.swing.JLabel jLAjuda;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLNome;
    private javax.swing.JRadioButton jRBFisica;
    private javax.swing.JRadioButton jRBJuridica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        try {
            ListagemClientes lc = new ListagemClientes(painel);
            painel.add(lc);
            lc.setVisible(true);
            this.dispose();
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(ListagemClientes.this, "Erro: \n" + pe, "ERROR - Parse Exception!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void hinter() {
        jLAjuda.setToolTipText("<html>Esta é a tela de listagem de Clientes,<br>"
                + " onde serão listados os dados relativos as informações do cliente. <br>"
                + "1. Aqui poderão ser efetuadas pesquisas por CPF ou pelo nome do cliente.<br>"
                + "2. Para ir para a tela de atualização, basta dar um duplo clique na linha do cliente escolhido.<br>"
                + "3. Para consultar o Manual do Usuário, basta dar um duplo clique em \"Ajuda.\"</html>");
    }
}
