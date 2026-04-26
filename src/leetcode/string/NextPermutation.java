package leetcode.string;

public class NextPermutation {

	public static void main(String [] args) {
		String str = "abc";
		System.out.println(findPermutation(str));
	}
	public static String findPermutation(String str) {
		char [] ch = str.toCharArray();
		int n = ch.length;
		
		int i=n-2;
		while(i>=0 && ch[i]>=ch[i+1]) {
			i--;
		}
		if(i>=0) {
			int j=n-1;
			while(ch[j]<=ch[i]) {
				j--;
			}
			swap(ch,i,j);
		}
		reverse(ch,i+1,n-1);
		return new String(ch);
	}
	public static void swap(char [] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
	public static void reverse(char [] ch, int start, int end) {
		while(start<end) {
			swap(ch, start, end);
			start++;
			end--;
		}
	}
}
