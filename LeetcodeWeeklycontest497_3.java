package Leetcode5;

public class LeetcodeWeeklycontest497_3 {
	public static void main(String[] args) {
		int[] sides = {3,4,5};
		int s = (sides[0]+sides[1]+sides[2])/2;
		int an =(int) Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));
		int a = sides[0],b = sides[1],c = sides[2];
		int a11= ((b*b)+(c*c) - (a*a))/(2*b*c);
		double a1 = Math.acos(a11);
		System.out.println(a1);
		}
}
