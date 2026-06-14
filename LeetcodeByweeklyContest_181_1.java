package Leetcode6;

public class LeetcodeByweeklyContest_181_1 {
	public static void main(String[] args) {
		int n = 101, x = 0;
		String str = Integer.toString(n);
		int a = 0, b = 0;
		if (str.substring(0, 1).equals(Integer.toString(x))) {
			a++;
		}
		boolean res = false;
		for (int i = 0; i < str.length(); i++) {
			if (Integer.toString(x).equals(str.substring(i, i + 1))) {
				b++;
				break;
			}
		}
		if(a!=1&&b==1) {
			res = true;
		}
		System.out.println(res);
	}
}
