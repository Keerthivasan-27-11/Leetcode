package Leetcode;
public class Listnode1 {
	private void psvm() {
		// TODO Auto-generated method stub
		String s = "abab";
		int count = 0;
		String res="";
		for(int i= 0;i<s.length();i++) {
			if(res.substring(0,1).equals(s.substring(i,i+1))) {
				count ++;
				s="";
			}
		}
		System.out.println(count);
	}

}
