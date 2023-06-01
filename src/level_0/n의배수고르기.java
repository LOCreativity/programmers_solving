package level_0;

import java.util.Arrays;

class Solution55 {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}

public class n의배수고르기 {
	public static void main(String []args) {
		int n = 3;
		int []numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		Solution55 ob = new Solution55();
		System.out.println(Arrays.toString(ob.solution(n, numlist)));
	}
}
