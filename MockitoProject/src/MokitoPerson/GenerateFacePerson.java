package MokitoPerson;

import java.util.ArrayList;
import java.util.List;

public class GenerateFacePerson implements PersonService
{

	public List<Person> getAllPerson() {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person(1l, "Tarkeshwar", "Delhi", "34343"));
        personList.add(new Person(2l, "Tarkeshwar1", "Mumbai", "343455553"));
        personList.add(new Person(3l, "Tarkeshwar2", "Kolkata", "34344343"));
        personList.add(new Person(4l, "Tarkeshwar3", "Chennai", "34342223"));
        return personList;
    }
}
