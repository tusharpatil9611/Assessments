package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
	//List<String> list= new ArrayList();
	List<String> nameList = new ArrayList<String>();
	String [] names = {"Ann", "Bob", "Carol"}; 				// Add to arrayList
	for (int k = 0; k < names.length; k++) 
	{
		nameList.add(names[k]);							// Display name list using an iterator
	}
	Iterator<String> it = nameList.iterator();
	while (it.hasNext()) System.out.println(it.next());
	}

}
