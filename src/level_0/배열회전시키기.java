package level_0;

import java.util.*;

class Solution52 {
    public int[] solution(int[] numbers, String direction) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < numbers.length; i++) {
        	list.add(numbers[i]);
        }
        if(direction.equals("right")) {
        	int temp = numbers[numbers.length - 1];
        	list.remove(numbers.length - 1);
        	list.add(0, temp);
        }
        else {
        	int temp = numbers[0];
        	list.remove(0);
        	list.add(numbers.length - 1, temp);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}

public class 배열회전시키기 {
	public static void main(String []args) {
		int []numbers = {1, 2, 3};
		String direction = "right";
		
		Solution52 ob = new Solution52();
		System.out.println(Arrays.toString(ob.solution(numbers, direction)));
	}
}
