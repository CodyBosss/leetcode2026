package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		String t = "anagram";
		String s = "nagaram";
		System.out.println(validAnagram(t, s));
	}

	public static boolean validAnagram(String t, String s) {
		if(s.length()!=t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        for(char c : s.toCharArray()){
        	if(!map.containsKey(c))return false;
        	map.put(c, map.get(c)-1);
        	if(map.get(c)<0)return false;
        }
        return true;
	}
}
