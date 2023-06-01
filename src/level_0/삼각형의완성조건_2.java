package level_0;

//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//a < b + c

class Solution22 {
    public int solution(int[] sides) {
        int answer = 0;
        int big = sides[0] >= sides[1] ? sides[0] : sides[1];
        int small = sides[0] < sides[1] ? sides[0] : sides[1];
        
        for(int i = big; i + small > big; i--)
        	answer++;
        
        for(int i = big + small - 1; (i < big + small) && i > big; i--)
        	answer++;
        return answer;
    }
}

public class 삼각형의완성조건_2 {
	public static void main(String []args) {
		int[] sides = {1, 2};
		
		Solution22 ob = new Solution22();
		System.out.println(ob.solution(sides));
	}
}
