package Leetcode31;

public class Leetcode2389 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,2,1},queries= {3,10,21};
		int[] res = new int[queries.length];
		for(int i = 0;i<res.length;i++) {
			int total = 0,a = 0;
			for(int j = 0;j<nums.length;j++) {
				total = 0;
				for(int k = 0;k<nums.length;k++) {
					a++;
					total +=nums[j];
					
				}
				if(total<=queries[i]) {
					break;
				}
			}
			res[i]=a;
		}
		for(int i = 0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
