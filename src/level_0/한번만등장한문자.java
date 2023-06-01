package level_0;

import java.util.Arrays;

class Solution33 {
    public String solution(String s) {
    	String answer = "";
        for(int i = 0; i < s.length(); i++) {
        	if(countChar(s, s.charAt(i)) == 1) answer += s.charAt(i);
        }
        char[] ch = answer.toCharArray();
        Arrays.sort(ch);
        return String.valueOf(ch);
    }
    public int countChar(String s, char ch) {
    	return (int)s.chars().filter(c -> c == ch).count();
    }
}

public class 한번만등장한문자 {
	public static void main(String []args) {
		String s = "abcabcadc";
		
		Solution33 ob = new Solution33();
		System.out.println(ob.solution(s));
	}
}
