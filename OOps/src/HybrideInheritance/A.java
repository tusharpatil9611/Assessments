package HybrideInheritance;

public class A 
{
	  void show()
      {    System.out.println ("I am in class A");
      }
}
class B extends A
{    void show()
    {    
	System.out.println ("I am in class B");
    }
}
interface C
	{    
		public void show1();
	}
class D extends B implements C
{   
	void show()
    {
		System.out.println ("I am using Class B in class D");
    }
    public void show1()
    {   
    	System.out.println ("I am using interface");
    }
}