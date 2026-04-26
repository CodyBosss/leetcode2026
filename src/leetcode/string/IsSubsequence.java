package leetcode.string;

public class IsSubsequence {
	
	public static void main(String [] args) {
		String s = "abc";
		String t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}
	public static boolean isSubsequence(String s, String t) {
		int i=0, j=0;
		StringBuilder sb = new StringBuilder();
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)!=t.charAt(j)) {
				j++;
			}
			else {
				sb.append(t.charAt(j));
				i++;j++;
			}
		}
		if(s.equals(sb.toString())) return true;		
		return false;
	}
}
