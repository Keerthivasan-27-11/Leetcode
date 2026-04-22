package Leetcode5;

public class Leetcode2373 {
	public static void main(String[] args) {
		int[][] matrix = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
		int n = matrix.length;
		int[][] res = new int[n-2][n-2];
		int a= 0, b = 0;
		int i = 0;
		while(i!=n-2){
			for(int j = 0;j<n-2;j++) {
				int max = 0;
				for(int k = i;k<i+3;k++) {
					for(int l = j;l<j+3;l++) {
						max = Math.max(max,matrix[k][l]);
					}
				}
				res[a][b++]=max;
			}
			a++;
			b=0;
			i++;
		}
		for(i = 0;i<n-2;i++) {
			for(int j = 0;j<n-2;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}
}
