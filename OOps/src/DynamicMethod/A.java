package DynamicMethod;

public class A 
{
	 void callme()
     {   
		 System.out.println("Inside A's callme Method");
     }
}
class B extends A
{    
	void callme()    //override callme()
    {   
		System.out.println("Inside B's callme Method");
    }
}
class C extends A
{   
	void callme()    // override callme()
    {   
		System.out.println("Inside C's callme Method");
    }
}