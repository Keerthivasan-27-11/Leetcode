package Leetcode5;

import java.util.*;

public class Leetcode1833 {
	public static void main(String[] args) {
		int[] groupSize = {1,1,1,1};
		int j = 1,n = groupSize.length,count = 0;
		List<List<Integer>> li = new ArrayList<>();
		do {
			int a = 0,min = 500;
			for(int i = 0;i<n;i++) {
				if(groupSize[i]!=-1) {
				min = Math.min(min, groupSize[i]);
			}}
			List<Integer> res = new ArrayList<>();
			for(int i = 0;i<n;i++) {
				if(groupSize[i]==min) {
					groupSize[i]=-1;
					res.add(i);
					count ++;
					a++;}
				if(a==min) {
					break;
				}
				System.out.println(1);
			}
			li.add(res);
		}while(count!=n);
		System.out.println(li);
	}
}
