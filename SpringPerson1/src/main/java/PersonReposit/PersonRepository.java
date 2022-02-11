package PersonReposit;

import org.springframework.data.jpa.repository.JpaRepository;

import Person.Person;

public  interface PersonRepository extends JpaRepository<Person, Integer> {

}
