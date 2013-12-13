/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.builder;

import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Item;
import br.com.siroc.modelo.Produto;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class ProdutoBuilder {

    private Long id;
    private String nome;
    private Double peso;
    private Double valor_saida;
    private Double valor_entrada;
    private Fornecedor fornecedor;
    private List<Item> itens;
    private int count;

    public ProdutoBuilder() {
        count = 0;
    }

    public Produto getProduto() {
        if (count < 5) {
            throw new IllegalArgumentException();
        }

        return new Produto(id, nome, peso, valor_saida, valor_entrada, fornecedor, itens);
    }

    public ProdutoBuilder setFornecedor(Fornecedor fornecedor) {
        if (fornecedor == null) {
            throw new IllegalStateException();
        }
        this.fornecedor = fornecedor;
        count++;
        return this;
    }

    public ProdutoBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder setNome(String nome) {
        if (nome.equals("")) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        count++;
        return this;
    }

    public ProdutoBuilder setPeso(String peso) {
        if (!temNumeros(peso) || peso.equals("")) {
            throw new IllegalArgumentException();
        }
        this.peso = Double.parseDouble(peso.replace(",", "."));
        count++;
        return this;
    }

    public ProdutoBuilder setValor_entrada(String valor_entrada) {
        if (!temNumeros(valor_entrada)) {
            throw new IllegalArgumentException();
        }

        if (valor_entrada.equals("")) {
            this.valor_entrada = 0.;
        } else {
            this.valor_entrada = Double.parseDouble(valor_entrada.replace(",", "."));
        };

        count++;
        return this;
    }

    public ProdutoBuilder setValor_saida(String valor_saida) {
        if (!temNumeros(valor_saida)) {
            throw new IllegalArgumentException();
        }
        if (valor_saida.equals("")) {
            this.valor_saida = 0.;
        } else {
            this.valor_saida = Double.parseDouble(valor_saida.replace(",", "."));;
        }
        count++;
        return this;
    }

    public ProdutoBuilder setItens(List<Item> itens) {
        this.itens = itens;
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

    private boolean temLetra(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
