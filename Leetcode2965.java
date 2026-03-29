package Leetcode4;

public class Leetcode2965 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,3},{2,2}};
		int[] g = new int[grid.length*grid.length];
		int count = 0;
		for(Integer i = 0;i<grid.length;i++) {
			for(Integer j = 0;j<grid.length;j++) {
				g[count++]=grid[i][j];
			}
		}
		int[] res = new int[2];
		int a = 0, b = 0;
		int n = grid.length*grid.length;
		for(int i =1;i<=n;i++) {
			int c = 0;
			for(int j = 0;j<g.length;j++) {
				if(g[j] == i) {
					c++;
				}
			}
			if(c == 0) {
				a= i;
			}
			if(c == 2) {
				b = i;
			}
		}res[0]=a;
		res[1]=b;
		System.out.println(a+" "+b);
	}

}
