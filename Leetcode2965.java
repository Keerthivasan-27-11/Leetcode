package Leetcode2;
import java.util.*;
public class Leetcode2965 {
	public static void main(String[] args) {
		int[][] grid= {{9,1,7},{8,9,2},{3,4,6}};
		int[] r = new int[grid.length*grid.length];
		int count= 0;
		HashSet<Integer> h = new HashSet<>();
		for(int i = 0;i<grid.length;i++) {
			for(int j = 0;j<grid[i].length;j++) {
				r[count++]=grid[i][j];
			}
		}
		for(int i = 0;i<r.length;i++) {
			int a = 0;
			for(int j = 0;j<r.length;j++) {
				if(r[i]==r[j]) {
					a++;
				}
			}
			if(a==2) {
				h.add(r[i]);
			}
		}
		for(int i = 0;i<r.length;i++) {
			int a = 0,b= 0;
			for(int j = 1;j<=r.length;j++) {
				if(i ==j) {
					continue;
				}
				if(r[i]==j) {
					a++;
				}
				else {
					b = j;
				}
			}
			if(a==0) {
				h.add(b);
			}
		}
		for(Integer i : h) {
			System.out.println(i);
		}
	}
}
