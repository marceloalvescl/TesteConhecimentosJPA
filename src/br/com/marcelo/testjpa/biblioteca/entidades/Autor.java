package br.com.marcelo.testjpa.biblioteca.entidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.marcelo.testjpa.biblioteca.util.FormatarDatas;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;

	public Autor() {
		
	}
	
	public Autor(String nome, String data) {
		super();
		this.nome = nome;
		setDataNascimento(data);
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

	public void setDataNascimento(String dataNascimento) {
		Calendar data = FormatarDatas.formataData(dataNascimento);
		this.dataNascimento = data;
	}

	public Calendar getDataNascimento() {
		return this.dataNascimento;
	}

}
