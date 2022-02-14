package HybrideInheritance;

public class HybrideDemo 
{
	 public static void main(String args[ ])
     {   
		 A a=new A();a.show();
         B b=new B(); b.show();
         C c;
         D d=new D();d.show();
         c=new D();c.show1();
     }
}
