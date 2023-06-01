package level_0;

class Solution57 {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0 ; i < rsp.length(); i++) {
        	if(rsp.charAt(i) == '2') answer += "0";
        	else if(rsp.charAt(i) == '0') answer += "5";
        	else answer += "2";
        }
        
        return answer;
    }
}

public class 가위바위보 {
	public static void main(String []args) {
		String rsp = "2";
		
		Solution57 ob = new Solution57();
		System.out.println(ob.solution(rsp));
	}
}
