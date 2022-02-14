package MapModifier;

import java.util.Scanner;
import java.util.stream.IntStream;

public class IntergerCount 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		boolean prime=IntergerCount.isPrime(num);
		System.out.println(prime);
	}
	public static boolean isPrime(int n)
	{
	    return IntStream.range(1, n + 1)
	        .filter(x -> n % x == 0)
	        .count() == 2;
	}
}
