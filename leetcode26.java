package Leetcode2;
import java.util.*;
public class leetcode26 {
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		HashSet<Integer> li = new HashSet<>();
		String s = "";
		
		for(int i=0;i<nums.length;i++) {
			if(s.contains(Integer.toString(nums[i]))) {
				continue;
			}
			else {
				s+=Integer.toString(nums[i]);
			}
		}
		System.out.println(s);
	}
}
