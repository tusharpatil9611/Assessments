package Hamcrest;

import static org.junit.Assert.assertThat;


import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;


public class StringConatin {
	@Test
	public void testStringCont()		// litter slow
	{
		assertThat("tusharpatil@gmail.com", containsString("tushar"));
	}
	 @Test
	    public void testendsWith()		/// fastest approach
	 {
	        assertThat("tbarua1@gmail.com",endsWith("@gmail.com"));
	 }
	 
	 @Test
	    public void testbeginsWith(){ // fastest approach
	        assertThat("tbarua1@gmail.com",startsWith("tush"));
	    }
	@Test
	public void tesdEqual()
	{
		assertThat("tushar", equalTo());
	}
	private Matcher<? super String> equalTo() {
		// TODO Auto-generated method stub
		return null;
	}
}
