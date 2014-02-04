/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.Jasper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author matteus
 */
public class Relatorio {

    private Connection conexao;
    private String caminho = System.getenv("USERPROFILE") + "\\meus documentos\\NBNG\\siroc\\pdfs";
    private String xml = System.getenv("USERPROFILE") + "\\Meus Documentos\\NBNG\\SIROC\\xml";

    public Relatorio() {
        this.conexao = getConexao();
    }

    public static Connection getConexao() {

        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/siroc", "postgres", "agreste03");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            throw new RuntimeException(ex);
        }
    }

    public void balancoSO(String where, int tipo, String nome) throws JRException, SQLException, IOException {
        xml += "\\balancoso.jrxml";

        JasperDesign desenho = JRXmlLoader.load(xml);
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        String query = "select produtos.pro_id,itens.item_quantidade, produtos.pro_nome || '-' || to_char(produtos.pro_peso,'09D90')|| ' Kg' as produto,\n"
                + "to_char(produtos.pro_entrada,'R$09G999D99')as valor_entrada,to_char(itens.item_valor, 'R$09G999D99') as item_valor, to_char((itens.item_valor * itens.item_quantidade), 'R$09G999D99') as total_parcial,\n"
                + "to_char((select sum(itens.item_valor * itens.item_quantidade) - sum(itens.item_quantidade * produtos.pro_entrada) from itens inner join produtos on\n"
                + "itens.fk_produto = produtos.pro_id inner join pedidos on itens.fk_pedido = pedidos.ped_id inner join clientes on\n"
                + "pedidos.fk_cliente = clientes.cli_id inner join fornecedores on produtos.fk_fornecedor = fornecedores.for_id\n"
                + "" + where + " ), 'R$09G999D99')as saldo,\n"
                + "to_char(((select sum(itens.item_valor * itens.item_quantidade) from itens inner join produtos on itens.fk_produto = produtos.pro_id inner join\n"
                + "pedidos on itens.fk_pedido = pedidos.ped_id inner join clientes on pedidos.fk_cliente = clientes.cli_id inner join fornecedores on\n"
                + "produtos.fk_fornecedor = fornecedores.for_id \n"
                + "" + where + " )), 'R$09G999D99') \n"
                + "as total from pedidos inner join clientes on clientes.cli_id = pedidos.fk_cliente inner join itens on\n"
                + "pedidos.ped_id = itens.fk_pedido inner join produtos on produtos.pro_id = itens.fk_produto inner join fornecedores  on\n"
                + "produtos.fk_fornecedor = fornecedores.for_id\n"
                + "" + where;

        PreparedStatement pstmt = this.conexao.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        HashMap parametros = new HashMap();
        parametros.put("termo", new Double(10));

        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        if (tipo == 1) {
            JasperPrintManager.printPage(impressao, 0, true);
        } else if (tipo == 0) {
            caminho = caminho + nome;
            JasperExportManager.exportReportToPdfFile(impressao, caminho);
        } else if (tipo == 2) {
            JasperViewer.viewReport(impressao, false);
        }

    }

    public void balancoNF(String where, int tipo, String nome) throws JRException, SQLException, IOException {
        xml += "\\balanconf.jrxml";

        JasperDesign desenho = JRXmlLoader.load(xml);
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        String query = "select pedidos.ped_id,fornecedores.for_nome,clientes.cli_nome || ' - ' || to_char(pedidos.ped_data,'dd/mm/yyyy') as cliente,itens.item_quantidade, produtos.pro_nome || '-' || to_char(produtos.pro_peso,'09D90')|| ' Kg' as produto,\n"
                + "to_char(produtos.pro_entrada,'R$09G999D99')as valor_entrada,to_char(itens.item_valor, 'R$09G999D99') as item_valor,\n"
                + "to_char((itens.item_valor * itens.item_quantidade), 'R$09G999D99') as total_parcial,\n"
                + "to_char((select sum(itens.item_valor * itens.item_quantidade) - sum(itens.item_quantidade * produtos.pro_entrada) from itens inner join pedidos on itens.fk_pedido = pedidos.ped_id\n"
                + "inner join produtos on itens.fk_produto = produtos.pro_id inner join fornecedores on produtos.fk_fornecedor = fornecedores.for_id\n"
                + "" + where + " ), 'R$09G999D99')as saldo,\n"
                + "to_char((select sum(itens.item_quantidade * itens.item_valor) from itens inner join pedidos on itens.fk_pedido = pedidos.ped_id\n"
                + "inner join produtos on itens.fk_produto = produtos.pro_id inner join fornecedores on produtos.fk_fornecedor = fornecedores.for_id\n"
                + "" + where + " ), 'R$09G999D99') as total\n"
                + "from pedidos inner join clientes on pedidos.fk_cliente = clientes.cli_id\n"
                + "inner join itens on pedidos.ped_id = itens.fk_pedido\n"
                + "inner join produtos on itens.fk_produto = produtos.pro_id\n"
                + "inner join fornecedores on produtos.fk_fornecedor = fornecedores.for_id\n"
                + "" + where + ""
                + "order by clientes.cli_nome,fornecedores.for_nome,produto,itens.item_quantidade";

        PreparedStatement pstmt = this.conexao.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        HashMap parametros = new HashMap();
        parametros.put("termo", new Double(10));

        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        if (tipo == 1) {
            JasperPrintManager.printPage(impressao, 0, true);
        } else if (tipo == 0) {
            caminho = caminho + nome;
            JasperExportManager.exportReportToPdfFile(impressao, caminho);
        } else if (tipo == 2) {
            JasperViewer.viewReport(impressao, false);
        }
    }

    public void romaneioSO(String query, int tipo, String nome) throws JRException, SQLException, IOException {
        xml += "\\romaneioso.jrxml";

        JasperDesign desenho = JRXmlLoader.load(xml);
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        PreparedStatement pstmt = this.conexao.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        HashMap parametros = new HashMap();
        parametros.put("termo", new Double(10));

        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        if (tipo == 1) {
            JasperPrintManager.printPage(impressao, 0, true);
        } else if (tipo == 0) {
            caminho = caminho + nome;
            JasperExportManager.exportReportToPdfFile(impressao, caminho);
        } else if (tipo == 2) {
            JasperViewer.viewReport(impressao, false);
        }
    }

    public void romaneioNF(String query, int tipo, String nome) throws JRException, SQLException, IOException {
        xml += "\\romaneionf.jrxml";

        JasperDesign desenho = JRXmlLoader.load(xml);
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        PreparedStatement pstmt = this.conexao.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        HashMap parametros = new HashMap();
        parametros.put("termo", new Double(10));

        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        if (tipo == 1) {
            JasperPrintManager.printPage(impressao, 0, true);
        } else if (tipo == 0) {
            caminho = caminho + nome;
            JasperExportManager.exportReportToPdfFile(impressao, caminho);
        } else if (tipo == 2) {
            JasperViewer.viewReport(impressao, false);
        }
    }

    public void gerarPedido(String query, int tipo, String nome) throws JRException, SQLException, IOException {
        xml += "\\pedidoMeiaPagina.jrxml";
        System.out.println(xml);
        JasperDesign desenho = JRXmlLoader.load(xml);
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);

        PreparedStatement pstmt = this.conexao.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        HashMap parametros = new HashMap();
        parametros.put("REPORT_CONNECTION", conexao);
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        if (tipo == 1) {
            JasperPrintManager.printPage(impressao, 0, true);
        } else if (tipo == 0) {
            caminho += nome;
            JasperExportManager.exportReportToPdfFile(impressao, caminho);

        } else if (tipo == 2) {
            JasperViewer.viewReport(impressao, false);
        }
    }
}
