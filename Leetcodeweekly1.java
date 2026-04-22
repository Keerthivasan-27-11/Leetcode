package Leetcode5;

public class Leetcodeweekly1 {
	public static void main(String[] args) {
		String s= "lm";
		String[] ch = new String[26];
		String[] ch1 = new String[26];
		int a = 0,count = 0,cn=25;
		for(Character c ='a';c<='z';c++) {
			ch[a++]=Character.toString(c);
			ch1[cn--]=Character.toString(c);
		}
		for(int i = 0;i<26;i++) {
			System.out.println(ch[i]+" "+ch1[i]);
		}
		System.out.println(a);
		String[] n = {"0","1","2","3","4","5","6","7","8","9"};
		for(int i = 0;i<s.length();i++) {
			String str = s.substring(i,i+1);
			int b = 0,c = 0;
			for(int j = 0;j<10;j++) {
				if(str.equals(n[j])) {
					b = j;
				}
			}
			for(int j = 0;j<26;j++) {
				if(str.equals(ch[j])) {
					b=j;
				}
			}
			System.out.println(ch1[b]+b);
			int co = 0;
			for(int j = 0;j<s.length();j++) {
if(str.equals(s.substring(j,j+1))) {
					if(str.equals(s.substring(j,j+1))) {
						co++;
					}
				}
			}
			if(co>=2) {
				break;
			}
			for(int j= 0;j<s.length();j++) {
				
				if(ch1[b].equals(s.substring(j,j+1))) {
					count ++;
				}
			}
			if(b <10) {
			for(int j = 0;j<s.length();j++) {
				if(n[Math.abs(b+1-9)].equals(s.substring(j,j+1))) {
					count++;
				}
			}}
		}
		System.out.println(count);
	}
}
