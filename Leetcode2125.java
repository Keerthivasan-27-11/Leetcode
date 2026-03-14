package Leetcode31;
import java.lang.*;
public class Leetcode2125 {
	public static void main(String[] args) {
		String[] bank = {"000","111","000"};
		int count = 0;
		for(int i = 0;i<bank.length-1;i++) {
			for(int j = Math.min(0, bank.length);j<bank[i].length();j++) {
				if(bank[i].substring(j,j+1).equals("1")) {
					for(int k = i+1;k<bank.length;k++) {
						int c = 0;
						for(int l = 0;l<bank[k].length();l++) {
							if(bank[k].substring(l,l+1).equals("1")) {
								count++;c++;
							}
						}if(c>=1) {
							break;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
