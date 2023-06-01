package level_0;

class Solution41 {
    public String solution(String letter) {
    	String answer = "";
    	String []s = letter.split(" ");
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--."
        				   ,"--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r","s","t"
        					,"u", "v", "w", "x", "y", "z"};
        
        for(int i = 0; i < s.length; i++) {
        	for(int j = 0; j < morse.length; j++) {
        		if(s[i].equals(morse[j])) {
        			answer += alpha[j];
        			break;
        		}
        	}
        }       
        return answer;
    }
}

public class 모스부호_1 {
	public static void main(String []args) {
		String letter = ".... . .-.. .-.. ---";
		Solution41 ob = new Solution41();
		System.out.println(ob.solution(letter));
	}
}
