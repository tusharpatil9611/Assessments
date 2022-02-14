package SuperKeyword;

public class student {
	 public static void main(String args [ ])
	    {   
	        exam obj=new exam(70);
	    }
	 public student(String name)
     {    System.out.println ("super "+name);
     }
}
class exam extends student
{    public exam(int score)
    {    super ("Dr. Tarkeshwar");
                     System.out.println ("sub "+score);
    }
}
 
