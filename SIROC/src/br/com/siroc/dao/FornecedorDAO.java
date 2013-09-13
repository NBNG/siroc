package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import br.com.siroc.modelo.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FornecedorDAO {
    private Session session;
    
    public FornecedorDAO(){
        session = new ConnectionFactory().getSession();
    }
    
    public List<Fornecedor> buscaPorNome(String nome){
        Transaction tx = session.beginTransaction();

        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

        String consulta = "SELECT for_nome FROM Fornecedor WHERE for_nome ilike '%'||:nome||'%'";

        Query query = session.createQuery(consulta);
        query.setParameter("nome", nome);


        fornecedores = (List) query.list();

        tx.commit();
        return fornecedores;
    }
}
