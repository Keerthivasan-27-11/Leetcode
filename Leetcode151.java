package Leetcode6;

public class Leetcode151 {
	public static void main(String[] args) {
		String s = "      hello     world ";
		String res = "";
		StringBuffer sb = new StringBuffer(s);
		int b1 = 0;
		for(int i = 0;i<sb.length();i++) {
			if(sb.substring(i,i+1).equals(" ")) {
				b1++;
			}
			else {
				break;
			}
		}
		sb.delete(0, b1);
		sb.reverse();
		int a= 0;
		for(int i = 0;i<sb.length();i++) {
			if(sb.substring(i,i+1).equals(" ")) {
				a++;
			}
			else {
				break;
			}
		}
		sb.delete(0, a);
		String st = sb.toString();
		String str = "";
		int n = sb.length();
		st+=" ";
		int m = 0;
		for(int i = 0;i<st.length();i++) {
			if((st.substring(i,i+1)).equals(" ") && m == 0) {
				StringBuffer b = new StringBuffer(str);
				b.reverse();
				if(i<n) {
					res += b.toString()+" ";
				}
				else {
					res+=b.toString();
				}
				str = "";
				m = 1;
			}
			else if(sb.substring(i,i+1).equals(" ") && m == 1) {
				continue;
			}
			else {
				m =0;
			 str += st.substring(i,i+1);
			}
		}
		System.out.println(res);
	}
}
