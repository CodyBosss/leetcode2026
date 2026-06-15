package JavaFeature8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringUsingStream {
	
	public static void main(String [] args) {
		String s = "Sudhir";
		String rev = IntStream.range(0, s.length()).mapToObj(i->String.valueOf(s.charAt(s.length()-1-i)))
		.collect(Collectors.joining());
		System.out.println(rev);
	}

}
