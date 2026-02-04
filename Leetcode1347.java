public class Leetcode1347 {
    public static void main(String[] args) {
        String s="leetcode",t = "practice";
        String res ="";
        int total = 0;
        for(int i = 0;i<t.length();i++){
            String st = t.substring(i,i+1);
           for(int j = 0;j<s.length();j++){
                if(st.equals(s.substring(j,j+1))){
                    if(res.contains(st)){
                        continue;
                }
                else{
                    res+=st;
                    total++;
                }
           }
           else{
            res+=st;
           }
        }}
        System.out.println(total+" "+res);
    }
}
