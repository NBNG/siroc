package br.com.siroc.modelo;

import br.com.siroc.builder.ClienteBuilder;
import br.com.siroc.controle.ClienteControle;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTeste {

    @Test(expected=IllegalArgumentException.class)
    public void testaEmail(){
        new ClienteBuilder().setEmail("lucas.fioda@gma");
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testaNome(){
        new ClienteBuilder().setNome("Lucas Garofolo 1321321");
    }
   
    @Test(expected=IllegalArgumentException.class)
    public void testaCidade(){
        new ClienteBuilder().setNome("Lavrinhas 138281");
    }
    
}
