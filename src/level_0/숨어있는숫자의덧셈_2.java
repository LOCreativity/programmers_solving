package level_0;

class Solution32 {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[^0-9]", " ").split(" ");
        
        for(String s : str) {
        	if(!s.equals("")) answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}

public class ¼û¾îÀÖ´Â¼ıÀÚÀÇµ¡¼À_2 {
	public static void main(String []args) {
		String my_string = "aAb1B2cC34oOp";
		
		Solution32 ob = new Solution32();
		System.out.println(ob.solution(my_string));
	}
}
