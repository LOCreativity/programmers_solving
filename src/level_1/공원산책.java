package level_1;

import java.util.Arrays;

class Solution18 {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for(int i = 0 ; i < park.length; i++) {
        	if(park[i].contains("S")) {
        		answer[0] = i;
        		answer[1] = park[i].indexOf("S");
        		break;
        	}
        }       
        for(int i = 0; i < routes.length; i++) {
        	String[] moves = routes[i].split(" ");
        	switch(moves[0]){
        		case "E":
        			if(answer[1] + Integer.parseInt(moves[1]) >= park[0].length()) continue;
        			if(park[i].indexOf("X") <= answer[1] + Integer.parseInt(moves[1]) && park[i].indexOf("X") != -1)continue;
        			answer[1] += Integer.parseInt(moves[1]);
        			break;
        		case "S":
        			int n = answer[0] + Integer.parseInt(moves[1]);
        			if(n >= park.length) continue;
        			if(searchX(park, n, i, moves[0]))continue;
        			answer[0] = n;
        			break;
        		case "W":
        			if(answer[1] - Integer.parseInt(moves[1]) < 0) continue;
        			if(park[i].indexOf("X") >= answer[1] + Integer.parseInt(moves[1]) && park[i].indexOf("X") != -1)continue;
        			answer[1] -= Integer.parseInt(moves[1]);
        			break;
        		case "N":
        			int a = answer[0] - Integer.parseInt(moves[1]);
        			if(a < 0) continue;
        			if(searchX(park, a, i, moves[0]))continue;
        			answer[0] = a;
        			break;
        	}
        }
        
        return answer;
    }
    public boolean searchX(String []park, int n, int i, String direction) {
    	if(direction.equals("S")) {
    		for(int a = i ; a <= n; a++) {
    			if(park[a].charAt(i) == 'X') return true;
    		}
    	}else {
    		for(int a = i ; a >= n; a--) {
    			if(park[a].charAt(i) == 'X') return true;
    		}
    	}
    	return false;
    }
}

public class 공원산책 {
	public static void main(String []args) {
		String[] park = {"SOO","OOO","OOO"};
		String[] routes = {"E 2","S 2","W 1"};
		
		Solution18 ob = new Solution18();
		System.out.println(Arrays.toString(ob.solution(park, routes)));
	}
}
