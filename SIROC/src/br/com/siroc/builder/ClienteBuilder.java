/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.builder;

import br.com.siroc.modelo.Cliente;
import br.com.siroc.modelo.Pedido;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class ClienteBuilder {

    private Long id;
    private String nome;
    private String inscricao_est;
    private String celular;
    private String telefone;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String contato;
    private String email;
    private String cnpj_cpf;

    private List<Pedido> pedidos;

    private int count;

    public ClienteBuilder() {
        count = 0;
    }

    public Cliente getCliente() {
        if (count < 9) {
            throw new IllegalArgumentException();
        }
        return new Cliente(id, nome, inscricao_est, celular, telefone, endereco,
                bairro, cidade, estado, cep, contato, email, cnpj_cpf, pedidos);
    }

    public ClienteBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public ClienteBuilder setBairro(String bairro) {
        if (temNumeros(bairro)) {
            throw new IllegalArgumentException();
        }
        this.bairro = bairro;
        count++;
        return this;
    }

    public ClienteBuilder setCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public ClienteBuilder setCep(String cep) {
        this.cep = cep;
        count++;
        return this;
    }

    public ClienteBuilder setCidade(String cidade) {
        if (temNumeros(cidade)) {
            throw new IllegalArgumentException();
        }
        count++;
        this.cidade = cidade;
        return this;
    }

    public ClienteBuilder setCnpj_cpf(String cnpj_cpf) {
        count++;
        this.cnpj_cpf = cnpj_cpf;
        return this;
    }

    public ClienteBuilder setContato(String contato) {
        if (temNumeros(contato)) {
            throw new IllegalArgumentException();
        }
        count++;
        this.contato = contato;
        return this;
    }

    public ClienteBuilder setEmail(String email) {
        this.email = email;
        if (this.email.equals("")) {
            this.email = null;
        } else if (!isValidEmail(this.email)) {
            throw new IllegalArgumentException();
        }
        return this;
    }

    public ClienteBuilder setEndereco(String endereco) {
        this.endereco = endereco;
        count++;
        return this;
    }

    public ClienteBuilder setEstado(String estado) {
        this.estado = estado;
        count++;
        return this;
    }

    public ClienteBuilder setInscricao_est(String inscricao_est) {
        if (!temNumeros(inscricao_est)) {
            throw new IllegalArgumentException();
        }
        this.inscricao_est = inscricao_est;
        count++;
        return this;
    }

    public ClienteBuilder setNome(String nome) {
        if (temNumeros(nome)) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        count++;
        return this;
    }

    public ClienteBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public ClienteBuilder setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
        return this;
    }

    private boolean temLetra(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean temNumeros(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
}
