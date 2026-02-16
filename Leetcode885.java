package Leetcode2;

public class Leetcode885 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows= 1,cols=4,rStart=0,cStart=0;
		int[][] res = new int[rows][cols];
		int count = 1;
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				res[i][j]=count++;
			}
		}
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				System.out.println(res[i][j]);
			}
		}
	}

}
