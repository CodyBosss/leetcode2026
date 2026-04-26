package leetcode.array;

public class IndexOfTarget {

	public static void main(String[] args) {
		int num[] = { 1, 3, 5, 6 };
		int target = 7;
		System.out.println(searchIndex(num, target));
	}

	public static int searchIndex(int num[], int target) {
		int left = 0, rigth = num.length - 1;
		while (left <= rigth) {
			int mid = left + (rigth - left) / 2;
			if (num[mid] == target) {
				return mid;
			} else if (num[mid] < target) {
				left = mid + 1;
			} else {
				rigth = mid - 1;
			}
		}
		return left;
	}
}
