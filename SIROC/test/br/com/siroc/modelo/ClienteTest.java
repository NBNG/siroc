package br.com.siroc.modelo;

import br.com.siroc.dao.ClienteDAO;

public class ClienteTest {

	public static void main(String args[]) {
		Cliente cliente = criaCliente();
		
		new ClienteDAO.adicionar(cliente);
	}

	private static Cliente criaCliente() {
		Cliente cliente = new Cliente();
		cliente.setNome("Luquinhas");
		return cliente;
	}

}
