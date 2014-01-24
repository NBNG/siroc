/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.builder;

import br.com.siroc.modelo.Item;
import br.com.siroc.modelo.Pedido;
import br.com.siroc.modelo.Produto;

/**
 *
 * @author Administrador
 */
public class ItemBuilder {

    private Long id;
    private Produto produto;
    private Pedido pedido;
    private Integer quantidade;
    private Double valor_alterado;
    int count;

    public ItemBuilder() {
        count = 0;
    }

    public Item getItem() {
        if (count < 2) {
            throw new IllegalStateException();
        }

        return new Item(id, produto, pedido, quantidade, valor_alterado);
    }

    public ItemBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public ItemBuilder setPedido(Pedido pedido) {
        this.pedido = pedido;
        return this;
    }

    public ItemBuilder setProduto(Produto produto) {
        if (produto.getId() == null) {
            throw new NullPointerException();
        }

        this.produto = produto;
        count++;
        return this;
    }

    public ItemBuilder setQuantidade(String quantidade) {
        
        if (quantidade.equals("")) {
            throw new IllegalArgumentException();
        }

        if (Integer.parseInt(quantidade) < 1){
            throw new IllegalArgumentException();
        } else {
            this.quantidade = Integer.parseInt(quantidade);
        }

        count++;
        return this;
    }

    public ItemBuilder setValor_alterado(String valor_alterado) {
        if (!temNumeros(valor_alterado) && !valor_alterado.equals("")) {
            throw new IllegalArgumentException();
        }

        if (valor_alterado.equals("")) {
            this.valor_alterado = produto.getValor_saida();
        } else {
            this.valor_alterado = Double.parseDouble(valor_alterado.replace(",", "."));
        }

        return this;
    }

    private boolean temNumeros(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
