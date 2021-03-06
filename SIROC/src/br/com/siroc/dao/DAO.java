package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

@SuppressWarnings("uncheked")
public class DAO<T> {

    private final Class<T> classe;
    private Session session;

    public DAO(Class<T> class1) {
        classe = class1;
        session = new ConnectionFactory().getSessionFactory().openSession();
    }

    public void adicionar(T t) {

        Transaction tx = session.beginTransaction();
        session.save(t);
        tx.commit();

    }

    public void atualiza(T t) {
        Transaction tx = session.beginTransaction();
        session.update(t);
        tx.commit();
    }

    public void remover(T t) {
        Transaction tx = session.beginTransaction();
        session.delete(t);
        tx.commit();
    }

    public List<T> listaTodos() {
        return this.session.createCriteria(classe).list();
    }

    public T busca(Long id) {
        return (T) session.load(classe, id);
    }

    public List<T> buscaPorNome(String nome) {
        return session.createCriteria(classe).add(Restrictions.ilike("nome", "%" + nome + "%")).list();
    }

    public void close() {
        if (session.isOpen()) {
            session.close();
        }
    }
}
