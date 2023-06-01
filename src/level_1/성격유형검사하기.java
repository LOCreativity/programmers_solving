package level_1;

import java.util.HashMap;

class Solution7 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] personality = {"R", "T", "C", "F", "J", "M", "A", "N"};
        HashMap<String, Integer> category = new HashMap<String, Integer>();
        
        for(int i = 0; i < personality.length; i++) {
        	category.put(personality[i], 0);
        }
        
        for(int i = 0 ; i < survey.length; i++) {
        	if(choices[i] > 4) category.put(String.valueOf(survey[i].charAt(1)), category.get(String.valueOf(survey[i].charAt(1))) + Math.abs(choices[i] - 4));
        	else category.put(String.valueOf(survey[i].charAt(0)), category.get(String.valueOf(survey[i].charAt(0))) + Math.abs(choices[i] - 4));
        }
        
        for(int i = 0; i < 8; i+=2) {
        	if(category.get(personality[i]) > category.get(personality[i + 1])) answer += personality[i];
        	else if(category.get(personality[i]) < category.get(personality[i + 1])) answer += personality[i + 1];
        	else {
        		if(personality[i].compareTo(personality[i+1]) == 1) answer += personality[i + 1];
        		else answer += personality[i];
        	}
        }
        return answer;
    }
}

public class 성격유형검사하기 {
	public static void main(String []args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		
		Solution7 ob = new Solution7();
		System.out.println(ob.solution(survey, choices));
	}
}
