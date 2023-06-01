package level_0;

import java.util.*;

class Solution5 {
    public int[] solution(int num, int total) {
        int[] answer = {};
        int start_num = 0;
        
        while(true) {
        	int sum = 0;
        	int tempNum = start_num;
        	for(int i = 0; i < num; i++) {
        		sum += tempNum;
        		tempNum++;
        	}
        	if(sum == total)break;
        	if(start_num == total) { 
        		start_num = -1;
        	}
        	else if(start_num < 0)
        		start_num--;
        	else if(start_num >= 0)
        		start_num++;
        	
        }
        
        answer = new int[num];
        
        for(int i = 0; i < num; i++){
        	answer[i] = start_num;
        	start_num++;
        }
        
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int num, int total) {
            int[] answer = new int[num];
            int check = num*(num+1) / 2;
            int start = (total - check) / num + 1;
            for (int i = 0; i < answer.length; i++) {
                    answer[i] = start + i ;
            }
            return answer;
    }
}
*/
public class 연속된수의합 {
	public static void main(String []args) {
		int num = 5;
		int total = 5;
		
		Solution5 ob = new Solution5();
		System.out.println(Arrays.toString(ob.solution(num, total)));
	}
}
