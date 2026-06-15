package leetcode.string;

public class RepeatedSubstringPattern {
	
	public static void main(String [] args) {
		String s = "ababkk"; //intput: "abab","ababba"
		System.out.println(repeatSubPattern(s));
	}
	
	public static boolean repeatSubPattern(String s) {	
		String jn = s+s;
		String trimmed = jn.substring(1,jn.length()-1);
		return trimmed.contains(s);
	}
}