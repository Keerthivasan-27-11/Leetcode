package Leetcode4;

public class Leetcode21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdab";
		int count = -1;
		for (int i = 1; i <= s.length(); i++) {
			if(s.substring(i-1,i).equals(Character.toString(s.charAt(Math.abs(s.length()-i))))){
				count=i-1;
				break;
			}
		}
		System.out.println(count);
	}

}