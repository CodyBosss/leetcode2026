package leetcode.array;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		int nums[] = { 1,2,3,4,5,3,2,3 };
		int target = 3;
		System.out.println(Arrays.toString(findFirstAndLastElementIndex(nums, target)));
	}

	public static int[] findFirstAndLastElementIndex(int nums[], int target) {
		int first = findFirst(nums, target);
		int last = findLast(nums, target);
		return new int[] {first, last};
	}
	
	public static int findFirst(int []nums, int target) {
		int low = 0, high = nums.length-1, ans = -1;		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(nums[mid]>=target) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
			if(nums[mid]==target) ans = mid;
		}
		return ans;
	}
	
	public static int findLast(int []nums, int target) {
		int low = 0, high = nums.length-1, ans = -1;		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(nums[mid]>=target) {
				low = mid+1;				
			}
			else {
				high = mid-1;
			}
			if(nums[mid]==target) ans = mid;
		}
		return ans;
	}
}
