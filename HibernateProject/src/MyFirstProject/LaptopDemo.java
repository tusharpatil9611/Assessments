package MyFirstProject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class LaptopDemo {

	public static void main(String[] args)
	{
		SessionFactory sessionFactory =HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		Loptop loptop =new Loptop();
		loptop.setCpu("Intel ");
		loptop.setHdd("1 TB");
		loptop.setLip(3595);
		loptop.setRam("24 GB");
		session.save(loptop);
		transaction.commit();
		session.close();
				
	}

}
