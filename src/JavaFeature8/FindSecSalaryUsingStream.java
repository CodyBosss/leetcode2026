package JavaFeature8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecSalaryUsingStream {
	
	public static void main(String [] args) {
		List<Integer> sal = Arrays.asList(50000,10000,90000,30000,60000,40000);
		Integer list = sal.stream().sorted(Collections.reverseOrder())
				.skip(2).findFirst().orElse(null);
		System.out.println(list);
		
		//for emp class
//		double res = list.stream().map(Test::getSal).distinct()
//				.sorted(Collections.reverseOrder()).skip(2).findFirst()
//				.orElse(null);
		
 	}

}
