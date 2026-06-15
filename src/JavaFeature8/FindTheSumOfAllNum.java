package JavaFeature8;

import java.util.Arrays;
import java.util.List;

public class FindTheSumOfAllNum {
	
	public static void main(String [] args) {
		List<Integer> num = Arrays.asList(1,2,3);
		
		//approach 1
		int sum = num.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
		//approach 2 : best way to find sum bcs it is concise and designed specifically for numeric streams.		
		int res = num.stream().mapToInt(Integer::intValue).sum();
		System.out.println(res);
	}
	
}
