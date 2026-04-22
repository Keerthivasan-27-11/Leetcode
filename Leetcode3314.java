package Leetcode5;
import java.util.*;
public class Leetcode3314 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(11);
		nums.add(13);
		nums.add(31);
		int[] res = new int[nums.size()];
		int a = 0;
		for(Integer i : nums) {
			res[a]=0;
			int j = 0;
			do {
				if(res[a]>i) {
					j = 1;
					res[a]=-1;
					break;
				}
				else if((res[a]|(res[a]+1)) == i) {
					res[a]=res[a];
					 j=1;
				}
				else {
					res[a]++;
				}
			}while(j!=1);
			a++;
		}
		for(int i = 0;i<nums.size();i++) {
			System.out.println(res[i]);
		}
	}
}
