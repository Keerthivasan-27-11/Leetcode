package Leetcode31;
import java.lang.*;
public class Leetcode1545 {
	public static void main(String[] args) {
//		String s = "101010";
		int n = 3,k = 1;
		String s= "0";
		System.out.println(s);
		StringBuilder sb1 = new StringBuilder();
		for(int j = 1;j<n;j++) {
			StringBuffer sb2 = new StringBuffer(s);
		for(int i = 0;i<s.length();i++) {
			if(s.substring(i,i+1).equals("1")) {
			sb2.setCharAt(i, '0');
			}
			else {
				sb2.setCharAt(i, '1');
			}
			}
		String str = sb2.toString();
		s= s+"1"+sb2.reverse();
		}
		System.out.println(Character.toString(s.charAt(k-1)));
}}
