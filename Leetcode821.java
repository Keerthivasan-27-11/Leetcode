package Leetcode6;

public class Leetcode821 {
	public static void main(String[] args) {
		String s = "loveleetcode", c = "e";
		int[] res = new int[s.length()];
		int a = 0, b = 0;
		for (int i = 0; i < s.length(); i++) {
			a = s.length();
			b = s.length();
			for (int j = i; j < s.length(); j++) {
				if (s.substring(j, j + 1).equals(c)) {
					a = Math.min(a, j);
				}
			}
			for(int j = 0;j<=i;j++) {
				if(s.substring(j,j+1).equals(c)) {
					b = Math.min(b, j);
				}
			}
			res[i] = Math.min(a, b);
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
