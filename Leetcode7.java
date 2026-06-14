package Leetcode6;

public class Leetcode7 {
	public static void main(String[] args) {
		int x = -2147483648;
		int res = 0;
		if (x >= 0) {
			StringBuffer sb = new StringBuffer(Integer.toString(x));
			sb.reverse();
			long num = Long.parseLong(sb.toString());
			if (num > (Math.pow(2,31)-1) || num < (-Math.pow(2, 31))) {
				num = 0;
			} else {
				res = (int) num;
			}
		} else {
			String str = Integer.toString(x);
			StringBuffer sb = new StringBuffer(str.substring(1, str.length()));
			sb.reverse();
			long num = Long.parseLong(sb.toString());
			if (num > Math.pow(2, 31) - 1 || num < -Math.pow(2, 31)) {
				num = 0;
			} else {
				res = (int) num;
			}
			res *= -1;
		}
		System.out.println(res);
	}
}
