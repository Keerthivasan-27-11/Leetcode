package Leetcode31;

public class Leetcode3746 {	
	public static void main(String[] args) {
		String s = "aaaaa";
		StringBuffer sb = new StringBuffer(s);
		int a = 0,b= 0;
		for(int i = 0;i<sb.length();i++) {
			if(sb.substring(i,i+1).equals("a")) {
				a++;
			}
			else {
				b++;
			}
		}
		System.out.println(b-a);
		}
}
