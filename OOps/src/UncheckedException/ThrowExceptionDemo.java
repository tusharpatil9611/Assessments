package UncheckedException;

public class ThrowExceptionDemo {

	public static void main(String[] args)
	{
		     try
          {   
		    	 ThrowException td = new ThrowException();
          }
          catch(NullPointerException e)
          {    
        	  System.out.println("recaught");
          }
	}

	}
