public class Leetcode3794 {
    public static void main(String[] args) {
        String s = "hey";int k = 1;
        String res="";
        for(int i = k-1;i>=0;i--){
            res += s.substring(i,i+1);
        }
        for(int i = k;i<s.length();i++){
            res+=s.substring(i,i+1);
        }
        System.out.println(res);
    }
}
