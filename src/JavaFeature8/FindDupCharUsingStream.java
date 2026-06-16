package JavaFeature8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDupCharUsingStream {
	
	public static void main(String [] args) {
		String s = "programming";
		
		//This approach will count each character.
		s.chars().mapToObj(i->(char)i)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()>1)
		.map(Map.Entry::getKey).forEach(System.out::println);
		
		
	}
}
