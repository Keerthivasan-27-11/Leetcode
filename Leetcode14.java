package Leetcode6;

public class Leetcode14 {
	public static void main(String[] args) {
		String[] strs = { "reflower","flow","flight" };
		String res = "";
		int min = 100000,n = 0;
		for (int i = 0; i < strs.length; i++) {
			if(min>strs[i].length()) {
				min = strs[i].length();
				n = i;
			}
		}
		for (int i = 0; i < min; i++) {
			int a = 0, b = 0;
			for (int j = 0; j < strs.length; j++) {
				for (int k = i; k < strs[j].length(); k++) {
					if (strs[n].substring(i, i + 1).equals(strs[j].substring(k, k + 1))) {
						a++;
						b = k;
						break;
					}
					else {
						break;
					}
				}
			}
			if (a == strs.length) {
				res += strs[0].substring(b, b + 1);
			} else {
				break;
			}
		}
		System.out.println(res);
	}
}
