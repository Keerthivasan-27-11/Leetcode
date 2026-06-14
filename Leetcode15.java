package Leetcode6;
import java.util.*;
import java.util.function.UnaryOperator;
public class Leetcode15 {
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> res = new ArrayList<>();
		int a= 0;
		System.out.println(res.size());
		for(int i =0;i<nums.length;i++) {
			a = 0;
			for(int j = 0;j<nums.length;j++) {
				for(int k = 0;k<nums.length;k++) {
					if(i!=j && j!=k && i!=k && (nums[i]+nums[j]+nums[k])==0) {
						List<Integer> li = new ArrayList<>();
						li.add(nums[i]);
						li.add(nums[j]);
						li.add(nums[k]);
						if(res.size() == 0) {
						res.add(li);
						}
						else {
							int s = 0,st = 0;
							for(int  i1 = 0;i1<res.size();i1++) {
								s = 0;
								for(Integer n:res.get(i1)) {
									for(Integer m:li) {
										if(m==n) {
											s++;
										}
									}
								}
								if(s == 0) {
									st++;
								}
							}
							if(st == res.size()) {
								res.add(li);
							}
						}
						System.out.println(li);
					}
				}
			}
		}
		System.out.println(res);
	}
}
