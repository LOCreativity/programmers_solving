package level_0;

class Solution63 {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0 ; i < my_string.length() ; i ++) {
        	if(my_string.charAt(i) > 47 && my_string.charAt(i) < 58) 
        		answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }
        
        return answer;
    }
}

public class ¼û¾îÀÖ´Â¼ýÀÚÀÇµ¡¼À_1 {
	public static void main(String []args) {
		String my_string = "aAb1B2cC34oOp";
		
		Solution63 ob = new Solution63();
		System.out.println(ob.solution(my_string));
	}
}
