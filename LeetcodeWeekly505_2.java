package Leetcode6;

import java.util.*;

public class LeetcodeWeekly505_2 {
	public static void main(String[] args) {
		int n = 1, k = 0;
		List<String> li = new ArrayList<>();
		for (int i = 0; i <= Math.powExact(2, n); i++) {
			String sb = Integer.toBinaryString(i);
			int s = sb.length();
			if (n > sb.length()) {
				for (int j = 0; j < Math.abs(n-s); j++) {
					sb = "0" + sb;
				}
			}
			if (sb.length() == n) {
				int a = 0, b = 0;
				for (int j = 0; j < sb.length() - 1; j++) {
					if (sb.substring(j, j + 2).equals("11")) {
						b = 1;
						break;
					}
				}
				if (b != 1) {
					for (int j = 0; j < sb.length(); j++) {
						if (sb.substring(j, j + 1).equals("1")) {
							a += j;
						}
					}
					if (a <= k) {
						li.add(sb);
					}
				}
			}
		}
		System.out.println(li);
	}
}
