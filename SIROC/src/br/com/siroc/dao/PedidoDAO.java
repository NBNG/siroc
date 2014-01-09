/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Administrador
 */
public class PedidoDAO {

    private Session session;

    public PedidoDAO() {
        session = new ConnectionFactory().getSessionFactory().openSession();
    }

    public List<Object[]> buscaAvançada(String consulta) {

//        Query query = session.createQuery(consulta);
//        List<Object> list = (List<Object>) session.createQuery(consulta);
        return (List<Object[]>) session.createQuery(consulta).list();
    }

    public List<Object[]> buscaPedido(String consulta) {
        return (List<Object[]>) session.createQuery(consulta).list();
    }

    public void close() {
        if (session.isOpen())
            session.close();
    }
}
