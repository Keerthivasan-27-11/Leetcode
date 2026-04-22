package Leetcode5;
import java.util.*;
public class Leetcode2094{
	public static void main(String[] args) {
		int[] digits = {2,1,3,0};
		List<Integer> li = new ArrayList<>();
		for(int i = 100;i<1000;i++) {
			String str = Integer.toString(i);
			int k = 0;
			for(int j = 0;j<digits.length;j++) {
				if(str.equals(Integer.toString( digits[j]))) {
					k++;
				}
			}
			if(k == digits.length) {
				li.add(i);
			}
		}
		System.out.println(li);
	}
}
