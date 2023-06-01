package level_0;

import java.util.Arrays;

class Solution20 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int[] max = {board[0]/2, board[1]/2};
        
        for(int i = 0; i < keyinput.length; i++) {
        	if(keyinput[i].equals("left")) answer[0] = (answer[0] == -max[0]) ? answer[0] : --answer[0];
        	else if(keyinput[i].equals("right")) answer[0] = (answer[0] == max[0]) ? answer[0] : ++answer[0]; 
        	else if(keyinput[i].equals("up")) answer[1] = (answer[1] == max[1]) ? answer[1] : ++answer[1]; 
        	else if(keyinput[i].equals("down")) answer[1] = (answer[1] == -max[1]) ? answer[1] : --answer[1]; 
        }
        
        return answer;
    }
}

public class 캐릭터의좌표 {
	public static void main(String []args) {
		String [] keyinput = {"left", "right", "up", "right", "right"};
		int []board = {11, 11};
		
		Solution20 ob = new Solution20();
		System.out.println(Arrays.toString(ob.solution(keyinput, board)));
	}
}
