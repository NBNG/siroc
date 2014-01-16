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
        if (count < 1) {
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
        this.bairro = bairro;
        if (this.bairro.equals("")) {
            this.bairro = null;
        } 
        return this;
    }

    public ClienteBuilder setCelular(String celular) {
        this.celular = celular;
        if(this.celular.equals("(  )      -    "))
            this.celular = null;
        return this;
    }

    public ClienteBuilder setCep(String cep) {
        this.cep = cep;
        if(this.cep.equals("     -   "))
            this.cep = null;
        return this;
    }

    public ClienteBuilder setCidade(String cidade) {
        this.cidade = cidade;
        if (this.cidade.equals("")) {
            this.cidade = null;
        }
        return this;
    }

    public ClienteBuilder setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
        if(this.cnpj_cpf.equals("   .   .   -  ") || this.cnpj_cpf.equals("  .   .   /    -  "))
            this.cnpj_cpf = null;
        return this;
    }

    public ClienteBuilder setContato(String contato) {
        this.contato = contato;
        if(this.contato.equals("")){
            this.contato = null;
        }
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
        if(this.endereco.equals(""))
            this.endereco = null;
        return this;
    }

    public ClienteBuilder setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public ClienteBuilder setInscricao_est(String inscricao_est) {
        this.inscricao_est = inscricao_est;
        if(this.inscricao_est.equals(""))
            this.inscricao_est = null;
        return this;
    }

    public ClienteBuilder setNome(String nome) {
        if (nome.equals(""))
            throw new IllegalArgumentException();
        
        this.nome = nome;
        count++;
        return this;
    }

    public ClienteBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        if(this.telefone.equals("(  )     -    "))
            this.telefone = null;
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
