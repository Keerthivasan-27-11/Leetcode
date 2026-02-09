package Leetcode;

public class Leetcode2433 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pref= {580749,257475,683852,498321,554252,183734,902737,233091};
		int[] nums = new int[pref.length];
		for(int i= 0;i<pref.length;i++) {
			if(i==0) {
				nums[i]=pref[i];
			}
			else {
				int t= 0;
				for(int k= 0;k<nums.length;k++) {
					t^=nums[k];
				}
				//System.out.println(t);
			int  a= 0;
			for(int j=0;j<Math.pow(10, 6);j++) {
			a=t^j;
			if(pref[i]==a) {
				nums[i]=j;
			}
		}
		}}
		
		for(int i = 0;i<nums.length;i++) {
		System.out.println(nums[i]);}
	}

}
