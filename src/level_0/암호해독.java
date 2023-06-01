package level_0;

class Solution58 {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = code -1; i < cipher.length(); i += code) {
        	answer += cipher.charAt(i);
        }
        return answer;
    }
}

public class 암호해독 {
	public static void main(String []args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		
		Solution58 ob = new Solution58();
		System.out.println(ob.solution(cipher, code));
	}
}
