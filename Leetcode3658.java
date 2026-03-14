package Leetcode31;

public class Leetcode3658 {
	public static void main(String[] args) {
		int n = 4;
		int o=0,e=0,a=0,b=1;
		while(a!=n*2) {
			if(b%2==0) {
				e+=b;
			}else {
				o+=b;
			}
			b++;
			a++;
		}
		int max = 0;
		for(int i = 1;i<Math.max(o, e);i++) {
			if(o%i==0 && e%i==0) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
