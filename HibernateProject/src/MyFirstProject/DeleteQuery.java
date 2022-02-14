package MyFirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteQuery {

	public static void main(String[] args) {
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        Person person = new Person();
	        person.setPid(1);
	        session.delete(person);
	        transaction.commit();
	        session.close();
	        sessionFactory.close();
	}

}
