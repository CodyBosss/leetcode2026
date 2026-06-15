package JavaFeature8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStream {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 7, 4);
		Set<Integer> dup = num.stream().filter(i->Collections.frequency(num, i)>1).collect(Collectors.toSet());
		System.out.println(dup);
	}

}
