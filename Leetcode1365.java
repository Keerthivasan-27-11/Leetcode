public class Leetcode1365 {
    public static void main(String[] args) {
        int[] nums={7,7,7,7};
        int[] res = new int[nums.length];
        int a =0;
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j =0 ;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count ++;
                }
            }
            res[a++]=count;
        }
        for(int i = 0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }
}
