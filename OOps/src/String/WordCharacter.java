package String;

import java.util.Scanner;

public class WordCharacter
{
	public static void main(String args[ ])
    {   
		String s=new String();
        int l=1,c=0,i,w=1,n;
        Scanner g=new Scanner(System.in);
        System.out.println("Enter the line of text:");
        s=g.nextLine();
        System.out.println("No. of lines words charectors in a text");
        for(i=0;i<s.length();i++)
        {    
        	if(s.charAt(i)==' ')
            {   
        		w++;
            }
            if(s.charAt(i)=='\n')
            l++;
        }
        System.out.println("WORDS"+w+"\n"+"CHARACTER"+s.length()+"\n"+"LINES:"+l);
    }
}
