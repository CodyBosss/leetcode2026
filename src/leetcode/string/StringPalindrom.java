package leetcode.string;

public class StringPalindrom {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
	s=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
	
//	Solution 1
//		String rev = new StringBuilder(s).reverse().toString();		
//		return s.equals(rev);
	
//	Solution 2
//	String rev = "";
//	for(int i=s.length()-1; i>=0; i--) {
//		rev = rev+s.charAt(i);
//	}
//	if(s.equals(rev)) 
//		return "P";
//	
//	else 
//		return "NP";
	
		
//	Solution 3
		int l = 0, r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return false;
			}
			l++;r--;
		}
		return true;
	}
}