package UncheckedException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CompileTimeException {
	public static void main(String[] args) 
	{
		File f=new File("hello.txt");
        try {
            FileWriter fileWriter=new FileWriter(f);
            fileWriter.write("Hi i am writing a file");
            fileWriter.close();
        }
        catch (IOException e) 
        {   // Compile time exception
            e.printStackTrace();
        }
	}
}
