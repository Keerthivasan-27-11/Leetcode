package Leetcode31;
import java.lang.*;
public class Leetcode1758 {
	public static void main(String[] args) {
		String s = "10";
		StringBuffer sb = new StringBuffer(s);
		int count = 0;
		//for(int j = 0;j<sb.length()/2;j++) {
		for(int i = 0;i<sb.length()-1;i++) {
			if(Character.toString(sb.charAt(i)).equals(Character.toString(sb.charAt(i+1)))) {
				count++;
				if(sb.substring(i+1,i+2).equals("1")) {
					sb.replace(i+1,i+2, "0");
				}
				else {
					sb.replace(i+1,i+2, "1");
				}
			}
			System.out.println(sb +" "+i);
			}
		System.out.println();
		System.out.println(sb+" "+Math.min(count,(s.length()-count)));
		}
}
