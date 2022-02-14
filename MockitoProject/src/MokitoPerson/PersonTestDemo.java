package MokitoPerson;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PersonTestDemo 
{
	@Test
    public void testPersonMock(){
        PersonService personService=mock(PersonService.class);
        List<Person> personList=new ArrayList<>();
        personList.add(new Person(1l, "Tarkeshwar", "Delhi", "34343"));
        personList.add(new Person(2l, "Tarkeshwar1", "Mumbai", "343455553"));
        personList.add(new Person(3l, "Tarkeshwar2", "Kolkata", "34344343"));
        personList.add(new Person(4l, "Tarkeshwar3", "Chennai", "34342223"));
        when(personService.getAllPerson()).thenReturn(personList);
        Assert.assertEquals(1l , personList.get(1).getPid());
    }
}
