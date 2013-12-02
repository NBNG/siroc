/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.Jasper;

import br.com.siroc.dao.PedidoDAO;
import br.com.siroc.fabrica.ConnectionFactory;
<<<<<<< HEAD

import java.sql.ResultSet;


=======
>>>>>>> ede404529825867332d8133b2eadfffa912e2bee
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
    List list;
    PedidoDAO pdao = new PedidoDAO();
    Long id;
    public Relatorio(Long id) {
        this.id = id;
        session = new ConnectionFactory().getSession();
    }

    public void gerar(int id) throws JRException, SQLException {
<<<<<<< HEAD

        String caminho = "C:\\siroc\\pedidofinal.jrxml";
        JasperDesign desenho = JRXmlLoader.load(caminho);
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);
        String consulta = "select cliente.cli_nome,cliente.cli_endereco ||', ' ||cliente.cli_bairro || '. ' || cliente.cli_cidade || '-' || cliente.cli_estado as endereco,\n" +
            "cliente.cli_telefone,cliente.cli_cep,cliente.cli_cnpj_cpf,cliente.cli_inscricao_est,to_char(sum(((item.item_valor * item.item_quantidade))*cliente.cli_frete)/100,'R$999G990D99')  as frete ,\n" +
            "produto.pro_id,item.item_quantidade,produto.pro_nome || ' - ' || produto.pro_peso|| ' Kg' as produto,to_char(item.item_valor,'R$999G990D99') as item_valor,\n" +
            "to_char((item.item_valor * item.item_quantidade) ,'R$999G990D99') as total_parcial ,to_char(sum((item.item_valor - produto.pro_saida)*item.item_quantidade),'L9G999G90D99')  as lucro ,\n" +
            "pedido.ped_pagamento,pedido.ped_pedido,pedido.ped_status,to_char(pedido.ped_data,'dd/mm/yyyy') as data,\n" +
            "to_char(sum(item.item_valor * item.item_quantidade),'R$999G990D99')  as total\n" +

=======
>>>>>>> ede404529825867332d8133b2eadfffa912e2bee
        String caminho = "c:\\siroc\\pedidofinal.jrxml";
        
        String consulta = "select cliente.nome,\n" +
            "cliente.endereco ||', ' ||cliente.bairro || '. ' || cliente.cidade || '-' || cliente.estado as endereco,\n" +
            "cliente.telefone,\n" +
            "cliente.cep,\n" +
            "cliente.cnpj_cpf,\n" +
            "cliente.inscricao_est,\n" +
            "to_char(sum(((item.valor_alterado * item.quantidade))*cliente.frete)/100,'R$999G990D99')  as frete ,\n" +
            "produto.id,\n" +
            "item.quantidade,\n" +
            "produto.nome || ' - ' || produto.peso|| ' Kg' as produto,\n" +
            "to_char(item.valor_alterado,'R$999G990D99') as item_valor,\n" +
            "to_char((item.valor_alterado * item.quantidade) ,'R$999G990D99') as total_parcial ,\n" +
            "to_char(sum((item.valor_alterado - produto.valor_saida)*item.quantidade),'L9G999G90D99')  as lucro ,\n" +
            "pedido.tipo_pagamento,\n" +
            "pedido.tipo_pedido,\n" +
            "pedido.status,\n" +
            "to_char(pedido.data,'dd/mm/yyyy') as data,\n" +
            "to_char(sum(item.valor_alterado * item.quantidade),'R$999G990D99')  as total\n" +
<<<<<<< HEAD

=======
>>>>>>> ede404529825867332d8133b2eadfffa912e2bee
            "FROM Pedido pedido \n" +
            "INNER JOIN pedido.cliente as cliente \n" +
            "INNER JOIN pedido.itens as item \n" +
            "INNER JOIN item.produto as produto \n" +
            "INNER JOIN produto.fornecedor as fornecedor\n" +
<<<<<<< HEAD
            "where pedidos.ped_id =: id\n" +
            "group by clientes.cli_nome,clientes.cli_endereco,clientes.cli_bairro,clientes.cli_cidade,clientes.cli_estado,clientes.cli_telefone,\n" +
            "clientes.cli_cep,clientes.cli_cnpj_cpf,clientes.cli_inscricao_est,clientes.cli_frete,produtos.pro_id,itens.item_quantidade,itens.item_valor,pedidos.ped_pagamento,\n" +
            "pedidos.ped_pedido,pedidos.ped_status,pedidos.ped_data";
        System.out.println(consulta);
        Query query = session.createQuery(consulta);
        query.setParameter("id", id);
        //PreparedStatement pstmt = this.session.prepareStatement(query);
        //ResultSet rs = pstmt.executeQuery();
        JRResultSetDataSource jrRS = new JRResultSetDataSource((ResultSet) query);
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, null, jrRS);
        JasperViewer.viewReport(impressao);
        //JasperPrintManager.printPage(impressao, 0, true);
=======
            "where pedido.id ="+id+"\n" +
            "group by cliente.nome,cliente.endereco,cliente.bairro,cliente.cidade,cliente.estado,cliente.telefone,\n" +
            "cliente.cep,cliente.cnpj_cpf,cliente.inscricao_est,cliente.frete,produto.id,item.quantidade,item.valor_alterado,pedido.tipo_pagamento,\n" +
            "pedido.tipo_pedido,pedido.status,pedido.data";
            
>>>>>>> ede404529825867332d8133b2eadfffa912e2bee
            list = pdao.buscaPedido(consulta);
            
            JasperReport pathjrxml = JasperCompileManager.compileReport(caminho);
            JasperPrint printReport = JasperFillManager.fillReport(pathjrxml, null, new JRBeanCollectionDataSource(list));
            JasperExportManager.exportReportToPdfFile(printReport, "c:/reportex.pdf");      
<<<<<<< HEAD

=======
>>>>>>> ede404529825867332d8133b2eadfffa912e2bee
    }

    public static void main(String[] args) throws JRException, SQLException {
        Relatorio jr = new Relatorio(new Long(35));
        jr.gerar(35);
    }

}
