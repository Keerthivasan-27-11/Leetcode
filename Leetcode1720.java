package Leetcode31;

public class Leetcode1720 {
	public static void main(String[] args) {
		int first = 4;
		int[] encoded = {6,2,7,3};
		int[] arr= new int[encoded.length+1];
		arr[0]=first;
		for(int i = 0;i<encoded.length;i++) {
			arr[i+1]=arr[i]^encoded[i];
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
