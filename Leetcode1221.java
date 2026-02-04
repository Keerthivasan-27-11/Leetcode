public class Leetcode1221 {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        int res = 0;
        int r = 0, l = 0;
        for(int i = 0;i<s.length();i++){
            String st = s.substring(i,i+1);
            if(st.equals("R")){
                r++;
            }
            if(st.equals("L")){
                l++;
            }
            if(l==r){
                res ++;
                r = 0;l=0;
            }
        }
        System.out.println(res);
    }
}
