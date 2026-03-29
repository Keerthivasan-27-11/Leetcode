package Leetcode4;
import java.util.*;
public class Leetcode3731 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,1};
		int min = 100, max = 0;
		for(int i = 0;i<nums.length;i++) {
			min= Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		List<Integer> li = new ArrayList<>();
		for(int i = min;i<=max ;i++) {
			int a = 0;
			for(int j= 0;j<nums.length;j++) {
				if(nums[j]==i) {
					a++;
				}
			}
			if(a==0) {
				li.add(i);
			}
		}
		System.out.println(li);
	}

}
