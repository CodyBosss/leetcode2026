package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Test {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();		
		int [] num = {2,7,11,15};
		int target = 9;
		String output = Arrays.toString(twoSum(num, target));
		long endTime = System.currentTimeMillis();
		System.out.println("output: "+ output + " total time: " + (endTime - startTime));
	}
	 static int[] twoSum(int[] numbers, int target) {
		        int i = 0, j = numbers.length - 1;
		        while(i < j) {
		            int sum = numbers[i] + numbers[j];
		            if (sum == target) {
		                return new int[]{i + 1, j + 1};
		            } else if (target < sum) {
		                j--;
		            } else if (target > sum) {
		                i++;
		            }
		        }
		        return new int[0];
		    }

}