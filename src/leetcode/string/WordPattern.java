package leetcode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat dog";
		System.out.println(wordPattern(pattern, s));
	}

	public static boolean wordPattern(String pattern, String s) {
		if (pattern == null || s == null)
			return false;
		String[] a = s.split(" ");
		if (pattern.length() != a.length)
			return false;
		Map<Character, String> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			if (map.containsKey(c)) {
				if (!map.get(c).equals(a[i]))
					return false;
			} else {
				if (map.containsValue(a[i]))
					return false;
				map.put(c, a[i]);
			}
		}
		return true;
	}
}
