package Leetcode31;

public class Leetcode1337 {
	public static void main(String[] args) {
		int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
		int[] res = new int[mat.length];
		int[] re1 = new int[mat.length];
		int k = 3;
		for(int i = 0;i<mat.length;i++) {
			int a = 0;
			for(int j = 0;j<mat[i].length;j++) {
				if(mat[i][j] == 1) {
					a++;
				}
			}
			res[i] = a;
			re1[i] = i; 
		}
		for(int i = 0;i<res.length;i++) {
			for(int j = 0;j<res.length-1;j++) {
				if(res[j]>res[j+1]) {
					int a = res[j];
					res[j]=res[j+1];
					res[j+1]=a;
					
					int b = re1[j];
					re1[j]=re1[j+1];
					re1[j+1]=b;
					
				}
			}
		}
		int[] re = new int[k];
		for(int i = 0;i<k;i++) {
			re[i]=re1[i];
		}
		for(int i =0;i<k;i++) {
			System.out.println(re[i]);
		}
	}
}
