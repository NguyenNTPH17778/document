package DataAccessLayer;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.sql.Select;

import BussinessLayer.Entities.Admin;
import BussinessLayer.IServiceBUS.IServiceAdmin;
import BussinessLayer.Utils.JpaUtil;

public class ServiceAdmin implements IServiceAdmin {
	EntityManager em;
	public ServiceAdmin() {
		em = JpaUtil.createEntityManager();
	}
	
	@Override
	public Admin add(Admin entity) throws Exception {

		try {
			em.getTransaction().begin();
			em.persist(entity);
			
			em.getTransaction().commit();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw e ;
		}
	}

	@Override
	public Admin delete(Admin entity) throws Exception {
		try {
			em.getTransaction().begin();
			em.remove(entity);
			
			em.getTransaction().commit();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw e ;
		}
	}

	@Override
	public Admin update(Admin entity) throws Exception {
		try {
			em.getTransaction().begin();
			em.merge(entity);
			
			em.getTransaction().commit();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw e ;
		}
	}

	@Override
	public List<Admin> selectAll() throws Exception {
		String query = "Select obj from Admin obj";
		TypedQuery<Admin> list = em.createQuery(query, Admin.class);
		return list.getResultList(); 
	}


	@Override
	public Admin loginAdmin(String user, String password) {
		try {
			TypedQuery<Admin> query = em.createQuery("SELECT obj FROM Admin obj where obj.email = :email and obj.password = :pass", Admin.class);
			Admin ad = query.setParameter("email", user).setParameter("password", password).getSingleResult();
			return ad;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Admin findAdmin(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
