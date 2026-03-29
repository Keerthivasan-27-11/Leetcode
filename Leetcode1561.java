package Leetcode4;

import java.util.*;

public class Leetcode1561 {
	public static void main(String[] args) {
		int[] nums= {0,1,1,3};int maximumBit = 2;
		int n = Math.powExact(2, maximumBit);
		int[] res = new int[nums.length];
		for(int i = 0;i<nums.length;i++) {
			int a = 0;
			for(int j = 0;j<nums.length-i;j++) {
				a^=nums[j];
				//System.out.print(nums[j]);
			}
			//System.out.println();
			for(int j = 0;j<n;j++) {
				if((a^j) == n-1) {
					System.out.println(j);
					break;
				}
			}
//			System.out.println();
		}
		System.out.println("hello world");
//		for(int j =0;j<nums.length;j++) {
//			System.out.println(res[j]);
//		}
	}
}
