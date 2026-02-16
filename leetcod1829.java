package Leetcode2;

public class leetcod1829 {
	public static void main(String[] args) {
		int[] nums= {0,1,1,3};
		int[] res = new int[nums.length];
		int a = 0,count=0;
		for(int i=nums.length-1;i>=0;i--) {
			int k=0;
			for(int j=0;j<=i;j++) {
				k^=nums[j];
			}
			k^=a;
			a=k;
			res[count++]=k;
		}
		for(int i =0;i<nums.length;i++) {
			System.out.println(res[i]);
		}
	}
}
