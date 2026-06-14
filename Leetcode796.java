package Leetcode6;

public class Leetcode796 {
	public static void main(String[] args) {
		String s = "abcde",goal = "abced";
		boolean b = false;
		String res = "";
		for(int i= 0;i<s.length();i++) {
			res = goal.substring(i,s.length())+goal.substring(0,i);
			if(res.equals(s)) {
				b = true;
				break;
			}
		}
		System.out.println(b);
	}
}
