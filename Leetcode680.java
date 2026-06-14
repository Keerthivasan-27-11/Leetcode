package Leetcode6;

public class Leetcode680 {
	public static void main(String[] args) {
		String s = "abc";
		boolean b = false;
		for(int i = 0;i<s.length();i++) {
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			if(s.equals(sb.toString())) {
				b = true;
				break;
			}
			else {
				sb.reverse();
				sb.delete(i, i+1);
				String str = sb.toString();
				sb.reverse();
				if(str.equals(sb.toString())) {
					b = true;
					break;
				}
			}
		}
		System.out.println(b);
	}
}
