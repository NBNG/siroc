package br.com.siroc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {
	
	@Id @GeneratedValue
	@Column(name="cli_id")
	private Long id;
	
	private String nome;
	private String inscricao_estadual;
	private String celular;
	private String telefone;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String contato;
	private String email;
	private String cgc;
	
	public Cliente(){
		
	}
	
	public Cliente(String nome, String inscricao_estadual, String celular,
			String telefone, String endereco, String bairro, String cidade,
			String estado, String cep, String contato, String email, String cgc) {
		super();
		this.nome = nome;
		this.inscricao_estadual = inscricao_estadual;
		this.celular = celular;
		this.telefone = telefone;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.contato = contato;
		this.email = email;
		this.cgc = cgc;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", inscricao_estadual="
				+ inscricao_estadual + ", celular=" + celular + ", telefone="
				+ telefone + ", endereco=" + endereco + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep
				+ ", contato=" + contato + ", email=" + email + ", cgc=" + cgc
				+ "]";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInscricao_estadual() {
		return inscricao_estadual;
	}
	public void setInscricao_estadual(String inscricao_estadual) {
		this.inscricao_estadual = inscricao_estadual;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCgc() {
		return cgc;
	}
	public void setCgc(String cgc) {
		this.cgc = cgc;
	}
}
