package Leetcode31;

public class Leetcode {
	public static void main(String[] args) {
		String pattern = "DDD";
		int n = pattern.length()+1;
		int[] num = new int[n];
		for(int i = 0;i<n;i++) {
			num[i]=i+1;
		}
		for(int j = 0;j<n;j++) {
		for(int i = 0;i<pattern.length();i++) {
			if(pattern.substring(i,i+1).equals("I")) {
				if(num[i]<num[i+1]) {
					
				}else {
					int a = num[i];
					num[i]=num[i+1];
					num[i+1]=a;
				}
			}
			if(pattern.substring(i,i+1).equals("D")) {
				if(num[i]>num[i+1]) {
					
				}else {
					int a = num[i+1];
					num[i+1]=num[i];
					num[i]=a;
				}
			}
			
		}}
		String res = "";
		for(int i= 0;i<n;i++) {
			System.out.println(num[i]);
			res+=Integer.toString(num[i]);
		}
	}
}
