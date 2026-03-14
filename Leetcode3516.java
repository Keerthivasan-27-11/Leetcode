package Leetcode31;

public class Leetcode3516 {
	public static void main(String[] args) {
		int x =2,y=7,z=4;
		int a = Math.abs(x-z);
		int b = Math.abs(y-z);
		int min = 0;
		if(a == b ) {
			
		}
		else {
			min = (a>b)?1:2;
		}
		System.out.println(min);
	}
}
