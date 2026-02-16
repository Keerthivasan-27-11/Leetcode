package Leetcode2;
import java.util.*;
public class Leetcode2778 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		List<Integer> li = new ArrayList<>();
		for(int i = 1;i<=nums.length;i++) {
			if(nums.length%i == 0) {
				li.add(nums[i-1]);
			}
		}
		int total = 0;
		for(Integer i : li) {
			total += i*i;
		}
		System.out.println(total);
		
	}
}
