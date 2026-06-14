package Leetcode6;

public class Leetcode {
	public static void main(String[] args) {
		int num1 = 96, num2 = 161;
		int res = 0;
		for (int i = num1; i <= num2; i++) {
			StringBuffer sb = new StringBuffer(Integer.toString(i));
			for (int j = 1; j < sb.length() - 1; j++) {
				if (Integer.parseInt(sb.substring(j - 1, j)) > Integer.parseInt(sb.substring(j, j + 1))
						&& Integer.parseInt(sb.substring(j, j + 1)) < Integer.parseInt(sb.substring(j + 1, j + 2))) {
					res++;
				} else if (Integer.parseInt(sb.substring(j - 1, j)) < Integer.parseInt(sb.substring(j, j + 1))
						&& Integer.parseInt(sb.substring(j, j + 1)) > Integer.parseInt(sb.substring(j + 1, j + 2))) {
					res++;
				}
			}
		}
		System.out.println(res);
	}
}
