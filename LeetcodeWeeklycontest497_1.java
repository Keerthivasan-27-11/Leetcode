package Leetcode5;

public class LeetcodeWeeklycontest497_1 {
	public static void main(String[] args) {
		int[][] matrix = {{0,1,0},{1,0,0},{0,0,0}};
		int[] res = new int[matrix.length];
		for(int i = 0;i<matrix.length;i++) {
			int a = 0;
			for(int j = 0;j<matrix[i].length;j++) {
				if(matrix[i][j]==1) {
					a ++;
				}
			}
			res[i]=a;
		}
		for(int i = 0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}
