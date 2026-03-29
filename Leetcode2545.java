package Leetcode4;

public class Leetcode2545 {
	public static void main(String[] args) {
		int[][] score = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
		int k = 2;
		for(int i = 0;i<score.length;i++) {
			for(int j= 0;j<score.length-1;j++)
			if(score[j][k]<score[j+1][k]) {
				int[] a = score[j];
				score[j]=score[j+1];
				score[j+1] = a;
			}
		}
		for(int i = 0;i<score.length;i++) {
			for(int j = 0;j<score[i].length;j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
	}
}
