package leetcode.string;

public class LengthOfWord {
	
	public static void main(String [] args) {
		String s = "Hello World        ";
		System.out.println(lengthOfWorld(s));
	}
	public static int lengthOfWorld(String s) {
		if(s==null || s.length()==0) return 0;		
		s.trim();
		String arr [] = s.split(" ");
		return arr.length;
	}
}
