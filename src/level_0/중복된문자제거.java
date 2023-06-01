package level_0;

class Solution40 {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0 ; i < my_string.length(); i++) {
        	if(!answer.contains(String.valueOf(my_string.charAt(i)))) answer += String.valueOf(my_string.charAt(i));
        }
        return answer;
    }
}

public class 중복된문자제거 {
	public static void main(String []args) {
		String my_string = "We are thr world";
		
		Solution40 ob = new Solution40();
		System.out.println(ob.solution(my_string));
	}
}
