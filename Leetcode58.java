package Leetcode6;
import java.util.*;
public class Leetcode58 {
	public static void main(String[] args) {
		String s = "luffy is still joyboy       ";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		int a = 0;
		for(int i=0;i<sb.length();i++) {
			if(sb.substring(i,i+1).equals(" ")) {
				a++;
			}
			else {
				break;
			}
		}
		sb.delete(0, a);
		String str = "";
		for(int i = 0;i<sb.length();i++) {
			if(sb.substring(i,i+1).equals(" ")) {
				break;
			}
			else {
				str+=sb.substring(i,i+1);
			}
		}
		System.out.println(str.length());
	}
}
