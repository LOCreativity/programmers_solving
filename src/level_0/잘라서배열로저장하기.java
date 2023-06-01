package level_0;

import java.util.Arrays;

class Solution26 {
    public String[] solution(String my_str, int n) {
        int sublen = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[sublen];
        int start = 0;
        int end = n;
        
        for(int i = 0; i < sublen; i++) {
        	if(end > my_str.length()) end = my_str.length();
        	answer[i] = my_str.substring(start, end);
        	start = end;
        	end += n;
        }
        return answer;
    }
}

public class 잘라서배열로저장하기 {
	public static void main(String []args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		
		Solution26 ob = new Solution26();
		System.out.println(Arrays.toString(ob.solution(my_str, n)));
	}
}
