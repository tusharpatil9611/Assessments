package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDynamically {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Element you Want");
		int len=sc.nextInt();
		System.out.println("Enter the Elements");
		int arr[]=new int[len];
		int sum=0;
		for (int i = 0; i <arr.length; i++) 
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	}

}
