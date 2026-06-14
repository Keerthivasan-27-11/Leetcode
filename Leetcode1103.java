package Leetcode6;

public class Leetcode1103 {
	public static void main(String[] args) {
		String s = "abaa";Character c = 'b';
		int[] res = new int[s.length()];
		for(int i = 0;i<s.length();i++) {
			int a = s.length();
			int b=0,d = 0,f = 0;
			for(int j = i;j<s.length();j++) {
				if(s.substring(j,j+1).equals(Character.toString(c))) {
					break;
				}
				b++;
			}
			if(i>0) {
			for(int j = i;j>=0;j--) {
				if(s.substring(j,j+1).equals(Character.toString(c))) {
					break;
				}
				d++;
			}
			res[i] = Math.min(b, d);
			}
			else {
				res[i] = b;
			}
		}
		for(int i = 0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}
