package leetcode.array;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoArray {
	
	public static void main(String [] args) {
		int a [] = {1,2,3,4,5};
		int b [] = {4,5,6,7,8};
		System.out.println(commonElements(a, b));
	}
	
	public static List<Integer> commonElements(int a[], int b[]) {
	List<Integer> result = Arrays.stream(a).filter(num->Arrays.stream(b).anyMatch(arr1->arr1==num)).boxed().collect(Collectors.toList());
	return result;
	}

}
