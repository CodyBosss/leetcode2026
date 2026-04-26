package leetcode.array;

public class SearchInRotatedSortedArray {
	public static void main(String [] args) {
		int [] nums = {1};
		int target = 0;
		System.out.println(searchTarget(nums, target));
	}
	public static int searchTarget(int [] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
