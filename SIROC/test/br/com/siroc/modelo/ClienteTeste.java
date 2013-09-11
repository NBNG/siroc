package br.com.siroc.modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ClienteTeste {
    
    public static void main(String args[]){
        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.configure();

        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        
        Cliente cliente = new Cliente();
        cliente.setNome("Luquinhas");
        
        Transaction tx = session.beginTransaction();
        session.save(cliente);
        tx.commit();
    }
}
