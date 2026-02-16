package Leetcode2;

public class Leetcode1833 {
	public static void main(String[] args) {
		int[] costs= {7,3,3,6};
		int coins = 56;
		for(int i= 0;i<costs.length;i++) {
			for(int j =0;j<costs.length-1;j++) {
				if(costs[j]>costs[j+1])
				{
					int a = costs[j];
					costs[j]=costs[j+1];
					costs[j+1]= a;
				}
			}
		}
		int count = 0;
		for(int i= 0;i<costs.length;i++) {
			int a = 0,total = 0;
			for(int j= 0;j<costs.length ;j++) {
				if(total == coins) {
					
				}
				else if(coins<costs[j]) {
					
				}
				else {
				total+=costs[j];
				if(total > coins)
					{
					}else {
						a++;
					}
					}
			}
			if(a==0) {
				
			}
			else if(count<a) {
				count = a;
			}
		}
		System.out.println(count);
	}
}
