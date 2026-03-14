package Leetcode31;
import java.util.*;
public class Leetcod2610 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		String st= "";
		for(int i = 0;i<nums.length;i++) {
			st+=nums[i];
		}
		List<List<Integer>> li = new ArrayList<>();
		int d = 0;
		for(int i  = 0;i<nums.length;i++) {
			String str = "";
			List<Integer> l1 = new ArrayList<>();
			for(int j = 0;j<nums.length;j++) {
			if(nums[j]==0) {
				continue;
			}
			if(str.length()==0) {
				str+=nums[j];
			}
			if(str.contains(Integer.toString( nums[j]))) {
				
			}
			else {
				str+=nums[j];
				nums[j]=0;
			}
			}StringBuffer sb = new StringBuffer(str);
			if(st.equals(str)) {
			sb.reverse();
			}			
			for(int k = 0;k<sb.length();k++) {
				l1.add(Integer.parseInt(sb.substring(k,k+1)));
			}
			d+=l1.size();
			li.add(l1);
			l1.remove(l1);
			if(d == nums.length) {
				break;
			}
		}
		System.out.println(li);
	}
}
