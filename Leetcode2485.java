package Leetcode31;

public class Leetcode2485 {
	public static void main(String[] args) {
		int n = 8;
		int pivot = 0;
		for(int i= 1;i<=n;i++) {
			int a = 0,b = 0;
			for(int j=1;j<i;i++) {
				a+=j;
			}
			for(int j = i;j<=n;j++) {
				b += j;
			}
			if(a ==b) {
				pivot = i;
				break;
			}
		}
		System.out.println("Hello World");
		System.out.println(pivot);
	}
}
