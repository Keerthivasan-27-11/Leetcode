package Leetcode2;
import java.util.*;
public class Leetcode804 {
	public static void main(String[] args) {
		String[] words= {"a"};
		String[] ch = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String[] c = new String[26];int count = 0;
		for(char n ='a';n<='z';++n) {
			c[count++]=Character.toString(n);
		}
		String[] same = new String[words.length];
		HashSet<String> lis = new HashSet<>();
		for(int i = 0;i<words.length;i++) {
			String res = "";
			for(int j = 0;j<words[i].length();j++) {
				for(int k = 0;k<26;k++) {
					if(words[i].substring(j,j+1).equals(c[k])) {
						res+=ch[k];
					}
				}
			}
			lis.add(res);
		}
		System.out.println(lis.size());
	}
}
