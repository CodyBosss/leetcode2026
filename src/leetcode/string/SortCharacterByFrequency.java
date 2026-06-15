
package leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {
	
	public static void main(String [] args) {
		String str = "trzz";
		System.out.println(frequencySort(str));
	}
	
	public static String frequencySort(String str) {
		Map<Character, Integer> freq = new HashMap<>();
		for(char c: str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		List<Character> chars = new ArrayList<>(freq.keySet());
		chars.sort((a,b)->freq.get(b) - freq.get(a));
		StringBuilder sb = new StringBuilder();
		for(char c : chars) {
			int count = freq.get(c);
			for(int i=0; i<count; i++) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
