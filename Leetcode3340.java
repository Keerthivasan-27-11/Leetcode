package Leetcode2;

public class Leetcode3340 {
	public static void main(String[] args) {
		String num = "24123";
		boolean bo = false;
		int a = 0,b = 0;
		for(int i = 0 ;i<num.length();i=i+2) {
			a+=Integer.parseInt(num.substring(i,i+1));
		}
		for(int i = 1;i<num.length();i=i+2) {
			b+=Integer.parseInt(num.substring(i,i+1));
		}
		if(a==b) {
			bo = true;
		}
		System.out.println(bo);
	}
}
