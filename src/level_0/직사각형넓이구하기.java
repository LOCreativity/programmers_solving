package level_0;

import java.util.Arrays;
import java.util.Comparator;

class Solution18 {
    public int solution(int[][] dots) {
        //첫번째 숫자 기준 오름차순 : {1,30}{2,10}{3,50}{4,20}{5,40}
        Arrays.sort(dots, Comparator.comparingInt((int[] o) -> o[0]));
        
        return Math.abs(dots[1][1] - dots[0][1]) * Math.abs(dots[2][0] - dots[0][0]);
    }
}

public class 직사각형넓이구하기 {
	public static void main(String []args) {
		int[][] dots = {{1,1}, {2,1}, {2,2}, {1,2}};
		
		Solution18 ob = new Solution18();
		System.out.println(ob.solution(dots));
	}
}
