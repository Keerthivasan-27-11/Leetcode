package Leetcode6;

public class Leetcode415 {
	public static void main(String[] args) {
		String num1 = "9133", num2 = "0";
		if (num1.length() < num2.length()) {
			for (int i = 0; i < Math.abs(num1.length() - num2.length()); i++) {
				num1 = "0" + num1;
			}
		} else if (num1.length() > num2.length()) {
			for (int i = 0; i < Math.abs(num1.length() - num2.length()); i++) {
				num2 = "0" + num2;
			}
		}
		System.out.println(num2+" " +num1+ " "+(num1.length()-num2.length()));
		int a = 0;
		String res = "";
		for (int i = num1.length() - 1; i >= 0; i--) {
			String b = Integer.toString(
					Integer.parseInt(num1.substring(i, i + 1)) + Integer.parseInt(num2.substring(i, i + 1)) + a);
			//System.out.println(num1.substring(i, i + 1)+" "+num2.substring(i, i + 1)+ " " +a+" "+b);
			if ((Integer.parseInt(b) >= 10)) {
				res = b.substring(b.length() - 1, b.length() ) + res;
				a = Integer.parseInt(b.substring(0, b.length() - 1));
			} else if(Integer.parseInt(b)<=9) {
				res = b + res;
				a = 0;
			}
		}
		if (a != 0) {
			res = Integer.toString(a) + res;
		}
		System.out.println(res);
	}
}
