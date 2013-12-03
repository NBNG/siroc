/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.jasper;

import br.com.siroc.dao.PedidoDAO;
import java.util.List;

/**
 *
 * @author matteus
 */
public class Jasper {

    public static void main(String[] args) {
        String consulta = "select cliente.nome,\n" +
"cliente.endereco ||', ' ||cliente.bairro || '. ' || cliente.cidade || '-' || cliente.estado as endereco,\n" +
"cliente.telefone,\n" +
"cliente.cep,\n" +
"cliente.cnpj_cpf,\n" +
"cliente.inscricao_est,\n" +
"to_char(((select sum (item.valor_alterado * item.quantidade) from pedido pedido inner join pedido.itens as item where pedido.id = 55)*cliente.frete)/100 ,'r$999g990d99') as frete,\n" +
"clientes.cli_inscricao_est,\n" +
"produto.id,\n" +
"item.quantidade,\n" +
"produto.nome || ' - ' || produto.peso|| ' kg' as produto,\n" +
"to_char(item.valor_alterado,'r$999g990d99') as item_valor,\n" +
"to_char((item.valor_alterado * item.quantidade) ,'r$999g990d99') as total_parcial ,\n" +
"to_char((select sum((item.valor_alterado - produto.valor_saida)*item.quantidade) from pedido pedido inner join pedido.itens as item inner join item.produto as produto where pedido.id = 55),'l9g999g90d99')  as lucro,\n" +
"pedido.tipo_pagamento,\n" +
"pedido.tipo_pedido,\n" +
"pedido.status,\n" +
"to_char(pedido.data,'dd/mm/yyyy') as data,\n" +
"to_char((select sum (item.valor_alterado * item.quantidade) from pedido pedido inner join pedido.itens as item where pedido.id = 55),'l9g999g90d99')  as total\n" +
"from Pedido pedido \n" +
"inner join pedido.cliente as cliente \n" +
"inner join pedido.itens as item \n" +
"inner join item.produto as produto \n" +
"inner join produto.fornecedor as fornecedor\n" +
"where pedido.id =:id\n" +
"group by cliente.nome,cliente.endereco,cliente.bairro,cliente.cidade,cliente.estado,cliente.telefone,\n" +
"cliente.cep,cliente.cnpj_cpf,cliente.inscricao_est,cliente.frete,produto.id,item.quantidade,item.valor_alterado,pedido.tipo_pagamento,\n" +
"pedido.tipo_pedido,pedido.status,pedido.data";
        PedidoDAO pdao = new PedidoDAO();
        List<Object[]> lista = pdao.buscaPedido(consulta);

        for (int i = 0; i < lista.size(); i++) {
            Object[] resultado = lista.get(i);
            System.out.println(resultado[1]);
            System.out.println(resultado[2]);
            System.out.println(resultado[3]);
            System.out.println(resultado[4]);
            System.out.println(resultado[5]);
            System.out.println(resultado[6]);
            System.out.println(resultado[7]);
            System.out.println(resultado[8]);
            System.out.println(resultado[9]);
            System.out.println(resultado[11]);
            System.out.println(resultado[12]);
            System.out.println(resultado[13]);
            System.out.println(resultado[14]);
            System.out.println(resultado[15]);
            System.out.println(resultado[16]);
            System.out.println(resultado[17]);
        }
    }
}
