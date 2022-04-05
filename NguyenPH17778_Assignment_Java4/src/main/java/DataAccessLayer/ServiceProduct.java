package DataAccessLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.From;

import org.hibernate.sql.Select;

import BussinessLayer.Entities.Product;
import BussinessLayer.IServiceBUS.IServiceProduct;
import BussinessLayer.Utils.JpaUtils;

public class ServiceProduct implements IServiceProduct {
	EntityManager em ;
	
	public ServiceProduct() {
		em = JpaUtils.createEntityManager();
	}
	@Override
	public Product addProduct(Product entity) throws Exception {
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
	public Product UpdateProduct(Product entity) throws Exception {
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
	public Product DeleteCategory(Product entity) throws Exception {
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
	public List<Product> selectAll() throws Exception {
		String query = "Select obj From product obj" ;
		TypedQuery<Product> list = em.createQuery(query,Product.class);
		return list.getResultList();
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
