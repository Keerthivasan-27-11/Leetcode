package Leetcode;
public class Leetcode3168{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ELEELEELLL";
		int count = 1,waiting = 0,leaving= 0;
		for(int i = 0 ;i<s.length();i++) {
			if(s.subSequence(i,i+1).equals("E")) {
				waiting++;
				if(waiting>count) {
					count ++;
				}
			}else if(s.substring(i,i+1).equals("L")) {
				waiting --;
			}
			
		}
		System.out.println(count);
	}

}
