package Leetcode2;

public class Leetcode1572 {
	public static void main(String[] args) {
		int[][] mat= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int total = 0;
		for(int i= 0;i<mat.length;i++) {
			for(int j = 0;j<mat[i].length;j++) {
				if(i == j) {
					total += mat[i][j];
				}
			}
		}
		for(int i=mat.length-1;i>-1;i--) {
			for(int j = 0;j<mat[i].length;j++) {
				if(i == j) {
					total += mat[i][j];
				}
			}
		}
		if(mat.length%2!=0) {
			total = total - mat[mat.length/2][mat.length/2];
		}
		System.out.println(total);
	}
}
