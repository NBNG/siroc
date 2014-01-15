package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import br.com.siroc.modelo.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class FornecedorDAO {

    private Session session;

    public FornecedorDAO() {
        session = new ConnectionFactory().getSessionFactory().openSession();
    }

    public List<Fornecedor> buscaPorNome(String nome) {
        Transaction tx = session.beginTransaction();

        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

        String consulta = "FROM Fornecedor WHERE for_nome like '%'||:nome||'%'";

        Query query = session.createQuery(consulta);
        query.setParameter("nome", nome);

        fornecedores = (List) session.createCriteria(Fornecedor.class).add(Restrictions.ilike("nome", "%" + nome + "%")).list();

        tx.commit();
        return fornecedores;
    }

    public void close() {
        if (session.isOpen()) {
            session.close();
        }
    }
}
