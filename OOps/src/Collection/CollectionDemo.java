package Collection;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) 
	{
		List<String>list=new ArrayList<String>();
		list.add("Tushar");
		list.add("Sarthak");
		list.add("Pallavi");
		list.add("Sushant");
		list.add("Ajay");
		list.add("Ajinkay");
		System.out.println(list);
		for (int i = 0; i <list.size(); i++)
		{
			
			System.out.println(list.get(i));
		}
		for (Object obj:list)
		{
			System.out.println(obj);
		}
		
		
	}

}
