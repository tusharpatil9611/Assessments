package LambdaExprssion;

import java.util.Random;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class LambdaDemo {

	public static void main(String[] args)
	{
        Scanner console = new Scanner(System.in);
 
        // quiz the user on 3 addition problems
        giveProblems(console, 3, "+", (x, y) -> x + y);
 
        // quiz the user on 3 multiplication problems
        giveProblems(console, 3, "*", (x, y) -> x * y);
	}

	private static void giveProblems(Scanner console, int count, String text, IntBinaryOperator operator)
	{
		Random r = new Random();
        int numRight = 0;
        for (int i = 1; i <= count; i++) 
        {
            int x = r.nextInt(12) + 1;
            int y = r.nextInt(12) + 1;
            System.out.print(x + " " + text + " " + y + " = ");
            int answer = operator.applyAsInt(x, y);
            int response = console.nextInt();
            if (response == answer) 
            {
                System.out.println("you got it right");
                numRight++;
            } 
            else 
            {
                System.out.println("incorrect...the answer was "
                                   + answer);
            }
        }
        System.out.println(numRight + " of " + count + " correct");
        System.out.println();
    }	
}

	


