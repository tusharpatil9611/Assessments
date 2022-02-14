package SwapingVariable;

public class Swap {

	int x=10;
	int y=20;
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
		System.out.println("Value of X:"+x+" adn "+y);
	}
}
