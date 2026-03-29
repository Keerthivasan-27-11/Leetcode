package Leetcode4;

public class Leetcode2125 {
	public static void main(String[] args) {
		String[] bank = { "000", "111", "000" };
		int count = 0;
		for (int i = 0; i < bank.length - 1; i++) {
			for (int j = 0; j < bank[i].length(); j++) {
				if (bank[i].substring(j, j + 1).equals("1")) {
					int a = 0;
					for (int l = i + 1; l < bank.length; l++) {
						for (int k = 0; k < bank[i].length(); k++) {
							if (bank[l].substring(k, k + 1).equals("1")) {
								a++;
								count++;
							}
						}
						if (a > 0) {
							break;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
