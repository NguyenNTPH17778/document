package Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	public static EntityManagerFactory getFactory() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("PH17778_NguyenThiNguyen_Lab5_310322");
		return factory;
	}
	public static EntityManager getEntityManager() {
		EntityManager em=JpaUtils.getFactory().createEntityManager();
		return em;
	}
}
