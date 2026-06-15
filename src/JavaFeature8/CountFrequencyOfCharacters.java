package JavaFeature8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacters {
	
	public static void main(String [] args) {
		String s = "swiss";
		Map<Character, Long> mp = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(
				Function.identity(), Collectors.counting()));
		System.out.println(mp);
	}

}
