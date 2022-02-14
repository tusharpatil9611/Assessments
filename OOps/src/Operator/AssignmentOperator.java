package Operator;

public class AssignmentOperator {

	public static void main(String[] args)
	{
		int x=5;
		int y=10;
		x+=y;
		System.out.println("The addition is:"+x);
		x-=y;
		System.out.println("The substraction is:"+x);
		x*=y;
		System.out.println("The multiplication is:"+x);
		x%=y;
		System.out.println("The reminder is:"+x);
		x/=y;
		System.out.println("The division is:"+x);
		x&=y;
		System.out.println("The result of AND operator:"+x);
		x|=y;
		System.out.println("The result of the OR operator :"+x);
		x<<=y;
		System.out.println("The result of Signed left shift operator:"+x);
		
	}

}
