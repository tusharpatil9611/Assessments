package Hamcrest;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

public class Hamcrest 
{
	@Test
    public void testEmailID(){  // JUnit Test case
        String email="tbarua1@gmail.com";
        Assert.assertTrue(email.contains("@"));
    }
    @Test
    public void testEmailIDHamcrest(){  // Hamcrest Test case
        String email="tusharpatil961111@gmail.com";
        Assert.assertThat(email, StringContains.containsString("gmail.com"));
    }
    @Test
    public void add()
    {
        int a=4;
        Assert.assertTrue(3<4);
    }
    
}
