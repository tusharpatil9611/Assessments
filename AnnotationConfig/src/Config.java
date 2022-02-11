import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
public class Config {
	
	 @Bean(initMethod = "initialize" , destroyMethod = "deleting" , name = "mybookbean")
	 @Scope("singleton")
	    public Book getBookBean() {
	        return new Book();
	 }
	 @Bean( name = "authorBean")
	 @Scope("prototype")
	    public Author getAuthorBean() {
	        return new Author();
	 }
}
