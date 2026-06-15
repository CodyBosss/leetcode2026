package JavaFeature8;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDupCharUsingStream {
	
	public static void main(String [] args) {
		String s = "programming";
		s.chars().mapToObj(c->(char)c).collect(
				Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().forEach(System.out::println);
	}
}
