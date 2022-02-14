package String;

public class ReadingSingleCharacter {
	public static void main(String[] args) throws Exception
    {
       char c;
       System.out.println("Enter a character");
       c = (char)System.in.read();
       System.in.read();			//to read the string from the console
       System.out.println("You entered " + c);
    }
}
