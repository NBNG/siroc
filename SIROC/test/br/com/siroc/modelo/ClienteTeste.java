package br.com.siroc.modelo;

import br.com.siroc.dao.DAO;
import br.com.siroc.fabrica.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ClienteTeste {

    public static void main(String args[]) {
        Session session = new ConnectionFactory().getSession();

        Cliente cliente = new Cliente();
        cliente.setId((long) 1);
        cliente.setNome("Teste_Atualiza");
        cliente.setCelular("teste2");
        cliente.setTelefone("teste2");
        cliente.setInscricao_est("teste2");
        cliente.setEndereco("teste2");
        cliente.setBairro("teste2");
        cliente.setCidade("teste2");
        cliente.setEstado("xx");
        cliente.setCep("123");
        cliente.setEmail("teste2");
        cliente.setCnpj("101010");
        cliente.setFrete(2.0);
        cliente.setContato("teste2");
        DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
        dao.atualiza(cliente);
    }
}
