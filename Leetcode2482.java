package Leetcode6;

public class Leetcode2482 {
	public static void main(String[] args) {
		int[][] grid = {{1,1,1},{1,1,1}};
		int[][] diff = new int[grid.length][grid[0].length];
		int[] rone = new int[grid[0].length],rzero = new int[grid[0].length];
		int[] cone = new int[grid.length],czero = new int[grid.length];
		
		for(int i = 0;i<grid.length;i++) {
			int ro=0,rz=0;
			for(int j = 0;j<grid[i].length;j++) {
				if(grid[i][j]==1) {
					ro++;
				}
				else {
					rz++;
				}
			} 
			rone[i] = ro;
			rzero[i] = rz;
		}
		for(int i = 0;i<grid[0].length;i++) {
			int co = 0,cz = 0;
			for(int j = 0;j<grid.length;j++) {
				if(grid[i][j]==1) {
					co++;
				}
				else {
					cz ++;
				}
			}
			cone[i] = co;
			czero[i] = cz;
		}
		
		for(int i  =0;i<grid.length;i++) {
			for(int j = 0;j<grid[i].length;j++) {
				System.out.print(diff[i][j]);
			}
			System.out.println();
		}
	}
}
