package PersonRestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Person.Person;
import PersonReposit.PersonRepository;

@RestController
public class PersonRestController {
	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping("/save")
	public String getSave(@RequestBody Person person)
	{
		personRepository.save(person);
		return "Person added Succefully";
	}
	@PutMapping("/update")
	public String setSave()
	{
		return "Hello";
	}

}
