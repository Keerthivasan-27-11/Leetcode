package Leetcode6;

public class Leetcode3753 {
	public static void main(String[] args) {
		long num1 = 120,num2 = 130;
		long res = 0;
		for (long i = num1; i <= num2; i++) {
			StringBuffer sb = new StringBuffer(Long.toString(i));
			for (int j = 1; j < sb.length() - 1; j++) {
				if ((sb.charAt(j-1)>sb.charAt(j) && sb.charAt(j)<sb.charAt(j+1)) || sb.charAt(j-1)<sb.charAt(j) && sb.charAt(j)>sb.charAt(j+1)) {
					res++; 
				} 
			}
		}
		System.out.println(res);
	}
}
