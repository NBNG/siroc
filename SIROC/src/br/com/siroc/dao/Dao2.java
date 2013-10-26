package br.com.siroc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class Dao2<T> {
    /*
     private final Session session; 
     private final Class classe;

     public Dao(Session session, Class classe) {
     this.session = session;
     this.classe = classe;
     }

     protected Session getSession() {
     return session;
     }

     public void adiciona(T objeto) {
     session.save(objeto);
     }

     public void atualiza(T objeto) {
     session.saveOrUpdate(objeto);
     }
        

     public void remove(T objeto) {
     session.delete(objeto);
     }

     public T busca(Long id) {
     return (T) session.load(classe, id);
     }

     public List<T> listaTudo() {
     return session.createCriteria(classe).list();
     }

     public List<T> listaTudo(String campo, String ordem) {
     if (ordem.equals("ASC"))
     return session.createCriteria(classe).addOrder(Order.asc(campo)).list();
     else if(ordem.equals("DESC"))
     return session.createCriteria(classe).addOrder(Order.desc(campo)).list();
     else
     return session.createCriteria(classe).list();
     }
     */
}
