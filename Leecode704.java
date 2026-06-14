package Leetcode6;

public class Leecode704 {
	public static void main(String[] args) {
		int[] nums = {2,5};
		int target = 2;
		int mid = nums.length/2;
		System.out.println(mid);
		int index = -1,right = nums.length-1,left = 0,j = 0;
		while(j!=nums.length) {
			if(target==nums[mid]) {
				index = mid;
				break;
			}
			else if(target<nums[mid]) {
				right = mid;
				mid = (right+left)/2;
			}
			else if(target>nums[mid]) {
				left = mid;
				mid = (right+left+1)/2;
			}
			j++;
		}
		System.out.println(index);
	}
}
