public class Leetcode16841 {
    public static void main(String[] args) {
        String[] words={"cc","acd","b","ba","bac","bad","ac","d"};
        String allowed = "cad";
        int a = 0,count = 0;
        for(int i = 0 ;i<words.length;i++){
            String str = words[i];
            for(int j = 0;j<str.length();j++){
                if(allowed.contains(str.substring(j,j+1))){
                    a+=1;
                }
                else{
                    a=-1;
                    break;
                }
            }
            if(a>=1){
                count++;
            }
        }
        System.out.println(count);
    }
}
