package leetcode.string;

import java.math.BigInteger;

public class MultiplyString {
	public static void main(String [] args) {
		String num1 = "123";
		String num2 = "456";
		System.out.println(mutlipleString(num1, num2));
	}
	public static String mutlipleString(String num1, String num2) {
		
//		1 approach
//		long n1 = Long.parseLong(num1);
//		long n2 = Long.parseLong(num2);
//		long res = n1*n2;
//		return String.valueOf(res);	
		
//		2 approach
//		BigInteger n1 = new BigInteger(num1);
//		BigInteger n2 = new BigInteger(num2);		
//		BigInteger res = n1.multiply(n2);		
//		return res.toString();
		
//		3 approach
		
		if(num1.equals("0") || num2.equals("0")) return "0";		
		int n = num1.length(), m=num2.length();
		int res [] = new int[n+m];
		for(int i=n-1; i>=0; i--) {
			for(int j=m-1; j>=0; j--) {
				int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				int sum = mul+res[i+j+1];
				res[i+j+1] = sum%10;
				res[i+j] = res[i+j]+sum/10;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int num : res) {
			if(!(sb.length()==0 && num==0)) {
				sb.append(num);
			}
		}
		return sb.length()==0 ? "0" : sb.toString();
	}
}
