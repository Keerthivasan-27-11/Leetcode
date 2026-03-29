package Leetcode4;

public class Leetcode1935 {
	public static void main(String[] args) {
		String text = "leet code", brokenLetters = "lt";
		int count = 0;
		text += " ";
		String str = "";
		for (int k = 0; k < text.length(); k++) {
			int a = 0;
			if(text.substring(k,k+1).equals(" ")) {
				for(int i =0;i<brokenLetters.length();i++) {
					if((brokenLetters.substring(i,i+1)).contains(str)) {
						a++;
						break;
					}
				}
			}
			else {
				str+=text.substring(k,k+1);
			}
			if(a> 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
