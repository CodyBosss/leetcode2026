package JavaFeature8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatativeCharacter {
	public static void main(String [] args) {
		String s = "swiss";
		Character res = s.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(i->i.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(res);
	}
}
