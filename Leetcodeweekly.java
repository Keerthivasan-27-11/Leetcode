package Leetcode4;

public class Leetcodeweekly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 998;
		int count  = 0;
		for(int i = 0;i<=n;i++) {
			StringBuffer sb = new StringBuffer(Integer.toString(i));
			if(sb.length()<=3) {
				count +=0;
			}
			else if(sb.length()>3 && sb.length()<=6) {
				count+=1;
			}
//			else {
//				count+=2;
//			}//100000
		}
		System.out.println(count);
	}

}
