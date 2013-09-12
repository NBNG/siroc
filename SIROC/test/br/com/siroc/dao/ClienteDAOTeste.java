package br.com.siroc.dao;

import org.junit.Test;
import static org.junit.Assert.*;
public class ClienteDAOTeste {

    @Test
    public void buscaPorCNPJ(){
        ClienteDAO dao = new ClienteDAO();
        
        assertEquals("Lucas Garofolo Lopes", dao.buscaPorCNPJ("12.123.123/0001-00").getNome());
    }
    
    @Test
    public void buscaPorNome(){
        ClienteDAO dao = new ClienteDAO();
        
        assertEquals("Lucas Garofolo Lopes", dao.buscaPorNome("Garofolo").getNome());
    }
}
