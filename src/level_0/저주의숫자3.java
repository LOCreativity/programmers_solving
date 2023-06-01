package level_0;

class Solution11 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	
        	answer++;        	
        	while(true) {
        		String st_n = Integer.toString(answer);
        		if(st_n.contains("3") || answer % 3 == 0) answer++;
        		else break;
        	}
        }     
        return answer;
    }
}

public class 저주의숫자3 {
	public static void main(String []args) {
		int n = 40;
		
		Solution11 ob = new Solution11();
		System.out.println(ob.solution(n));
	}
}
