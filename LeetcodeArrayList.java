package Leetcode2;
import java.util.*;
public class LeetcodeArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> items = new ArrayList<>(Arrays.asList(
		            new ArrayList<>(Arrays.asList("phone", "blue", "pixel")),
		            new ArrayList<>(Arrays.asList("computer", "silver", "lenovo")),
		            new ArrayList<>(Arrays.asList("phone", "gold", "phone"))
		        ));
		String ruleValue= "phone",ruleKey="type";
		  ArrayList<String> li1 = new ArrayList<>();
	        for (ArrayList<String> sublist : items) {
	            li1.addAll(sublist);
	        }
	        int count = 0;
	        String[] n = {"type","color","name"};
	        int co = 0;
	        for(String s : li1) {
	        		if(s.equals(ruleValue) && ruleKey.equals(n[co])) {
	        			count++;
	        		}
	        		co= (++co)%3;
	        		}
	        System.out.println(count);
	}
}
