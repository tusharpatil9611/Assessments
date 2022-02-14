package String;
//java program to find length of the given string
import java.util.Scanner;

public class StringLength
{
	 public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		System.out.println(" "+s);
		System.out.println("length of the String:"+s.length());
		System.out.println("compre to"+s.compareTo("asd"));
		System.out.println("To upperCase"+s.toUpperCase());
		System.out.println("To lower case"+s.toLowerCase());
		System.out.println("SubString MEthod"+s.substring(1, 4));
		System.out.println("");
	}
}
