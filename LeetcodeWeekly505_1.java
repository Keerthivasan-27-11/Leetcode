package Leetcode6;

public class LeetcodeWeekly505_1 {
	public static void main(String[] args) {
		int n = 5,k = 100;
		int res = 0;
		for(int i = 0;i<=n*k*10;i++) {
			if(Math.abs(n-i)<=k && (n&i)==0) {
				res+=i;
			}
		}
		System.out.println(res);
	}
}
