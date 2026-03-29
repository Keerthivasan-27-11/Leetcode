package Leetcode4;
import java.util.*;
public class Leetcode1630 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,6,5,9,3,7},l = {0,0,2}, r = {2,3,5};
		List<Boolean> li = new ArrayList<>();
		for(int i = 0;i<l.length;i++) {
			int[] n = new int[Math.abs(r[i]+1 - l[i])];int a = 0;
			for(int j = l[i];j<=r[i];j++) {
				n[a++]=nums[j];
			}
			System.out.println();
			for(int j = 0;j<n.length;j++) {
				for(int k = 0 ;k<n.length-1;k++) {
					if(n[k]<n[k+1]) {
						int b = n[k];
						n[k]=n[k+1];
						n[k+1]= b;
					}
				}
			}
			int b =0;
			for(int j = 0;j<n.length-1;j++) {
				if((n[1]-n[0]) == (n[j+1]-n[j])) {
					b++;
				}
			}
			System.out.println(b);
			if(b == n.length-1) {
				li.add(true);
			}else {
				li.add(false);
			}
		}
		System.out.println(li);
	}

}
