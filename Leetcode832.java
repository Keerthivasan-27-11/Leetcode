package Leetcode31;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Leetcode832 {
	public static void main(String[] args) {
		int[][] image= {{1,1,0},{1,0,1},{0,0,0}};
		int[][] res = new int[image.length][image.length];
		for(int i = 0;i<image.length;i++) {
			for(int j= 0;j<image.length;j++) {
				res[i][Math.abs(j-(image.length-1))] = image[i][j];
			}
		}
		for(int i = 0;i<image.length;i++) {
			for(int j= 0;j<image.length;j++) {
				if(res[i][j]==1) {
					res[i][j]=0;
				}else {
					res[i][j]=1;
				}
			}
		}
		for(int i = 0;i<image.length;i++) {
			for(int j= 0;j<image.length;j++) {
			 System.out.print(res[i][j]);
			}
			System.out.println();
		}
		
	}
}
