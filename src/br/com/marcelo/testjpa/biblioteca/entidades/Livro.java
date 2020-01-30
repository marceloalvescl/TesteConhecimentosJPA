package br.com.marcelo.testjpa.biblioteca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@ManyToOne
	private AreaConhecimento areaConhecimento;
	@ManyToOne
	private Autor autor;
	@OneToOne
	private OutrasInformacoes outrasInformacoes;
	
	public Livro() {
		
	}
	
	public Livro(String nome, AreaConhecimento areaConhecimento, Autor autor, OutrasInformacoes outrasInformacoes) {
		super();
		this.nome = nome;
		this.areaConhecimento = areaConhecimento;
		this.autor = autor;
		this.outrasInformacoes = outrasInformacoes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public AreaConhecimento getAreaConhecimento() {
		return areaConhecimento;
	}

	public void setAreaConhecimento(AreaConhecimento areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public OutrasInformacoes getOutrasInformacoes() {
		return outrasInformacoes;
	}

	public void setOutrasInformacoes(OutrasInformacoes outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}

}
