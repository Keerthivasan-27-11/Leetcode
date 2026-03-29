package Leetcode4;
import java.util.*;
public class Leetcode46 {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> li = new ArrayList<>();
		for(int i = 0;i<nums.length;i++) {
			List<Integer> list = new ArrayList<>();
			int a = 0;
			for(int j = 0;j<nums.length;j++) {
				if(a==0) {
					list.add(nums[i]);a++;
				}
				if(i != j && a!=0) {
					list.add(nums[j]);
				}
			}
			li.add(list);
		}
		System.out.println(li);
	}
}
