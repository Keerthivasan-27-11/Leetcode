package Leetcode5;

public class Leetcode1863 {
	public static void main(String[] args) {
		int[] nums = {1,3};
		int total = 0;
		int n = 5;
		int k = 0;
		do{
			for(int i = 0;i<n;i++) {
				for(int j = i;i<Math.min(i+k,n);j++) {
					System.out.print(j);
				}
			}
			System.out.println();
			k++;
		}while(k!=n);
		
	}
}
