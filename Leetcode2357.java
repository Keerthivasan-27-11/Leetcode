package Leetcode2;

public class Leetcode2357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,5,0,3,5};
        int count=0,n=1;
        for(int i=0;i<nums.length;i++){
            int a=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==0){
                    a++;
                }
            }
            if(a==nums.length){
                break;
            }else{
                count++;
            for(int k=0;k<nums.length;k++){
                if(nums[k]==0){
                    
                }
                
                else{
                    nums[k]=nums[k]-n;
                }
            }
            }
        }
        System.out.println(count);
	}

}
