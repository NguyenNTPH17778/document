package DataAccessLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import BussinessLayer.Entities.Category;
import BussinessLayer.IServiceBUS.IServiceCategories;
import BussinessLayer.Utils.JpaUtils;

public class ServiceCategories implements IServiceCategories{
	EntityManager em;
	
	
	public ServiceCategories() {
		em= JpaUtils.createEntityManager();
	}
	
	@Override
	public Category addCategory(Category entity) throws Exception {
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
	public Category UpdateCategory(Category entity) throws Exception {
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
	public Category DeleteCategory(Category entity) throws Exception {
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
	public List<Category> selectAll() throws Exception {
		String query = "Select obj from Category obj";
		TypedQuery<Category> list = em.createQuery(query, Category.class);
		return list.getResultList();
	}



	@Override
	public Category findCategory(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
