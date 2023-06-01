package level_0;

class Solution66 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0 ; i < Integer.toString(n).length() ; i++) {
        	answer += Integer.parseInt(Integer.toString(n).valueOf(Integer.toString(n).charAt(i)));
        }     
        return answer;
    }
}

public class 자릿수더하기 {
	public static void main(String []args) {
		int n = 1234;
		
		Solution66 ob = new Solution66();
		System.out.println(ob.solution(n));
	}
}
