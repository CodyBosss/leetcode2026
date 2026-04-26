package leetcode.array;

import java.util.Arrays;

public class MergeTwoArrayAndFindMedian {

	public static void main(String[] args) {
		int a[] = { 1, 3 };
		int b[] = { 2 };
		System.out.println(findMedian(a, b));
	}

	public static double findMedian(int[] a, int[] b) {

		int idx = 0, i = 0, j = 0;
		int arr[] = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				arr[idx] = a[i];
				idx++;
				i++;
			} else {
				arr[idx] = b[j];
				idx++;
				j++;
			}
		}
		while (i < a.length) {
			arr[idx] = a[i];
			idx++;
			i++;
		}

		while (j < b.length) {
			arr[idx] = b[j];
			idx++;
			j++;
		}
		
		double result = 0;
		int n = arr.length;			//1,2,3
		if(n%2!=0)
			result = arr[n/2];		
		else
			result = (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
		
		return result;
	}

}
