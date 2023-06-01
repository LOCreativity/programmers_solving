package level_1;

class Solution5 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char []ch = s.toCharArray();
        //97 ~ 122
        for(int i = 0 ; i < s.length(); i++) {
        	for(int j = 0 ; j < index; j++) {
        		ch[i]++;
        		if(ch[i] > 122) ch[i] = 'a';
            	if(skip.contains(String.valueOf(ch[i]))) j--;
        	}
        	answer += ch[i];
        }
        
        return answer;
    }
}

public class 둘만의암호 {
	public static void main(String[] args) {
		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
		
		Solution5 ob = new Solution5();
		System.out.println(ob.solution(s, skip, index));
	}
}
