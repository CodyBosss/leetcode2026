package leetcode.string;

public class RansomNotesUsingString {
	
	public static void main(String [] args) {
		String r = "aa";
		String m = "ab";
		System.out.println(canConstruct(r, m));
	}
	public static boolean canConstruct(String r, String m) {
		if(r==null || m==null)return false;
		if(r.length()>m.length())return false;
		int arr[] = new int[26];
		for(int i=0; i<m.length(); i++) {
			char c = m.charAt(i);
			if(c >= 'a' && c <= 'z') {
				++arr[c-'a'];
			}
		}
		for(int i=0; i<r.length(); i++) {
			char c = r.charAt(i);
			if(c<'a' || c>'z') {
				return false;
			}
			if(--arr[c-'a']<0) {
				return false;
			}
		}
		return true;
	}
}
