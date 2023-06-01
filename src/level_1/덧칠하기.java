package level_1;

import java.util.HashMap;

class Solution16 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        HashMap<Integer, Boolean> paint = new HashMap<Integer, Boolean>();
        
        for(int i = 0; i < n; i++) {
        	paint.put(i+1, true);
        }
        
        for(int i = 0; i < section.length; i++) {
        	paint.put(section[i], false);
        }
        
        for(int i = 1 ; i <= n ; i++) {
    		if(paint.get(i) == false) {
    			i+= m - 1;
    			answer++;
    		}
        }   
        return answer;
    }
}

public class µ¡Ä¥ÇÏ±â {
	public static void main(String []args) {
		int n = 8;
		int m = 4;
		int[] section = {2, 3, 6};
		
		Solution16 ob = new Solution16();
		System.out.println(ob.solution(n, m, section));
	}
}
