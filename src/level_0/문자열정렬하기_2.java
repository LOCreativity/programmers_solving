package level_0;

import java.util.Arrays;

class Solution43 {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++)
        	answer += arr[i];
        return answer;
    }
}

public class ���ڿ������ϱ�_2 {
	public static void main(String []args) {
		String my_string = "Bcad";
		
		Solution43 ob = new Solution43();
		System.out.println(ob.solution(my_string));
	}
}
