package leetcode.array;

import java.util.Arrays;

public class AddZeroes {
	public static void main(String [] args) {
		int nums [] = {0,1,0,2,3};
		addZero(nums);
	}
	public static void addZero(int nums []) {
		int i=0, j=0;
		while(i<nums.length) {
			if(nums[i]!=0) {
				nums[j++] = nums[i++];
			}
			else {
				i++;
			}
		}
		while(j<nums.length) {
			nums[j++] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}
}
