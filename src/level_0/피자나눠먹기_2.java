package level_0;

class Solution50 {
    public int solution(int n) {
        int answer = 1;
        while(answer * 6 % n != 0)
        	answer++;
        return answer;
    }
}

public class ÇÇÀÚ³ª´²¸Ô±â_2 {
	public static void main(String []args) {
		int n = 10;
		
		Solution50 ob = new Solution50();
		System.out.println(ob.solution(n));
	}
}
