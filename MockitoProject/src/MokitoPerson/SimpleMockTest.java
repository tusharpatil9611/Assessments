package MokitoPerson;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SimpleMockTest {
	
	 @Test
	    public void listingObjects2(){
	        List mocklist=mock(List.class);
	        when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3);
	       Assert.assertEquals(1,mocklist.size());
	       Assert.assertEquals(2,mocklist.size());
	       Assert.assertEquals(3,mocklist.size());
	        System.out.println(mocklist.size());
	        System.out.println(mocklist);
	    }
}
