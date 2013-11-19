/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.classes_auxiliares;

import br.com.siroc.fabrica.ConnectionFactory;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author matteus
 */
public class Jasper_Reports {

    private Session session;

    public Jasper_Reports() {
        session = new ConnectionFactory().getSession();
    }

    public void gerar(int id) throws JRException, SQLException {
        URL arquivo = getClass().getResource("/br/com/siroc/Jasper/pedido_final.jrxml");
        
        String resultado = arquivo.getPath();
        resultado = resultado.replaceAll("%20", " ");

        JasperDesign desenho = JRXmlLoader.load(resultado);
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        String consulta = "select clientes.cli_nome,clientes.cli_endereco ||', ' ||clientes.cli_bairro || '. ' || clientes.cli_cidade || '-' || clientes.cli_estado as endereco,\n"
                + " clientes.cli_telefone, clientes.cli_cep,clientes.cli_cnpj_cpf,clientes.cli_inscricao_est,\n"
                + " to_char(((select sum(itens.item_valor * itens.item_quantidade)\n"
                + " from itens inner join pedidos on itens.fk_pedido = pedidos.ped_id inner join clientes on pedidos.fk_cliente = clientes.cli_id\n"
                + " where pedidos.ped_id = :id)*clientes.cli_frete)/100,'R$99G999D99' ) as cli_frete,produtos.pro_id,itens.item_quantidade,\n"
                + " produtos.pro_nome || ' - ' || produtos.pro_peso|| ' Kg' as produto, to_char(itens.item_valor, 'R$99G999D99') as item_valor,\n"
                + " to_char((itens.item_valor * itens.item_quantidade), 'R$99G999D99') as total_parcial, to_char((select sum((itens.item_valor - produtos.pro_saida)\n"
                + " * itens.item_quantidade) from itens inner join produtos on itens.fk_produto = produtos.pro_id inner join pedidos on\n"
                + " itens.fk_pedido = pedidos.ped_id inner join clientes on pedidos.fk_cliente = clientes.cli_id where pedidos.ped_id = :id), 'R$99G999D99')as saldo,\n"
                + " pedidos.ped_pagamento,pedidos.ped_pedido,pedidos.ped_status, to_char((select sum(itens.item_valor * itens.item_quantidade)\n"
                + " from itens inner join pedidos on itens.fk_pedido = pedidos.ped_id where pedidos.ped_id = :id), 'R$99G999D99') as total from\n"
                + " pedidos inner join clientes on clientes.cli_id = pedidos.fk_cliente inner join itens on pedidos.ped_id = itens.fk_pedido inner join produtos on\n"
                + " produtos.pro_id = itens.fk_produto where pedidos.ped_id = :id";
        
        Query query = session.createQuery(consulta);
        query.setParameter("id", id);
        //PreparedStatement pstmt = this.session.prepareStatement(query);
        //ResultSet rs = pstmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource((ResultSet) query);
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, null, jrRS);
        JasperViewer.viewReport(impressao);
        //JasperPrintManager.printPage(impressao, 0, true);
    }

    public static void main(String[] args) throws JRException, SQLException {
        Jasper_Reports jr = new Jasper_Reports();
        jr.gerar(35);
    }

}
