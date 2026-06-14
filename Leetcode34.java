package Leetcode6;

public class Leetcode34 {
	public static void main(String[] args) {
		int[] nums = {1,4};
		int target = 4;
		int[] res = new int[2];
		int a = -1,b = -1;
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]==target && a == -1) {
				a = i;
			}
			else if(nums[i] == target) {
				b  = i;
			}
		}
		if((a!= -1 && b == -1)||(a == -1 && b!=-1)){
			if(a!=-1) {
				res[0]=a;
				res[1]=a;
			}
			else{
				res[0]=b;
				res[1]=b;
			}
		}
		else if((a == -1 && b ==0)||(a == 0 && b == -1)){
			
		}else {
		res[0] = a ;
		res [1] = b;}
		System.out.println(res[0]+" "+res[1]);
		System.out.println(a+" "+b);
	}
}
