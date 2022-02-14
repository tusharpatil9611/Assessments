package Fact;

import org.junit.Assert;
import org.junit.Test;

public class factTest {
@Test
	public void factTestM()
	{
		int fact=120;
		fact f=new fact();
		int actualResult=f.fact(5);
		Assert.assertEquals(fact,actualResult);
	}
}

