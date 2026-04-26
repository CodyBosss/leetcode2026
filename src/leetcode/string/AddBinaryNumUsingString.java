package leetcode.string;

import java.math.BigInteger;

public class AddBinaryNumUsingString {
	public static void main(String [] args) {
		String a = "11";
		String b = "11";
		System.out.println(addBinary(a, b));
	}
	public static String addBinary(String a, String b) {
//		BigInteger num1 = new BigInteger(a,2);
//		BigInteger num2 = new BigInteger(b,2);		
//		BigInteger res = num1.add(num2);
//		return res.toString(2);
		
		StringBuilder sb = new StringBuilder();
		int i=a.length()-1;
		int j=b.length()-1;
		int carry = 0;
		
		while(i>=0 || j>=0) {
			int sum = carry;
			if(i>=0)
				sum+=a.charAt(i--) - '0';
			if(j>=0)
				sum+=b.charAt(j--) - '0';
			
			sb.append(sum%2);
			carry = sum/2;
		}
		if(carry!=0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}
}
