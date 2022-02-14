package MapModifier;

import java.util.stream.IntStream;

public class Map1
{
	public static void main(String[] args) 
	{
		int sum = IntStream.range(1, 6)
			    .map(n -> n * n)
			    .sum();
		System.out.println(sum);
	}
}
