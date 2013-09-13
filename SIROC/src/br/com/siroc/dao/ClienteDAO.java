/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import br.com.siroc.modelo.Cliente;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClienteDAO {

    private Session session;

    public ClienteDAO() {
        session = new ConnectionFactory().getSession();
    }

    public Cliente buscaPorCNPJ(String cnpj) {
        Transaction tx = session.beginTransaction();

        Cliente cliente = null;

        String consulta = "FROM Cliente WHERE cli_cnpj = :cnpj";

        Query query = session.createQuery(consulta);
        query.setParameter("cnpj", cnpj);

        if (query.list().size() > 0) {
            cliente = (Cliente) query.list().get(0);
        }

        tx.commit();

        return cliente;
    }

    public Cliente buscaPorNome(String nome) {
        Transaction tx = session.beginTransaction();

        Cliente cliente = null;

        String consulta = "FROM Cliente WHERE cli_nome like '%'||:nome||'%'";

        Query query = session.createQuery(consulta);
        query.setParameter("nome", nome);

        if (query.list().size() > 0) {
            cliente = (Cliente) query.list().get(0);
        }

        tx.commit();

        return cliente;
    }
}
