package Leetcode5;

public class Leetcode3750 {
	public static void main(String[] args) {
		int n = 10;
		StringBuffer sb = new StringBuffer(Integer.toBinaryString(n));
		String str = Integer.toBinaryString(n);
		sb.reverse();
		int count = 0;
		for(int i = 0;i<sb.length();i++) {
			if(str.substring(i,i+1).equals(sb.substring(i,i+1))) {
				
			}
			else {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
