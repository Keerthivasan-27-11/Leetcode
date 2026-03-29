package Leetcode4;

public class Leetcode3502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = {1,2,3,4,5};
		int[] res = new int[cost.length];
		for(Integer i = 0;i<cost.length;i++) {
			if(i == 0) {
				res [i] =cost[i];
			}
			else{
					if(res[i-1]<=cost[i]) {
						res[i]=res[i-1];
					}else {
						res[i]=cost[i];
					}
				}
			}
		for(int i = 0;i<cost.length;i++) {
			System.out.println(res[i]);
		}
		}
}

