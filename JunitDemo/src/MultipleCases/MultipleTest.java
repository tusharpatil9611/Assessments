package MultipleCases;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MultipleTest 
{
	private int x ,y,result;
	public MultipleTest(int x, int y, int result)
	{
		super();
		this.x = x;
		this.y = y;
		this.result = result;
	}
	@Test
	public void addTest()
	{
		Addition add=new Addition();
		int actual=add.add(x, y);
		Assert.assertEquals(result, actual);
	}
	@Test
	public void subTest()
	{
		Addition sub=new Addition();
		int actual=sub.add(x, y);
		Assert.assertEquals(result, actual);
	}
	@Test(timeout=10)
	public void mulTest()
	{
		Addition mul=new Addition();
		int actual=mul.add(x, y);
		Assert.assertEquals(result, actual);
	}
	@Ignore
	@Parameterized.Parameters
    public static Collection<Integer[]> getParameters()
	{
        Integer [][]inputArr;
        inputArr=new Integer[][]{{1,2,3},
        						{-1,2,1},
        						{2,2,3},
        						{4,0,4}};
        return Arrays.asList(inputArr);
    }
}
