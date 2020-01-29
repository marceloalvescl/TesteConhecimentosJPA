package br.com.marcelo.testjpa.biblioteca.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;

import br.com.marcelo.testjpa.biblioteca.entidades.Autor;
import br.com.marcelo.testjpa.biblioteca.util.JPAUtil;

public class PopulaAutor {

	
	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();
		/**
		 * 
		Autor autor1 = new Autor("Fernando Pessoa", "13/06/1888");
		Autor autor2 = new Autor("Augusto Cury", "02/10/1958");
		Autor autor3 = new Autor("Machado de Assis", "21/06/1839");
		Autor autor4 = new Autor("Carlos Drummond de Andrade", "31/10/1902");
		Autor autor5 = new Autor("Paulo Coelho", "24/08/1947");
		Autor autor6 = new Autor("James C Hunter", "26/06/1955");
		Autor autor7 = new Autor("J R R Tolkien", "03/01/1892");
        ArrayList<Autor> autores = new ArrayList<Autor>(Arrays.asList(autor1, 
        							autor2, autor3, autor4, autor5, autor6, autor7));
		
		for (Autor autor : autores) {
			try {
				em.persist(autor);				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		*/
		
		Autor a = em.find(Autor.class, 3);
		a.setDataNascimento("21/06/1839");
		Autor a1 = em.find(Autor.class, 4);
		a1.setDataNascimento("31/10/1902");
		Autor a2 = em.find(Autor.class, 5);
		a2.setDataNascimento("24/08/1947");
		Autor a3 = em.find(Autor.class, 6);
		a3.setDataNascimento("26/06/1955");
		Autor a4 = em.find(Autor.class, 7);
		a4.setDataNascimento("03/01/1892");
		
		
		
		em.getTransaction().commit();
		em.clear();
	}
	
	
}
