package level_1;

import java.util.*;

class Solution17 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] suit = new int[n];
        
        Arrays.fill(suit, 1);       
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0 ; i < lost.length; i++) {
        	suit[lost[i] - 1]--;
        }
        
        for(int i = 0; i < reserve.length; i++) {
        	suit[reserve[i] - 1]++;
        }
        
        for(int i = 1; i < n - 1; i++) {
        	if(suit[i-1] == 2 && suit[i] == 0) {
        		suit[i-1] = 1;
        		suit[i] = 1;
        		continue;
        	}
        	if(suit[i] == 2 && suit[i-1] == 0) {
        		suit[i-1] = 1;
        		suit[i] = 1;
        	}
        	else if(suit[i] == 2 && suit[i+1] == 0) {
        		suit[i] = 1;
        		suit[i+1] = 1;
        	}
        }
        
        if(suit[suit.length-1] == 2 && suit[suit.length-2] == 0) {
        	suit[suit.length-1] = 1;
        	suit[suit.length-2] = 1;
        }
        
        for(int i = 0 ; i < suit.length; i++) {
        	if(suit[i] >= 1) answer++;
        }  
        return answer;
    }
}

public class Ã¼À°º¹ {
	public static void main(String []args) {
		int n = 10;
		int[] lost = {1, 3, 5, 7, 9};
		int[] reserve = {2, 4, 6, 8, 10};
		
		Solution17 ob = new Solution17();
		System.out.println(ob.solution(n, lost, reserve));
	}
}
