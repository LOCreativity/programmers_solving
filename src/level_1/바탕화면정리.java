package level_1;

import java.util.Arrays;

class Solution3 {
    public int[] solution(String[] wallpaper) {
    	
    	int[] answer = {50, 50, 0, 0};
    	
    	for(int i = 0 ; i < wallpaper.length; i++) {
    		for(int j = 0 ; j < wallpaper[0].length(); j++) {
    			if(wallpaper[i].charAt(j) == '#') {
    				answer[0] = Math.min(answer[0], i);
    				answer[1] = Math.min(answer[1], j);
    				answer[2] = Math.max(answer[2], i + 1);
    				answer[3] = Math.max(answer[3], j + 1);
    			}
    		}
    	}
    	
        return answer;
    }
}

public class 바탕화면정리 {
	public static void main(String []args) {
		String[] wallpaper = {};
		
		Solution3 ob = new Solution3();
		System.out.println(Arrays.toString(ob.solution(wallpaper)));
	}
}
