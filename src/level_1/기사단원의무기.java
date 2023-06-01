package level_1;

class Solution15 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisors = new int[number];
        
        for(int i = 1; i <= number; i++) {
        	for(int j = 1; j <= Math.sqrt(i); j++) {
        		if(i % j == 0) {
        			if(i / j == j) divisors[i-1]++; //��� �ߺ��ɰ��
        			else
        				divisors[i-1] += 2;			//�ߺ� �ƴҰ��
        		}
        	}
        	if(divisors[i-1] > limit) answer += power;
        	else answer += divisors[i-1];
        }   
        return answer;
    }
}

public class ���ܿ��ǹ��� {
	public static void main(String []args) {
		int number = 10;
		int limit = 3;
		int power = 2;
		
		Solution15 ob = new Solution15();
		System.out.println(ob.solution(number, limit, power));
	}
}
