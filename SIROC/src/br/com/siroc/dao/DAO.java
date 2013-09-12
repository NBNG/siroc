package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAO<T> {

    private final Class<T> classe;
    private Session session;

    public DAO(Class<T> class1) {
        classe = class1;
        session = new ConnectionFactory().getSession();
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
    /*
     public T buscaUmPorId(Long id) {
     EntityManager em = new JPAUtil().getEntityManager();
     T result = null;

     CriteriaBuilder cb = em.getCriteriaBuilder();
     CriteriaQuery<T> c = cb.createQuery(classe);
     Root<T> a = c.from(classe);
     c.select(a);

     // Criando um predicate
     Predicate predicate = cb.equal(a.get("id"), id);

     // ASSOCIANDO O PREDICATE A CONSULTA
     c.where(predicate);

     Query query = em.createQuery(c);

     result = (T) query.getSingleResult();

     return result;
     }

     public int contaTodos() {
     EntityManager em = new JPAUtil().getEntityManager();
     CriteriaBuilder cb = em.getCriteriaBuilder();
		
     CriteriaQuery<Long> criteria = cb.createQuery( Long.class );
		
     Root<T> a = criteria.from(classe);
		
     criteria.multiselect( cb.count(a) ) ;
		
     Long count = em.createQuery( criteria ).getSingleResult();
		
		
     return Integer.valueOf((int) count.longValue());
     }

     public List<T> listaTodosPaginada(int inicio, int quantidade) {
     EntityManager em = new JPAUtil().getEntityManager();
		
     CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		
     query.select(query.from(classe));
		
     List<T> listaT = em.createQuery(query).setMaxResults(quantidade).setFirstResult(inicio).getResultList();

     em.close();
		
     return listaT;
     }
	
     public T buscaPorLogin(String login){
     EntityManager em = new JPAUtil().getEntityManager();
		
     String jpql = "select usuario from USUARIO usuario where usuario.login like :login";
		
     return (T) em.createQuery(jpql).setParameter("login", login+"%").getSingleResult();
     }
     */
}
