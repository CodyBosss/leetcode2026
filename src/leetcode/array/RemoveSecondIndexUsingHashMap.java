package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class RemoveSecondIndexUsingHashMap {
	public static void main(String [] args) {
		int num [] = {1,2,3,4};
		System.out.println(addAndRemove(num));
	}
	
	public static Map<Integer, Integer> addAndRemove(int num []){
		int k = 2;
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<num.length; i++) {
//			Solution 1
//			if(i==k) {
//				continue;
//			}
			
//			Solution 2
			
			mp.values().removeIf(v->v==k);
			
			mp.put(num[i],i);
		}
		return mp;
	}
}
