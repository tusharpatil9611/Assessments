package DynamicMethod;

public class DynamicDemo 
{
	public static void main(String args [ ])
    {   
		A a=new A();
        B b=new B();
        C c=new C();
        A r;    					 // obtains a reference of type A
        r=a;
        r.callme();
        r=b; 
        r.callme();
        r=c; 
        r.callme();
    }
}
