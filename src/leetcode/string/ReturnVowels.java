package leetcode.string;

public class ReturnVowels {
	
	public static void main(String [] args) {
		String s = "leetcode";
		System.out.println(returnVowels(s));
	}
	
	public static String returnVowels(String s) {
		int l=0,r=s.length()-1;
		char [] c = s.toCharArray();
		while(l<r) {
			while(l<r && !isVowel(c[l])) {
				l++;
			}
			while(l<r && !isVowel(c[r])) {
				r--;
			}
			
			char temp = c[l];
			c[l] = c[r];
			c[r] = temp;
			
			l++; r--;			
		}
		return new String(c);
	}
	
	private static boolean isVowel(char c) {
		return "aeiouAEIUO".indexOf(c)!=-1;
	}
}
