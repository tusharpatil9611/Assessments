package SwappingVariableDynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class swap {
	int x,y;
	public void readxy() throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of X and y");
		 x=Integer.parseInt(br.readLine());
		 y=Integer.parseInt(br.readLine());
	}
	public void swapwot()
	{
		x=x+y;
		y=x-y;
		x=x-y;
	}
	public void swapwt()
	{
		int temp=x;
		x=y;
		y=temp;
	}
	public void display()
	{
		System.out.println("Value of x:"+x+" value of y:"+y);
	}

	public static void main(String[] args)
	{
		swap s=new swap();
		s.swapwot();
		s.display();
		s.swapwt();
		s.display();
		
	}
}
