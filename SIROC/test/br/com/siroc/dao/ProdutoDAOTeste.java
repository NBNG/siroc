/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Produto;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class ProdutoDAOTeste {
    
    @Test
    public void testaBuscaPorNome(){
        DAO<Fornecedor> dao = new DAO<Fornecedor>(Fornecedor.class);
        
        assertEquals(dao.buscaPorNome("OPAOPA").get(0).getProdutos().get(0).getNome(),"Alpiste TOTOSO");
    }
    
    @Test
    public void testaBuscaProdutoPorFornecedor(){
        FornecedorDAO dao = new FornecedorDAO();
        
        assertEquals(dao.buscaPorNome("OPAOPA").get(0).getProdutos().get(0).getNome(),"Alpiste TOTOSO");
    }
    
}
