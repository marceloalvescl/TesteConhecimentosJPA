package br.com.marcelo.testjpa.biblioteca.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	
	public static EntityManagerFactory em = Persistence.createEntityManagerFactory("biblioteca");
	
	public EntityManager getEntityManager() {
		return em.createEntityManager();
	}
	
}
