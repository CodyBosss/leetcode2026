package JavaFeature8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordByLength {

	public static void main(String[] args) {
		List<String> word = Arrays.asList("Java","Spring","Boot","Developer");
		Map<Integer, List<String>> groupWordByL = word.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupWordByL);
	}

}
