package Leetcode6;

public class LeetcodeByWeekly182_1 {
	public static void main(String[] args) {
		String[] events = {"1","4","W","6","WD"};
		int counter = 0, score = 0,count = 0;
		for(int i = 0;i<events.length;i++) {
			if(events[i].equals("1") || events[i].equals("0") || events[i].equals("2") || events[i].equals("3") || events[i].equals("4") || events[i].equals("6")) {
				score += Integer.parseInt(events[i]);
			}
			else if(events[i].equals("W")) {
				counter += 1;
			}
			else if(events[i].equals("WD")) {
				score += 1;
			}
			else if(events[i].equals("NB")) {
				score += 1;
			}
			if(counter == 10) {
				break;
			}
		}
		int[] res = new int[2];
		res[0]=score;
		res[1] = counter;
		System.out.println(score+" "+counter);
	}
}
