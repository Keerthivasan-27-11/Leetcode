package Leetcode31;

public class Leetcode1740 {
	public static void main(String[] args) {
		String s="textbook";
		String a = s.substring(0,s.length()/2),b = s.substring(s.length()/2,s.length());
		int a1 = 0,b1 = 0;
		for(int i = 0;i<a.length();i++) {
			String str = a.substring(i,i+1);
			switch(str) {
			case "a":a1++;break;
			case "e":a1++;break;
			case "i":a1++;break;
			case "o":a1++;break;
			case "u":a1++;break;
			case "A":a1++;break;
			case "E":a1++;break;
			case "I":a1++;break;
			case "O":a1++;break;
			case "U":a1++;break;
			}
		}
		for(int i = 0;i<b.length();i++) {
			String str = b.substring(i,i+1);
			switch(str) {
			case "a":b1++;break;
			case "e":b1++;break;
			case "i":b1++;break;
			case "o":b1++;break;
			case "u":b1++;break;
			case "A":b1++;break;
			case "E":b1++;break;
			case "I":b1++;break;
			case "O":b1++;break;
			case "U":b1++;break;
			}
		}
		boolean b2 = true;
		if(a1 != b1) {
			b2 = false;
		}
		System.out.println(b2);
	}
}
