package Leetcode6;

public class Leetcode29 {
	public static void main(String[] args) {
		int dividend =10,divisor = 3;
		long res = 0;
		Long l1 = Long.parseLong(Integer.toString(dividend));
		Long l2 = Long.parseLong(Integer.toString(divisor));
		res =(l1)/l2;
		if(res>Math.pow(2, 31)-1) {
			res =(long) Math.pow(2, 31)-1;
		}
		if(res<-Math.pow(2, 31)) {
			res =(long) -Math.pow(2, 31);
		}
		System.out.println((int)res);
	}
}
