package JavaFeature8;

import java.util.Arrays;
import java.util.List;

public class CountEvenAndOddNum {
	
	public static void main(String [] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//count even num
		Long even = num.stream().filter(i->i%2==0).count();
		System.out.println(even);
		
		//count odd num
		Long odd = num.stream().filter(i->i%2!=0).count();
		System.out.println(odd);
	}

}
