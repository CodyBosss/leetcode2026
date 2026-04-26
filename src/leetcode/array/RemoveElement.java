package leetcode.array;

public class RemoveElement {
	
	public static void main(String [] args) {
		int [] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int k = 0;
		System.out.println(removeElement(nums, val, k));
	}
	public static int removeElement(int [] nums, int val, int k) {
		for(int j = 0; j<nums.length; j++) {
			if(nums[j]!=val) {
				nums[k]=nums[j];
				k++;
			}
		}
		return k;
	}

}
