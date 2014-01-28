package br.com.siroc.modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FORNECEDORES")
public class Fornecedor {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Double frete;
    private Double porcMg;
    private Double porcSp;
    private Double porcRj;
    private List<Produto> produtos;

    public Fornecedor() {
    }

    public Fornecedor(Long id, String nome, String telefone, String email,
            Double frete, List<Produto> produtos, Double porcMg, Double porcSp,
            Double porcRj) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.frete = frete;
        this.produtos = produtos;
        this.porcMg = porcMg;
        this.porcSp = porcSp;
        this.porcRj = porcRj;
    }

    @Id
    @GeneratedValue
    @Column(name = "for_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "for_nome", nullable = false, length = 150)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "for_telefone", nullable = true, length = 14)
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Column(name = "for_email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Column(name = "for_frete", nullable = true)
    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    @Column(name = "for_porc_mg", nullable = false)
    public Double getPorcMg() {
        return porcMg;
    }

    public void setPorcMg(Double porcMg) {
        this.porcMg = porcMg;
    }

    @Column(name = "for_porc_sp", nullable = false)
    public Double getPorcSp() {
        return porcSp;
    }

    public void setPorcSp(Double porcSp) {
        this.porcSp = porcSp;
    }

    @Column(name = "for_porc_rj", nullable = false)
    public Double getPorcRj() {
        return porcRj;
    }

    public void setPorcRj(Double porcRj) {
        this.porcRj = porcRj;
    }

}
