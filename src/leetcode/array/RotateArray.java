package leetcode.array;

import java.util.Arrays;

public class RotateArray {
	
	public static void main(String [] args) {
		int nums [] = {-1,-100,2,99};
		int k = 2;
		rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void rotate(int num [], int k) {
		k = k%num.length;
		reverse(num,0,num.length-1);
		reverse(num,0,k-1);
		reverse(num,k,num.length-1);
	}
	public static void reverse(int num [], int start, int end) {
		while(start<end) {
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++; end--;
		}
	}
}
