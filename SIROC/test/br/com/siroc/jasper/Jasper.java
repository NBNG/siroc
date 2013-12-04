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
        String consulta = "select cliente.nome,\n"
                + "cliente.endereco ||', ' ||cliente.bairro || '. ' || cliente.cidade || '-' || cliente.estado as endereco,\n"
                + "cliente.telefone,\n"
                + "cliente.cep,\n"
                + "cliente.cnpj_cpf,\n"
                + "cliente.inscricao_est,\n"
                + "to_char(((select sum (item.valor_alterado * item.quantidade) from pedido pedido inner join pedido.itens as item where pedido.id = 55)*cliente.frete)/100 ,'r$999g990d99') as frete,\n"
                + "produto.id,\n"
                + "item.quantidade,\n"
                + "produto.nome || ' - ' || produto.peso|| ' kg' as produto,\n"
                + "to_char(item.valor_alterado,'r$999g990d99') as item_valor,\n"
                + "to_char((item.valor_alterado * item.quantidade) ,'r$999g990d99') as total_parcial ,\n"
                + "to_char((select sum((item.valor_alterado - produto.valor_saida)*item.quantidade) from pedido pedido inner join pedido.itens as item inner join item.produto as produto where pedido.id = 55),'l9g999g90d99')  as lucro,\n"
                + "pedido.tipo_pagamento,\n"
                + "pedido.tipo_pedido,\n"
                + "pedido.status,\n"
                + "to_char(pedido.data,'dd/mm/yyyy') as data,\n"
                + "to_char((select sum (item.valor_alterado * item.quantidade) from pedido pedido inner join pedido.itens as item where pedido.id = 55),'l9g999g90d99')  as total\n"
                + "from Pedido pedido \n"
                + "inner join pedido.cliente as cliente \n"
                + "inner join pedido.itens as item \n"
                + "inner join item.produto as produto \n"
                + "inner join produto.fornecedor as fornecedor\n"
                + "where pedido.id =55\n"
                + "group by cliente.nome,cliente.endereco,cliente.bairro,cliente.cidade,cliente.estado,cliente.telefone,\n"
                + "cliente.cep,cliente.cnpj_cpf,cliente.inscricao_est,cliente.frete,produto.id,produto.nome,produto.peso,produto.valor_saida,item.quantidade,\n"
                + "item.valor_alterado,pedido.tipo_pagamento,pedido.tipo_pedido,pedido.status,pedido.data,pedido.id";
        System.out.println(consulta);
        PedidoDAO pdao = new PedidoDAO();
        List<Object[]> lista = pdao.buscaPedido(consulta);

        for (int i = 0; i < lista.size(); i++) {
            Object[] resultado = lista.get(i);

        }
    }
}
