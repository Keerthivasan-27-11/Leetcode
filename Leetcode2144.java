package Leetcode6;
import java.util.*;
public class Leetcode2144 {
	public static void main(String[] args) {
		int[][] mat = {{0,0},{1,1},{0,0}};
		int[] res = new int[2];
		int[] one = new int[mat.length];
		for(int i = 0;i<mat.length;i++) {
			int a = 0;
			for(int j = 0;j<mat[i].length;j++) {
				if(mat[i][j] == 1) {
					a++;
				}
			}
			one[i] = a;
		}
		int a = 0;
		for(int i = 0;i<mat.length;i++) {
			if(one[i] == one[0]) {
				a++;
			}
		}
		if(a == mat.length) {
			res[0]=0;
			res[1]=one[0];
		}
		else {
			int b = 0,n = 0;
			for(int j = 0;j<mat.length;j++) {
				if(b<one[j]) {
					b = one[j];
					n = j;
				}
			}
			res[0]=n;
			res[1]=b;
		}
		System.out.println(res[0]+" " +res[1]);
	}
}
