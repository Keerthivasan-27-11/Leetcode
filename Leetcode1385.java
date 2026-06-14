package Leetcode6;

public class Leetcode1385{
	public static void main(String[] args) {
		int[] arr1 = {2,1,100,3},arr2 = {-5,-2,10,-3,7};
		int d = 6;
		int res = 0;
		for(int i = 0;i<arr1.length;i++) {
			for(int j = 0;j<arr2.length;j++) {
				if(Math.abs(arr1[i]-arr2[j])<=d) {
					res = Math.abs(res-Math.abs(arr1[i]-arr2[j]));
				}
			}
		}
//		if(res>d) {
//			res = d;
//		}
		System.out.println(res);
	}
}
