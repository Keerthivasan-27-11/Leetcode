package Leetcode31;

public class Leetcode3838 {
	public static void main(String[] args) {
	String[] words= {"abcd","def","xyz"};
	int[] weights= {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
	String res = "";
	for(int i = 0;i<words.length;i++) {
		int n = 0;
		for(int j = 0;j<words[i].length();j++) {
			int co = 0;
			for(char c = 'a';c<='z';c++) {
			if(words[i].substring(j,j+1).equals(Character.toString(c))) {
					n+=weights[co];
					break;
				}
			co++;
			}
		}
		//System.out.println(n);
		int count = 0;
		for(char ch = 'z';ch>='a';ch--) {
			if(count == (n%26)) {
				res+=Character.toString(ch);
			}
			count++;
		}
	}
	System.out.println(res);
	}
}
