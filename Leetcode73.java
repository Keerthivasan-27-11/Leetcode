package Leetcode6;
import java.util.*;
public class Leetcode73 {
	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		int res = 0;
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0;j<matrix[i].length;j++) {
				if(matrix[i][j]==target) {
					res= 1;
					break;
				}
			}
		}
		boolean b = true;
		if( res != 1) {
			b = false;
		}
		System.out.println(b);
	}
}