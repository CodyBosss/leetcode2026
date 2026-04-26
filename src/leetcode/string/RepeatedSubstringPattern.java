package leetcode.string;

public class RepeatedSubstringPattern {
	
	public static void main(String [] args) {
		String s = "abab"; //intput: "abab","ababba"
		System.out.println(repeatSubPattern(s));
	}
	
	public static boolean repeatSubPattern(String s) {	
		String join = s+s; //abababab
		String trimmed = join.substring(1,join.length()-1);
		return trimmed.contains(s);
	}
}