package BussinessLayer.Utils;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	public static EntityManagerFactory getFactory() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Assigment_Final");
		
		return factory;
	}
	
	public static EntityManager createEntityManager() {
		EntityManager em = getFactory().createEntityManager();
		return em;
	}
	public static void main(String[] args) {
	 System.out.println(createEntityManager());//haiz
	}

}