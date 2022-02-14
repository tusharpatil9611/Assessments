package MapModifier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LongestLineFromFile {

	public static void main(String[] args) throws Exception
	{
		int longest = Files.lines(Paths.get("my.text"))
			    .mapToInt(String::length)
			    .max()
			    .getAsInt();
		System.out.println(longest);
	}

}
