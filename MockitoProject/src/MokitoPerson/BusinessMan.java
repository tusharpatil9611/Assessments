package MokitoPerson;
import java.util.*;
public class BusinessMan {
 private PersonService personService;

public BusinessMan(PersonService personService) 
{
	super();
	this.personService = personService;
}
	public List<Person> findAllPerson(Person person)
	{
		List<Person> p=new ArrayList<Person>();
		p.add(person);
		return p;	
	}
 
}
