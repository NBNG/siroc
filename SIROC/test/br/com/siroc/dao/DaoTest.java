package br.com.siroc.dao;

import br.com.siroc.modelo.Cliente;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DaoTest {

    @Test
    public void testaPesquisaNome() {

        DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);

        assertEquals("Lucas Garofolo Lopes", dao.busca((long) 3).getNome());
    }

    @Test
    public void testaConexoes() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            DAO<Cliente> dao = new DAO<>(Cliente.class);
            dao.close();
        }
    }
}
