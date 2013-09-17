/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.modelo;

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

/**
 *
 * @author Proclima
 */
@Entity
@Table(name = "PRODUTOS")
public class Produto {

    private Long id;
    private String nome;
    private Double quantidade;
    private Double valor_saida;
    private Double valor_entrada;
    private Fornecedor fornecedor;

    @Id
    @GeneratedValue
    @Column(name = "pro_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "pro_nome", length = 50, nullable = false)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "pro_quantidade")
    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    @Column(name = "pro_saida")
    public Double getValor_saida() {
        return valor_saida;
    }

    public void setValor_saida(Double valor_saida) {
        this.valor_saida = valor_saida;
    }

    @Column(name = "pro_entrada")
    public Double getValor_entrada() {
        return valor_entrada;
    }

    public void setValor_entrada(Double valor_entrada) {
        this.valor_entrada = valor_entrada;
    }

    @ManyToOne
    @JoinColumn(name = "fk_fornecedor", nullable = false)
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
