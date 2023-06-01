package level_0;

//���� �� ���� ���̴� �ٸ� �� ���� ������ �պ��� �۾ƾ� �մϴ�.
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

public class �ﰢ���ǿϼ�����_2 {
	public static void main(String []args) {
		int[] sides = {1, 2};
		
		Solution22 ob = new Solution22();
		System.out.println(ob.solution(sides));
	}
}
