
import java.lang.*;

public class Leetcode3760{
    public static void main(String[] args) {
		int k = 3,a =0;
		String[] in = new String[(int) Math.pow(2, k)];
		for(int i = 0 ;i<(int)Math.pow(2,k );i++){
			String st = Integer.toBinaryString(i);

			for(int j = 0 ;j < st.length();j++){
				String s1 = Character.toString(st.charAt(i)),s2=Character.toString(st.charAt(i+1));
				if((s1.equals("0"))&&(s2.equals("0"))){
					break;
				}
				else{
					in[a++]=st;
				}
			}
		}
		for(int i = 0 ;i<(int)Math.pow(2,k);i++){
			System.out.println(in[i]);
		}
    }
}