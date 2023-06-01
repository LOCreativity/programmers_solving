package level_1;

class Solution8 {
    public int solution(String s) {
        int answer = 0;
        int compare = 0; 
        int start = s.charAt(0);
        
        for(int i = 0 ; i < s.length(); i++) {
        	if(start == s.charAt(i)) compare++;
        	else compare--;
        	if(compare == 0) {
        		answer++;
        		if(i + 1 < s.length() - 1) start = s.charAt(i + 1);
        	}
        }
        
        if(compare != 0) answer++;
        
        return answer;
    }
}

public class 문자열나누기 {
	public static void main(String []args) {
		String s = "abracadabra";
		
		Solution8 ob = new Solution8();
		System.out.println(ob.solution(s));
	}
}
