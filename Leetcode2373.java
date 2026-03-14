package Leetcode31;

public class Leetcode2373 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
		int[][] res = new int[grid.length/2][grid.length/2];
		int a = 0,b = 0;
		for(int i = 0;i<grid.length-2;i++) {
			for(int j = 0;j<grid.length-2;j++) {
				int ma = 0;
				for(int k = i;k<i+3;k++) {
					for(int l = j;l<j+3;l++) {
						System.out.print(grid[k][l]);
						ma = Math.max(ma, grid[k][l]);
					}
					System.out.println();
				}
				System.out.println(ma);
				
				res[a][b%res.length]=ma;
				b++;
			}
			a++;
		}
		for(int i = 0;i<res.length;i++) {
			for(int j = 0;j<res.length;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
		System.out.println(5/2);
	}

}
