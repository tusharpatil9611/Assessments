package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo 
{
	public static void main(String args[ ])
    {
        String s=new String("abc def gh hj");
        StringTokenizer t=new StringTokenizer(s);
        System.out.println(t.countTokens());
        while(t.hasMoreTokens());
        System.out.println(t.nextToken());
    }
}
