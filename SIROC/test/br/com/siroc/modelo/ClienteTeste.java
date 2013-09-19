package br.com.siroc.modelo;

import br.com.siroc.controle.ClienteControle;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTeste {

    @Test
    public void testaEmail(){
        Cliente cliente = new Cliente();
        cliente.setEmail("lucas.fioda@gmail.com");
        org.junit.Assert.assertTrue(new ClienteControle().adicionar(cliente));
    }
    
    @Test
    public void testaNome(){
        
    }
}
