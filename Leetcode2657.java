package Leetcode6;

public class Leetcode2657 {
	public static void main(String[] args) {
		int[] A = {2,3,1},B = {3,1,2};
		int n = A.length,a = 0;
		int[] res = new int[n];
		for(int i = 0;i<n;i++) {
			a = 0;
			for(int j = 0;j<=i;j++) {
				for(int k = 0;k<=i;k++) {
					if(A[j] == B[k]) {
						a++;
					}
				}
			}
			res[i] = a;
		}
		for(int i = 0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}
