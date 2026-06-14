package Leetcode6;

public class Leetcode125 {
	public static void main(String[] args) {
		String s = "P0";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			int a = 0;
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (s.substring(i, i + 1).toLowerCase().equals(Character.toString(ch))) {
					res += s.substring(i, i + 1).toLowerCase();
					a = 1;
					break;
				} 
			}
			if (a != 1) {
				for (int j = 0; j < 10; j++) {
					if (s.substring(i, i + 1).equals(Integer.toString(j))) {
						res += s.substring(i, i + 1);
						break;
					}
				}
			}
		}
		StringBuffer sb = new StringBuffer(res);
		sb.reverse();
		boolean b = false;
		if (res.equals(sb.toString())) {
			b = true;
		}
		System.out.println(res);
		System.out.println(b);
	}
}