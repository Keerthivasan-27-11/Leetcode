package Leetcode6;

public class Leetcode8 {

	public int myAtoi(String s) {
		
		String res = "";
		int a = 0, b = 0;
		String str = "0 1 2 3 4 5 6 7 8 9";
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(" ")) {
				continue;
			} else if ((s.substring(i, i + 1).equals("-")) && b != 1) {
				a = 1;
				b = 1;
			} else if (str.contains(s.substring(i, i + 1))) {
				b = 1;
				res += s.substring(i, i + 1);
			} else {
				break;
			}
		}
		int total = 0;
		if (res.length() == 0) {
			total = 0;
		} else {
			total = Integer.parseInt(res);
		}
		if (a == 1) {
			total *= -1;
		}
		if(total<-Math.pow(2, 31)) {
			total =(int) -Math.pow(2, 31);
		}
		if(total > Math.pow(2, 31)-1) {
			total = (int)Math.powExact(2, 31)-1;
		}
		return total;
	}

	public static void main(String[] args) {
		Leetcode8 li = new Leetcode8();
		int a = li.myAtoi("91283472332");
		
		System.out.println(a);
	}
}
