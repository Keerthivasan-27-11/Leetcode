public class Leetcode2125 {
    public static void main(String[] args) {
        
        int total = 0;

        // 011001
        // 000000
        // 010100
        // 001000
        
        String[] bank = {"011001","000000","010100","001000"};
        for(int i = 0;i<bank.length;i++){
            String st = bank[i].substring(i,i+1);
            if(st.contains("1")){
        for(int j = i;j<bank.length;j++){
                String st1 = bank[i];
                if(st.contains("1")){
                for(int k = 0 ;k<st.length();k++){
                    int i1 = Integer.parseInt(st1.substring(k,k+1));
                }
            }
            else{
                continue;
            }
        }
        }
        else{
            continue;
        }
    }
    }
}
