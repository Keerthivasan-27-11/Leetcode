package Leetcode4;

public class Leetcode1827 {
	public static void main(String[] args) {
		int[] nums = {8};
		int count = 0;
		int j =0;
		do {
			j = 0;
			for(int i = 0;i<nums.length-1;i++) {
				if(nums[i]<nums[i+1]) {
					j++;
				}
				else {
					count++;
					nums[i+1]+=1;
				}
			}
			if(j!=nums.length-1) {
				
			}
		}while(j!=nums.length-1);
		System.out.println(count);
	}
}
