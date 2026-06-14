package Leetcode6;

import java.util.*;

public class Leetcode412 {
	public static void main(String[] args) {
		int n = 15;
		List<String> li = new ArrayList<>();
		for(int i = 1;i<=n;i++) {
			int m = 0;
			if(i%3==0) {
				m += 3;
			}
			if(i%5==0) {
				m += 5;
			}
			if(m==3) {
				li.add("Fizz");
			}
			else if(m==5) {
				li.add("Buzz");
			}
			else if(m==8) {
				li.add("FizzBuzz");
			}
			else {
				li.add(Integer.toString(i));
			}
		}
		System.out.println(li);
	}
}
