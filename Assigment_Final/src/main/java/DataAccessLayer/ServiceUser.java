package DataAccessLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;

import BussinessLayer.Entities.*;

import BussinessLayer.IServiceBUS.IServiceUser;
import BussinessLayer.Utils.JpaUtils;

public class ServiceUser implements IServiceUser{
	EntityManager em;
	
	
	public ServiceUser() {
		em= JpaUtils.createEntityManager();
	}
	@Override
	public User addUser(User entity) throws Exception {
		try {
			em.getTransaction().begin();
			
			em.persist(entity);
			
			em.getTransaction().commit();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			
			throw e;
		}
	}

	@Override
	public User UpdateUser(User entity) throws Exception {
		try {
			em.getTransaction().begin();
			
			em.merge(entity);
			
			em.getTransaction().commit();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			
			throw e;
		}
	}

	@Override
	public User DeleteCategory(User entity) throws Exception {
		try {
			em.getTransaction().begin();
			
			em.remove(entity);
			
			em.getTransaction().commit();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			
			throw e;
		}
	}

	@Override
	public List<User> selectAll() throws Exception {
		String query = "SELECT obj FROM User obj";
		TypedQuery<User> list =em.createNamedQuery(query, User.class);
		return list.getResultList();
	}

	@Override
	public User findUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User loginUser(String email, String password) {
		try {
			TypedQuery<User> query = em.createQuery("SELECT obj FROM User obj where obj.email = :email and obj.password = :password", User.class);
			User ad = query.setParameter("email", email).setParameter("password", password).getSingleResult();
			return ad;
		} catch (Exception e) {
			return null;
		}
	
		
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(new ServiceUser().selectAll().size());
	}

}