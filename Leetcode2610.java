package Leetcode4;
import java.util.*;
public class Leetcode2610 {
	private static final ArrayList<Integer> ArrayList = null;

	public static void main(String[] args) {
		int[] nums = {1,3,4,1,2,3,1};
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int b = 0;
		do {
			b = 0;
			ArrayList<Integer> li = new ArrayList<>();
			for(int i = 0;i<nums.length;i++) {
				if(nums[i]==-1) {
					b++;
				}
			}
			if(b==nums.length) {
				break;
			}
		for(int i =0;i<nums.length;i++) {
			int a = 0;
			if(nums[i]==-1) {
				continue;
			}
			for(Integer j:li) {
				if(j!=nums[i]) {
					a++;
				}
			}
			if(a==li.size()) {
				li.add(nums[i]);
				nums[i]=-1;
			}
		}
		res.add(li);
		}while(b!=nums.length);
		System.out.println(res);
	}
}
