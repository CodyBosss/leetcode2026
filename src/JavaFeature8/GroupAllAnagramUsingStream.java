package JavaFeature8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAllAnagramUsingStream {
	
	public static void main(String [] args) {
		String [] arr = {"abc","bac","eat","ate","tea","flow","wolf"};
		List<String> list = Arrays.asList(arr);
		Map<String, List<String>> group = list.stream()
				.collect(Collectors.groupingBy(s->s.chars().sorted()
						.collect(StringBuilder::new,
								StringBuilder::appendCodePoint,
								StringBuilder::append).toString()));
		System.out.println(group);
	}

}
