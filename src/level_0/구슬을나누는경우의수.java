package level_0;

//3C2 = 2C1 + 2C2 조합 분열하는 방법을 코드로 구현

class Solution24 {
    public int combination(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            return combination(n-1, r-1) + combination(n-1, r);
        }
    }

    public int solution(int balls, int share) {
        return combination(balls, share);
    }
}

public class 구슬을나누는경우의수 {
	public static void main(String []args) {
		int balls = 3;
		int share = 2;
		
		Solution24 ob = new Solution24();
		System.out.println(ob.solution(balls, share));
	}
}
