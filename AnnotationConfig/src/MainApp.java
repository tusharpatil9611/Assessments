import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class MainApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		//Book book=(Book)annotationConfigApplicationContext.getBean("getBookBean");
		Book book1=(Book)annotationConfigApplicationContext.getBean("mybookbean");
		Author author =(Author)annotationConfigApplicationContext.getBean("authorBean");
		
		//System.out.println(book);
		System.out.println(book1);
		System.out.println(author);
		annotationConfigApplicationContext.close();
	}

}
