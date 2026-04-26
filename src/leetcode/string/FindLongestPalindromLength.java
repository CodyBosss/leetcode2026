package leetcode.string;

import java.util.Arrays;

public class FindLongestPalindromLength {

	public static void main(String [] args) {
		String s = "abccccdd";
		System.out.println(longestPalindromLength(s));
	}
	public static int longestPalindromLength(String s) {
		int count [] = new int[128];
		for(char c : s.toCharArray()) {
			count[c]++;
		}
		int length = 0;
		boolean oddFound = false;
		for(int freq : count) {
			if(freq%2==0) {
				length = length+freq;
			}
			else {
				length = length+freq-1;
				oddFound = true;
			}
		}
		if(oddFound)length++;		
		return length;
	}
}
