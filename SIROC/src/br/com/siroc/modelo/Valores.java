/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siroc.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author matteus
 */
@Entity
@Table(name = "Valores")
public class Valores implements Serializable {

    private String estado;
    private Double porcentagem;

    public Valores() {
    }

    public Valores(String estado, Double porcentagem) {
        this.estado = estado;
        this.porcentagem = porcentagem;
    }

    @Id
    @Column(name = "val_estado", length = 2, nullable = false)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "val_porcentagem", nullable = false)
    public Double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

}
