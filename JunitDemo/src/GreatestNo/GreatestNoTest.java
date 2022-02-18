package GreatestNo;

import org.junit.Test;

import junit.framework.Assert;

public class GreatestNoTest 
{
	@Test
	public void greatestNo()
	{
		int a=10;
		int b=20;
		int c=30;
		int result=20;
		int finalResult=GreatestNumber.greatest(a, b, c);
		Assert.assertEquals(result, c);
				
	}
}
