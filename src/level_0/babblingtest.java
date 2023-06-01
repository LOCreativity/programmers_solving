package level_0;


class Solution {
    String[] speakingList = {"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;

        for (String str : babbling) {
            String tempStr = str;
            for (String speak : speakingList) {
                tempStr = tempStr.replace(speak, ".");
            }
            tempStr = tempStr.replace(".", "");
            if (tempStr.length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}

public class babblingtest {
	public static void main(String []args) {
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa", "woowo"};
		
		Solution ob = new Solution();
		System.out.println(ob.solution(babbling));
	}
}
