package Leetcode5;

public class Leetcode {
	public static void main(String[] args) {
		int x = -120;
		if(x>0) {
			StringBuffer sb = new StringBuffer(Integer.toString(x));
			sb.reverse();
			x = Integer.parseInt(sb.toString());
		}
		else {
			String res = Integer.toString(x);
			StringBuffer sb = new StringBuffer(res.substring(1,res.length()));
			sb.reverse();
			x = Integer.parseInt(sb.toString());
			x*=-1;
		}
		System.out.println(x);
		if(-(Math.pow(2,31))>=x && x<=Math.pow(2,31)-1) {
		}
		else {
			x = 0;
		}
		System.out.println(x);
	}
}
