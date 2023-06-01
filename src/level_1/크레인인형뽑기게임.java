package level_1;

import java.util.Stack;

class Solution10 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> save = new Stack<>();
        
        for(int i = 0; i < moves.length; i++) {
        	for(int j = 0; j < board[0].length; j++) {
        		if(board[j][moves[i] - 1] != 0) {
        			save.push(board[j][moves[i] - 1]);
        			board[j][moves[i] - 1] = 0;
        			break;
        		}
        	}
        	if(save.size() >= 2) {
        		if(save.peek() == save.elementAt(save.size() - 2)) {
        			save.pop();
        			save.pop();
        			answer+=2;
        		}
        		
        	}
        }  
        return answer;
    }
}

public class 크레인인형뽑기게임 {
	public static void main(String []args) {
		int[][] board = {{0, 0, 0, 0, 0},
						 {0, 0, 1, 0, 3},
						 {0, 2, 5, 0, 1},
						 {4, 2, 4, 4, 2},
						 {3, 5, 1, 3, 1}};
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
		
		Solution10 ob = new Solution10();
		System.out.println(ob.solution(board, moves));
	}
}
