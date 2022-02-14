package StaticMemberConcetp;

public class StaticMemberAndMethod {
	 public static void main(String args[ ])
     {
         static2.call();
         System.out.println("Value2="+static2.b);
     }
}
class static2
{
    static int a=10;
    static int b=20;
    static void call()
    {
        System.out.println("Value1="+a);
    }
}