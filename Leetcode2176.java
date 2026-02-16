package Leetcode2;

public class Leetcode2176 {
	public static void main(String[] args) {
		int[] nums= {3,1,2,2,2,1,3};
		int k = 1;
		int count =0;
		for(int i = 0;i<nums.length;i++) {
			for(int j = 0;j<i;j++) {
				if(i == j) {
					continue;
				}
				else {
				if(nums[i]==nums[j]) {
					if((i*j)%k ==0) {
						count ++;
					}
				}
			}}
		}
		System.out.println(count/2);
	}
}
