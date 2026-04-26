package leetcode.string;

public class StringSwapping {
	
	public static void main(String [] args) {
		String a = "Sudhir";
		String b = "Ronny";
		System.out.println(a+"...."+b);
		a = a+b;   //"SudhirRonny"
		b =  a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println(a+"...."+b);
	}

}
