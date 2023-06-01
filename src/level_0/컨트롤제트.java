package level_0;

class Solution23 {
    public int solution(String s) {
        int answer = 0;
        String []str = s.split(" ");
        
        for(int i = 0 ; i < str.length; i++) {
        	if(str[i].equals("Z")) answer -= Integer.parseInt(str[i - 1]);
        	else answer += Integer.parseInt(str[i]);
        }   
        return answer;
    }
}

public class 컨트롤제트 {
	public static void main(String []args) {
		String s = "1 2 Z 3";
		
		Solution23 ob = new Solution23();
		System.out.println(ob.solution(s));
	}
}
