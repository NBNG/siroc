/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.modelo;

/**
 *
 * @author matteus
 */
public class Itens_Pedido {

    private Long id;
    private Produto produto;
    private Pedido pedido;
    private Integer quantidade;
    private Double valor_alterado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor_alterado() {
        return valor_alterado;
    }

    public void setValor_alterado(Double valor_alterado) {
        this.valor_alterado = valor_alterado;
    }
}
