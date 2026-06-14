package Leetcode6;

public class LeetcodeByweekly184_1 {
	public static void main(String[] args) {
		int nums = 6;
		boolean b = false;
		String str = Integer.toBinaryString(nums);int a = 0;
		for(int i = 0;i<str.length()-1;i+=2) {
			if(str.substring(i,i+2).equals("11")) {
				a++;
			}
		}
		if(a==1) {
			b = true;
		}
		System.out.println(b);
	}
}
