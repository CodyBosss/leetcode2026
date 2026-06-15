package JavaFeature8;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMinNumUsingStream {
	
	public static void main(String [] args) {
		List<Integer> num = Arrays.asList(40,10,30,50,20,60);
		Integer max = num.stream().max(Integer::compareTo).orElse(null);
		Integer min = num.stream().min(Integer::compareTo).orElse(null);
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}

}
