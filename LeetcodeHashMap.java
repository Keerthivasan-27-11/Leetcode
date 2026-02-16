package Leetcode2;
import java.util.*;
public class LeetcodeHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> li = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i<3;i++) {
			System.out.print("Enter your id: ");
			int key = scan.nextInt();
			System.out.print("Enter your name : ");
			String a = scan.next();
			li.put(key, a);
		}
	}
}
