package level_0;

import java.util.*;

class Solution12 {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        
        for(int i = 0; i < numlist.length; i++)
        	list.add(numlist[i]);
        
        for(int i = 0; i < numlist.length; i++) {
        	
        	int min = -1;
        	int minIndex = 0;
            int result;
        	Collections.sort(list);	
        	
        	for(int j = 0; j < list.size(); j++) {
        		result = Math.abs(list.get(j) - n);
        		if((min >= result && list.get(minIndex) < list.get(j)) || min == -1) {  
        			min = result;
        			minIndex = j;
        		}
        	}
        	answer[i] = list.get(minIndex);
        	list.remove(minIndex);
        }
        return answer;
    }
}

public class 특이한정렬 {
	public static void main(String []args) {
		int []numlist = {10000, 20, 36, 47, 40, 6,10, 7000};
		int n = 30;
		
		Solution12 ob = new Solution12();
		System.out.println(Arrays.toString(ob.solution(numlist, n)));
	}
}
