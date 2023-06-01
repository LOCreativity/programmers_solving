package level_0;

import java.util.Arrays;

class Solution51 {
    public int[] solution(int[] array) {
        int[] answer = {array[0], 0};
        for(int i = 1 ; i < array.length;i++) {
        	if(answer[0] < array[i]) {
        		answer[0] = array[i];
        		answer[1] = i;
        	}
        }
        return answer;
    }
}

public class 가장큰수찾기 {
	public static void main(String []args) {
		int []array = {1, 8, 3};
		
		Solution51 ob = new Solution51();
		System.out.println(Arrays.toString(ob.solution(array)));
	}
}
