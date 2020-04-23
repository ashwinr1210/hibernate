package billing.login;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import billing.dbconfig.HibernateUtil;

public class RegisterService {
	SessionFactory sessFact = HibernateUtil.getSessionFactory();
	Session session = sessFact.getCurrentSession();
	Transaction tx = session.beginTransaction();

	public String addCredentials(String username,String password,String email,String dob) {

		try {
			LoginModel loginmodel=new LoginModel();
			loginmodel.setUsername(username);
			loginmodel.setPassword(password);
			loginmodel.setEmail(email);
		
			java.util.Date date1= new SimpleDateFormat("yyyy-mm-dd").parse(dob);  
			loginmodel.setDate(date1);
			session.save(loginmodel);
		} catch (Exception e) {
			e.printStackTrace();
		return "errorr";
	
		} finally {
			tx.commit();
			session.close();
		}
	return "successs";
	}
}
