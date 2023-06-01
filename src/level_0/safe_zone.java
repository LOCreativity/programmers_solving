package level_0;

import java.util.*;

class Solution4 {
    public int solution(int[][] board) {
        int answer = 0;
        int [][]copyboard = new int[board.length][board.length];
        int explosionRange = 1;	//���� ����
        
        //�迭 ����
        int tempIndex = 0;
        for(int []row : board) {
        	copyboard[tempIndex] = Arrays.copyOf(row, board.length);
        	tempIndex++;
        }
        
        //��ź�� ��ġ�� �� �˻�
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) continue;
                //1�� ���(��ź)
                for(int row = i-explosionRange; row <= i + explosionRange; row++) {
                	if(row < 0 || row >= board.length)continue;
                	for(int col = j -explosionRange; col <= j+explosionRange; col++) {
                		if(col < 0 || col >= board.length)continue;
                		copyboard[row][col] = 1;
                	}
                }
            }
        }
        //�������� ����
        for(int i = 0; i < board.length;i++) {
        	for(int j = 0; j < board.length;j++) {
        		if(copyboard[i][j] == 0)
        			answer++;
        	}
        }
        return answer;
    }
}

public class safe_zone {
	public static void main(String []args) {
		int [][] board = {{0, 0, 0, 0, 0},
			              {0, 0, 0, 0, 0},
			              {0, 0, 1, 0, 0},
			              {0, 0, 0, 0, 0},
			              {0, 0, 0, 0, 0}};
		Solution4 ob = new Solution4();
		System.out.println(ob.solution(board));
	}
}
