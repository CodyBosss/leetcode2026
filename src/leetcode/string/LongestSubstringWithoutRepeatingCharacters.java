package leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String [] args) {
		String str = "pwwkew";
		System.out.println(longestSubString(str));
	}
	public static int longestSubString(String str) {
		int left = 0, mL=0;
		Set<Character> set = new HashSet<>();
		for(int right = 0; right<str.length(); right++) {
			while(set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(right));
			mL = Math.max(mL, right-left+1);
		}
		return mL;
	}
}
