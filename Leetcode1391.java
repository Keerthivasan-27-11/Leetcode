package Leetcode6;
import java.util.*;
public class Leetcode1391 {
	public static void main(String[] args) {
		int[][] grid = {{1,1,1,1,1,1,2}};
//		boolean b = true;
//		int start = 0;
//		for(int i = 0;i<grid.length;i++) {
//			int a = 0;
//			if(start == 0) {
//				start = grid[0][0];
//			}
//			for(int j = 0;j<grid[i].length;j++) {
//				a = 0;
//				for(int k = 0;k<grid[i].length;k++) {
//					if(grid[i][j]==grid[i][k]) {
//						a++;
//					}
//				}
//				if((a == 1 || a == grid[i].length) && start == grid[i][j]) {
//					a = -1;
//				}
//				if(a>1 && a<grid[i].length) {
//					b = false;
//					break;
//				}
//			}
//			if(a == -1) {
//				break;
//			}
//		}
		//System.out.println(b);
		int[][] res = new int[grid.length][grid[0].length];
		int count = 0;
		for(int i=0;i<res.length;i++) {
			for(int j = 0;j<res[i].length;j++) {
				res[i][j]=count++;
			}
		}
		List<Integer> li = new ArrayList<>();
		int a = 0, b= 0;
		boolean b1 = true;
		for(int i = 0;i<grid.length;i++) {
			for(int j = 0;j<grid[i].length;j++) {
				if(grid[i][j]==1 && b<=grid[0].length) {
					b++;
				}
				else if(grid[i][j] == 2 && a<=grid.length) {
					a++;
				}
				else if(grid[i][j]==3 && a<=grid.length && b<=grid[i].length) {
					a++;b++;
				}
				else if(grid[i][j]==4 && a<=grid.length && b<=grid[i].length) {
					a--;b++;
				}
				else if(grid[i][j]==5 && a<=grid.length && b<=grid[i].length) {
					a++;b--;
				}
				else if(grid[i][j]==6 && a<=grid.length && b<=grid[i].length) {
					a++;b++;
				}
				else {
					b1 = false;
					break;
				}
			}
		}
		System.out.println(b1);
	}
}
