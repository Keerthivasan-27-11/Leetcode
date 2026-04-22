package Leetcode5;

import java.util.*;

public class Leetcode1561 {
	public static void main(String[] args) {
		int[] piles = { 2, 4, 1, 2, 7, 8 };
		int max = 0, n = piles.length;
		int j = 0;
		HashSet<Integer> li = new HashSet<>();
		do {
			int a = 0;
			for (int i = j; i < j + n; i += 3) {
				int b = 0,c= 0,d=0;
				for(int k =i;k<i+3;k++) {
					System.out.print(piles[k%n]);
					b = Math.max(piles[k%n], Math.max(c, d));
				}
				System.out.print(' ');
			}
			System.out.println();
			j++;
		} while (j != n);
		System.out.println(max);
	}
}
