package StaticMemberConcetp;

public class ClassAndObjectIni {
	 public static void main(String args[ ])
	  {
		 System.out.println("Number of Cube objects = "+ Cube.numOfCubes);
		 System.out.println("Number of Cube objects = "+ Cube.getNoOfCubes());
     }
}
class Cube
{
    int length = 10;
    int breadth = 10;
    int height = 10;
    static int numOfCubes = 10; 		// static variable initiallised first
    public static int getNoOfCubes()
    {     //static method
        return numOfCubes;
    }
    public Cube()
    {   
    	numOfCubes++; //
    }
}
