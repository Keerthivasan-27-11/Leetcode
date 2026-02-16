package Leetcode2;

public class Leetcode2315 {
	public static void main(String[] args) {
		String s = "yo|uar|e**|b|e***au|tifu|l";
		int max = 0,a= 0,b=0,c=0,d=0,e=0,f=0;
		for(int i = 0;i<s.length();i++) {
			String n = s.substring(i,i+1);
			d++;
			if(a==0 && n.equals("|")) {
				a = 1;
				c++;
				e=d;
				continue;
			}
			if(a==1 && n.equals("*")) {
				b++;
			}
			if(a == 1 && n.equals("|")) {
				c++;
				if(c%2==0 && f!=e) {
				f++;
					if(max ==0) {
						max += b;b = 0;
					}
					else {
						max+=b;
						b=0;
					}
				}
				b=0;
			}
		}
		System.out.println(f);
		System.out.println(e);
		System.out.println(max);
	}
}
