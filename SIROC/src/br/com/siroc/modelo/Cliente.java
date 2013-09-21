package br.com.siroc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Index;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
    
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
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String inscricao_est, String celular, String telefone, 
            String endereco, String bairro, String cidade, String estado, String cep, String contato, String email, String cnpj, Double frete){
        this.nome = nome;
        this.inscricao_est = inscricao_est;
        this.celular = celular;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.contato = contato;
        this.email = email;
        this.cnpj = cnpj;
        this.frete = frete;
    }
    
    @Id
    @GeneratedValue
    @Column(name = "cli_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "cli_nome", nullable = false, length = 150)
    @Index(name = "sk_nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "cli_endereco", nullable = false, length = 80)
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Column(name = "cli_inscricao_est", nullable = false, length = 20, unique = true)
    public String getInscricao_est() {
        return inscricao_est;
    }

    public void setInscricao_est(String inscricao_est) {
        this.inscricao_est = inscricao_est;
    }

    @Column(name = "cli_celular", nullable = true, length = 15)
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Column(name = "cli_telefone", nullable = true, length = 14)
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Column(name = "cli_bairro", nullable = false, length = 30)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Column(name = "cli_cidade", nullable = false, length = 30)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Column(name = "cli_estado", nullable = false, length = 2)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "cli_cep", nullable = false, length = 9)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Column(name = "cli_contato")
    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Column(name = "cli_email", nullable = true, length = 50, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "cli_cnpj", nullable = false, length = 20, unique = true)
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Column(name = "cli_frete", nullable = true)
    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }
}
