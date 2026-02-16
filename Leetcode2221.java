package Leetcode2;

public class Leetcode2221 {
	public static void main(String[] args) {
		int[] nums = {5};
		int total = 0;
		if(nums.length==1) {
			total = nums[0];
		}
		else {
		int[] res = new int[nums.length-1];
		for(int i = nums.length-1;i>-1;i--) {
			for(int j = 0;j<i;j++) {
				String a =Integer.toString(nums[j]+nums[j+1]);
				nums[j]=Integer.parseInt(a.substring(a.length()-1,a.length()));
				total = nums[j];
			}
			for(int k= 0 ;k<nums.length;k++) {
				System.out.print(nums[k]+" ");
			}
			System.out.println();
		}}
		System.out.println(total);
	}
}
