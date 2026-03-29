package Leetcode4;
import java.util.*;
public class Leetcode2391 {
	public static void main(String[] args) {
		String[] garbage = {"MMM","PGM","GP"};
		int[] travel = {3,10};
		int total = 0,g=0,m= 0,b=0,p = 0;
		for(int i = 0;i<garbage.length;i++) {
			int a = 0;
			for(int j = 0;j<garbage[i].length();j++) {
				if(garbage[i].substring(j,j+1).equals("G")) {
					g++;
					a++;
				}
			}
			if(a>0) {
				g+=travel[b++];
			}
		}
		int c= 0,d= 0;
		for(int i = 0;i<garbage.length;i++) {
			int a = 0;
			for(int j = 0;j<garbage[i].length();j++) {
				if(garbage[i].substring(j,j+1).equals("P")) {
					p++;
					a++;
				}
			}
			if(a>0) {
				p+=travel[c++];
			}
		}
		for(int i = 0;i<garbage.length;i++) {
			int a = 0;
			for(int j = 0;j<garbage[i].length();j++) {
				if(garbage[i].substring(j,j+1).equals("M")) {
					m++;
					a++;
				}
			}
			if(a>0) {
				m+=travel[d++];
			}
		}
		System.out.println(g+" "+m+" "+p);
	}
}
