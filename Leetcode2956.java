package Leetcode31;

public class Leetcode2956 {
	public static void main(String[] args) {
		int[] nums1= {4,3,2,3,1},nums2= {2,2,5,2,3,6};
		int ans1= 0,ans2 = 0;
		for(int i = 0;i<nums1.length;i++) {
			for(int j = 0;j<nums2.length;j++) {
				if(nums1[i]==nums2[j]) {
					ans1=j ;
				}
			}
		}
		for(int i = 0;i<nums2.length;i++) {
			for(int j = 0;j<nums1.length;j++) {
				if(nums1[j]==nums2[i]) {
					ans2=j ;
				}
			}
		}
		int[] res = new int[2];
		res[0]= ans2;
		res[1]=ans1;
		System.out.println(res[0]+" "+res[1]);
	}
}