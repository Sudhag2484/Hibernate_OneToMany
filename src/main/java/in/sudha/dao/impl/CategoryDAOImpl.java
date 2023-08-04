package in.sudha.dao.impl;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.sudha.dao.CategoryDAO;
import in.sudha.entities.CategoryEntity;

public class CategoryDAOImpl implements CategoryDAO {

	EntityManagerFactory factory =Persistence.createEntityManagerFactory("test");
	
	public void saveCategory(CategoryEntity entity) {
            EntityManager em = factory.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            try {
            	em.persist(entity);
            	tx.commit();
            	System.out.println("Category with products are persisted");
            }catch(Exception e){
            	tx.rollback();
            	e.printStackTrace();
            }finally {
            	em.close();
            }
		
	}

	public CategoryEntity fetchCategory(Integer cId) {
        EntityManager em = factory.createEntityManager();
        CategoryEntity entity = em.find(CategoryEntity.class, cId);
        em.close();
		return entity;
	}

	public void deleteCategory(Integer cId) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        CategoryEntity entity = em.find(CategoryEntity.class, cId);
        tx.begin();
        try {
        	em.remove(entity);
        	tx.commit();
        	System.out.println("Product remove DB");
        }catch(Exception e) {
        	tx.rollback();
        	e.printStackTrace();
        }finally {
        	em.close();
        }
	}

}
