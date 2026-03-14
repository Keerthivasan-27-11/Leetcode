package Leetcode31;

public class Leetcode451 {
	public static void main(String[] args) {
		String s = "Aabb";
		String res = "";
		String[] str = new String[s.length()];
		int[] nu = new int[s.length()];
		for(int i = 0;i<s.length();i++) {
			int a = 0;
			for(int j =0;j<s.length();j++) {
				if(s.substring(i,i+1).equals(s.substring(j,j+1))) {
					a++;
				}
			}
			str[i]= s.substring(i,i+1);
			nu [i]=a;
		}
		for(int i= 0;i<s.length();i++) {
			for(int j = 0;j<s.length()-1;j++) {
				if(nu[j]<nu[j+1]) {
					int n = nu[j];
					nu[j]=nu[j+1];
					nu[j+1]=n;
					String st = str[j];
					str[j]=str[j+1];
					str[j+1]=st;
					
				}
			}
		}
		for(int i = 0;i<s.length();i++) {
			res+=str[i];
		}
		System.out.println(res);
	}
}
