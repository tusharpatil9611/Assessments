package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.Assert;
public class CalculaterTest {
	int x=0;
	int y=0;
	int result=0;
	Calculator cal=null;
	 @BeforeClass
	    public static void setupClassLevel()
	 	{
	        System.out.println("Invoke before loading class in JVM");
	    }
	@Before
	public void setUp()			//always execuite first any time.
	{
		 x=30;
		 y=20;
		 cal=new Calculator();
	}
@Test
	public void additionTest()
	{
			result=50;
		int finalResult=cal.addition(x, y);
		Assert.assertEquals(result, finalResult);
		
		
	}
@Test
	public void subTest()
	{
			result=10;
			int finalSub=cal.subtraction(x, y);
		Assert.assertEquals(result, finalSub);
		
	}
@Test
	public void mulTest()
	{
		result=600;
		int finalSub=cal.multiplication(x, y);
		Assert.assertEquals(result, finalSub);
	
	}
@Test
	public void divTest()
	{
	    result=2;
	    int finalSub=cal.division(x, y);
	    Assert.assertEquals(result, finalSub);
	
	}
@Test
	public void modTest()
	{
	    result=10;
	    int finalSub=cal.modul(x, y);
	    Assert.assertEquals(result, finalSub);
	
	}

@After
	public void cleaning()			//clear the calculator output
	{
		x=0;
		y=0;
		cal=null;
	}
@Test
	public void squTest()
	{
	    result=900;
	    int finalSub=cal.square(x);
	    Assert.assertEquals(result, finalSub);
	
	}
@AfterClass
	public static void  setupAfterClassLevel()
	{
    	System.out.println("Invoke After class loading class in JVM");
	}
}
