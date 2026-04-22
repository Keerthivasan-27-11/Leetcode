package Leetcode5;
import java.util.*;
public class Leetcode905 {
	public static void main(String[] args) {
		int[] nums = {0};
		int[] even = new int[nums.length];
		int[] odd = new int[nums.length];
		int a= 0,b=0;
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				even[a++]=nums[i];
			}
			else {
				odd[b++]=nums[i];
			}
		}
		int count = 0;int[] res = new int[nums.length];
		for(int i = 0;i<a;i++) {
			res[count++]=even[i];
		}
		for(int j= 0;j<b;j++) {
			res[count++]=odd[j];
		}
		for(Integer i = 0;i<nums.length;i++) {
			System.out.println(res[i]);
		}
	}
}
