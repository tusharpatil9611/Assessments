package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListAndIterator {

	public static void main(String[] args)
	{
		List<String>list=new LinkedList<String>();		//link list and array list is always good it is mutable  
		list.add("One");
		list.add("two");
		list.add("Three");
		String[] numbers={"1", "2", "3", "4"}; // Cann't  resizable and immutable
		Iterator<String> iterator = list.iterator();		//place list into the iterator and create object of the iterator
		 System.out.println("Iterating using Iterator");
		while(iterator.hasNext())							//has.next=To check object
		{
            System.out.println(iterator.next());
        }
		System.out.println();
		 System.out.println("Enhanced For Loop");
        for(Object obj:list)						
        {
            System.out.println(obj);
        }
        System.out.println();
        System.out.println("Regular For Loop");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("converting to the string");
        System.out.println(list);
        list.remove(1);
        list.remove("Three");
        System.out.println("After Deleting Index 2 and Object Four ");
        System.out.println(list);
	}
}
