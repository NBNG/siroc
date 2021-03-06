package br.com.siroc.modelo;

import br.com.siroc.builder.ClienteBuilder;
import org.junit.Test;

public class ClienteTeste {

    @Test(expected = IllegalArgumentException.class)
    public void testaEmail() {
        new ClienteBuilder().setEmail("lucas.garofolo@");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaNome() {
        new ClienteBuilder().setNome("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaCidade() {
        new ClienteBuilder().setNome("809jkj0");
    }

    @Test
    public void testaFrete() {
        String frete = "";

    }

    @Test(expected = IllegalArgumentException.class)
    public void testaContato() {
        new ClienteBuilder().setNome("Lucas Garofolo 12331");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaInscricaoEstadual() {
        new ClienteBuilder().setInscricao_est("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testaTelefone() {
        new ClienteBuilder().setTelefone("(  )    -    ");
    }
}
