package Leetcode4;

import java.util.*;

public class Leetcode48 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] res = new int[matrix.length][matrix.length];
		int a = 0, b = 0;
		for (int i = 0; i < matrix.length; i++) {
			b = 0;
			for (int j = matrix.length - 1; j >= 0; j--) {
				res[a][b] = matrix[j][i];
				b++;
			}
			a++;
		}
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0;j<matrix.length;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}
}
