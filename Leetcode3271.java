package Leetcode4;

public class Leetcode3271 {
	public static void main(String[] args) {
		String s = "abcd";int k = 2;
		String res = "";
		char[] c = new char[26];
		int co = 0;
		for(char ch = 'a';ch<='z';ch++) {
			c[co++]=ch;
		}
		int j = 0;
		do {
			int a = 0;
			for(int i = j;i<k+j;i++) {
				int count = 0;
				for(int l = 0;l<26;l++) {

					if(s.substring(i,i+1).equals(Character.toString(c[l]))) {
						count = l;break;
					}
				}
				a+=count;
			}
			j+=k;
			res+=Character.toString(c[a%26]);
		}while(j != s.length());
		System.out.println(res);
	}
}
