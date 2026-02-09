package Leetcode;
import java.util.*;
public class Leetcoe1431 {
	public static void main(String[] args) {
		int[] candies = {12,1,12};
		int extraCandies=10;
		int[] r = new int[candies.length];
		List<Boolean> res = new ArrayList<>();
		for(int i= 0;i<candies.length;i++) {
			r[i]=candies[i]+extraCandies;
		}
		
		for(int i= 0;i<candies.length;i++) {
			int a = 0;
			for(int j=0;j<i;j++) {
				if(r[i]>=r[j]) {
					a++;
				}
			}
			if(a>=i-1) {
				res.add(true);
			}
			else {
				res.add(false);
			}
		}
		for(boolean b : res) {
			System.out.println(b);
		}
		
	}
}
