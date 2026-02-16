package Leetcode2;

public class Leetcode1588 {
	public static void main(String[] args) {
		int[] arr= {1,4,2,5,3};
		for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.println(arr[j]);
			}
		}
	}
}
