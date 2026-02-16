package Leetcode2;

public class Leetcode3151 {
	public static void main(String[] args) {
		int[] nums= {1};
		boolean b = false;
		if(nums.length == 1) {
			b = true;
		}
		else {
		for(int i= 0;i<nums.length-1;i++) {
			int a = 0;
			if(nums[i]==nums[i+1]) {
				a++;
			}
			else if(nums[i]%2==0 && nums[i+1]%2==0) {
				a++;
			}
			else if(nums[i+1]%2!=0 && nums[i]%2!=0) {
				a++;
			}
			if(a==0){
				b = true;
			}
			else {
				b = false;
				break;
			}
		}}
		System.out.println(b);
	}
}
