package level_0;

class Solution59 {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        for(int i = 0 ; i < my_string.length(); i++) {
        	answer[i] = Character.isUpperCase(my_string.charAt(i)) ? answer[i].toLowerCase() : answer[i].toUpperCase();
        }
        return String.join("", answer);
    }
}

public class 대문자와소문자 {
	public static void main(String []args) {
		String my_string = "cccCCC";
		
		Solution59 ob = new Solution59();
		System.out.println(ob.solution(my_string));
	}
}
