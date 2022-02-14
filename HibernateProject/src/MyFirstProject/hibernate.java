package MyFirstProject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernate {
	
	private static final SessionFactory sessionFactory;
    static {
        try {
            //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            //sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() 
    {
        return sessionFactory;
    }
}
