package JavaFeature8;

import java.util.Arrays;
import java.util.List;

public class FindEvenAndOddNum {
	public static void main(String [] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> even = num.stream().filter(i->i%2==0).toList();
		System.out.println("Even : "+even);
		
		List<Integer> odd = num.stream().filter(i->i%2!=0).toList();
		System.out.println("Odd : "+odd);
	}
	
}
