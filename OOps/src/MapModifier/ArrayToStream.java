package MapModifier;

import java.util.Arrays;

public class ArrayToStream {

	public static void main(String[] args)
	{
		// compute sum of absolute values of even int.
		int []number= {12,54,2,14,12,65,3,6,4,8,6,};
		int sum = Arrays.stream(number)
	            .map(n -> Math.abs(n))	//abs means absolute value only positive value.
	            .filter(n -> n % 2 == 0)
	            .distinct()
	            .sum();
		System.out.println(sum);
	}

}
