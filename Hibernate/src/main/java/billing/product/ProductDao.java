package billing.product;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import billing.dbconfig.*;
import billing.login.LoginModel;




public class ProductDao {
		@SuppressWarnings("unchecked")
		public List<ProductModel> getProductList() {
			
			SessionFactory sessFact = HibernateUtil.getSessionFactory();
			Session session = sessFact.getCurrentSession();
			Transaction tx = session.beginTransaction();
			 try{
			
				 CriteriaBuilder cb = session.getCriteriaBuilder();
				    CriteriaQuery<ProductModel> cq = cb.createQuery(ProductModel.class);
				    Root<ProductModel> rootEntry = cq.from(ProductModel.class);
				    CriteriaQuery<ProductModel> all = cq.select(rootEntry);
				 
				    TypedQuery<ProductModel> allQuery = session.createQuery(all);
				    List<ProductModel> results = allQuery.getResultList();
				    return results ;
				  
		}catch (Exception e) {
            e.printStackTrace();
        }  
			 finally {
					tx.commit();
					session.close();
				}
			 return null;
			 
}
		
		
		@SuppressWarnings("finally")
		public Integer addProductDetails(ProductModel productModel) {
			SessionFactory sessFact = HibernateUtil.getSessionFactory();
			Session session = sessFact.getCurrentSession();
			Transaction tx = session.beginTransaction();
			Integer result = 0;
			try {
//				productModel.setProductId(product.getProductId());
//				ProductModel productModel=new ProductModel();
//				productModel.setProductId(productId);
//				productModel.setProductName(productName);
//				productModel.setProductPrice(productPrice);
//				productModel.setProductQuantity(quantity);
				
				result=(Integer) session.save(productModel);
				
			} catch (Exception e) {
				e.printStackTrace();
			return null;
		
			} finally {
				tx.commit();
				session.close();
			}
		return result;
		}

			
		public void deleteProduct(Integer productId) {
			SessionFactory sessFact = HibernateUtil.getSessionFactory();
			Session session = sessFact.getCurrentSession();
			Transaction tx = session.beginTransaction();
			 try{
			String criteriaDelete = "Delete from ProductModel where productId=" + productId;
			session.createQuery(criteriaDelete).executeUpdate();
			
		}catch (Exception e) {
            e.printStackTrace();
        }   finally {
			tx.commit();
			session.close();
		}
			 
			 
		}

	
}