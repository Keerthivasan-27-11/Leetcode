import java.lang.*;

public class Leetcode3146 {
    public static void main(String[] args) {
        String s = "abc",t="bac";
        int total = 0;
        for(int i = 0;i<s.length();i++){
            String st = s.substring(i,i+1);
            for(int j = 0 ;j<t.length();j++){
                if(st.equals(t.subSequence(j,j+1))){
                    total+=(int)Math.abs((i-j));
                }
            }
        }
        System.out.println(total);
    }
}
