package Leetcode5;

public class Leetcode1791 {
	public static void main(String[] args) {
		int[][] edges = {{1,2},{5,1},{1,3}};
		int a = 0, b = 0,c = 0;
		int[] num = new int[edges.length*edges[0].length];
		int co = 0;
		for(int i = 0;i<edges.length;i++) {
			for(int j = 0;j<edges[i].length;j++) {
				num[co++]=edges[i][j];
			}
		}
		for(int i = 0;i<num.length;i++) {
			c= 0;
			for(int j = 0;j<num.length;j++) {
				if(num[i] == num[j]) {
					c ++;
				}
			}
			if(b < c) {
				a = num[i];
				b = c;
			}
		}
		System.out.println(a);
	}
}
