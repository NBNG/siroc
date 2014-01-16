/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import br.com.siroc.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author MyPenis
 */
public class ProdutoDAO {

    private Session session;

    public ProdutoDAO() {
        session = new ConnectionFactory().getSessionFactory().openSession();
    }

    public List<Produto> buscaPorNome(String nome) {
        Transaction tx = session.beginTransaction();

        List<Produto> produtos = new ArrayList<>();

        produtos = (List) session.createCriteria(Produto.class).
                add(Restrictions.ilike("nome", "%" + nome + "%")).list();

        tx.commit();

        return produtos;
    }

    public List<Object[]> buscaAvançada(String consulta) {
        return (List<Object[]>) session.createQuery(consulta).list();
    }

    public void close() {
        if (session.isOpen()) {
            session.close();
        }
    }
}
