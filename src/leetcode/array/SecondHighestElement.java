package leetcode.array;

import java.util.Arrays;

public class SecondHighestElement {
	public static void main(String [] args) {
		int num [] = {5,1,8,3,1,6,7};
		System.out.println(secHighestElement(num));
	}
	
	public static int secHighestElement(int num []) {
		//using Java 8 feature
//		int result = Arrays.stream(num).distinct().sorted().skip(1).findFirst().orElseThrow(()->new IllegalStateException("No second element present"));
//		return result;
		
//		Using simple loop
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num[i];
			}
			else if(secondLargest<num[i] && num[i]!=firstLargest) {
				secondLargest = num[i];
			}
		}
		return secondLargest;
	}
}
