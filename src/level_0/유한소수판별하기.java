package level_0;

class Solution14 {
    public int solution(int a, int b) {
        int answer = 1;
        int standard = (a > b) ? a : b;
        
        for(int i = 2; i < standard; i++) {
        	if(a % i == 0 && b % i == 0) {
        		a /= i;
        		b /= i;
        		i--;
        	}
        }
        
        while(true) {
        	if(b % 2 == 0 || b % 5 == 0) {
        		b = (b % 2 == 0) ? b / 2 : b / 5;
        	}
        	
        	if(b == 1) {
        		answer = 1;
        		break;
        	}
        	else if(b % 2 != 0 && b % 5 != 0){
        		answer = 2;
        		break;
        	}
        }
        
        return answer;
    }
}

public class 유한소수판별하기 {
	public static void main(String []args) {
		int a = 12;
		int b = 21;
		
		Solution14 ob = new Solution14();
		System.out.println(ob.solution(a, b));
	}
}
