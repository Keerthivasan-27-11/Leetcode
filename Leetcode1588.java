package Leetcode31;

public class Leetcode1588 {
	public static void main(String[] args) {
		int[] arr= {1,4,2,5,3};
//		int total = 0,a = 0;
//		for(int i = 0;i<arr.length;i++) {
//			total +=arr[i];
//		}
//		int b= 2;int count = 0;
//		do {
//		int last = 0,ma = 0;
//		do{
//			for(int i=a;i<=b;i++) {
//				System.out.print(arr[i]+" ");
//			}
//			System.out.println();
//			a++;
//			b++;
//			if(b == arr.length) {
//				break;
//			}
//			System.out.println(b);
//		}while(b!=arr.length+1);
//		b+=2;
//		}while(count!=1);
		int j = 3,a=0,b = 0;
		do {
			a=0;j=3;
			System.out.println(j);
		do {
			for(int i = a;i<j;i++) {
			System.out.print(arr[i]);
			b++;		
			}
			System.out.println();
			j++;
			a++;
		}while(j!=arr.length+1);
		j+=2;
		a=0;
		}while(b!=arr.length+1);
		}
	
}
