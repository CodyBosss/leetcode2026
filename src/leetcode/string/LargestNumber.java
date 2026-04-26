package leetcode.string;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int nums[] = { 3,30,34,5,9 };
		System.out.println(largestNumber(nums));
	}

	public static String largestNumber(int[] nums) {
		String [] s = new String[nums.length];
		for(int i=0; i<nums.length; i++) {
			s[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(s, (a,b)->(b+a).compareTo(a+b));
		if(s[0].equals("0"))return "0";
		StringBuilder sb = new StringBuilder();
		for(String str : s) {
			sb.append(str);
		}
		return sb.toString();
	}

}
