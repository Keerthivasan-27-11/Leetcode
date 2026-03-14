package Leetcode31;

public class Leetcode3783 {
	public static void main(String[] args) {
		int n = 25;
		StringBuffer sb = new StringBuffer(Integer.toString(n));
		sb.reverse();
		int res =Math.abs(n-Integer.parseInt(sb.toString()));
		System.out.println(res);
	}
}
