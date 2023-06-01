package level_0;

class Solution49 {
    public String solution(int age) {
        String answer = "";
       
        for(char x : Integer.toString(age).toCharArray()) {
        	answer += (char)(Integer.parseInt(String.valueOf(x)) + 97); 
        }
        return answer;
    }
}

public class 외계행성의나이 {
	public static void main(String []args) {
		int age = 23;
		
		Solution49 ob = new Solution49();
		System.out.println(ob.solution(age));
	}
}
