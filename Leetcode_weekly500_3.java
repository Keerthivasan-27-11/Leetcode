package Leetcode6;

public class Leetcode_weekly500_3 {
	public static void main(String[] args) {
		int[] nums = { -5, -2, 3 };
		int[][] queries = { { 0, 2 }, { 2, 0 }, { 1, 2 } };
		int[] res = new int[queries.length];
		for(int i = 0;i<queries.length;i++) {
			int x = queries[i][0],y = queries[i][1];
			int min = Math.min(x, y),max = Math.max(y, x);
			int a= 0;
			for(int j = min ;j<=max ;j++) {
				a+=Math.max(a,Math.abs(nums[x]-nums[y]));
			}
			res[i]=a;
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
