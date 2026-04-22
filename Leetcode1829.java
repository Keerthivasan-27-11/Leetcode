package Leetcode5;
import java.util.*;
public class Leetcode1829 {
	public static void main(String[] args) {
		int[] nums = {0,1,1,3};int maximumBit = 2;
		List<Integer> li = new ArrayList<>();
		for(int i = 0;i<nums.length;i++) {
			li.add(nums[i]);
			}
		int[] res = new int[nums.length];
		int ma = Math.powExact(2, maximumBit),k = 0,max = li.get(li.size()-1);
		for(int i = 0;i<nums.length;i++) {
			int a = 0;k = 0;
			for(Integer n : li) {
				a^=n;
			}
			k=Math.abs((max-a));
			li.remove(li.size()-1);
			res[i]=k;
		}
		for(int i =0;i<nums.length;i++) {
			System.out.println(res[i]);
		}
	}
}
