package Leetcode6;

public class Leetcode3120 {
	public static void main(String[] args) {
		String word = "abBCab";
		char[] str = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			str[i] = word.charAt(i);
		}
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (str[i] == (str[j]) && i != j) {
					str[j] = '_';
				}
			}
		}
		int a = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j] > str[j + 1]) {
					char c = str[j];
					str[j] = str[j + 1];
					str[j + 1] = c;
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(str[i]=='_'||str[j]=='_') {
					continue;
				}
				if (Character.toString(str[i]).toUpperCase().equals(Character.toString(str[j])) && i!=j) {
					a++;
					System.out.println(str[i]+" " +str[j]);
				}
			}
		}
		System.out.println(a);
	}
}
