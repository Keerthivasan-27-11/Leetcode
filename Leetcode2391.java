package Leetcode31;



public class Leetcode2391 {
	public static void main(String[] args) {
		String[] garbage= {"G","P","GP","PP"};
		int[] travel = {2,4,3};
		int m= 0,g=0,p=0,total=0,n= 0;
		for(int i = 0;i<garbage.length;i++) {
			if(i>=1) {
				System.out.println(i);
				g+=travel[i-1];}
			for(int j = 0;j<garbage[i].length();j++) {
				if(garbage[i].substring(j,j+1).equals("G")) {
					g++;
				}
			}
		}
		System.out.println(g);
	}
}
