package Leetcode4;
import java.util.*;
public class Leetcode1389 {
	public static void main(String[] args) {
		int[] nums = {0,1,0},index = {0,1,0};
		int[] res = new int[nums.length];
		for(int i = 0;i<nums.length;i++) {
			res[i]=-1;
		}
		for(int i = 0;i<nums.length;i++) {
			if(res[index[i]] == -1) {
				res[index[i]]=nums[i];
			}
			else {
				for(int j = nums.length-2;j>=index[i];j--) {
					res[j+1]=res[j];
				}
				res[index[i]]=nums[i];
			}
		}
		for(int i = 0;i<nums.length;i++) {
			System.out.println(res[i]);
		}
	}
}
