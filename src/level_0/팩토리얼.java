package level_0;

class Solution38 {
    public int solution(int n) {
        int answer = 0;
        
        for(answer = 1; answer <= n; answer++) {
        	n = n / answer;
        }
        return answer - 1;
    }
}

public class ÆÑÅä¸®¾ó {
	public static void main(String []args) {
		int n = 3628800;
		
		Solution38 ob = new Solution38();
		System.out.println(ob.solution(n));
	}
}
