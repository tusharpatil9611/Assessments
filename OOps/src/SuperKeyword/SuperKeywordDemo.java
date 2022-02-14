package SuperKeyword;

public class SuperKeywordDemo 
{
	int a;
	int b;
	public SuperKeywordDemo(int a, int b) 
	{
		this.a=a;
		this.b=b;
		
	}
	public void print()
	{
		System.out.println(" a :"+a+" b"+b);
	}
}
class child extends SuperKeywordDemo
{

	public child(int a, int b) {
		super(a, b);
		System.out.println("Pass the arguments to parents class");
	}
}
