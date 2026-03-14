package Leetcode31;

public class Leetcode2433 {
	public static void main(String[] args) {
		int[] pref = {13};
		int[] res = new int[pref.length];
		res[0]=pref[0];
		for(int i = 0;i<pref.length-1;i++) {
			res[i+1]=pref[i]^pref[i+1];
		}
		for(int i = 0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}
