/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.modelo;

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

/**
 *
 * @author Proclima
 */
@Entity
@Table(name = "PRODUTOS")
public class Produto {

    private Long id;
    private String nome;
    private Double peso;
    private Double valor_saida;
    private Double valor_entrada;
    private Fornecedor fornecedor;
    private List<Item> itens;
    private List<Historico> historico;

    public Produto() {
    }

    public Produto(Long id, String nome, Double peso, Double valor_saida, Double valor_entrada, Fornecedor fornecedor, List<Item> itens) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.valor_saida = valor_saida;
        this.valor_entrada = valor_entrada;
        this.fornecedor = fornecedor;
    }

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

    @Column(name = "pro_peso")
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
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

    @OneToMany(mappedBy = "produto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    /*@OneToMany(mappedBy = "historico", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<Historico> getHistorico() {
        return historico;
    }*/

    public void setHistorico(List<Historico> historico) {
        this.historico = historico;
    }
}
