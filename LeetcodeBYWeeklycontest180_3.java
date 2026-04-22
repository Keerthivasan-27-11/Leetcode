package Leetcode5;
import java.math.BigInteger;
public class LeetcodeBYWeeklycontest180_3{
	public static void main(String[] args) {
		int[] nums = {5,6,7,8};
		int count = 0,flip = 0;
		for(int i = 0;i<nums.length;i++) {
			int b = 0,n1 = 0;
			while(n1!= 1){
				b = 0;
				for(int j = 1;j<=nums[i];j++) {
					if(nums[i]%j == 0) {
						b++;
					}
				}
				nums[i]++;
				if (flip == 0) {
					if(b == 2) {
						n1 ++;
						flip = 1;
					}else {
						count++;
					}
				}
				else {
					if(b != 2) {
						n1++;
						flip = 0;
					}
					else {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}