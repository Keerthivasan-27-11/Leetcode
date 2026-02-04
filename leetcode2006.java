import java.lang.*;;
public class leetcode2006 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        int k = 2;
        int count = 0;
        for(int i = 0 ;i<nums.length;i++){
            int  n = nums[i];
            for(int j = 0 ;j<=i;j++){
                if(Math.abs((n-nums[j]))==k){
                    count ++;
            }
        }}
        System.out.println(count);
    }
}
