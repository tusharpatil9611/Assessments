package BankDetail;

import java.util.Scanner;

public class bankMain {

	 public static void main(String args[ ])
	    {    
		 	banktransaction gv=new banktransaction();  int ch;
	        Scanner t=new Scanner(System.in);
	        System.out.println("1.deposit:");
	        System.out.println(" 2.draw");
	        System.out.println(" 3.enquiry:");
	        while(true)
	        {    System.out.println(" Enter U r choice:");     ch=t.nextInt();
	            switch(ch)
	            {
	                case 1: gv.deposit();break;
	                case 2: gv.draw();break;
	                case 3: gv.enquiry();break;
	                default:return;
	            }
	        }
	    }

}
