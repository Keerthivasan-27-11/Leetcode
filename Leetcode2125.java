package Leetcode5;

public class Leetcode2125 {
	public static void main(String[] args) {
		String[] bank = {"011001","000000","010100","001000"};
		int count = 0;
		for(int i = 0;i<bank.length-1;i++) {
			int a = 0;
			for(int j = 0;j<bank[i].length();j++) {
				if(bank[i].substring(j,j+1).equals("1")) {
					a++;
				}
			}
			int b = 0;
			for(int j= i+1;j<bank.length;j++) {
				for(int k = 0;k<bank[j].length();k++) {
					if(bank[j].substring(k,k+1).equals("1")) {
						b++;
					}
				}
				if(b>0) {
					break;
				}
			}
			count+=(a*b);
		}
		System.out.println(count);
	}
}
