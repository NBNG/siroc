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

    @Test(expected = IllegalArgumentException.class)
    public void testaQuantidadeNula() {
        new ItemBuilder().setQuantidade("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaQuantidadeComString() {
        new ItemBuilder().setQuantidade("asd21a2");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testaQuantidadecom0(){
        new ItemBuilder().setQuantidade("0");
    }
    
    //@Test(expected = IllegalArgumentException.class)
    @Test
    public void testaQuantidadeCerto(){
        new ItemBuilder().setQuantidade("1");
    }
    
    
    public void testaValorNulo(){
        new ItemBuilder().setValor_alterado("", 2.5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testaValorComCaracter(){
        new ItemBuilder().setValor_alterado("1as1", 2.5);
    }
    
    
}
