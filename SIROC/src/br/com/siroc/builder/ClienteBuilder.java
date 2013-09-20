/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.builder;

import br.com.siroc.modelo.Cliente;
import javax.swing.JOptionPane;

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
    private String cnpj;
    private Double frete;
    private int count;

    public ClienteBuilder() {
        count = 0;
    }

    public ClienteBuilder setBairro(String bairro) {
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
        return this;
    }

    public ClienteBuilder setCidade(String cidade) {
        if(!temNumeros(cidade)) {
            new JOptionPane.showMessageDialog(null,"Cidade com números");
        }
            
        
        this.cidade = cidade;
        return this;
    }

    public ClienteBuilder setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public ClienteBuilder setContato(String contato) {
        this.contato = contato;
        return this;
    }

    public ClienteBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public ClienteBuilder setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public ClienteBuilder setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public ClienteBuilder setFrete(Double frete) {
        this.frete = frete;
        return this;
    }

    public ClienteBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public ClienteBuilder setInscricao_est(String inscricao_est) {
        this.inscricao_est = inscricao_est;
        return this;
    }

    public ClienteBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ClienteBuilder setTelefone(String telefone) {
        this.telefone = telefone;
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
