package level_0;

import java.util.Arrays;

class Solution6 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int i = 2;
        
        numer1 = numer1 * denom2;
        numer2 = numer2 * denom1;
        
        denom1 = denom1 * denom2;
        denom2 = denom2 * denom1;
        
        answer[0] = numer1 + numer2;	//분자
        answer[1] = denom1;				//분모
        
        while(true) {
        	if(answer[0] % i != 0 || answer[1] % i != 0) {
        		if(i >= answer[1])break;
        		i++;
        		continue;
        	}
        	answer[0] /= i;
        	answer[1] /= i;
        }
        return answer;
    }
}

public class 분수의합 {
	public static void main(String []args) {
		int numer1 = 9;
		int denom1 = 3;
		int numer2 = 1;
		int denom2 = 3;
		
		Solution6 ob = new Solution6();
		System.out.println(Arrays.toString(ob.solution(numer1, denom1, numer2, denom2)));
	}
}
