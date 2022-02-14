package Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LineWordCharacter
{
	public static void main(String[] args) throws Exception 
	{
		 FileReader f = new FileReader("demo.txt");
         int l,w,ch;
         l=w=ch=0;
         int c;
         while((c=f.read())!=-1)
         {    if(c==' ')
                 w++;
             else if(c=='\n')
             {    l++; w++;
             }
             else
                 ch++;
         }
         System.out.println("Lines: "+l+" Words:"+w+"  Characters:"+ch);
	}
}
