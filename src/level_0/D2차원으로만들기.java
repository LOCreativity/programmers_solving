package level_0;

import java.util.*;

class Solution37 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        for(int i = 0 ; i < num_list.length / n; i++) {
        	for(int j = 0; j < n; j++) {
        		answer[i][j] = num_list[(i * n) + j];
        	}
        }
        
        return answer;
    }
}

public class D2차원으로만들기 {
	public static void main(String []args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7 ,8};
		int n = 2;
		
		Solution37 ob = new Solution37();
		System.out.println(Arrays.deepToString(ob.solution(num_list, n)));
	}
}
