package Leetcode31;
import java.util.*;
import java.util.HashSet;

public class Leetcode2325 {
	public static void main(String[] args) {
		String key = "eljuxhpwnyrdgtqkviszcfmabo",message="zwx hnfx lqantp mnoeius ycgk vcnjrdb";
		String[] str1 = new String[26];
		String[] str2 = new String[26];
		int a = 0;
		List<String> li = new ArrayList<>();
		for(char ch = 'a';ch<='z';++ch) {
			str1[a++] = Character.toString(ch);
		}
		for(int i = 0;i<key.length();i++) {
				int count = 0;
				if(key.substring(i,i+1).equals(" ")) {
					
				}else {
				for(String j : li) {
					if(j.equals(key.substring(i,i+1))) {
						count++;
					}
				}
				if(count==0) {
					li.add(key.substring(i,i+1));
				}}
		}
		int co= 0;
		for(String i:li) {
			str2[co++]=i;
		}
		System.out.println(li);
		String res = "";
		for(int i = 0;i<message.length();i++) {
			if(message.substring(i,i+1).equals(" ")) {
				res+=" ";
			}else {
			int d = 0;
			for(int j = 0;j<26;j++) {
				if(str2[j]==null) {
					continue;
				}
				if(str2[j].equals(message.substring(i,i+1))) {
					d=j;
				}
			}
			res+=str1[d];
		}}
		System.out.println(res);
	}
}
