package br.com.siroc.fabrica;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ConnectionFactory {

    public static final SessionFactory session = buildSession();

    private static SessionFactory buildSession() {
        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.configure();
        return configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return session;
    }

    /*public Session getSession() {
     AnnotationConfiguration configuration = new AnnotationConfiguration();
     configuration.configure();

     SessionFactory factory = configuration.buildSessionFactory();
     Session session = factory.openSession();
     return session;
     }*/
}
