package JavaFeature8;

import java.util.List;

public class SeperateConsonantFromString {
	
	public static void main(String [] args) {
		String s = "Sudhir";
		seperateConsonant(s);
	}
	
	public static void seperateConsonant(String s) {
//		StringBuilder sb = new StringBuilder();
//		for(char c : s.toCharArray()) {
//			if("AEIOUaeiou".indexOf(c)==-1) {
//				sb.append(c);
//			}
//		}
//		return sb.toString();
		
		s.chars().mapToObj(c->(char)c)
		.filter(ch->"AEIOUaeiou".indexOf(ch)==-1)
		.forEach(ch->System.out.println(ch+" "));
	}
}
