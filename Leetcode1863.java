package Leetcode;

public class Leetcode1863 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,5,6,7,8};
		int total = 0;
		int b =0;
		for(int i=0;i<nums.length;i++) {
			b^=nums[i];
			total +=nums[i];
		}
		total +=b;
		for(int i = 0;i<nums.length;i++) {
			int a = 0;
			for(int j=i;j<nums.length;j++) {
				a^=nums[j];
			}System.out.println(a);
			total+=a;
		}
		int a = 0;
		for(int i= 0;i<nums.length;i++) {
			a^=nums[i];
		}
		total +=a;
//		System.out.println(total+" "+a);
	}

}
