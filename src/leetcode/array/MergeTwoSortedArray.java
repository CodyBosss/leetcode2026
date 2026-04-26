package leetcode.array;

import java.util.Arrays;

public class MergeTwoSortedArray {
	
	public static void main(String [] args) {
		int a [] = {1,2,3,0,0,0};
		int b [] = {2,5,6};
		int m=3, n=3;
		System.out.println(Arrays.toString(mergeTwoArrays(a, b, m, n)));
	}
	
	public static int[] mergeTwoArrays(int a[], int b[], int m, int n) {
		int idx=m+n-1, i=m-1, j=n-1;
		while(i>=0 && j>=0) {
			if(a[i]>=b[j]) {
				a[idx] = a[i];
				idx--; i--;
			}
			else {
				a[idx] = b[j];
				idx--;j--;
			}
		}
		while(j>=0) {
			a[idx] = b[j];
			idx--;j--;
		}
		return a;
	}
}
