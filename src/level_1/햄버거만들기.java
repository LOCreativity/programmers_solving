package level_1;

import java.util.Stack;

class Solution6 {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int n : ingredient) {
        	stack.push(n);
        	if(stack.size() > 3 && stack.peek() == 1
        	&& stack.get(stack.size()-2) == 3
        	&& stack.get(stack.size() - 3) == 2
        	&& stack.get(stack.size() - 4) == 1) {
        		stack.pop();
        		stack.pop();
        		stack.pop();
        		stack.pop();
        		answer++;
        	}
        }      
        return answer;
    }
}

public class 햄버거만들기 {
	public static void main(String []args) {
		int[] ingredient = {1, 2, 3, 1, 1, 2, 3, 1};
		
		Solution6 ob = new Solution6();
		System.out.println(ob.solution(ingredient));
	}
}