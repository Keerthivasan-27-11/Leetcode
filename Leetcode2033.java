package Leetcode6;

public class Leetcode2033 {
	public static void main(String[] args) {
		int[][] grid = { { 2,4 }, { 6,8 } };
		int x = 2;
		int min = Math.powExact(10, 5);
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				int count = 0, c = 0;
				for (int k = 0; k < grid.length; k++) {
					for (int l = 0; l < grid[k].length; l++) {
						int a = grid[k][l];
						if (grid[i][j] != a ) {
							while(a!=grid[i][j]) {
								count++;
								if (grid[i][j] > a) {
									a += x;
									if(a>grid[i][j]) {
										count = -1;
										c = 1;
										break;
									}
								} else {
									a -= x;
									if(a<grid[i][j]) {
										c = 1;
										count = -1;
										break;
									}
								}
							}
						}
						if(c == 1) {
							break;
						}
					}
					if(c == 1) {
						break;
					}
				}
					min = Math.min(min, count);
			}
		}
		if(min == Math.powExact(10, 5)) {
			min = -1;
		}
		System.out.println(min);
	}
}
