package Leetcode6;
import java.util.*;
public class Leetcode136 {
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		int res = 0;
		for(int i = 0;i<nums.length;i++) {
			int a = 0;
			for(int j = 0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					a++;
				}
			}
			if(a == 1) {
				res=nums[i];
				break;
			}
		}
		System.out.println(res);
	}
}
