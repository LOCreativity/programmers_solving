package level_0;

import java.util.*;

class Solution8 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
       
        for(int i = 0; i < quiz.length; i++) {
        	StringTokenizer quizToken = new StringTokenizer(quiz[i], " ");
        	String []Tokens = new String[quizToken.countTokens()];
        	int idx = 0;
        	int sum = 0;
        	
        	while(quizToken.hasMoreTokens()) {
        		Tokens[idx] = quizToken.nextToken();
        		idx++;
        	}
        	
        	if(Tokens[1].equals("+")) sum = Integer.parseInt(Tokens[0]) + Integer.parseInt(Tokens[2]);
        	else sum = Integer.parseInt(Tokens[0]) - Integer.parseInt(Tokens[2]);
        	
        	if(sum == Integer.parseInt(Tokens[4]))answer[i] = "O";
        	else answer[i] = "X";
        }   
        return answer;
    }
}

public class OXÄûÁî {
	public static void main(String []args) {
		String []quiz = {"3 - 4 = -3", "5 + 6 = 11"};
		
		Solution8 ob = new Solution8();
		System.out.println(Arrays.toString(ob.solution(quiz)));
	}
}
