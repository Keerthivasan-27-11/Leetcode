package Leetcode31;

public class Leetcode3736 {
	public static void main(String[] args) {
		int[] nums= {4,4,5};
		int max = 0;
		for(int i = 0;i<nums.length;i++) {
			max=Math.max(max, nums[i]);
		}
		int i =0,j = 0,count =0;
		do {
			j=0;
			for(i = 0;i<nums.length;i++) {
				if(max == nums[i]) {
					j++;
				}
				else {
					count++;
					nums[i]+=1;
				}
			}
		}while(j!=nums.length);
		System.out.println(count);
	}
}
