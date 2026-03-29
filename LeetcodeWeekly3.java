package Leetcode4;

public class LeetcodeWeekly3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3};
		int diff = -1,n = 0;
		for(int i = 0;i<nums.length-1;i++) {
			int a = nums[i] - nums [ i +1];
			if(diff == -1) {
				diff  = a;
			}
			else if (diff != a && n==0) {
				nums[i+1] =nums [i]-diff;
				n++;
			}
		}
		int count = 0;
		for(int i = 0;i<nums.length-1;i++) {
			//System.out.println(nums[i]);
			if((nums[i] - nums [ i+1]) == diff) {
				count ++;
			}
		}
		count +=1;
		System.out.println(count);
	}

}
