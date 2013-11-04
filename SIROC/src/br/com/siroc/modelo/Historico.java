/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.modelo;

import java.util.Date;
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
import javax.persistence.Temporal;

/**
 *
 * @author matteus
 */
@Entity
@Table(name = "HISTORICO")
@org.hibernate.annotations.Entity(dynamicInsert = true)
public class Historico {

    @Id
    @GeneratedValue
    @Column(name = "his_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "his_data", columnDefinition = "date default current_date", nullable = false)
    public Date getData_mudanca() {
        return data_mudanca;
    }

    public void setData_mudanca(Date data_mudanca) {
        this.data_mudanca = data_mudanca;
    }

    @Column(name = "his_valor_antigo", nullable = false)
    public Double getValor_antigo() {
        return valor_antigo;
    }

    public void setValor_antigo(Double valor_antigo) {
        this.valor_antigo = valor_antigo;
    }

    @Column(name = "his_valor_atualizado", nullable = false)
    public Double getValor_atualizado() {
        return valor_atualizado;
    }

    public void setValor_atualizado(Double valor_atualizado) {
        this.valor_atualizado = valor_atualizado;
    }

    @ManyToOne
    @JoinColumn(name = "fk_pedido", nullable = false)
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    private Long id;
    private Date data_mudanca;
    private Double valor_antigo;
    private Double valor_atualizado;
    private Produto produto;
}
