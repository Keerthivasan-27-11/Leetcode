package Leetcode2;

public class Leetcode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2},nums2= {3,4};
		int[] res = new int[nums1.length+nums2.length];
		int count = 0;
		for(int i = 0;i<nums1.length;i++) {
			res[count++]=nums1[i];
		}
		for(int i = 0;i<nums2.length;i++) {
			res[count++]=nums2[i];
		}
		for(int i = 0;i<res.length;i++) {
			for(int j = 0;j<res.length-1;j++) {
				if(res[j]>res[j+1]) {
				int a = res[j];
				res[j]=res[j+1];
				res[j+1]=a;
				}
			}
		}
		double total = 0;
		if(res.length%2==0) {
			total = res[res.length/2]+res[(res.length/2)-1];
			total = total /2.0;
		}
		else {
			total = res[res.length/2];
		}
		System.out.println(total);
	}

}
