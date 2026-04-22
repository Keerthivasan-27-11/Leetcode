package Leetcode5;

public class connect {
	public static void main(String[] args) {
		int[] res = {-3,4,-5};
		for(int i = 0;i<res.length;i++) {
			for(int j = 0;j<res.length-1;j++) {
				if(res[j]>res[j+1]) {
					int a = res[j];
					res[j]=res[j+1];
					res[j+1]=a;
				}
			}
		}
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}
