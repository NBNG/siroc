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
    public void testaConsulta(){
        PedidoDAO dao = new PedidoDAO();
        
        String consulta = "SELECT pedido FROM Pedido pedido "
                + "INNER JOIN pedido.cliente as cliente "
                + "INNER JOIN pedido.itens as item "
                + "INNER JOIN item.produto as produto "
                + "INNER JOIN produto.fornecedor as fornecedor"; // WHERE cliente.id = 10";
        
        for(Pedido pedido : dao.buscaAvançada(consulta)){
            System.out.println(pedido.getId());
        }
    }
}
