/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author matteus bibola
 */


@Entity
@Table(name="ITEM")
public class Item {

    private Long id;
    private Produto produto;
    private Pedido pedido;
    private Integer quantidade;
    private Double valor_alterado;
    
    @Id
    @GeneratedValue
    @Column(name="item_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @ManyToOne
    @JoinColumn(name = "fk_produto", nullable=false)
    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @ManyToOne
    @JoinColumn(name = "fk_pedido", nullable = false)
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    @Column(name="item_quantidade", nullable = false)
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    @Column(name="item_valor", nullable = false)
    public Double getValor_alterado() {
        return valor_alterado;
    }

    public void setValor_alterado(Double valor_alterado) {
        this.valor_alterado = valor_alterado;
    }
}
