package Leetcode5;

public class Leetcode3712 {
	public static void main(String[] args) {
		int[] nums = { 4,4,4,1,2,3};
		int k = 3;
		int total = 0, j = 0;
		while (j != nums.length) {
			int a = 0;
			for (int k1 = 0; k1 < nums.length; k1++) {
				if (nums[j] == nums[k1]) {
					a++;
				}
			}
			if (a % k == 0) {
				total += nums[j];
			}
			j++;
		}
		System.out.println(total);
	}
}
