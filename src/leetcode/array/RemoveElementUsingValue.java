package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementUsingValue {

	public static void main(String [] args) {
		int num [] = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeDuplicate(num, val));
	}
	
	public static int removeDuplicate(int num[], int val) {
		List<Integer> list = new ArrayList<>();
		int k=0;
		for(int i=0; i<num.length; i++) {
			if(num[i]!=val) {
				list.add(num[i]);
				k++;
			}
		}
		return k;
	}
}
