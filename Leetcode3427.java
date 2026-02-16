package Leetcode2;

public class Leetcode3427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,3,1};
			int total = 0;
			for(int i = 0;i<nums.length;i++) {
				int a = 0;
				for(int j = Math.max(0, i-nums[i]);j<=i;j++) {
					a+=nums[j];
				}
				
				total +=a;
			}
		System.out.println(total);
	}

}
