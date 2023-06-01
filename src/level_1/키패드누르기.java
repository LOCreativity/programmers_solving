package level_1;

class Solution11 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int []hands = {10, 12};
        int handsearch = hand.equals("right") ? 1 : 0;
        
        for(int i = 0; i < numbers.length; i++) {
        	if(hands[0] == 0) hands[0] = 11;
        	else if(hands[1] == 0) hands[1] = 11;
        	
        	if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        		answer += "L";
        		hands[0] = numbers[i];
        	}
        	else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        		answer += "R";
        		hands[1] = numbers[i];
        	}
        	else {
        		if(numbers[i] == 0) numbers[i] = 11;
        		
        		int leftDistance = Math.abs(hands[0] - numbers[i]);
        		int rightDistance = Math.abs(hands[1] - numbers[i]);
        		//절대값/3 의 몫 : 세로거리, 절대값/3 의 나머지 : 가로거리 (윤희영님 코드 참고)
        		leftDistance = (leftDistance / 3) + (leftDistance % 3);
                rightDistance = (rightDistance / 3) + (rightDistance % 3);
        		
        		if(leftDistance == rightDistance) {
        			answer += hand.equals("right") ? "R" : "L";
        			hands[handsearch] = numbers[i];
        		}
        		else if(leftDistance < rightDistance) {
        			answer += "R";
        			hands[1] = numbers[i];
        		}
        		else {
        			answer += "L";
        			hands[0] = numbers[i];
        		}
        	}
        }
        
        return answer;
    }
}

public class 키패드누르기 {
	public static void main(String []args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		Solution11 ob = new Solution11();
		System.out.println(ob.solution(numbers, hand));
	}
}
