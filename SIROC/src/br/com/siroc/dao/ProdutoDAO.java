/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import br.com.siroc.modelo.Historico;
import br.com.siroc.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
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

        List<Produto> produtos = new ArrayList<Produto>();

        produtos = (List) session.createCriteria(Produto.class).add(Restrictions.ilike("nome", "%" + nome + "%")).list();

        tx.commit();

        return produtos;
    }
<<<<<<< HEAD
    
    public List listaTodos() {
        return this.session.createCriteria(Historico.class).addOrder(Order.desc("data_mudanca")).list();
    }
    
=======

>>>>>>> d0dc45909fc0af86dc92a391e1286e4574fd2f97
    public void close() {
        if (session.isOpen()) {
            session.close();
        }
    }
}
