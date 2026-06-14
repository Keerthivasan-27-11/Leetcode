package Leetcode6;

public class Leetcode64 {
	public static void main(String[] args) {
		int[][] grid = {{1,4,8,6,2,2,1,7},{4,7,3,1,4,5,5,1},{8,8,2,1,1,8,0,1},{8,9,2,9,8,0,8,9},{5,7,5,7,1,8,5,5},{7,0,9,4,5,6,5,6},{4,9,9,7,9,1,9,0}};
		int min = 1000000;
		int res = 100000;
		int len = grid.length;
		for (int i = 0; i < grid.length; i++) {
			int b = 0;
			for (int l = 0; l < i; l++) {
				b += grid[l][0];
			}
			for (int k = 0; k < grid[0].length; k++) {
				b += grid[i][k];
			}
			for(int k = i+1;k<grid.length;k++) {
				b+=grid[k][grid[i].length-1];
			}
			min = Math.min(min, b);
		}
		int m = 1000000;
		for(int i = 0;i<grid[0].length;i++) {
			int s = 0;
			for(int j = 0;j<i;j++) {
				s+=grid[0][j];
			}
			for(int j = 0;j<grid.length;j++) {
				s+=grid[j][i];
			}
			for(int j = i+1;j<grid[0].length;j++) {
				s+=grid[grid.length-1][j];
			}
			m = Math.min(s, m);
		}
		res = Math.min(res, Math.min(min, m));
		System.out.println(res+" "+min+" "+m);
	}
}
