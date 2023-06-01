package level_0;

class Solution36 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = -1;

        for(int i = 0; i < array.length; i++) {
        	if(Math.abs(array[i] - n) <= min || min == -1) {
        		if(min == Math.abs(array[i] - n)) {
        			answer = Math.min(answer, array[i]);
        			continue;
        		}
        		answer = array[i];
        		min = Math.abs(array[i] - n);
        	}
        }
        return answer;
    }
}

public class 가까운수 {
	public static void main(String []args) {
		int[] array = {3, 10, 28};
		int n = 20;
		
		Solution36 ob = new Solution36();
		System.out.println(ob.solution(array, n));
	}
}
