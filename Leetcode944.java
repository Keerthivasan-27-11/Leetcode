package Leetcode6;

public class Leetcode944 {
	public static void main(String[] args) {
		String[] strs = {"zyx","wvu","tsr"};
		int res = 0;
		for(int i = 0;i<strs[0].length();i++) {
			int a = 0;
			for(int j = 0;j<strs.length-1;j++) {
				if(strs[j].charAt(i)<=strs[j+1].charAt(i)) {
					a++;
				}
			}
			if(a!=strs.length-1) {
				res++;
			}
		}
		System.out.println(res);
	}
}
