package Leetcode6;

public class Leetcode392 {
	public static void main(String[] args) {
		String s = "axc",t = "ahbgdc";
		int j  = 0, k = 0;
		boolean b = false;
		while(j<s.length() && k<t.length()) {
			if(s.charAt(j)==t.charAt(k)) {
				j++;
			}
			k++;
		}
		if(j == s.length()) {
			b = true;
		}
		System.out.println(b);
	}
}
