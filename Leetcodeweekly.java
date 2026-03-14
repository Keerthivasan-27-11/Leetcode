package Leetcode31;

public class Leetcodeweekly {
	public static void main(String[] args) {
		int[] capacity = {3,5,4,3};
		int itemSize=2;
		int min = 100;
		for(int i = 0;i<capacity.length;i++) {
			if(capacity[i]>=itemSize) {
				min = Math.min(capacity[i], min);
			}
		}
		int max = -1,a = 0;
		for(int i = 0;i<capacity.length;i++) {
			if(min == capacity[i]) {
				max = i;
				break;
			}
		}
		System.out.println(max);
	}
}
