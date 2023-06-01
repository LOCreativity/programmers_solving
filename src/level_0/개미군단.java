package level_0;

class Solution61 {
    public int solution(int hp) {
        return (hp / 5) + (hp % 5 / 3) + (hp % 5 % 3);
    }
}

public class 개미군단 {
	public static void main(String []args) {
		int hp = 23;
		
		Solution61 ob = new Solution61();
		System.out.println(ob.solution(hp));
	}
}
