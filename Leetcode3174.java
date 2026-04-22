package Leetcode5;

public class Leetcode3174 {
	public static void main(String[] args) {
		String s = "abc";
		StringBuffer sb = new StringBuffer(s);
		int j1 = 0;
		String res= "1 2 3 4 5 6 7 8 9 0";
		do {
			j1 = 0;
			int i1 = sb.length();
			for (int i = 0; i < i1; i++) {
				if (res.contains(sb.substring(i,i+1))) {
					sb.delete(i - 1, i + 1);
					j1++;
					break;
				}
			}
		} while (j1 != 0);
		System.out.println(sb);
	}
}
