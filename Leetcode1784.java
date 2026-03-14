package Leetcode31;

public class Leetcode1784 {
	public static void main(String[] args) {
		String s = "1100";
		boolean b =false;
		int  o = 0,z = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.substring(i,i+1).equals("1")) {
				o ++;
			}else {
				z ++;
			}
		}
		System.out.println(o+ " "+z);
	}
}
