package br.com.siroc.modelo;

import br.com.siroc.dao.DAO;
import br.com.siroc.fabrica.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ClienteTeste {
    
    public static void main(String args[]){
        Session session = new ConnectionFactory().getSession();
        
        Cliente cliente = new Cliente();
        cliente.setNome("Luquinhas");
        cliente.setEndereco("Cruzeiro");
        
        DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
        dao.adicionar(cliente);
    }
}
