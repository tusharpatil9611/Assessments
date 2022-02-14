package MapModifier;

import java.util.ArrayList;

public class ListToStream {

	public static void main(String[] args) 
	{
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(-10);
		list.add(-50);
		list.add(80);
		list.stream().map(Math::abs).forEach(System.out::print);
		
		
	}

}
