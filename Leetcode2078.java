package Leetcode5;
import java.util.*;
public class Leetcode2078 {
	public static void main(String[] args) {
		int[] colors = {0,1};
		int res = 0;
		for(int i = 0;i<colors.length;i++) {
			for(int j = 0;j<colors.length;j++) {
				if(i!=j && colors[i]!=colors[j]) {
					res = Math.max(res,Math.abs(i-j));
				}
			}
		}
		System.out.println(res);
	}
}
