package JavaFeature8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAvgUsingStream {
	
	public static void main(String [] args) {
		List<Integer> num = Arrays.asList(10,20,30,40,50);
		
		//Approach 1
		OptionalDouble avg = num.stream().mapToInt(Integer::intValue).average();
		System.out.println(avg);
		
		//Approach 2
		double res = num.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(res);
		
		//Average od odd numbers
		List<Integer> oddNum = Arrays.asList(1,2,3,4,5,6,7,8,9);
		double oddAvg = oddNum.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(oddAvg);
	}
}
