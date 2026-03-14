package Leetcode31;

public class Leetcode1732{
	public static void main(String[] args) {
		int[] grid = {-4,-3,-2,-1,4,3,2};
		int max = 0;
		int[] gr = new int[grid.length+1];
		gr[0]=0;int count = 1;
		for(int i = 0;i<grid.length;i++) {
			gr[count++]=grid[i]+gr[i];
			max=Math.max(max,grid[i]+gr[i]);
		}
		System.out.println(max);
	}
}
