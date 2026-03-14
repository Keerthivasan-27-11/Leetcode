package Leetcode31;

public class Leetcode1572 {
	public static void main(String[] args) {
		int[][] mat = {{5}};
		int total = 0;
		for(int i = 0;i<mat.length;i++) {
			for(int j = 0;j<mat.length;j++) {
				if(i == j) {
					total +=mat[i][j];
				}
			}
		}
		if(mat.length%2!=0) {
		for(int i = 0;i<mat.length;i++){
			if(i != mat.length/2) {
			total+=mat[i][Math.abs(i-mat.length)-1];
			}		
			}
		}else {
			for(int i = 0;i<mat.length;i++){
				total+=mat[i][Math.abs(i-mat.length)-1];
				}		
		}
		System.out.println(total);
	}
}
