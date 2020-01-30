package br.com.marcelo.testjpa.biblioteca.test;

import javax.persistence.EntityManager;

import br.com.marcelo.testjpa.biblioteca.entidades.AreaConhecimento;
import br.com.marcelo.testjpa.biblioteca.entidades.Autor;
import br.com.marcelo.testjpa.biblioteca.entidades.Livro;
import br.com.marcelo.testjpa.biblioteca.entidades.OutrasInformacoes;
import br.com.marcelo.testjpa.biblioteca.util.JPAUtil;

public class PopulaLivro {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		/*
		OutrasInformacoes oi = new OutrasInformacoes("1998", "1", "2");
		
		Livro livro = new Livro("O monge e o executivo", 
				em.find(AreaConhecimento.class, 9), 
				em.find(Autor.class, 6), 
				oi
				);
		
		OutrasInformacoes oi1 = new OutrasInformacoes("1936", "1", "53");
		Autor autor = new Autor("Dale Carnegie", "24/11/1888");
		
		Livro livro1 = new Livro("Como fazer amigos e influenciar pessoas", 
				em.find(AreaConhecimento.class, 9), 
				autor,
				oi1
				);
		
		OutrasInformacoes oi2 = new OutrasInformacoes("2011", "1", "2");
		Autor autor1 = new Autor("Robert T Kiyosaki", "08/04/1947");
		
		Livro livro2 = new Livro("Pai Rico, Pai Pobre", 
				em.find(AreaConhecimento.class, 9), 
				autor1,
				oi2
				);
		
		OutrasInformacoes oi3 = new OutrasInformacoes("1955", "1", "20");
		Autor autor2 = new Autor("George Samuel Clason", "07/11/1874");
		
		Livro livro3 = new Livro("O homem mais rico da babilônia", 
				em.find(AreaConhecimento.class, 9), 
				autor1,
				oi2
				);
		em.persist(oi);
		em.persist(livro);		
		
		em.persist(autor);
		em.persist(oi1);
		em.persist(livro1);

		em.persist(autor1);
		em.persist(oi2);
		em.persist(livro2);

		em.persist(autor2);
		em.persist(oi3);
		em.persist(livro3);	
		*/
		
		OutrasInformacoes oi4 = new OutrasInformacoes("2014", "1", "2");
		
		Livro livro4 = new Livro("De volta ao mosteiro", 
				em.find(AreaConhecimento.class, 9), 
				em.find(Autor.class, 6), 
				oi4
				);
		
		em.persist(oi4);
		em.persist(livro4);
		
		em.close();
		em.getTransaction().commit();
	}
}