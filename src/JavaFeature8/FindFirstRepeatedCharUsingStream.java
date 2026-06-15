package JavaFeature8;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedCharUsingStream {
	
	public static void main(String [] args) {
		String s = "swiss";
		Set<Character> hs = new HashSet<>();
		Character res = s.chars().mapToObj(c->(char)c)
				.filter(i->!hs.add(i)).findFirst().orElse(null);
		System.out.println(res);
	}

}
