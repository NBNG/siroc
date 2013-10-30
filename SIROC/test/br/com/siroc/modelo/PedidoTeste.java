/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.modelo;

import br.com.siroc.builder.ClienteBuilder;
import br.com.siroc.builder.PedidoBuilder;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author Administrador
 */
public class PedidoTeste {
    
    @Test(expected = NullPointerException.class)
    public void testaCliente() {
        new PedidoBuilder().setCliente(null);
    }
    
    @Test(expected = NullPointerException.class)
    public void testaItens() {
        List<Item> itens = new ArrayList();
        new PedidoBuilder().setItens(itens);
    }
}
