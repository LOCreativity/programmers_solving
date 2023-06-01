package level_0;

class Solution25 {
    public int solution(String my_string) {
        int answer = 0;
        String []str = my_string.split(" ");
        
        for(int i = 1; i < str.length; i+=2) {
        	if(str[i].equals("+")) answer = Integer.parseInt(str[i-1]) + Integer.parseInt(str[i+1]);
        	else answer = Integer.parseInt(str[i-1]) - Integer.parseInt(str[i+1]);
        	str[i+1] = Integer.toString(answer);
        }  
        return answer;
    }
}

public class 문자열계산하기 {
	public static void main(String []args) {
		String my_string = "3 - 7 + 10 + 5";
		
		Solution25 ob = new Solution25();
		System.out.println(ob.solution(my_string));
	}
}
