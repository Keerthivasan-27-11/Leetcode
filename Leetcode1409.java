package Leetcode4;

import java.util.*;

public class Leetcode1409 {
	public static void main(String[] args) {
		int[] queries = { 7,5,5,8,3};
		int m = 8;
		int[] res = new int[m];
		for (int i = 0; i < m; i++) {
			res[i] = i + 1;
		}
		int[] re = new int[queries.length];
		int n =0;
		for (int i = 0; i < queries.length; i++) {
			int a = 0;
			for (int j = 0; j < res.length; j++) {
				if (queries[i] == res[j]) {
					a = j;
					break;
				}
			}
			re[i]=a;
			int b = res[a];
			for (int j = a - 1; j >= 0; j--) {
				res[j + 1] = res[j];
			}
			res[0] = b;
		}
		for(int i = 0;i<queries.length;i++) {
			System.out.println(re[i]);
		}
	}
}
