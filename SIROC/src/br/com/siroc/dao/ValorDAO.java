/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import br.com.siroc.modelo.Valores;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author matteus
 */
public class ValorDAO {

    private Session session;

    public ValorDAO() {
        session = new ConnectionFactory().getSessionFactory().openSession();
    }

    public List<Valores> buscaPorNome(String id) {
        Transaction tx = session.beginTransaction();

        List<Valores> valores = new ArrayList<>();
        valores = (List) session.createCriteria(Valores.class).
                add(Restrictions.ilike("estado", "%" + id + "%")).list();

        tx.commit();

        return valores;
    }
}
