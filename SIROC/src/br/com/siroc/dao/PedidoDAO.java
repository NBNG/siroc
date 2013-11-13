/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.dao;

import br.com.siroc.fabrica.ConnectionFactory;
import br.com.siroc.modelo.Cliente;
import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Pedido;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

/**
 *
 * @author Administrador
 */
public class PedidoDAO {

    private Session session;

    public PedidoDAO() {
        session = new ConnectionFactory().getSession();
    }

    public List<Pedido> buscaAvançada(Cliente cliente, Fornecedor fornecedor) //, Date dataInicial, Date dataFinal,
            //Double valorInicial,Double valorFinal, String estado, String cidade, String status,
            /*String tipoPagamento, String tipoPedido)*/ {
        
        List<Pedido> listPedidos = new ArrayList<Pedido>();
        
        String consulta = "FROM Pedido WHERE 1=1 ";


        Query query = session.createQuery(consulta);
        //ifs testando se tem valores no parametros
        //query.setParameter("Cliente", cliente);
        //query.setParameter("Fornecedor", fornecedor );

        listPedidos = query.list();
        for (Pedido pedido : listPedidos) {
            System.out.println(pedido.getId());
        }
        query.list();

        return null;
    }
    
   
}
