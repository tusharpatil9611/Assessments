package MyFirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

import javax.persistence.Query;

public class ListingRecordFromTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		 Query query = session.createQuery("FROM Laptop");
		 ((org.hibernate.query.Query) query).setString("name","Tushar");
		 List lst=((org.hibernate.query.Query)query).list();
         for(Object obj:lst)
         {
             System.out.println(obj);
         }
	}

}
