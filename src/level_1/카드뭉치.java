package level_1;

class Solution13 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Num = 0;
        int cards2Num = 0;
        
        for(int i = 0; i < goal.length; i++) {
        	if(cards1Num < cards1.length && cards1[cards1Num].equals(goal[i])) cards1Num++;
        	else if(cards2Num < cards2.length && cards2[cards2Num].equals(goal[i])) cards2Num++;
        	else return "No";
        }
        return "Yes";
    }
}

public class ī�并ġ {
	public static void main(String []args) {
		String[] cards1 = {"i", "water", "drink"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		
		Solution13 ob = new Solution13();
		System.out.println(ob.solution(cards1, cards2, goal));
	}
}
