public class Leetcode1684 {
    public static void main(String[] args) {
        String[] words ={"ipeihtzjwq","rwrcci","n","ktrjyhh","zipdehh","cqe","ptwwe","c","cckq","qwdqiddh","kfriwenu","y","evbvg"};
        String allowed = "pwqcdyrjhoizekt";
        int total = 0;
        for(int i = 0;i<words.length;i++){
            int a = 0;
            for(int j = 0 ;j<words[i].length();j++){
                String st = words[i].substring(j,j+1);
                if((allowed.contains(st))){
                    a++;
                }
                else{
                    a=-1;
                    break;
                }
            }
            if(a>=1){
                total ++;
            }
        }
        System.out.println(total);
    }
}
