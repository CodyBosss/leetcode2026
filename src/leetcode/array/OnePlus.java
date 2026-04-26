package leetcode.array;

import java.util.Arrays;

public class OnePlus {

	public static void main(String[] args) {
		int num[] = { 9, 9 };
		System.out.println(Arrays.toString(addOne(num)));
	}

	public static int[] addOne(int num[]) {
		for (int i = num.length - 1; i >= 0; i--) {
			num[i]++;
			if (num[i] < 10) {
				return num;
			}
			num[i] = 0;
		}
		int res[] = new int[num.length + 1];
		res[0] = 1;
		return res;
	}
}
