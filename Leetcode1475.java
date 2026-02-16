package Leetcode2;

public class Leetcode1475 {
	public static void main(String[] args) {
		int[] prices = {10,1,1,6};
		int[] res = new int[prices.length];
		for(int i = 0;i<prices.length-1;i++) {
			int total = 0;
			for(int j = i+1;j<prices.length;j++) {
				if(prices[i]>=prices[j]) {
					total =prices[i]-prices[j];
					break;
				}else {
					total = prices[i];
				}
			}
			res[i]  = total;
		}
		res[res.length-1]=prices[prices.length-1];
		for(int i=0;i<res.length;i++) {
		System.out.println(res[i]);} 
	}
}
