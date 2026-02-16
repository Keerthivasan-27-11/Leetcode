package Leetcode2;

public class Leetcode3686 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] task = {{1,6},{2,3}};
		int min=0;
		for(int i= 0;i<task.length;i++) {
			int a = 0;
			for(int j=0;j<task[i].length;j++) {
				a+=task[i][j];
			}
			if(i==0) {
				min=a;
			}
			else if(min>a) {
				min=a;
			}
		}
		System.out.println(min);
	}	

}
