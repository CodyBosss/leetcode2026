package JavaFeature8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {
	
	public static void main(String [] args) {
		List<String> str = Arrays.asList("Sudhir","Khandare","Java","Developer");
		
		//Longest String
		String longestString = str.stream().max(Comparator.comparing(String::length)).orElse(null);
		System.out.println(longestString);
		
		//Shortest String
		String shortestString = str.stream().min(Comparator.comparing(String::length)).orElse(null);
		System.out.println(shortestString);
	}

}
