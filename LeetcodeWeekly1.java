package Leetcode4;

public class LeetcodeWeekly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n =1002;
//		String str = Long.toString(n);
//		long max =(long) Math.pow(10, str.length());
//		long count  = 0;
//		if(str.length()<3) {
//			count+=0;
//		}
//		else if(str.length()>=3 && str.length()<6) {
//			count+=(str.length()*0 + str.length()*1 + str.length()*2);
//		}
//		
		long count = 0;
		for(long i = 1000000000;i<=999999999;i++) {
			count+=3;
		}
		System.out.println(count);
		
		
		
//		int i = 1;
//		while(i<=n){
//			StringBuffer sb = new StringBuffer(Long.toString(i));
//			if(sb.length()<3) {
//				count +=0;
//			}
//			else if(sb.length()>3 && sb.length()<6) {
//				count+=1;99000
//			}
//			else if(sb.length()>6 && sb.length()<=9) {
//				count +=1;18000000
//			}
//			else if(sb.length()>9 && sb.length()<=12) {
//				count +=4;
//			}
//			else {
//				count+=5;
//			}
//			i++;
//		}
		System.out.println(count);
	}

}
