import java.util.ArrayList;
import java.util.List;

public class Leetcode2824 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(-6);nums.add(2);nums.add(5);nums.add(-2);nums.add(-7);nums.add(-1);nums.add(3);
        int[] nums1=new int[nums.size()];
        int target = -2;
        int a = 0;
        for(Integer i : nums){
            nums1[a++]=i;
        }
        int count = 0;
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<i;j++){
                if((nums1[i]+nums1[j])<target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
