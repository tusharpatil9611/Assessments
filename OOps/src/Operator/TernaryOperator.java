package Operator;

public class TernaryOperator {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		int result=0;
		boolean isValue=true;
		if((x==5) &&(x<y))
			System.out.println("Value of x is:"+x);
		if((x==y)||(y>1))
			System.out.println("Value of y is greater then the value ofx");
		result=isValue?x:y;
			System.out.println("The returned value is:"+result);
				
		
		
	}

}
