package MultipleInheritance;

public class A 
{
	 void show()
     {    System.out.println ("Iam in Class A");
     }
}
interface B
	{   
		public void show1();
	}
class C extends A implements B
{    void show()
    {    
		System.out.println ("Iam using Class A  in Class C");
    }
    public void show1()
    {  
    	System.out.println ("Iam using interface Class");
    }
}