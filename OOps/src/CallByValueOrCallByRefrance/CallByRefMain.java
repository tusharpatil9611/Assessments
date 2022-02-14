package CallByValueOrCallByRefrance;

public class CallByRefMain {
	   public static void main(String args [ ])
	      {    
		   		CallByRefrance t=new CallByRefrance(4,5);
		   		System.out.println("Before calling a="+t.a+" :b="+t.b);
		   		t.meth(t);
		   		System.out.println("After calling a="+t.a+" :b="+t.b);
	      }

}
