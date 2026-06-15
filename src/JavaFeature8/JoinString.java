package JavaFeature8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
	
	public static void main(String [] args) {
		List<String> str = Arrays.asList("Java","Developer");
		String joinString = str.stream().collect(Collectors.joining());
		System.out.println(joinString);
	}
}
