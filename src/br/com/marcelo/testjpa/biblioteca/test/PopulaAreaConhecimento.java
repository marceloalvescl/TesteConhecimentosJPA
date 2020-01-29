package br.com.marcelo.testjpa.biblioteca.test;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;

import br.com.marcelo.testjpa.biblioteca.entidades.AreaConhecimento;
import br.com.marcelo.testjpa.biblioteca.util.JPAUtil;

public class PopulaAreaConhecimento {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		AreaConhecimento ac = new AreaConhecimento("Hist�ria e Geografia");
		AreaConhecimento ac1 = new AreaConhecimento("Literatura");
		AreaConhecimento ac2 = new AreaConhecimento("Arte e Recrea��o");
		AreaConhecimento ac3 = new AreaConhecimento("Tecnologia");
		AreaConhecimento ac4 = new AreaConhecimento("Ci�ncias");
		AreaConhecimento ac5 = new AreaConhecimento("Idiomas");
		AreaConhecimento ac6 = new AreaConhecimento("Ci�ncias Sociais");
		AreaConhecimento ac7 = new AreaConhecimento("Religi�o");
		AreaConhecimento ac8 = new AreaConhecimento("Filosofia e Religi�o");
		AreaConhecimento ac9 = new AreaConhecimento("Ci�ncia da Computa��o, informa��o e trabalhos gerais");
		ArrayList<AreaConhecimento> acs = new ArrayList<AreaConhecimento>(Arrays.asList(ac, ac1, ac2, ac3, ac4, ac5, ac6, ac7, ac8, ac9));
		
		for (AreaConhecimento areaConhecimento : acs) {
			try {
				em.persist(areaConhecimento);
			}catch(Exception e) {
				System.out.println(areaConhecimento.toString() + " j� existe!");
			}
		}
		
		em.getTransaction().commit();
		em.close();
		
	}
	
}
