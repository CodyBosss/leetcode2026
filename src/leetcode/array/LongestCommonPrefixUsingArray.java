package leetcode.array;

public class LongestCommonPrefixUsingArray {
	
	public static void main(String [] args) {
		String [] str = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(str));
	}
	
	public static String longestCommonPrefix(String [] str) {
		if(str==null || str.length==0) return "";
		String prefix = str[0];//flower
		
		//(loop starts from index 1 i.e "flow")
		for(int i=1; i<str.length; i++) { 
			
			//str["flow"].indexOf("flower")!=0 ---->-1!=0 -->true it will enter inside while loop.
			while(str[i].indexOf(prefix)!=0) {
				
				//prefix.substring(0,6-1) --->(0,5) again it will check while loop.
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty())return "";
			}
		}
		return prefix;
	}

}
