package Leetcode6;

public class Leetcode3629 {
	public static void main(String[] args) {
		int[] nums= {2,3,4,7,9};
		int count = 0, a= 1,i = 0;
		while(i!=nums.length) {
			int b = 0;
			for(int j = 1;j<=nums[i];j++) {
				if(nums[i]%j==0) {
					b ++;
				}
			}
			if(b == 2 && i+b<nums.length) {
				a = nums[i];
			}
			else {
				a=1;
			}
			System.out.println(a);
			count ++;
			i+=a;
		}
		System.out.println(count);
	}
}
