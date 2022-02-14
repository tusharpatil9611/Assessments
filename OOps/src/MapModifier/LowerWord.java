package MapModifier;

import java.util.*;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LowerWord {

	public static void main(String[] args)
	{
		List<String> words = Arrays.asList(
			    "To", "be", "or", "Not", "to", "be");
		Set<String>word2=words.stream().map(String::toLowerCase).collect(Collectors.toSet());
		System.out.println("Word 2 :"+word2);
		List<String>word3=Arrays.asList( "To", "be", "or", "Not", "to", "be");
		Set<String>word4=word3.stream().map(String::toUpperCase).collect(Collectors.toSet());
		System.out.println("Word 4 :"+word4);
	}

}
