package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Utils.JpaUtils;
import Entities.Category;


public class CategoriesDAO {
private EntityManager em;
	
	public CategoriesDAO() {
		this.em = JpaUtils.getEntityManager();
	}
	public List<Category> all() {
		String jpql="SELECT obj FROM Category obj";
		TypedQuery<Category> query=this.em.createQuery(jpql,Category.class);
		List<Category> ds=query.getResultList(); 
		return ds;
	}
	public Category findById(int id) {
		Category entity=this.em.find(Category.class, id);
		return entity;
	}
	public Category create(Category entity) throws Exception{
		try {
			this.em.getTransaction().begin();
			this.em.persist(entity);
			this.em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}
	public Category update(Category entity) throws Exception{
		try {
			this.em.getTransaction().begin();
			this.em.merge(entity);
			this.em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}
	public Category delete(Category entity) throws Exception{
		try {
			this.em.getTransaction().begin();
			this.em.remove(entity);
			this.em.getTransaction().commit();
			return entity;
		} catch (Exception e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}
	public Category fineById(int id) {
		Category entity=this.em.find(Category.class, id);
		return entity;
	}
}
