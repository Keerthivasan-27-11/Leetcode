package Leetcode6;

public class Leetcode3633 {
	public static void main(String[] args) {
		int[] landStartTime = { 99 }, landDuration = { 59 }, waterStartTime = { 99,54 }, waterDuration = { 85,20 };
		int m = landStartTime.length, n = waterStartTime.length;
		int min = 10000000;
		for (int i = 0; i < m; i++) {
			for (int k = 0; k < n; k++) {
				min = Math.min(min, (landStartTime[i] + landDuration[i] + waterDuration[k]));
				System.out.println(min);
			}
		}
		System.out.println(min);
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < m; k++) {
				min = Math.min(min, (waterStartTime[i] + waterDuration[i] + landDuration[k]));
				System.out.println(min);
			}
		}
		System.out.println(min);
	}
}
