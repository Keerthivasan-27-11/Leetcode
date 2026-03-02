package Leetcode2;


public class Leetcode1323 {
	public static void main(String[] args) {
		int num = 9999;
		String s = Integer.toString(num);
		int max = num;
		//System.out.println("hello");
		for(int i =s.length()-1;i>-1;i--) {
			String str = "";
			if(s.substring(i,i+1).equals("6")) {
				str=s.replaceFirst("6", "9");
				//System.out.println(s);
				max = Math.max(Integer.parseInt(str),max);
			}
			if(s.substring(i,i+1).equals("9")) {
				str=s.replaceFirst("6", "9");
				//System.out.println(s);
				max = Math.max(Integer.parseInt(str),max);
			}
			
		}
		System.out.println(max);
	}
}
