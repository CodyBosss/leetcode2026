package JavaFeature8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumIntoEvenAndOdd {
	
	public static void main(String [] args) {
		List<Integer> num = Arrays.asList(10,15,20,25,30,35,40,45,50);		
		Map<Boolean, List<Integer>> list = num.stream().collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println(list);
	}

}
