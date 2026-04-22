package Leetcode5;

public class Leetcode1295 {
	public static void main(String[] args) {
		int[] nums = { 555,901,482,1771 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			StringBuffer sb = new StringBuffer(Integer.toString(nums[i]));
			if(sb.length()%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
