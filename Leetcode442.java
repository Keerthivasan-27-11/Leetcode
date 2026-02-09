package Leetcode;
import java.util.*;
public class Leetcode442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> r = new HashSet<>();
		List<Integer> res = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int[] nums = {4,3,2,7,8,2,3,1};
		for(int i = 0;i<nums.length;i++) {
			int a = 0;
			for(int j = 0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					a++;
				}
			}
			if(a>=2) {
				r.add(nums[i]);
			}
		}
		for(Integer i:r) {
			res.add(i);
		}
		for(Integer j : res) {
			System.out.println(j);
		}
	}
	

}
