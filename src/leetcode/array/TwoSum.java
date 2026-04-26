package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String [] args) {
		int [] nums = {2,7,11,10};
		int target = 9;
		System.out.println(Arrays.toString(TwoSum(nums, target)));
	}
	public static int [] TwoSum(int [] nums, int target) {
		Map<Integer, Integer>map = new HashMap<>();
		for(int i=0; i<nums.length; i++) { 
			int value = target - nums[i];  
			if(map.containsKey(value)) {
				return new int[] {map.get(value), i};
			}
			map.put(nums[i], i); 
		}
		return new int[] {};
	}

}
