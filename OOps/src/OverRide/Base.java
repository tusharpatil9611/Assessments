package OverRide;

public class Base 
{
	 public void show()
     { 
		 System.out.println("Base class method");
     }
}
class Derived extends Base
{
	public void show()
	{
		System.out.println("Derived class method");
	}
}
class Derived1 extends Derived
{
	public void show()
	{
		System.out.println("Derived1 class Method");
	}
}