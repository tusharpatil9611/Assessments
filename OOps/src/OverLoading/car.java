package OverLoading;

public class car extends vehical
{
	 public void start()
	 {
		 // early binding
		 System.out.println("car has been started");
	 }
	 public static void stop() 
	 {        
		 // late binding
		 System.out.println("Car has been stopped");
	 }

}
