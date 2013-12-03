/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.Jasper;

import br.com.siroc.dao.PedidoDAO;
import br.com.siroc.fabrica.ConnectionFactory;
import java.sql.SQLException;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.hibernate.Session;

/**
 *
 * @author matteus
 */
public class Relatorio {
    
    private Session session;
    PedidoDAO pdao = new PedidoDAO();
    Long id;
    
    public Relatorio(Long id) {
        this.id = id;
        session = new ConnectionFactory().getSession();
    }

    public void gerar() throws JRException, SQLException {
        String caminho = "c:\\siroc\\pedidofinal.jrxml";

        String consulta = "select cliente.nome,\n"
                + "cliente.endereco ||', ' ||cliente.bairro || '. ' || cliente.cidade || '-' || cliente.estado as endereco,\n"
                + "cliente.telefone,\n"
                + "cliente.cep,\n"
                + "cliente.cnpj_cpf,\n"
                + "cliente.inscricao_est,\n"
                + "to_char(sum(((item.valor_alterado * item.quantidade))*cliente.frete)/100,'R$999G990D99')  as frete ,\n"
                + "produto.id,\n"
                + "item.quantidade,\n"
                + "produto.nome || ' - ' || produto.peso|| ' Kg' as produto,\n"
                + "to_char(item.valor_alterado,'R$999G990D99') as item_valor,\n"
                + "to_char((item.valor_alterado * item.quantidade) ,'R$999G990D99') as total_parcial ,\n"
                + "to_char(sum((item.valor_alterado - produto.valor_saida)*item.quantidade),'L9G999G90D99')  as lucro ,\n"
                + "pedido.tipo_pagamento,\n"
                + "pedido.tipo_pedido,\n"
                + "pedido.status,\n"
                + "to_char(pedido.data,'dd/mm/yyyy') as data,\n"
                + "to_char(sum(item.valor_alterado * item.quantidade),'R$999G990D99')  as total\n"
                + "FROM Pedido pedido \n"
                + "INNER JOIN pedido.cliente as cliente \n"
                + "INNER JOIN pedido.itens as item \n"
                + "INNER JOIN item.produto as produto \n"
                + "INNER JOIN produto.fornecedor as fornecedor\n"
                + "where pedido.id =" + id + "\n"
                + "group by cliente.nome,cliente.endereco,cliente.bairro,cliente.cidade,cliente.estado,cliente.telefone,\n"
                + "cliente.cep,cliente.cnpj_cpf,cliente.inscricao_est,cliente.frete,produto.id,item.quantidade,item.valor_alterado,pedido.tipo_pagamento,\n"
                + "pedido.tipo_pedido,pedido.status,pedido.data";

        List<Object[]> list= pdao.buscaPedido(consulta);

        JasperReport pathjrxml = JasperCompileManager.compileReport(caminho);
        JasperPrint printReport = JasperFillManager.fillReport(pathjrxml, null, new JRBeanCollectionDataSource(list));
        JasperExportManager.exportReportToPdfFile(printReport, "c:/reportex.pdf");
    }

    public static void main(String[] args) throws JRException, SQLException {
        Relatorio jr = new Relatorio(new Long(35));
        jr.gerar();
    }

}
