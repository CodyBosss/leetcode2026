package JavaFeature8;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	
	public static void main(String [] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,2,3,4,5);
		List<Integer> removeDup = num.stream().distinct().toList();
		System.out.println(removeDup);
	}

}
