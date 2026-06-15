package JavaFeature8;

import java.util.Arrays;

public class CountWordOccurencesUsingString {
	public static void main(String [] args) {
		String str = "Welcome to Pune or Welcome to Mumbai";
		String findWord = "Welcome";
		countWord(str, findWord);
	}
	
	public static void countWord(String str, String findWord) {
		long count = Arrays.stream(str.split("\\s+"))
				.filter(word->word.equalsIgnoreCase(findWord))
				.count();
		
		System.out.println("Occurences of "+findWord+" are : "+count);
	}

}
