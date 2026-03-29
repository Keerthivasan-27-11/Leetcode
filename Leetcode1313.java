package Leetcode4;
import java.util.*;
public class Leetcode1313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3};
		List<Integer> li = new ArrayList<>();
		for(int i = 0;i<nums.length;i+=2) {
			for(int j = 0;j<nums[i];j++) {
				li.add(nums[i+1]);
			}
		}
		int[] res = new int[li.size()];int a = 0;
		for(Integer i : li) {
			res[a++]=i;
		}
		System.out.println(li);
	}

}
