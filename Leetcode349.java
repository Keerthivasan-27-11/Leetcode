package Leetcode31;
import java.util.*;
public class Leetcode349 {
	public static void main(String[] args) {
		int[] nums1 = {4,9,5},nums2 = {9,4,9,8,4};
		HashSet<Integer> li = new HashSet<>();
		for(int i = 0;i<nums1.length;i++) {
			for(int j = 0;j<nums2.length;j++) {
				if(nums1[i]==nums2[j]) {
					li.add(nums1[i]);
				}
			}
		}
		int a = 0;
		int[] res = new int[li.size()];
		for(Integer i : li) {
			res[a++]=i;
		}
	}
}
