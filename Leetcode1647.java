package Leetcode31;

public class Leetcode1647 {
	public static void main(String[] args) {
		String s = "bab",t = "aba";
		int count = 0;
		for(int i = 0;i<s.length();i++) {
			int a = 0, b = 0;
			for(int j = 0;j<s.length();j++) {
				if(s.substring(i,i+1).equals(t.substring(j,j+1))) {
					a++;
				}
			}
			for(int j = 0;j<s.length();j++) {
				if(t.substring(i,i+1).equals(s.substring(j,j+1))) {
					b++;
				}
			}
			if(b == a) {
				System.out.println(s.substring(i,i+1));
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
