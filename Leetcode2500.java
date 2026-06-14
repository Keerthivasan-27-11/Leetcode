package Leetcode6;

import java.util.*;

public class Leetcode2500 {
	public static void main(String[] args) {
		int[][] nums = { {10}};
		int res = 0;
		for (int k = 0; k < nums[0].length; k++) {
			HashSet<Integer> li = new HashSet<>();
			for (int i = 0; i < nums.length; i++) {
				int a = 0, b = 0;
				for (int j = 0; j < nums[i].length; j++) {
					if(nums[i][j] == -1) {
						continue;
					}
					else if (nums[i][j] > a) {
						a = nums[i][j];
						b = j;
					}
				}
				li.add(a);
				nums[i][b] = -1;
			}
			int max = 0;
			for(Integer n : li) {
				max = Math.max(max, n);
			}
			res+=max;
		}
		System.out.println(res);
	}
}
