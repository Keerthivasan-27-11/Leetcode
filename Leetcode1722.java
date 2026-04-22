package Leetcode5;

import java.util.*;

public class Leetcode1722 {
	public static void main(String[] args) {
		int[] source = { 85,91 }, target = { 77,50 };
		int[][] allowedSwaps = {{1,0}};
		int count = allowedSwaps.length, n = allowedSwaps.length;
		for(int i = 0;i<n;i++) {
			int[] res = allowedSwaps[i];
			int a = res[0];
			int b = res[1];
			int c = source[a];
			source[a] = source[b];
			source[b] = c;
		}
		for (int i = 0; i < source.length; i++) {
			if (source[i] != target[i]) {
				count++;
			}
		}
		if(count == n) {
			count = 0;
		Random r = new Random();
		for (int j = 0; j < n*n; j++) {
			for (int i = 0; i < n*n; i++) {
				int[] res = allowedSwaps[r.nextInt(n)];
				int a = res[0];
				int b = res[1];
				int c = source[a];
				source[a] = source[b];
				source[b] = c;
			}
			int a = 0;
			for (int i = 0; i < source.length; i++) {
				if (source[i] != target[i]) {
					a++;
				}
			}
			count = Math.min(a, count);
		}
		if (n == 0) {
			for (int i = 0; i < source.length; i++) {
				if (source[i] != target[i]) {
					count++;
				}
			}
		}}
		System.out.println(count);
	}
}
