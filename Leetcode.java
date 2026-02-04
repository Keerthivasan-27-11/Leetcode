import java.util.ArrayList;
import java.util.List;

public class Leetcode {
    public static void main(String[] args) {
        String s1 = "this apple is sweet",s2="this apple is sour";
        List<String> str1 = new ArrayList<>();
        List<String> str2 = new ArrayList<>();
        for(int i = 0;i<s1.length();i++){
            String s ="";
            if(s1.substring(i,i+1).equals(" ")){
                str1.add(s);
                s="";
            }
            else{
                System.out.println(s);
                s+=s1.substring(i,i+1);
            }
        }
        for(String ss : str1){
            System.out.println(ss);
        }
    }
}