package level_0;

class Solution28 {
    public int solution(int[] numbers, int k) {
        return numbers[(k - 1) * 2 % numbers.length];
    }
}

public class �������� {
	public static void main(String []args) {
		int []numbers = {1};
		int k = 5;
		
		Solution28 ob = new Solution28();
		System.out.println(ob.solution(numbers, k));
	}
}
