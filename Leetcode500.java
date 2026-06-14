package Leetcode6;

public class Leetcode500 {
	public static void main(String[] args) {
		String[] words = {"hello","Alaska","Dad","Peace"};
		String s = "";
		for (int i = 0; i < words.length; i++) {
			int a = 0, b = 0, c = 0;
			for (int j = 0; j < words[i].length(); j++) {
				String str = words[i].substring(j, j + 1).toLowerCase();
				if ("qwertyuiop".contains(str)) {
					a++;
				} else if ("asdfghjkl".contains(str)) {
					b++;
				} else {
					c++;
				}
			}
			if(a == words[i].length()||b == words[i].length() || c==words[i].length()) {
				s+=i;
			}
		}
		String[] res = new String[s.length()];
		int a = 0;
		for(int i = 0;i<s.length();i++) {
			res[a++]=words[Integer.parseInt(s.substring(i,i+1))];
		}
		for(int i = 0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}
