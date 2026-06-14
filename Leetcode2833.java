package Leetcode6;

public class Leetcode2833 {
	//czech
	public static void main(String[] args) {
		String moves = "_R__LL_";
		int count = 0,l = 0,r = 0;
		for(int i = 0;i<moves.length();i++) {
			if(moves.substring(i,i+1).equals("L")) {
				l++;
			}
			else if(moves.substring(i,i+1).equals("R")) {
				r++;
			}
		}
		for(int i = 0;i<moves.length();i++) {
			if(moves.substring(i,i+1).equals("R") || (moves.substring(i,i+1).equals("_") && r>=l)) {
				count++;
			}
			else if(moves.substring(i,i+1).equals("L") ||( moves.substring(i,i+1).equals("_") && l>r)) {
				count--;
			}			
		}
		System.out.println(count);
	}
}
