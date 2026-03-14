package Leetcode31;

public class Leetcode1536 {
	public static void main(String[] args) {
		int[][] grid = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
		int count = 0;
		for(int i = 0;i<grid.length;i++) {
			for(int j= 0;j<grid.length;j++) {
				int[] b = {};int d = 0;
				if(grid[j][j]!=1) {
					for(int k =j;k<grid.length-1;k++) {
							if(grid[j][j]!=1) {
								b = grid[k];d=k;
							}
						}
					}
				}
			}
		for(int i = 0;i<grid.length;i++) {
			for(int j= 0;j<grid.length;j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
}
