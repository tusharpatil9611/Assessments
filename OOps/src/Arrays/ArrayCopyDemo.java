package Arrays;

public class ArrayCopyDemo {
	 public static void main(String[ ] args)
     {
       char[ ] copyFrom = {'a','b','c','d','e','f','g','h','i','j'};
       char[ ] copyTo = new char[5];				//creating array of the size 5
       System.arraycopy(copyFrom, 2, copyTo, 0, 5);			//Inbuilt method start from index2 and copy array o-5;
       System.out.println(new String (copyTo));
     }
}
