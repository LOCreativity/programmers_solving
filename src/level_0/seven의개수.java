package level_0;

class Solution30 {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0 ; i < array.length; i++) {
        	String st = Integer.toString(array[i]);
        	for(int j = 0; j < st.length(); j++) {
        		if(st.charAt(j) == '7') answer++;
        	}
        }    
        return answer;
    }
}

public class sevenÀÇ°³¼ö {
	public static void main(String []args) {
		int[] array = {7, 77, 17};
		
		Solution30 ob = new Solution30();
		System.out.println(ob.solution(array));
 	}
}
