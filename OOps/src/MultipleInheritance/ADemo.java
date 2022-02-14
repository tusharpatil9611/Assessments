package MultipleInheritance;

public class ADemo 
{
	 public static void main(String args[ ])
     {   
		 A a=new A();  a.show();
         B b;
         b=new C();
         b.show1();
         C c=new C();  c.show();
     }
}
