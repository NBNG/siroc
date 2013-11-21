/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import br.com.siroc.modelo.Cliente;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Pedido;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Administrador
 */
public class PedidoDAO {

    private Session session;

    public PedidoDAO() {
        session = new ConnectionFactory().getSession();
    }

    public List<Pedido> buscaAvançada(Cliente cliente, Fornecedor fornecedor, Date dataInicial, Date dataFinal,
            Double valorInicial, Double valorFinal, String estado, String cidade, String status,
            String tipoPagamento, String tipoPedido, String consulta) {

        System.out.println(consulta);
        if (cliente != null) {
            
        }
        if (fornecedor != null) {

        }
        if (dataInicial != null && dataFinal != null) {

        }
        if (valorInicial != null && valorFinal != null) {

        }
        if (estado != null) {

        }
        if (cidade != null) {

        }
        if (status != null) {

        }
        if (tipoPagamento != null) {

        }
        if (tipoPedido != null) {

        }
        return null;
    }
    
    public List<Object[]> buscaAvançada(String consulta) {
       
//        Query query = session.createQuery(consulta);
//        List<Object> list = (List<Object>) session.createQuery(consulta);
        
        return (List<Object[]>) session.createQuery(consulta).list();
    }

}
