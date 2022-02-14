package AllProgram;

public class Suhrit {
	public static void main(String args)
	{
		int n=Integer.parseInt(args);
		double sum=0.0;
		for (int i = 0; i <=n; i++) 
		{
			sum=sum+(1.0/Math.pow(2,i));
            System.out.println("Sum is "+sum);
			
		}
		
	}

}
