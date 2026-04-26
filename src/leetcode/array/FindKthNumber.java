package leetcode.array;

public class FindKthNumber {
	public static void main(String [] args) {
		int num [] = {1,2,3,4};
		int k = 2;
		System.out.println(findKthNum(num, k));
	}
	public static int findKthNum(int num[], int k) {
		int n = num.length;
		for(int i=0; i<num.length; i++) {
			int missing = num[i]-(i+1);
			if(missing>=k) {
				return k+i;
			}
		}
		return k+n;
	}

}
