/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author matteus seu rabão
 */
@Entity
@Table(name = "PEDIDOS")
@org.hibernate.annotations.Entity(dynamicInsert = true)
public class Pedido {

    private Long id;
    private Date data;
    private String tipo_pagamento;
    private String tipo_pedido;
    private String status;
    private Cliente cliente;
    private List<Item> itens;
    private Double valorTotal;

    public Pedido(Long id, Date data, String tipo_pagamento, String tipo_pedido, String status, Cliente cliente, List<Item> itens) {
        this.id = id;
        this.data = data;
        this.tipo_pagamento = tipo_pagamento;
        this.tipo_pedido = tipo_pedido;
        this.status = status;
        this.cliente = cliente;
        this.itens = itens;
    }

    public Pedido() {

    }

    @Id
    @GeneratedValue
    @Column(name = "ped_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "ped_data", columnDefinition = "date default current_date", nullable = true)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "ped_pagamento", nullable = false)
    public String getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    @Column(name = "ped_pedido", nullable = false)
    public String getTipo_pedido() {
        return tipo_pedido;
    }

    public void setTipo_pedido(String tipo_pedido) {
        this.tipo_pedido = tipo_pedido;
    }

    @Column(name = "ped_status", nullable = true)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "fk_cliente", nullable = false)
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Transient
    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
