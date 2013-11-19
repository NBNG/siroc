/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import br.com.siroc.modelo.Pedido;
import org.junit.Test;

/**
 *
 * @author matteus
 */
public class PedidoDAOTeste {

    @Test
    public void testaConsulta() {
        PedidoDAO dao = new PedidoDAO();
String matteus = "select pe.ped_data,c.cli_cidade,c.cli_estado,c.cli_nome,f.for_nome,(select sum(it.item_valor * it.item_quantidade) \n" +
"from pedidos as pe inner join clientes as c on pe.fk_cliente = c.cli_id inner join itens as it on it.fk_pedido = pe.ped_id inner join produtos as p on \n" +
"it.fk_produto = p.pro_id inner join fornecedores as f on p.fk_fornecedor = f.for_id where f.for_nome ilike '%padaria%'AND\n" +
"c.cli_nome ilike '%ronaldo%' AND pe.ped_data between '2013-11-01' AND '2013-11-30' AND c.cli_estado ilike 'sp' AND\n" +
"c.cli_cidade ilike 'cruzeiro' AND pe.ped_status ilike 'pago' AND pe.ped_pagamento ilike 'cartão' AND pe.ped_pedido = 'SO') as total,\n" +
"((select sum(it.item_valor * it.item_quantidade) from pedidos as pe inner join clientes as c on pe.fk_cliente = c.cli_id\n" +
"inner join itens as it on it.fk_pedido = pe.ped_id inner join produtos as p on it.fk_produto = p.pro_id inner join fornecedores as f on \n" +
"p.fk_fornecedor = f.for_id where f.for_nome ilike '%padaria%'AND c.cli_nome ilike '%ronaldo%' AND pe.ped_data between '2013-11-01' AND '2013-11-30' \n" +
"AND c.cli_estado ilike 'sp' AND c.cli_cidade ilike 'cruzeiro' AND pe.ped_status ilike 'pago' AND pe.ped_pagamento ilike 'cartão' AND \n" +
"pe.ped_pedido = 'SO')*c.cli_frete)/100 as frete,pe.ped_pagamento,pe.ped_pedido,pe.ped_status from pedidos pe inner join \n" +
"clientes as c on pe.fk_cliente = c.cli_id inner join itens as it on it.fk_pedido = pe.ped_id inner join produtos as p on it.fk_produto = p.pro_id \n" +
"inner join fornecedores as f on p.fk_fornecedor = f.for_id where f.for_nome ilike '%padaria%' AND c.cli_nome ilike '%ronaldo%' AND\n" +
"pe.ped_data between '2013-11-01' AND '2013-11-30' AND (select sum(it.item_valor * it.item_quantidade) from pedidos as pe\n" +
"inner join clientes as c on pe.fk_cliente = c.cli_id inner join itens as it on it.fk_pedido = pe.ped_id inner join produtos as p on\n" +
" it.fk_produto = p.pro_id inner join fornecedores as f on p.fk_fornecedor = f.for_id where f.for_nome ilike '%padaria%'AND\n" +
"c.cli_nome ilike '%ronaldo%' AND pe.ped_data between '2013-11-01' AND '2013-11-30' AND c.cli_estado ilike 'sp' AND\n" +
"c.cli_cidade ilike 'cruzeiro' AND pe.ped_status ilike 'pago' AND pe.ped_pagamento ilike 'cartão' AND pe.ped_pedido = 'SO')  between 1 and 1000 AND\n" +
"c.cli_estado ilike 'sp' AND c.cli_cidade ilike 'cruzeiro' AND pe.ped_status ilike 'pago' AND pe.ped_pagamento ilike 'cartão' AND pe.ped_pedido = 'SO'";
        System.out.println(matteus);
        String consulta = "SELECT pedido FROM Pedido pedido "
                + "INNER JOIN pedido.cliente as cliente "
                + "INNER JOIN pedido.itens as item "
                + "INNER JOIN item.produto as produto "
                + "INNER JOIN produto.fornecedor as fornecedor WHERE cliente.id = 10";

        for (Pedido pedido : dao.buscaAvançada(consulta)) {
            System.out.println(pedido.getId());
        }
    }
}
