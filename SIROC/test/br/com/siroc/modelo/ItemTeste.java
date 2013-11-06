/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.modelo;

import br.com.siroc.builder.ItemBuilder;
import org.junit.Test;

/**
 *
 * @author Administrador
 */
public class ItemTeste {

    @Test(expected = NullPointerException.class)
    public void testaProduto() {
        Produto produto = new Produto();
        produto.setNome("Lucas");
        //produto.setId(Long.MIN_VALUE);
        new ItemBuilder().setProduto(produto);
    }

    @Test(expected = NullPointerException.class)
    public void testaQuantidadeNula() {
        new ItemBuilder().setQuantidade(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaQuantidadeComString() {
        new ItemBuilder().setQuantidade("");
    }
}
