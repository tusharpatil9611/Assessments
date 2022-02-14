package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		String [] name= {"Tushar","rajendra","patil","chaudhari"};	// Add to arrayList using a ListIterator
		java.util.ListIterator<String> iterator=list.listIterator();
		for (int i = 0; i < name.length; i++) 
		{
			iterator.add(name[i]);				// Get a new ListIterator
		}
		 list.listIterator();
		 while (iterator.hasNext()) System.out.println(iterator.next());
		
	}

}
