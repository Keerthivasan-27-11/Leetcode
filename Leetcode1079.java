public class Leetcode1079 {
    public static void main(String[] args) {
        String tiles = "AAB";
        String res = "";
        
        String[] st = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int total= 0;
        res+=tiles.substring(0,1);
        for(int i = 1;i<tiles.length();i++){
            int a = 0;
            for(int j = 0;j<res.length();j++){
                if((res.substring(j,j+1)).equals(tiles.substring(i,i+1))){
                    System.out.println(1);
                }else{
                    a++;
                }
            }
            if(a>=1){
                total++;
            }
        }
        System.out.println(total);
    }
}
