package Leetcode31;

public class Leetcode3184 {
	public static void main(String[] args) {
		int[] hours = {72,48,24,3};
		int count = 0;
		for(int i = 0;i<hours.length;i++) {
			for(int j = 0;j<hours.length;j++) {
				if(i<j && (hours[i]+hours[j])%24== 0) {
					count ++;
				}
			}
		}
		System.out.println(count);
	}
}
