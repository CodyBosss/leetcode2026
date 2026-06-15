package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagram {
	
	public static void main(String [] args) {
		String str [] = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(anagram(str));
	}
	public static List<List<String>> anagram(String [] str){
		Map<String, List<String>> mp = new HashMap<>();
		for(String s : str) {
			char [] c = s.toCharArray();
			Arrays.sort(c);
			String k = new String(c);
			
			mp.computeIfAbsent(k, i-> new ArrayList<>()).add(s);
		}		
		return new ArrayList<>(mp.values());
	}

}
