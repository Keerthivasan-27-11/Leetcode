package Leetcode6;
import java.util.*;
public class Leetcode1832 {
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		Set<String> str = new HashSet<>();
		for(int i = 0;i<sentence.length();i++) {
			str.add(sentence.substring(i,i+1));
		}
		boolean b = false;
		if(str.size() == 26) {
			b = true;
		}
		System.out.println(b);
	}
}
