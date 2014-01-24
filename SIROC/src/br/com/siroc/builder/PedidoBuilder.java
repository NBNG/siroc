/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.builder;

import br.com.siroc.modelo.Cliente;
import br.com.siroc.modelo.Item;
import br.com.siroc.modelo.Pedido;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class PedidoBuilder {

    private Long id;
    private Date data;
    private Date vencimento;
    private String tipo_pagamento;
    private String tipo_pedido;
    private Double obs;
    private String status;
    private Cliente cliente;
    private List<Item> itens;
    private int count;

    public PedidoBuilder() {
        count = 0;
    }

    public Pedido getPedido() {
        if (count < 2) {
            throw new IllegalStateException();
        }

        return new Pedido(id, data, tipo_pagamento, tipo_pedido, status, cliente, itens, vencimento, obs);
    }

    public PedidoBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public PedidoBuilder setCliente(Cliente cliente) {
        if (cliente.getId() == null) {
            throw new NullPointerException();
        }
        this.cliente = cliente;
        count++;
        return this;
    }

    public PedidoBuilder setData(Date data) {
        this.data = data;
        return this;
    }

    public PedidoBuilder setVencimento(Date vencimento) {
        this.vencimento = vencimento;
        return this;
    }

    public PedidoBuilder setItens(List<Item> itens) {
        if (itens.isEmpty()) {
            throw new NullPointerException();
        }
        this.itens = itens;
        count++;
        return this;
    }

    public PedidoBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public PedidoBuilder setObs(Double obs) {
        this.obs = obs;
        return this;
    }

    public PedidoBuilder setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
        return this;
    }

    public PedidoBuilder setTipo_pedido(String tipo_pedido) {
        this.tipo_pedido = tipo_pedido;
        return this;
    }

}
