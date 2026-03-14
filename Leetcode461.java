package Leetcode31;

public class Leetcode461 {
	public static void main(String[] args) {
		int x = 1,y=4;
		String s = Integer.toBinaryString(x), s1 = Integer.toBinaryString(y);
		int max = Math.max(s1.length(), s.length());
		if(s.length()!=max) {
			for(int i = s.length();i<max;i++) {
				s="0"+s;
			}
		}
		if(s1.length()!=max) {
			for(int i = s1.length();i<max;i++) {
				s1="0"+s1;
			}
		}
		int count = 0, j = 0;
		StringBuffer sb = new StringBuffer(s);
		do {
			if(s1.substring(j,j+1).equals(sb.substring(j,j+1))) {
				
			}else {
				count++;
				if(s.substring(j,j+1).equals("1")) {
				sb.replace(j, j+1,"0");}
				else {
					sb.replace(j, j+1,"0");
				}
			}
			j++;
		}while(j!=sb.length());
		System.out.println(count);
	}
}
