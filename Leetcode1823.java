package Leetcode2;

public class Leetcode1823 {
	public static void main(String[] args) {
		int n = 5,k = 2;
		int[] a = new int[n];
		for(int i =1;i<=n;i++) {
			a[i-1]=i;
		}
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j = 0;j<n;j=j+k) {
			System.out.print(a[j]+" ");
			}
			System.out.println();
		}
		for(int i = 0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
}
