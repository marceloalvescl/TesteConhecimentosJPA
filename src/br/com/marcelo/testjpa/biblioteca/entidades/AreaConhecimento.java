package br.com.marcelo.testjpa.biblioteca.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.UniqueConstraint;

@Entity
public class AreaConhecimento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(unique = true)
	private String descricao;
	
	@Override
	public String toString() {
		return "AreaConhecimento: " + descricao;
	}

	public AreaConhecimento(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
