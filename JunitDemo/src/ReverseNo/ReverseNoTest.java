package ReverseNo;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNoTest 
{
	@Test
	public void reverse()
	{
		
		int reverse=321;				//expected result
		ReverseNo rev=new ReverseNo();
		int finalResult=rev.reverseNumber(123);	//pass the parameter to the method
		Assert.assertEquals(reverse, finalResult);
	}
}
