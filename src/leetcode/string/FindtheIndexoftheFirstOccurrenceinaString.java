package leetcode.string;

public class FindtheIndexoftheFirstOccurrenceinaString {
	
	public static void main(String [] args) {
		String a = "hello";
		String b = "ll";
		System.out.println(indexOfFirstOccurence(a, b));
	}
	public static int indexOfFirstOccurence(String a, String b) {
		return a.indexOf(b);
	}
}
