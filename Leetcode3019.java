package Leetcode31;

public class Leetcode3019 {
	public static void main(String[] args) {
		String s = "AaAaAaaA";
		String key=s.substring(0,1);
		int change=0;
		key.toLowerCase();
		for(int i = 0;i<s.length();i++) {
			if(key.toLowerCase().equals( s.substring(i,i+1)) || key.toUpperCase().equals(s.substring(i,i+1)) ) {
				
			}else {
				key=s.substring(i,i+1);
				key.toLowerCase();
				change++;
			}
		}
		System.out.println(change);
	}
}
