package level_0;

import java.util.*;

class Solution13 {
    public int[] solution(int[][] score) {
    	int[] answer = new int[score.length];
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	int prior = 0;
    	int rank = 0;
    	int stack = 0;
    	
    	for(int i = 0; i < score.length; i++) 
    		list.add((score[i][0] + score[i][1]));
    	
        for(int i = 0; i< score.length; i++) {
        	int max = 0;
        	for(int j = 0; j < list.size(); j++) {
        		if(max <= list.get(j) && list.get(j) != -1) max = list.get(j);
        	}
        	if(list.get(list.indexOf(max)) == prior) { 
        		stack++;
        		answer[list.indexOf(max)] = rank;
        	}
        	else {
        		answer[list.indexOf(max)] = ++rank + stack;
        		rank = answer[list.indexOf(max)];
        		stack = 0;
        	}
        	prior = list.get(list.indexOf(max));
        	list.set(list.indexOf(max), -1);
        }
        return answer;
    }
}

public class 등수매기기 {
	public static void main(String []args) {
		int [][]score = {{1, 3}, {3, 3}, {2, 3}, {3, 2}, {1, 2}, {0, 0}};
		
		Solution13 ob = new Solution13();
		System.out.println(Arrays.toString(ob.solution(score)));
	}
}
