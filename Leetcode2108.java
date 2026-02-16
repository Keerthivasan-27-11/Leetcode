package Leetcode2;

public class Leetcode2108 {
	public static void main(String[] args) {
		String[] words= {"def","ghi"};
		String res = "";
		for(int i = 0;i<words.length;i++) {
			String s ="";
			for(int j=words[i].length()-1;j>-1;j--) {
				s+=words[i].substring(j,j+1);
			}
			if(words[i].equals(s)) {
				res=words[i];
				break;
			}
		}
		System.out.println(res);
	}
}
