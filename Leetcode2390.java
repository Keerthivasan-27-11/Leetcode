package Leetcode;

public class Leetcode2390 {
	public static void main(String[] args) {
		String s="leet**cod*e";
		String res = "";
		for(int i = 0;i<s.length();i++) {
			if(s.substring(i,i+1).equals("*")) {
				String st = "";
				st=res.substring(0,res.length()-1);
				res=st;
			}
			else {
				res+=s.substring(i,i+1);
			}
			
		}
		System.out.println(res);
	}
}
