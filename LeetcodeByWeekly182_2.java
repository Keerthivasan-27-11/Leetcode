package Leetcode6;

public class LeetcodeByWeekly182_2 {
	public static void main(String[] args) {
		String s = "1010";
		int min = 0, j = 0;
		StringBuffer sb = new StringBuffer(s);
		int a = 0;
		for (int i = 0; i < sb.length() - 1; i++) {
			if (sb.substring(i, i + 1).equals("1") && sb.substring(i + 1, i + 2).equals("1")) {
				min++;
				if (sb.substring(i, i + 1).equals("1")) {
					sb.replace(i, i + 1, "0");
				} else {
					sb.replace(i, i + 1, "1");
				}
			}
		}
		
		System.out.println(min);
	}
}
