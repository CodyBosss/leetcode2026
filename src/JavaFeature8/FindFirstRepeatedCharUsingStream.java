package JavaFeature8;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharUsingStream {
	
	public static void main(String [] args) {
		String s = "swiss";
		
		//first approach
		Set<Character> hs = new HashSet<>();
		Character res = s.chars().mapToObj(c->(char)c)
				.filter(i->!hs.add(i)).findFirst().orElse(null);
		System.out.println(res);
		
		//sec approach
		Character find = s.chars().mapToObj(n->(char)n)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(i->i.getValue()>1).map(Map.Entry::getKey).skip(1).findFirst().orElse(null);
		System.out.println(find);
	}

}
