package Leetcode6;

public class Leetcode657 {
	public static void main(String[] args) {
		String moves = "UD";
		//int[][] move = new int[moves.length()][moves.length()];
		int left = 0,right = 0;
		for(int i = 0;i<moves.length();i++) {
			if(moves.substring(i,i+1).equals("U")) {
				left--;
			}
			else if(moves.substring(i,i+1).equals("D")) {
				left++;
			}
			else if(moves.substring(i,i+1).equals("R")) {
				right++;
			}
			else if(moves.substring(i,i+1).equals("L")){
				right--;
			}
		}
		boolean b = false;
		if(left==0 && right==0) {
			b = true;
		}
		System.out.println(b);
	}
}
