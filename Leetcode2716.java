package Leetcode2;
import java.util.*;
public class Leetcode2716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baadccab";
		HashSet<String> li = new HashSet<>();
		for(int i = 0;i<s.length() ;i++) {
			li.add(s.substring(i,i+1));
		}
		String res = "";
		for(String n : li) {
			res+=n;
		}
		System.out.println(li.size());
	}

}
