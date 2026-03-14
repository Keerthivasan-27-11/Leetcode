package Leetcode31;

public class Leetcode1582 {
public static void main(String[] args) {
	int[][] mat = {{1,0},{0,1},{0,0}};
	int count = 0; 
	for(int i = 0;i<mat.length;i++) {
		for(int j = 0;j<mat[i].length;j++) {
			System.out.print(mat[i][j]);
		}
		System.out.println();
	}
	for(int i = 0;i<mat.length;i++) {
		int b = 0,a=0,c=0;
		for(int j = 0;j<mat[i].length;j++) {
			if(mat[i][j]==1) {
				b++;
			}
			if(mat[i][j]==0) {
				a++;
			}
		}
		if(a == mat[i].length-1 && b==1 && c== 1) {
			count ++;
		}
	}
	System.out.println(count);
}
}
