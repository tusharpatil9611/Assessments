package Arrays;

public class ArraysDeclaration {
	
	 public static void main(String[ ] args)
     {
           int[] x = new int [101];
           for (int i = 0; i< x.length; i++ )
        	   x[i] = i;
           int sum = 0;
           for(int i = 0; i< x.length; i++)
           {
        	   sum += x[i];
           		System.out.println(sum);
           }
     }
}
