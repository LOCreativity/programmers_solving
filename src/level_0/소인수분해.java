package level_0;

import java.util.*;

class Solution29 {
    public int[] solution(int n) {
        String result = "";
        
        for(int i = 2; i <= n; i++) {
        	if(n % i == 0) {
        		n /= i;
        		if(!result.contains(Integer.toString(i))) result += Integer.toString(i) + " ";  
        		i--;
        	}
        }
        StringTokenizer st = new StringTokenizer(result);
        int[] answer = new int[st.countTokens()];
        for(int i = 0; st.hasMoreTokens(); i++) {
        	answer[i] = Integer.parseInt(st.nextToken());
        }
        
        return answer;
    }
}

public class 소인수분해 {
	public static void main(String []args) {
		int n = 420;
		
		Solution29 ob = new Solution29();
		System.out.println(Arrays.toString(ob.solution(n)));
	}
}
