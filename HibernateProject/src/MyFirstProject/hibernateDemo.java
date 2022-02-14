package MyFirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class hibernateDemo {

	public static void main(String[] args) {
	 // Session session = HibernateUtil.getSessionFactory().openSession();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Person person=new Person();
        person.setName("Tarkeshwar");
        person.setAddress("At pune");
        person.setPhoneNo("7798573567");
        person.setPid(10);
        session.save(person);
        transaction.commit();
       
        session.close();           // Optional
        sessionFactory.close();   // Optional
	}

}
