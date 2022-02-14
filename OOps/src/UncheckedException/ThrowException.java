package UncheckedException;

public class ThrowException 
{
	 public ThrowException() throws NullPointerException
     {    System.out.println("caught");
         throw new NullPointerException("demo");
     }
}
