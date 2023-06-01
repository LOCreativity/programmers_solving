package level_0;

class Solution19 {
    public int solution(int M, int N) {
        return (M - 1) + ((N - 1) * M);
    }
}

public class 종이자르기 {
	public static void main(String []args) {
		int M = 2;
		int N = 2;
		
		Solution19 ob = new Solution19();
		System.out.println(ob.solution(M, N));
	}
}
