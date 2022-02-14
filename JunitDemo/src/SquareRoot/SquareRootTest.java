package SquareRoot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareRootTest
{
	@Test
	public void squareRoonTest()
	{
		SquareRoot instance = new SquareRoot();
		double expResult = 4;
		double result = instance.findSquareroot(16);   
		assertEquals("findSquareroot",expResult, result, 0.0);
	}
}
