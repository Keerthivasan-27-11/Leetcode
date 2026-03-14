package Leetcode31;
import java.util.*;
public class Leetcode2442 {
	public static void main(String[] args) {
		int[] nums = {2,2,2};
		int[] n = new int[nums.length*2];
		for(int i = 0;i<nums.length;i++) {
			n[i]=nums[i];
		}
		HashSet<Integer> li = new HashSet<>();
		int a = nums.length;
		for(int i = 0;i<nums.length;i++) {
			StringBuffer sb = new StringBuffer(Integer.toString(nums[i]));
			sb.reverse();
			n[a++]=Integer.parseInt(sb.toString());
		}
		for(int i = 0;i<n.length;i++) {
			li.add(n[i]);
		}
		System.out.println(li.size());
	}
}
