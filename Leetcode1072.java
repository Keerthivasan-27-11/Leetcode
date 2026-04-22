package Leetcode5;

public class Leetcode1072 {
	public static void main(String[] args) {
		int[][] matrix = {{0,1},{1,1}};
		int count = 0;
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0;j<matrix[i].length;j++) {
				if(matrix[i][j]==1) {
					matrix[i][j]=0;
				}
				else {
					matrix[i][j]=1;
				}
			}
			int b = 0 ;
			for(int i1 = 0;i1<matrix.length;i1++) {
				int a = 0;
				for(int j = 0;j<matrix[0].length;j++) {
					if(matrix[j][i1]==matrix[j][0]) {
						a ++;
					}
				}
				if(a == matrix.length) {
					b++;
				}
			}
			if(b > 0) {
				count++;
			}
			//count = Math.max(count, b);
		}
		System.out.println(count);
	}
}
