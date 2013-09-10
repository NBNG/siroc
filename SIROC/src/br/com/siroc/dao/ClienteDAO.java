package br.com.siroc.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.siroc.infra.CriadorDeSession;
import br.com.siroc.modelo.Cliente;

public class ClienteDAO {
	
	private final Session session;
	
	public ClienteDAO(){
		this.session = CriadorDeSession.getSession();
	}
	
	public void adicionar(Cliente cliente) {
		Transaction tx = session.beginTransaction();
		session.save(cliente);
		tx.commit();
	}

}
