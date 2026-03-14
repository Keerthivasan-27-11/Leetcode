package Leetcode31;
import java.util.regex.*;
public interface Leetcode1888 {
	public static void main(String[] args) {
		String s = "10001100101000000";
		int count = 0;
		int min = s.length();
		String str = s+s;
		for(int i = 0;i<s.length();i++) {
			int a = 0;
			StringBuffer sb = new StringBuffer(str.substring(i,i+s.length()));
			for(int j = 0;j<sb.length()-1;j++) {
				if(sb.substring(j,j+1).equals(sb.substring(j+1,j+2))) {
					a++;
					if(sb.substring(j+1,j+2).equals("1")) {
						sb.replace(j+1,j+2,"0");
					}else {
						sb.replace(j+1,j+2,"1");
					}
				}
			}
			
			min = Math.min(a, min);
		}
		System.out.println(min);
	}
}
