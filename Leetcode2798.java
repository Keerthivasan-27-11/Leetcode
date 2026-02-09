package Leetcode;

public class Leetcode2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hours = {5,1,4,2,2};int target = 6;
		int count = 0;
		for(int i=0;i<hours.length;i++) {
			if(hours[i]>=target) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
