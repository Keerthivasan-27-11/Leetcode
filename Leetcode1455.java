package Leetcode2;
import java.util.*;
public class Leetcode1455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "hello";
		String searchWord = "ell";
		List<String> li = new ArrayList<>();
		sentence+=" ";String s = "";
		for(int i= 0;i<sentence.length() ;i++) {
			if(sentence.substring(i,i+1).equals(" ")) {
				
				//7639526888
				
				li.add(s);
				s="";
			}
			else {
				s+=sentence.substring(i,i+1);
			}
		}
		int count = 0,c= 0;
		for(String i : li) {
		c++;
		String st = i.substring(0,searchWord.length());
			if(st.contains(searchWord)) {
				count = c;
				break;
			}
		
		}
		System.out.println(count);
	}
}
