
package leetcode.string;

public class MaximumProductOfWordLengths {

	public static void main(String[] args) {
		String[] words = { "a", "ab", "abc", "d", "cd", "bcd", "abcd" };
		System.out.println((productLength(words)));
	}

	public static int wordsLength(String[] words) {
		int maxL = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (noCommonLetter(words[i], words[j])) {
					int product = words[i].length() * words[j].length();
					maxL = Math.max(maxL, product);
				}
			}
		}
		return maxL;
	}

	private static boolean noCommonLetter(String a, String b) {
		for (char c : a.toCharArray()) {
			if (b.indexOf(c) != -1) {
				return false;
			}
		}
		return true;
	}

	public static int productLength(String[] words) {
		int max = 0;
		int n = words.length;
		int mask[] = new int[n];
		int length[] = new int[n];
		for (int i = 0; i < words.length; i++) {
			int bitmask = 0;
			for (char c : words[i].toCharArray()) {
				bitmask = bitmask | (1 << (c - 'a'));
			}
			mask[i] = bitmask;
			length[i] = words[i].length();
		}

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if ((mask[i] & mask[j]) == 0) {
					max = Math.max(max, length[i] * length[j]);
				}
			}
		}
		return max;
	}

}
