/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.builder;

import br.com.siroc.modelo.Fornecedor;
import br.com.siroc.modelo.Produto;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class FornecedorBuilder {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Double frete;
    private List<Produto> produtos;
    int count;

    public FornecedorBuilder() {
        count = 0;
    }

    public FornecedorBuilder setEmail(String email) {
        this.email = email;
        if (this.email.equals("")) {
            throw new NullPointerException();
        } else if (!isValidEmail(this.email)) {
            throw new IllegalArgumentException();
        }
        count++;
        return this;
    }

    public FornecedorBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public FornecedorBuilder setNome(String nome) {
        if (nome.equals("")) {
            throw new NullPointerException();
        }
        this.nome = nome;
        count++;
        return this;
    }

    public FornecedorBuilder setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
        return this;
    }

    public FornecedorBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        count++;
        return this;
    }

    public FornecedorBuilder setFrete(String frete) {
        if (frete.equals("")) {
            this.frete = 0.;
        } else {
            this.frete = Double.parseDouble(frete.replace(",", "."));;
        }
        return this;
    }

    public Fornecedor getFornecedor() {
        if (count < 3) {
            throw new IllegalArgumentException();
        }

        return new Fornecedor(id, nome, telefone, email, frete, produtos);
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
}
