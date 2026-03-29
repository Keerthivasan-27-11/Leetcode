package Leetcode4;

public class Leetcode3131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {10},nums2 = {5};
		if(nums1.length > 1) {
		System.out.println(1);
		for(int i = 0;i<nums1.length;i++) {
			for(int j = 0;j<nums1.length-1;j++) {
				if(nums1[j] > nums1[j+1]) {
					int c=nums1[j];
					nums1[j] = nums1[j+1];
					nums1[j+1]= c;
				}
			}
		}

		for(int i = 0;i<nums2.length;i++) {
			for(int j = 0;j<nums2.length-1;j++) {
				if(nums2[j] > nums2[j+1]) {
					int c=nums2[j];
					nums2[j] = nums2[j+1];
					nums2[j+1]= c;
				}
			}
		}}
		int j = 0,i1 = 0,c= 0, count = 0;
		do {
			c= 0;
			if(nums1[0]+j==nums2[0]) {
				count=j;
			}
			else if(nums1[0]-i1 == nums2[0]) {
				count = i1;
			}
//			for(int i= 0;i<nums2.length;i++) {
//				if(nums1[i]+count == nums2[i]) {
//					c++;
//				}
//			}
			j++;i1--;
		}while(nums1[0]+count != nums2[0]);
		System.out.println(count);
	}

}
