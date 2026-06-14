package Leetcode6;

public class Leetcode81 {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		int k = 0;
		k = nums.length / 2;
		int[] res = new int[nums.length];
		int a = 0;
		for (int i = k; i < nums.length; i++) {
			res[a++] = nums[i];
		}
		for (int j = 0; j < k; j++) {
			res[a++] = nums[j];
		}
		int b = -1;
		for (int i = 0; i < res.length; i++) {
			if (res[i] == target) {
				b = i;
				break;
			}
		}
		System.out.println(b);
	}
}
