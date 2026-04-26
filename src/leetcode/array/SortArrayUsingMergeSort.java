package leetcode.array;

import java.util.Arrays;

public class SortArrayUsingMergeSort {

	public static void main(String[] args) {
		int num[] = { 8, 1, 2, 5, 4, 9, 7 };
		int n = num.length;
		int start = 0, end = n-1;
		divide(num, start, end);
		System.out.println(Arrays.toString(num));
	}

	public static void divide(int num[], int start, int end) {
		if(start>=end) {
			return;
		}
		int mid = start+(end-start)/2;
		divide(num, start, mid);
		divide(num, mid+1, end);
		conquer(num, start, mid, end);
	}
	public static void conquer(int num[], int start, int mid, int end) {
		int i=start, j=mid+1, idx=0;
		int newArr[] = new int[end-start+1];
		while(i<=mid && j<=end) {
			if(num[i]<=num[j]) {					// 8, 1, 2, 5, 4, 9, 7
				newArr[idx++] = num[i++];
			}
			else {
				newArr[idx++] = num[j++];
			}
		}
		while(i<=mid) {
			newArr[idx++] = num[i++];
		}
		while(j<=end) {
			newArr[idx++] = num[j++];
		}
		for(int x=0, y=start; x<newArr.length; x++, y++) {
			num[y] = newArr[x];
		}
	}
}