package Leetcode4;
import java.util.*;
public class Leetcode557 {
	public static void main(String[] args) {
		String s = "Let`s take LeetCode contest";
		s+=" ";
		String res = "";
		String str = "";
		for(int i = 0;i<s.length();i++) {
			if(s.substring(i,i+1).equals(" ")) {
				StringBuffer sb = new StringBuffer(str);
				sb.reverse();
				res+=sb+" ";
				str="";
			}
			else {
				str+=s.substring(i,i+1);
			}
		}
		res=res.substring(0,res.length()-1);
		System.out.println(res);
	}
}
