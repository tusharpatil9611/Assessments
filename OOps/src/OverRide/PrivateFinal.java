package OverRide;

public class PrivateFinal 
{
	private final void f() 
	{
		System.out.println("With final f()");
	}
	private void g()
	{
		System.out.println("Without final g()");
	}
}
class OverridingPrivate extends PrivateFinal
{   
	private final void f()
    {   
		System.out.println("OverridingPrivate.f()");
    }
    private void g()
    {  
    	System.out.println("OverridingPrivate.g()");
    }
}
class OverridingPrivate2 extends OverridingPrivate
{   
	public final void f()
    {
		System.out.println("OverridingPrivate2.f()");
     }
    public void g()
    {
    	System.out.println("OverridingPrivate2.g()");
    }
}

