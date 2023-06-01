package level_0;

import java.util.*;
import java.util.stream.Stream;

class Solution54 {
    public int[] solution(String my_string) {
    	int []answer = Stream.of(my_string.replaceAll("[^0-9]", "").split("")).mapToInt(Integer::parseInt).toArray();
    	Arrays.sort(answer);
    	return answer;
    }
}

public class 문자열정렬하기_1 {
	public static void main(String []args) {
		String my_string = "p2o4i8gj2";
		
		Solution54 ob = new Solution54();
		System.out.println(Arrays.toString(ob.solution(my_string)));
	}
}
