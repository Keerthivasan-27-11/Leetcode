package Leetcode31;

public class Leetcode3370 {
	public static void main(String[] args) {
		int n = 10 ;
		int a = 0,i = 0,j = n,b =0,max = 0;
		do {
			a=0;
			StringBuffer sb = new StringBuffer(Integer.toBinaryString(j));
			b = sb.length();
			for(i = 0;i<sb.length();i++) {
				if(sb.substring(i,i+1).equals("1")) {
					a++;
				}
			}
			max = j;
			j++;
		}while(a!=b);
		System.out.println(max);
	}
}
