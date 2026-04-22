package Leetcode5;

public class Leetcode268 {
	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		int total = 0,res = 0;
		for(int i=0;i<nums.length;i++) {
			total +=i;
			res +=nums[i];
		}
		total+=nums.length;
		System.out.println(total -res);
	}
}
