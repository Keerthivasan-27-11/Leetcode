package Leetcode6;

import java.util.*;

public class Leetcode66 {
	public static void main(String[] args) {
		int[] digits = { 4,3,2,1};
		List<Integer> li = new ArrayList<>();
		int a = 0,b = 0;
		for (int i =digits.length-1;i>=0;i--) {
			if(i == digits.length-1) {
			b = digits[i] + 1 + a;}else {
				b = a+digits[i];
			}
			a = 0;
			String str = Integer.toString(b);
			if(str.length()==2) {
			a = Integer.parseInt(str.substring(0, 1));
			li.add(Integer.parseInt(str.substring(1, 2)));}
			else {
				li.add(Integer.parseInt(str.substring(0,1)));
			}
		}
		if(a!=0) {
			li.add(a);
		}
		int[] res = new int[li.size()];
		a= li.size()-1;
		for(Integer i : li) {
			res[a--]=i;
		}
		for(int i = 0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		System.out.println(li);
	}
}
