package Leetcode6;
import java.util.*;
public class Leetcode2452 {
	public static void main(String[] args) {
		String[] queries = {"yes"},dictionary = {"not"};
		List<String> li = new ArrayList<>();
		for(int i= 0;i<queries.length;i++) {
			for(int j = 0;j<dictionary.length;j++) {
				int changes = 0;
				for(int k = 0;k<queries[i].length();k++) {
					if(queries[i].substring(k,k+1).equals(dictionary[j].substring(k,k+1))){
						
					}
					else {
						changes++;
					}
				}
				if(changes<=2) {
					li.add(queries[i]);
					break;
				}
			}
		}
		System.out.println(li);
	}
}
