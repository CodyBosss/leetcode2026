package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumIndexSumOfTwoLists {

	public static void main(String[] args) {
		String list1[] = { "happy", "sad", "good" };
		String list2[] = { "sad", "happy", "good" };
		System.out.println(Arrays.toString(findRestaurant(list1, list2)));
	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		int minSum = Integer.MAX_VALUE;

		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}

		for (int i = 0; i < list2.length; i++) {
			if (map.containsKey(list2[i])) {
				int sum = i + map.get(list2[i]);
				if (sum < minSum) {
					list.clear();
					list.add(list2[i]);
					minSum = sum;
				} else if (sum == minSum) {
					list.add(list2[i]);
				}
			}
		}
		return list.toArray(new String[0]);
	}

}
