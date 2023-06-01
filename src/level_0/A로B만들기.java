package level_0;

import java.util.Arrays;

class Solution39 {
    public int solution(String before, String after) {
    	char[] beforech = before.toCharArray();
    	char[] afterch = after.toCharArray();
    	
    	Arrays.sort(beforech);
    	Arrays.sort(afterch);
        
    	return String.valueOf(beforech).equals(String.valueOf(afterch)) ? 1 : 0;
    }
}

public class A로B만들기 {
	public static void main(String []args) {
		String before = "olleh";
		String after = "hello";
		
		Solution39 ob = new Solution39();
		System.out.println(ob.solution(before, after));
	}
}
