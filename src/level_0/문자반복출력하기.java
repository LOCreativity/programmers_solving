package level_0;

class Solution71 {
    public String solution(String my_string, int n) {
    	String answer = "";
    	for(int i = 0 ; i < my_string.length(); i++) {
    		answer += my_string.valueOf(my_string.charAt(i)).repeat(n);
    	}
        return answer;
    }
}

public class 문자반복출력하기 {
	public static void main(String []args) {
		String my_string = "hello";
		int n = 3;
		
		Solution71 ob = new Solution71();
		System.out.println(ob.solution(my_string, n));
	}
}
