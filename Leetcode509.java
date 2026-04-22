package Leetcode5;

public class Leetcode509 {
	public static void main(String[] args) {
		int n = 0;
		int a = 0, b = 1;
		int total = 0;
		int[] f = new int[n];
		for (int i = 0; i < n; i++) {
			f[i]=a;
			int c = b;
			b=a+b;
			a=c;
		}
		total = f[n-2]+f[n-1];
		System.out.println(total);
	}
}
