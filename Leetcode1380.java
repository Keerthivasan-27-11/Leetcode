package Leetcode5;

public class Leetcode1380 {
	public static void main(String[] args) {
		int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		int val = 0;
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0;j<matrix[i].length;j++) {
				int a = 0,b = 0;
				for(int l = 0;l<matrix.length;l++) {
					if(matrix[i][j]>=matrix[l][j]) {
						a++;
					}
				}
				for(int k = 0;k<matrix[i].length;k++) {
					if(matrix[i][j]<=matrix[i][k]) {
						b++;
					}
				}
				if(a == matrix.length && b == matrix[i].length ) {
					val = matrix[i][j];
				}
			}
		}
		System.out.println(val);
	}
}
