package billing.login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import billing.dbconfig.HibernateUtil;

public class RegisterService {
	SessionFactory sessFact = HibernateUtil.getSessionFactory();
	Session session = sessFact.getCurrentSession();
	Transaction tx = session.beginTransaction();

	public String addCredentials(String username,String password,String email) {

		try {
			LoginModel loginmodel=new LoginModel();
			loginmodel.setUsername(username);
			loginmodel.setPassword(password);
			loginmodel.setEmail(email);
			session.save(loginmodel);
		} catch (Exception e) {
		return "error";
	
		} finally {
			tx.commit();
			session.close();
		}
	return "success";
	}
}
