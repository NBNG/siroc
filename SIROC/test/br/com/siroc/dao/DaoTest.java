package br.com.siroc.dao;

import br.com.siroc.modelo.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;

public class DaoTest {
    
    @Test
    public void testaPesquisaNome(){
        
        DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
        
        assertEquals("Lucas Garofolo Lopes", dao.busca((long) 3).getNome());
    }
    
 
}
