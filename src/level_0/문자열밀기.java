package level_0;

import java.util.*;

class Solution15 {
    public int solution(String A, String B) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(A.split("")));
        
        for(int i = 0; i < A.length(); i++) {
        	if(A.equals(B)) return answer;
        	String temp = list.get(A.length() - 1);
        	list.remove(A.length() - 1);
        	list.add(0 ,temp);
        	
        	String str = "";
        	for(String ch : list){
        		str += ch;
        	}
        	A = str;
        	answer++;
        }
        if(answer == list.size()) answer = -1;
        return answer;
    }
}

public class 문자열밀기 {
	public static void main(String []args) {
		String A = "apple";
		String B = "elppa";
		
		Solution15 ob = new Solution15();
		System.out.println(ob.solution(A, B));
	}
}
