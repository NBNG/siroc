/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import org.junit.Test;

/**
 *
 * @author matteus
 */
public class PedidoDAOTeste {

    @Test
    public void testaConsulta() {
        PedidoDAO dao = new PedidoDAO();

        String consulta = "SELECT pedido.id,cliente.cidade,cliente.estado,cliente.nome,"
                + "fornecedor.nome,sum(item.valor_alterado*item.quantidade) as valor_total,pedido.status,"
                + "pedido.tipo_pagamento,pedido.tipo_pedido,(sum(item.valor_alterado*item.quantidade)*cliente.frete)/100 as frete "
                + "FROM Pedido pedido "
                + "INNER JOIN pedido.cliente as cliente "
                + "INNER JOIN pedido.itens as item "
                + "INNER JOIN item.produto as produto "
                + "INNER JOIN produto.fornecedor as fornecedor "
                + "WHERE lower(cliente.nome) like lower('%a%') "
                + "AND lower(fornecedor.nome) like lower('%a%') "
                + "AND pedido.data BETWEEN '2013-01-01' AND '2013-12-30' "
                + "AND lower(cliente.estado) like lower('%s%') "
                + "AND lower(cliente.cidade) like lower('%c%') "
                + "AND lower(pedido.status) like lower('%') "
                + "AND lower(pedido.tipo_pagamento) like lower('%') "
                + "AND lower(pedido.tipo_pedido) like lower('%') "
                + "GROUP BY pedido.id,cliente.cidade,cliente.estado,cliente.nome, "
                + "fornecedor.nome, cliente.frete HAVING SUM(item.valor_alterado*item.quantidade) BETWEEN 1 AND 100";
        dao.buscaAvançada(consulta);
        //for (Pedido pedido : dao.buscaAvançada(consulta)) {
        //    System.out.println(pedido.getId());
        //}
    }

}
