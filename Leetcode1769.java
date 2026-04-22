package Leetcode5;

public class Leetcode1769 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String boxes = "001011";
		int[] res = new int[boxes.length()];
		int a = 0;
		for(int i =0;i<boxes.length();i++) {
			if(boxes.substring(i,i+1).equals("1")) {
				int count = 0;
				for(int j = 0;j<boxes.length();j++) {
					if(boxes.substring(j,j+1).equals("1") && i!=j) {
						count+=Math.abs(i-j);
					}
				}
				res[a++]=count;
			}
			else {
				int count = 0;
				for(int j = 0;j<boxes.length();j++) {
					if(boxes.substring(j,j+1).equals("1") && i!=j) {
						count += Math.abs(i-j);
					}
				}
				res[a++]=count;
			}
		}
		for(int i = 0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
