/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import br.com.siroc.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ClienteDAO {

    private Session session;

    public ClienteDAO() {
        session = new ConnectionFactory().getSessionFactory().openSession();
    }

    public Cliente buscaPorCNPJ(String cnpj_cpf) {

        Transaction tx = session.beginTransaction();

        Cliente cliente = null;

        String consulta = "FROM Cliente WHERE cli_cnpj_cpf = :cnpj_cpf";

        Query query = session.createQuery(consulta);
        query.setParameter("cnpj_cpf", cnpj_cpf);

        if (query.list().size() > 0) {
            cliente = (Cliente) query.list().get(0);
        }

        tx.commit();

        return cliente;
    }

    public List<Cliente> buscaPorNome(String nome) {
        Transaction tx = session.beginTransaction();

        List<Cliente> clientes = new ArrayList<Cliente>();

        clientes = (List) session.createCriteria(Cliente.class).add(Restrictions.ilike("nome", "%" + nome + "%")).list();

        tx.commit();

        return clientes;
    }

    public void close() {
        if (session.isOpen()) {
            session.close();
        }
    }

}
