package level_0;

class Solution48 {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[numbers.length - 1];
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		if(answer < numbers[i] * numbers[j]) answer = numbers[i] * numbers[j];
        	}
        }        
        return answer;
    }
}

public class 최댓값만들기_2 {
	public static void main(String []args) {
		int[] numbers = {1, 2, -3, 4, -5};
		
		Solution48 ob = new Solution48();
		System.out.println(ob.solution(numbers));
	}
}
