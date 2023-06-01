package level_1;

import java.util.Arrays;

class Solution4 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0 ; i < targets.length; i++) {
        	for(int j = 0 ; j < targets[i].length(); j++) {
        		int count = 0;
        		int temp = -1;
            	int min = -1;
        		for(int k = 0 ; k < keymap.length; k++) {
        			if(keymap[k].contains(String.valueOf(targets[i].charAt(j))))
        				temp = keymap[k].indexOf(String.valueOf(targets[i].charAt(j))) + 1;
        			else count++;
        			if(min > temp || min == -1) min = temp;
        		}
        		
        		if(count == keymap.length) {
        			answer[i] = -1;
        			break;
        		}
        		else answer[i] += min;
        	}
        }
        return answer;
    }
}

public class 대충만든자판 {
	public static void main(String []args) {
		String[] keymap = {"ABACD", "BCEFD"};
		String[] targets = {"GGGG","AABB"};
		
		Solution4 ob = new Solution4();
		System.out.println(Arrays.toString(ob.solution(keymap, targets)));
	}
}
