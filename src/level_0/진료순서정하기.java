package level_0;

import java.util.*;

class Solution34 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0 ; i< emergency.length; i++) {
        	list.add(emergency[i]);
        }
        
        for(int i = 0; i < emergency.length; i++) {
        	int max = list.get(0);
        	for(int j = 0; j < list.size(); j++) {
        		if(max < list.get(j)) max = list.get(j);
        	}
        	answer[list.indexOf(max)] = i + 1;
        	list.set(list.indexOf(max), -1);
        }    
        return answer;
    }
}

public class 진료순서정하기 {
	public static void main(String []args) {
		int[] emergency = {3, 76, 24};
		
		Solution34 ob = new Solution34();
		System.out.println(Arrays.toString(ob.solution(emergency)));
	}
}
