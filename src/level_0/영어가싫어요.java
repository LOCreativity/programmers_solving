package level_0;

class Solution27 {
    public long solution(String numbers) {
        String []number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < number.length; i++) {
        	numbers = numbers.replace(number[i], Integer.toString(i));
        } 
        return Long.parseLong(numbers);
    }
}

public class 영어가싫어요 {
	public static void main(String []args) {
		String numbers = "onetwothreefourfivesixseveneightnine";
		
		Solution27 ob = new Solution27();
		System.out.println(ob.solution(numbers));
	}
}
