package JavaFeature8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurancesUsingStream {

	public static void main(String[] args) {
		String s = "Welcome to mumbai and Welcome to Pune";
		Map<String, Long> list = Arrays.stream(s.split("\\s+"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(list);
	}
}
