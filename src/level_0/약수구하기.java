package level_0;

import java.util.*;

class Solution46 {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0) answer.add(i);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

public class 약수구하기 {
	public static void main(String []args) {
		int n = 24;
		
		Solution46 ob = new Solution46();
		System.out.println(Arrays.toString(ob.solution(n)));
	}
}
