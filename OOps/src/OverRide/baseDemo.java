package OverRide;

public class baseDemo {

	public static void main(String[] args) 
	{
		Base b = new Base();
        Derived d  =new Derived();
        Derived1 d1 = new Derived1();
        b.show();  
        d.show(); 
        d1.show();
	}
}
