package billing.login;


import billing.dbconfig.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
public class LoginService {
	public String validateCredentials(String username,String password) {
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		Transaction tx = session.beginTransaction();
		 try{
			 //METHOD 1
			 
			 //LoginModel model = session.createNativeQuery("Select * from login_details",LoginModel.class).getSingleResult();
			 
			 // METHOD 2
			 
			 //LoginModel model = session.createQuery("from LoginModel where loginId = :LOGINID",LoginModel.class).setParameter("LOGINID", username).getSingleResult();
			 
			 //METHOD 3
			 
			 CriteriaBuilder cb = session.getCriteriaBuilder();
			 CriteriaQuery<LoginModel> cr = cb.createQuery(LoginModel.class);
			 Root<LoginModel> root = cr.from(LoginModel.class);
			 Predicate uname=cb.equal(root.get("username"), username);
			 Predicate pwd=cb.equal(root.get("password"), password);
			 cr.select(root).where(cb.and(uname, pwd));
//			 cr.select(root).where(cb.equal(root.get("username"), username));
			 Query<LoginModel> query = session.createQuery(cr);
			 LoginModel model = query.getSingleResult();
			 tx.commit();
	            if(model!=null && model.getId()>0)
	            	return "success";
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 return "error";
	}
}
