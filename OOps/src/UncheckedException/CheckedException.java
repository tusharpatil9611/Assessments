package UncheckedException;

public class CheckedException {

	public static void main(String[] args)
	{
		try {
				Thread.sleep(300);
				System.out.println("in try block");
			} 
		catch (InterruptedException e) 
		{
			System.out.println("Handled");
		}
	}

}
