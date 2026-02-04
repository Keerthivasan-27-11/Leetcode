public class leetcode4 {
    public static void main(String[] args) {
        int[] num1={2,2,4,4};
        int[] num2={2,2,4,4};
        int[] res = new int[num1.length+num2.length];
        int count = 0;
        for(int i= 0;i<num1.length;i++){
            res[count++]=num1[i];
        }
        for(int i = 0 ;i<num2.length;i++){
            res[count++]=num2[i];
        }
        for(int i =0;i<res.length-1;i++){
            if(res[i]>res[i+1]){
                int a = res[i];
                res[i]=res[i+1];
                res[i+1]=a;
            }
        }
        int len = res.length,k=0;
        double d = 0;
        for(int i =0;i<res.length;i++){
            System.out.println(res[i]+" "+i);
        } int a=0;
        if(len%2==0){
            k+= res.length/2;
            a+= (res[k]+res[k-1]);
            d=a/2f;
        }
        
        else{
            k = len/2;
            d=res[k];
        }
        System.out.println(k+" "+d+" "+len);
    }
}
