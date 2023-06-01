package level_0;

class Solution42 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1 ; i <= n; i++) {
        	int count = 0;
        	for(int j = 1; j <= i; j++) {
        		if(i % j == 0) count++;
        		if(count >= 3) {
        			answer++;
        			break;
        		}
        	}
        }
        return answer;
    }
}

public class 합성수찾기 {
	public static void main(String []args) {
		int n = 10;
		
		Solution42 ob = new Solution42();
		System.out.println(ob.solution(n));
	}
}
