package Leetcode5;

public class Leetcode338 {
	public static void main(String[] args) {
		int n = 5;
		int[] res = new int[n+1];
		for(int i = 0;i<=n;i++) {
			StringBuffer sb = new StringBuffer(Integer.toBinaryString(i));
			int a = 0;
			for(int j =0;j<sb.length();j++) {
				if(sb.substring(j,j+1).equals("1")) {
					a++;
				}
			}
			res[i]=a;
		}
		for(int i = 0;i<n+1;i++) {
			System.out.println(res[i]);
		}
	}
}
